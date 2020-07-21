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
public class Resource_sol_Resource extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516104593803806104598339810160409081528151602080840151928401516060850151928501805190959485019491820193909101916100599160009187019061009f565b50825161006d90600190602086019061009f565b50815161008190600290602085019061009f565b50805161009590600390602084019061009f565b505050505061013a565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100e057805160ff191683800117855561010d565b8280016001018555821561010d579182015b8281111561010d5782518255916020019190600101906100f2565b5061011992915061011d565b5090565b61013791905b808211156101195760008155600101610123565b90565b610310806101496000396000f3006080604052600436106100615763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166322f0f6e4811461006657806354de0a43146100f05780638e52570114610105578063fde081741461011a575b600080fd5b34801561007257600080fd5b5061007b61012f565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100b557818101518382015260200161009d565b50505050905090810190601f1680156100e25780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156100fc57600080fd5b5061007b6101c4565b34801561011157600080fd5b5061007b610225565b34801561012657600080fd5b5061007b610283565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156101ba5780601f1061018f576101008083540402835291602001916101ba565b820191906000526020600020905b81548152906001019060200180831161019d57829003601f168201915b5050505050905090565b60008054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156101ba5780601f1061018f576101008083540402835291602001916101ba565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156101ba5780601f1061018f576101008083540402835291602001916101ba565b60038054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156101ba5780601f1061018f576101008083540402835291602001916101ba5600a165627a7a723058207e0fd0882fb2aba473db662507186f75395adb0c83d15d55e166cc0c973175cf0029";

    public static final String FUNC_GETSUBJECTNAME = "getSubjectName";

    public static final String FUNC_GETSUBJECTADDR = "getSubjectAddr";

    public static final String FUNC_GETRESOURCENAME = "getResourceName";

    public static final String FUNC_GETROLE = "getRole";

    @Deprecated
    protected Resource_sol_Resource(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Resource_sol_Resource(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Resource_sol_Resource(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Resource_sol_Resource(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> getSubjectName() {
        final Function function = new Function(FUNC_GETSUBJECTNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getSubjectAddr() {
        final Function function = new Function(FUNC_GETSUBJECTADDR, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getResourceName() {
        final Function function = new Function(FUNC_GETRESOURCENAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getRole() {
        final Function function = new Function(FUNC_GETROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<Resource_sol_Resource> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _subjectAddr, String _subjectName, String _resourceName, String _role) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_subjectAddr),
                new Utf8String(_subjectName),
                new Utf8String(_resourceName),
                new Utf8String(_role)));
        return deployRemoteCall(Resource_sol_Resource.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Resource_sol_Resource> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _subjectAddr, String _subjectName, String _resourceName, String _role) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_subjectAddr),
                new Utf8String(_subjectName),
                new Utf8String(_resourceName),
                new Utf8String(_role)));
        return deployRemoteCall(Resource_sol_Resource.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Resource_sol_Resource> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _subjectAddr, String _subjectName, String _resourceName, String _role) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_subjectAddr),
                new Utf8String(_subjectName),
                new Utf8String(_resourceName),
                new Utf8String(_role)));
        return deployRemoteCall(Resource_sol_Resource.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Resource_sol_Resource> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _subjectAddr, String _subjectName, String _resourceName, String _role) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_subjectAddr),
                new Utf8String(_subjectName),
                new Utf8String(_resourceName),
                new Utf8String(_role)));
        return deployRemoteCall(Resource_sol_Resource.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static Resource_sol_Resource load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Resource_sol_Resource(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Resource_sol_Resource load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Resource_sol_Resource(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Resource_sol_Resource load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Resource_sol_Resource(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Resource_sol_Resource load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Resource_sol_Resource(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
