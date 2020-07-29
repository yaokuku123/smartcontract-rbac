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
public class Request_sol_Request extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161043f38038061043f8339810160409081528151602080840151928401516060850151928501805190959485019491820193909101916100599160009187019061009f565b50825161006d90600190602086019061009f565b50815161008190600290602085019061009f565b50805161009590600390602084019061009f565b505050505061013a565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100e057805160ff191683800117855561010d565b8280016001018555821561010d579182015b8281111561010d5782518255916020019190600101906100f2565b5061011992915061011d565b5090565b61013791905b808211156101195760008155600101610123565b90565b6102f6806101496000396000f3006080604052600436106100615763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630b3d831d8114610066578063a09538f8146100f0578063c221d25814610105578063ef7c29c61461011a575b600080fd5b34801561007257600080fd5b5061007b61012f565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100b557818101518382015260200161009d565b50505050905090810190601f1680156100e25780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156100fc57600080fd5b5061007b6101ba565b34801561011157600080fd5b5061007b610215565b34801561012657600080fd5b5061007b610270565b6002805460408051602060018416156101000260001901909316849004601f810184900484028201840190925281815292918301828280156101b25780601f10610187576101008083540402835291602001916101b2565b820191906000526020600020905b81548152906001019060200180831161019557829003601f168201915b505050505081565b6000805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156101b25780601f10610187576101008083540402835291602001916101b2565b6003805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156101b25780601f10610187576101008083540402835291602001916101b2565b60018054604080516020600284861615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156101b25780601f10610187576101008083540402835291602001916101b25600a165627a7a723058201619d34358bfa41732cdb1d01f6de411f4fcfacd604c3a1cd5f957fb4e617d6a0029";

    public static final String FUNC_CONTROLADDR = "controlAddr";

    public static final String FUNC_SOURCESUBJECTADDR = "sourceSubjectAddr";

    public static final String FUNC_REQUESTSUBJECTADDR = "requestSubjectAddr";

    public static final String FUNC_SOURCEADDR = "sourceAddr";

    @Deprecated
    protected Request_sol_Request(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Request_sol_Request(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Request_sol_Request(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Request_sol_Request(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> controlAddr() {
        final Function function = new Function(FUNC_CONTROLADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> sourceSubjectAddr() {
        final Function function = new Function(FUNC_SOURCESUBJECTADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> requestSubjectAddr() {
        final Function function = new Function(FUNC_REQUESTSUBJECTADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> sourceAddr() {
        final Function function = new Function(FUNC_SOURCEADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Request_sol_Request> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _sourceSubjectAddr, String _sourceAddr, String _controlAddr, String _requestSubjectAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_sourceSubjectAddr),
                new Utf8String(_sourceAddr),
                new Utf8String(_controlAddr),
                new Utf8String(_requestSubjectAddr)));
        return deployRemoteCall(Request_sol_Request.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Request_sol_Request> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _sourceSubjectAddr, String _sourceAddr, String _controlAddr, String _requestSubjectAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_sourceSubjectAddr),
                new Utf8String(_sourceAddr),
                new Utf8String(_controlAddr),
                new Utf8String(_requestSubjectAddr)));
        return deployRemoteCall(Request_sol_Request.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Request_sol_Request> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _sourceSubjectAddr, String _sourceAddr, String _controlAddr, String _requestSubjectAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_sourceSubjectAddr),
                new Utf8String(_sourceAddr),
                new Utf8String(_controlAddr),
                new Utf8String(_requestSubjectAddr)));
        return deployRemoteCall(Request_sol_Request.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Request_sol_Request> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _sourceSubjectAddr, String _sourceAddr, String _controlAddr, String _requestSubjectAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_sourceSubjectAddr),
                new Utf8String(_sourceAddr),
                new Utf8String(_controlAddr),
                new Utf8String(_requestSubjectAddr)));
        return deployRemoteCall(Request_sol_Request.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static Request_sol_Request load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Request_sol_Request(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Request_sol_Request load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Request_sol_Request(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Request_sol_Request load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Request_sol_Request(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Request_sol_Request load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Request_sol_Request(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
