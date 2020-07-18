package com.yqj.blockchain;

import com.yqj.domain.SysUser;
import org.springframework.stereotype.Component;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.math.BigInteger;


@Component
public class BlockChain {

    //部署主体合约，将注册的主体上链
    public String registerContract(SysUser sysUser) throws Exception {
        //建立私链连接
        Web3j web3j = Web3j.build(new HttpService("http://192.168.44.133:8989"));
        //加载钱包账户
        Credentials credentials = WalletUtils.loadCredentials("", "D:\\science_research\\real_project\\基于RBAC的访问控制服务\\smartcontract-rbac\\src\\main\\resources\\keystore\\UTC--2020-07-13T02-55-32.975926212Z--e01c787c4890baf36053959d4e6e08eb71b1318e");
        //部署合约
        User_sol_User voting = User_sol_User.deploy(web3j,credentials, BigInteger.valueOf(3000000),
                BigInteger.valueOf(3000000),sysUser.getUsername(),sysUser.getUserId()).send();
        //合约地址
        String contractAddress = voting.getContractAddress();
        return contractAddress;
    }

    //加载已经在链上的合约，并且调用方法
    public SysUser loadContract(String address) {
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
            //构建返回的合约对象
            SysUser sysUser = new SysUser();
            sysUser.setUsername(username);
            sysUser.setUserId(userId);
            sysUser.setWallet(address);
            return sysUser;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
