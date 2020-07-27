package com.yqj.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class User_sol_User extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161045c38038061045c833981016040908152815160208084015192840151606085015192850180519095948501949190910192916100579160009187019061008c565b50825161006b90600190602086019061008c565b50815161007f90600290602085019061008c565b5060035550610127915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100cd57805160ff19168380011785556100fa565b828001600101855582156100fa579182015b828111156100fa5782518255916020019190600101906100df565b5061010692915061010a565b5090565b61012491905b808211156101065760008155600101610110565b90565b610326806101366000396000f3006080604052600436106100775763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632ebcb653811461007c578063681f3e6d1461010657806398e1b4101461011b578063ed2c45a414610142578063f6f291f21461015c578063fde0817414610174575b600080fd5b34801561008857600080fd5b50610091610189565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100cb5781810151838201526020016100b3565b50505050905090810190601f1680156100f85780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561011257600080fd5b5061009161021e565b34801561012757600080fd5b5061013061027f565b60408051918252519081900360200190f35b34801561014e57600080fd5b5061015a600435610285565b005b34801561016857600080fd5b5061015a600435610291565b34801561018057600080fd5b5061009161029c565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156102145780601f106101e957610100808354040283529160200191610214565b820191906000526020600020905b8154815290600101906020018083116101f757829003601f168201915b5050505050905090565b60008054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156102145780601f106101e957610100808354040283529160200191610214565b60035490565b60038054919091039055565b600380549091019055565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156102145780601f106101e9576101008083540402835291602001916102145600a165627a7a723058207ec858083567b8fb816b3b02b0ca1748c1f0212dd1fcd34f4ed6bb482690e5fd0029";

    public static final String FUNC_GETUSERID = "getUserId";

    public static final String FUNC_GETUSERNAME = "getUsername";

    public static final String FUNC_GETMONEY = "getMoney";

    public static final String FUNC_CONSUMER = "consumer";

    public static final String FUNC_RECHARGE = "reCharge";

    public static final String FUNC_GETROLE = "getRole";

    @Deprecated
    protected User_sol_User(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected User_sol_User(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected User_sol_User(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected User_sol_User(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getUserId() {
        final Function function = new Function(FUNC_GETUSERID, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getUsername() {
        final Function function = new Function(FUNC_GETUSERNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getMoney() {
        final Function function = new Function(FUNC_GETMONEY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> consumer(BigInteger spend) {
        final Function function = new Function(
                FUNC_CONSUMER, 
                Arrays.<Type>asList(new Uint256(spend)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> reCharge(BigInteger charge) {
        final Function function = new Function(
                FUNC_RECHARGE, 
                Arrays.<Type>asList(new Uint256(charge)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getRole() {
        final Function function = new Function(FUNC_GETROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _username, String _userId, String _role, BigInteger _money) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId),
                new Utf8String(_role),
                new Uint256(_money)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _username, String _userId, String _role, BigInteger _money) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId),
                new Utf8String(_role),
                new Uint256(_money)));
        return deployRemoteCall(User_sol_User.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _username, String _userId, String _role, BigInteger _money) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId),
                new Utf8String(_role),
                new Uint256(_money)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _username, String _userId, String _role, BigInteger _money) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId),
                new Utf8String(_role),
                new Uint256(_money)));
        return deployRemoteCall(User_sol_User.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static User_sol_User load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static User_sol_User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new User_sol_User(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new User_sol_User(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
