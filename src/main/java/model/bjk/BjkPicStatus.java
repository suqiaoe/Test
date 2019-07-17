package model.bjk;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkPicStatus {
    private Long id;
    private Long bjkReturnId;
    @XStreamAlias("baoCaseNo")
    private String baoCaseNo;
    @XStreamAlias("tpaCaseNo")
    private String tpaCaseNo;
    @XStreamAlias("transactionNum")
    private String transactionNum;
    @XStreamAlias("requestType")
    private String requestType;
    @XStreamAlias("status")
    private String status;
    @XStreamAlias("statusDesc")
    private String statusDesc;
    @XStreamAlias("serviceName")
    private String serviceName;
    @XStreamAlias("piccCoreResp")
    private String piccCoreResp;
    @XStreamAlias("attach")
    private String attach;



    public String getAttach() {
        return attach;
    }
    public void setAttach(String attach) {
        this.attach = attach;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getBjkReturnId() {
        return bjkReturnId;
    }
    public void setBjkReturnId(Long bjkReturnId) {
        this.bjkReturnId = bjkReturnId;
    }
    public String getBaoCaseNo() {
        return baoCaseNo;
    }
    public void setBaoCaseNo(String baoCaseNo) {
        this.baoCaseNo = baoCaseNo;
    }
    public String getTpaCaseNo() {
        return tpaCaseNo;
    }
    public void setTpaCaseNo(String tpaCaseNo) {
        this.tpaCaseNo = tpaCaseNo;
    }
    public String getTransactionNum() {
        return transactionNum;
    }
    public void setTransactionNum(String transactionNum) {
        this.transactionNum = transactionNum;
    }
    public String getRequestType() {
        return requestType;
    }
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatusDesc() {
        return statusDesc;
    }
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getPiccCoreResp() {
        return piccCoreResp;
    }
    public void setPiccCoreResp(String piccCoreResp) {
        this.piccCoreResp = piccCoreResp;
    }


}
