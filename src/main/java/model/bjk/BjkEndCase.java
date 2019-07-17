package model.bjk;

import java.math.BigDecimal;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkEndCase {
    //baocaseno
    private String caseNo;
    private String contNO;
    private String idNo;
    //@JSONField(format = "yyyy-MM-dd")
    private String endCaseDate;
    private String claimNo;
    private BigDecimal outDutyAmnt;
    private BigDecimal realPay;
    //ftp地址
    private String attach;
    private Integer requestNumber;
    private String regtId;
    public String getCaseNo() {
        return caseNo;
    }
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }
    public String getContNO() {
        return contNO;
    }
    public void setContNO(String contNO) {
        this.contNO = contNO;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public String getEndCaseDate() {
        return endCaseDate;
    }
    public void setEndCaseDate(String endCaseDate) {
        this.endCaseDate = endCaseDate;
    }
    public String getClaimNo() {
        return claimNo;
    }
    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }
    public BigDecimal getOutDutyAmnt() {
        return outDutyAmnt;
    }
    public void setOutDutyAmnt(BigDecimal outDutyAmnt) {
        this.outDutyAmnt = outDutyAmnt;
    }
    public BigDecimal getRealPay() {
        return realPay;
    }
    public void setRealPay(BigDecimal realPay) {
        this.realPay = realPay;
    }
    public String getAttach() {
        return attach;
    }
    public void setAttach(String attach) {
        this.attach = attach;
    }
    public Integer getRequestNumber() {
        return requestNumber;
    }
    public void setRequestNumber(Integer requestNumber) {
        this.requestNumber = requestNumber;
    }
    public String getRegtId() {
        return regtId;
    }
    public void setRegtId(String regtId) {
        this.regtId = regtId;
    }
}
