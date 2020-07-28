package com.yqj.blockchain;

import com.yqj.domain.SysControl;
import com.yqj.domain.SysResource;
import com.yqj.domain.SysUser;
import org.springframework.stereotype.Component;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class BlockChain {

    //部署主体合约，将注册的主体上链
    public String registerSubjectContract(SysUser sysUser) throws Exception {
        //建立私链连接
        Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
        //加载钱包账户
        Credentials credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
        //部署合约
        BigInteger bigIntegerMoney = new BigInteger(String.valueOf(sysUser.getMoney()));
        User_sol_User contract = User_sol_User.deploy(web3j,credentials, BigInteger.valueOf(3000000),
                BigInteger.valueOf(3000000),sysUser.getUsername(),sysUser.getUserId(),sysUser.getRole(),bigIntegerMoney).send();
        //合约地址
        String contractAddress = contract.getContractAddress();
        return contractAddress;
    }

    //加载已经在链上的主体合约，并且调用方法
    public SysUser loadSubjectContract(String address) {
        try {
            //建立私链连接
            Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
            //加载钱包账户
            Credentials credentials = null;
            credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
            //加载合约
            User_sol_User contract = User_sol_User.load(address, web3j, credentials, BigInteger.valueOf(3000000), BigInteger.valueOf(3000000));
            String username = contract.getUsername().send();
            String userId = contract.getUserId().send();
            String role = contract.getRole().send();
            BigInteger bigIntegerMoney = contract.getMoney().send();
            Long money = bigIntegerMoney.longValue();
            //构建返回的合约对象
            SysUser sysUser = new SysUser();
            sysUser.setUsername(username);
            sysUser.setUserId(userId);
            sysUser.setWallet(address);
            sysUser.setRole(role);
            sysUser.setMoney(money);
            return sysUser;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //客体托管资源
    public String registerObjectResource(SysResource sysResource) throws Exception {
        //建立私链连接
        Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
        //加载钱包账户
        Credentials credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
        //部署合约
        Resource_sol_Resource contract = Resource_sol_Resource.deploy(web3j,credentials, BigInteger.valueOf(3000000),
                BigInteger.valueOf(3000000),sysResource.getSubjectAddr(),sysResource.getSourceName(),sysResource.getSourceName(),sysResource.getControlAddr()).send();
        //合约地址
        String contractAddress = contract.getContractAddress();
        return contractAddress;
    }

    //部署访问策略
    public String registerControlContract(SysControl sysControl) throws Exception {
        //建立私链连接
        Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
        //加载钱包账户
        Credentials credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
        //部署合约
        BigInteger bigIntegerPrice = new BigInteger(String.valueOf(sysControl.getPrice()));
        //将年转换为毫秒
        BigInteger bigIntegerTime= new BigInteger(String.valueOf(31536000l*sysControl.getTransTime()));
        Control_sol_Control contract = Control_sol_Control.deploy(web3j,credentials, BigInteger.valueOf(3000000),
                BigInteger.valueOf(3000000),sysControl.getRole(),bigIntegerTime,bigIntegerPrice).send();
        //合约地址
        String contractAddress = contract.getContractAddress();
        return contractAddress;
    }

    //获取控制合约的起始和结束时间
    public SysControl loadControlContractTime(SysControl sysControl, String controlAddr) throws Exception {
        //建立私链连接
        Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
        //加载钱包账户
        Credentials credentials = null;
        credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
        //加载合约
        Control_sol_Control contract = Control_sol_Control.load(controlAddr, web3j, credentials, BigInteger.valueOf(3000000), BigInteger.valueOf(3000000));
        //赋值时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long startTime = contract.startTime().send().longValue();
        Long stopTime = contract.stopTime().send().longValue();
        //注：以太坊的时间戳是秒
        sysControl.setStartTime(sdf.format(new Date(startTime*1000)));
        sysControl.setStopTime(sdf.format(new Date(stopTime*1000)));
        return sysControl;
    }
}
