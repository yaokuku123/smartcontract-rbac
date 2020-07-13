package com.yqj.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161031f38038061031f8339810160405280516020808301519183018051909392909201916100489160009190850190610064565b50805161005c906001906020840190610064565b5050506100ff565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a557805160ff19168380011785556100d2565b828001600101855582156100d2579182015b828111156100d25782518255916020019190600101906100b7565b506100de9291506100e2565b5090565b6100fc91905b808211156100de57600081556001016100e8565b90565b6102118061010e6000396000f30060806040526004361061004b5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632ebcb6538114610050578063681f3e6d146100da575b600080fd5b34801561005c57600080fd5b506100656100ef565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561009f578181015183820152602001610087565b50505050905090810190601f1680156100cc5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156100e657600080fd5b50610065610184565b60018054604080516020601f6002600019610100878916150201909516949094049384018190048102820181019092528281526060939092909183018282801561017a5780601f1061014f5761010080835404028352916020019161017a565b820191906000526020600020905b81548152906001019060200180831161015d57829003601f168201915b5050505050905090565b60008054604080516020601f600260001961010060018816150201909516949094049384018190048102820181019092528281526060939092909183018282801561017a5780601f1061014f5761010080835404028352916020019161017a5600a165627a7a7230582071a8e5a43a7796e2b94e931a27c3cc3a907763e5a22c6a099d6af812fb867bae0029";

    public static final String FUNC_GETUSERID = "getUserId";

    public static final String FUNC_GETUSERNAME = "getUsername";

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

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _username, String _userId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _username, String _userId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId)));
        return deployRemoteCall(User_sol_User.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _username, String _userId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _username, String _userId) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_username),
                new Utf8String(_userId)));
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
