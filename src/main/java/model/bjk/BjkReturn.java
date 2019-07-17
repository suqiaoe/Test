package model.bjk;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkReturn {
    private Long id;
    /** 合作伙伴编码*/
    private String tpaId;
    /** 业务数据*/
    private String content;
    /** 唯一标识*/
    private String UUID;
    /** 接口标识*/
    private String serviceName;
    /** 时间戳、毫秒数*/
    private Long timeStamp;
    /** 返回码*/
    private Integer errorCode;
    /** 具体成功失败文字说明*/
    private String errorMsg;
    /** 文件类型*/
    private String contentType;
    /** 文件名*/
    private String fileName;
    /** 扩展字段*/
    private String attach;
    /** tpa案件号*/
    private String tpaCaseNo;
    /** 保健康案件号*/
    private String baoCaseNo;
    /** 理算完成通知信息导入接口标识*/
    private String infoImport;
    /** 理赔进度-初审响应码*/
    private Integer firstErrorCode;
    /** 理赔进度-初审信息*/
    private String firstErrorMsg;
    /** 理赔进度-复核响应码*/
    private Integer againErrorCode;
    /** 理赔进度-复核响应信息*/
    private String againErrorMsg;
    /** 请求次数 */
    private Integer requestNumber;

    private String batchId;


    public String getInfoImport() {
        return infoImport;
    }
    public void setInfoImport(String infoImport) {
        this.infoImport = infoImport;
    }
    public Integer getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorMsg() {
        return errorMsg;
    }
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTpaId() {
        return tpaId;
    }
    public void setTpaId(String tpaId) {
        this.tpaId = tpaId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getUUID() {
        return UUID;
    }
    public void setUUID(String uUID) {
        UUID = uUID;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public Long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getAttach() {
        return attach;
    }
    public void setAttach(String attach) {
        this.attach = attach;
    }
    public String getTpaCaseNo() {
        return tpaCaseNo;
    }
    public void setTpaCaseNo(String tpaCaseNo) {
        this.tpaCaseNo = tpaCaseNo;
    }
    public String getBaoCaseNo() {
        return baoCaseNo;
    }
    public void setBaoCaseNo(String baoCaseNo) {
        this.baoCaseNo = baoCaseNo;
    }
    public Integer getFirstErrorCode() {
        return firstErrorCode;
    }
    public void setFirstErrorCode(Integer firstErrorCode) {
        this.firstErrorCode = firstErrorCode;
    }
    public String getFirstErrorMsg() {
        return firstErrorMsg;
    }
    public void setFirstErrorMsg(String firstErrorMsg) {
        this.firstErrorMsg = firstErrorMsg;
    }
    public Integer getAgainErrorCode() {
        return againErrorCode;
    }
    public void setAgainErrorCode(Integer againErrorCode) {
        this.againErrorCode = againErrorCode;
    }
    public String getAgainErrorMsg() {
        return againErrorMsg;
    }
    public void setAgainErrorMsg(String againErrorMsg) {
        this.againErrorMsg = againErrorMsg;
    }
    public Integer getRequestNumber() {
        return requestNumber;
    }
    public void setRequestNumber(Integer requestNumber) {
        this.requestNumber = requestNumber;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    @Override
    public String toString() {
        return "BjkReturn [id=" + id + ", tpaId=" + tpaId + ", content=" + content + ", UUID=" + UUID + ", serviceName="
                + serviceName + ", timeStamp=" + timeStamp + ", errorCode=" + errorCode + ", errorMsg=" + errorMsg
                + ", contentType=" + contentType + ", fileName=" + fileName + ", attach=" + attach + ", tpaCaseNo="
                + tpaCaseNo + ", baoCaseNo=" + baoCaseNo + ", infoImport=" + infoImport + ", firstErrorCode="
                + firstErrorCode + ", firstErrorMsg=" + firstErrorMsg + ", againErrorCode=" + againErrorCode
                + ", againErrorMsg=" + againErrorMsg + ", requestNumber=" + requestNumber + "]";
    }

}
