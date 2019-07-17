package model.bjk;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkHead {
    /**请求类型*/
    @XStreamAlias("REQUEST_TYPE")
    private String requestType;
    /**交互编码*/
    @XStreamAlias("TRANSACTION_NUM")
    private String transactionNum;
    public String getRequestType() {
        return requestType;
    }
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public String getTransactionNum() {
        return transactionNum;
    }
    public void setTransactionNum(String transactionNum) {
        this.transactionNum = transactionNum;
    }
    @Override
    public String toString() {
        return "BjkHead [requestType=" + requestType + ", transactionNum=" + transactionNum + "]";
    }

}
