package com.yqj.blockchain;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
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
public class Control_sol_Control extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516104ca3803806104ca833981016040908152815160208084015192840151919093018051909361004991600091860190610060565b5042600181905591909101600255600355506100fb565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100a157805160ff19168380011785556100ce565b828001600101855582156100ce579182015b828111156100ce5782518255916020019190600101906100b3565b506100da9291506100de565b5090565b6100f891905b808211156100da57600081556001016100e4565b90565b6103c08061010a6000396000f3006080604052600436106100825763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166303ff5e73811461008757806310055c1d146100ae57806378e9792514610138578063a035b1fe1461014d578063d1a3bfc914610162578063e3d4ba991461018e578063ef613f16146101e7575b600080fd5b34801561009357600080fd5b5061009c6101ff565b60408051918252519081900360200190f35b3480156100ba57600080fd5b506100c3610205565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100fd5781810151838201526020016100e5565b50505050905090810190601f16801561012a5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561014457600080fd5b5061009c610293565b34801561015957600080fd5b5061009c610299565b34801561016e57600080fd5b5061017a60043561029f565b604080519115158252519081900360200190f35b34801561019a57600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261017a9436949293602493928401919081908401838280828437509497506102a79650505050505050565b3480156101f357600080fd5b5061017a600435610378565b60025481565b6000805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561028b5780601f106102605761010080835404028352916020019161028b565b820191906000526020600020905b81548152906001019060200180831161026e57829003601f168201915b505050505081565b60015481565b60035481565b600354111590565b60008060405180828054600181600116156101000203166002900480156103055780601f106102e3576101008083540402835291820191610305565b820191906000526020600020905b8154815290600101906020018083116102f1575b50506040519081900381208551909350859250819060208401908083835b602083106103425780518252601f199092019160209182019101610323565b5181516020939093036101000a600019018019909116921691909117905260405192018290039091209390931495945050505050565b6000600154821015801561038e57506002548211155b929150505600a165627a7a7230582079af07b5faba3ade2598eee63dd347db72994a419f25f5fac33fd41408561b670029";

    public static final String FUNC_STOPTIME = "stopTime";

    public static final String FUNC_ROLE = "role";

    public static final String FUNC_STARTTIME = "startTime";

    public static final String FUNC_PRICE = "price";

    public static final String FUNC_TERMOFPRICE = "termOfPrice";

    public static final String FUNC_TERMOFROLE = "termOfRole";

    public static final String FUNC_TERMOFTIME = "termOfTime";

    @Deprecated
    protected Control_sol_Control(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Control_sol_Control(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Control_sol_Control(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Control_sol_Control(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> stopTime() {
        final Function function = new Function(FUNC_STOPTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> role() {
        final Function function = new Function(FUNC_ROLE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> startTime() {
        final Function function = new Function(FUNC_STARTTIME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> price() {
        final Function function = new Function(FUNC_PRICE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> termOfPrice(BigInteger requestPrice) {
        final Function function = new Function(FUNC_TERMOFPRICE, 
                Arrays.<Type>asList(new Uint256(requestPrice)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> termOfRole(String requestRole) {
        final Function function = new Function(FUNC_TERMOFROLE, 
                Arrays.<Type>asList(new Utf8String(requestRole)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> termOfTime(BigInteger requestTime) {
        final Function function = new Function(FUNC_TERMOFTIME, 
                Arrays.<Type>asList(new Uint256(requestTime)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<Control_sol_Control> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _role, BigInteger transTime, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_role),
                new Uint256(transTime),
                new Uint256(_price)));
        return deployRemoteCall(Control_sol_Control.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Control_sol_Control> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _role, BigInteger transTime, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_role),
                new Uint256(transTime),
                new Uint256(_price)));
        return deployRemoteCall(Control_sol_Control.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Control_sol_Control> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _role, BigInteger transTime, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_role),
                new Uint256(transTime),
                new Uint256(_price)));
        return deployRemoteCall(Control_sol_Control.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Control_sol_Control> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _role, BigInteger transTime, BigInteger _price) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new Utf8String(_role),
                new Uint256(transTime),
                new Uint256(_price)));
        return deployRemoteCall(Control_sol_Control.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static Control_sol_Control load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Control_sol_Control(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Control_sol_Control load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Control_sol_Control(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Control_sol_Control load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Control_sol_Control(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Control_sol_Control load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Control_sol_Control(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
