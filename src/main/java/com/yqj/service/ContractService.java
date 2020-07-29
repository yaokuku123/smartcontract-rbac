package com.yqj.service;

import com.yqj.blockchain.BlockChain;
import com.yqj.dao.ControlDao;
import com.yqj.dao.ResourceDao;
import com.yqj.domain.SysControl;
import com.yqj.domain.SysRequest;
import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Service
public class ContractService {

    @Autowired
    private BlockChain blockChain;

    @Autowired
    private ResourceDao resourceDao;

    @Autowired
    private ControlDao controlDao;

    //查找链上用户信息
    public SysUser findUser(String address){
        SysUser contractUser = blockChain.loadSubjectContract(address);
        return contractUser;
    }

    //生成客体资源的访问策略,并将客体资源托管
    public void objectResource(SysControl sysControl,SysResource sysResource) throws Exception {
        //将策略托管至链上合约
        String controlAddr = blockChain.registerControlContract(sysControl);
        sysControl.setControlAddr(controlAddr);
        sysResource.setControlAddr(controlAddr);
        //根据策略合约的地址查找对应策略的起始和终止时间
        sysControl = blockChain.loadControlContractTime(sysControl,controlAddr);
        //客体资源托管至链上合约
        String sourceAddr = blockChain.registerObjectResource(sysResource);
        sysResource.setSourceAddr(sourceAddr);
        //存储访问策略到数据库
        controlDao.save(sysControl);
        //存储资源数据到数据库
        resourceDao.save(sysResource);
    }

    //查询全部托管的资源信息
    public List<SysResource> finaAllResource(){
        List<SysResource> sysResources = resourceDao.findAll();
        return sysResources;
    }

    //按照id查询托管资源
    public SysResource findResourceById(Long id) {
         return resourceDao.getOne(id);
    }

    //按照控制合约地址查询
    public SysControl findControlByAddr(String controlAddr) {
        return controlDao.findByControlAddr(controlAddr);
    }

    //从链上获取访问权限信息，并判断是否符合请求资源的要求
    public boolean judgeRequest(SysRequest sysRequest) throws Exception {
        //从链上获取访问控制的要求
        SysControl chainControl = blockChain.getControl(sysRequest.getControlAddr());
        //从链上获取请求主体的信息
        SysUser chainSubject = blockChain.getSubject(sysRequest.getRequestSubjectAddr());
        //判断是否可以访问资源
        boolean judgeRole = false;
        if (chainControl.getRole() == chainSubject.getRole()){
            judgeRole = true;
        }else if ("vip".equals(chainSubject.getRole())){
            judgeRole = true;
        }
        boolean judgePrice = chainControl.getPrice() <= chainSubject.getMoney();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long controlTime = sdf.parse(chainControl.getStopTime()).getTime();
        long nowTime = System.currentTimeMillis();
        boolean judgeTime =nowTime <= controlTime;

        if (judgePrice && judgeRole && judgeTime){
            return true;
        }else {
            return false;
        }

    }
}
