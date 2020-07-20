package com.yqj.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
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
    private static final String BINARY = "608060405234801561001057600080fd5b506040516103fd3803806103fd833981016040908152815160208084015192840151606085015192850180519095948501949190910192916100579160009187019061008c565b50825161006b90600190602086019061008c565b50815161007f90600290602085019061008c565b5060035550610127915050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100cd57805160ff19168380011785556100fa565b828001600101855582156100fa579182015b828111156100fa5782518255916020019190600101906100df565b5061010692915061010a565b5090565b61012491905b808211156101065760008155600101610110565b90565b6102c7806101366000396000f3006080604052600436106100615763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632ebcb6538114610066578063681f3e6d146100f057806398e1b41014610105578063fde081741461012c575b600080fd5b34801561007257600080fd5b5061007b610141565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100b557818101518382015260200161009d565b50505050905090810190601f1680156100e25780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156100fc57600080fd5b5061007b6101d6565b34801561011157600080fd5b5061011a610237565b60408051918252519081900360200190f35b34801561013857600080fd5b5061007b61023d565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156101cc5780601f106101a1576101008083540402835291602001916101cc565b820191906000526020600020905b8154815290600101906020018083116101af57829003601f168201915b5050505050905090565b60008054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156101cc5780601f106101a1576101008083540402835291602001916101cc565b60035490565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156101cc5780601f106101a1576101008083540402835291602001916101cc5600a165627a7a72305820827661cd8056f030b544ab13f5c67c17a1f8e9f8473b17d3b3b89947c1d4c0290029";

    public static final String FUNC_GETUSERID = "getUserId";

    public static final String FUNC_GETUSERNAME = "getUsername";

    public static final String FUNC_GETMONEY = "getMoney";

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
