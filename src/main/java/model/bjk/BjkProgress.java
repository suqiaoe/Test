package model.bjk;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkProgress {
    private Long id;
    @XStreamAlias("baoCaseNo")
    private String baoCaseNo;
    @XStreamAlias("tpaCaseNo")
    private String tpaCaseNo;
    @XStreamAlias("tpaClaimNo")
    private String tpaClaimNo;
    @XStreamAlias("reptId")
    private String reptId;
    @XStreamAlias("accidentResult")
    private String accidentResult;
    @XStreamAlias("claimConclusion")
    private Integer claimConclusion;
    @XStreamAlias("caseStatus")
    private Integer caseStatus;
    @XStreamAlias("isSupplement")
    private String isSupplement;
    @XStreamAlias("statusRemark")
    private String statusRemark;
    @XStreamAlias("claimTotalAmount")
    private Double claimTotalAmout;
    @XStreamAlias("closeTime")
//	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private String closeTime;
    @XStreamAlias("caseRejectReason")
    private String caseRejectReason;
    @XStreamAlias("caseRejectTime")
//	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private String caseRejectTime;
    @XStreamAlias("caseCancelReason")
    private String caseCancelReason;
    @XStreamAlias("caseCancelTime")
//	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private String caseCancelTime;


    /**
     * 推送进度所需要的参数
     * @return
     */
    private String progress;
    private String money;
    private String problemReason;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date problemTime;
    //是否可补充材料
    private String yesOrNo;

    private BjkEndCase endCase;

    @XStreamAlias("supplementRemark")
    private String supplementRemark;

    @XStreamAlias("caseStage")
    private Integer caseStage;

    @XStreamAlias("statusTime")
    private String statusTime;


    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public Integer getCaseStage() {
        return caseStage;
    }

    public void setCaseStage(Integer caseStage) {
        this.caseStage = caseStage;
    }

    public String getYesOrNo() {
        return yesOrNo;
    }

    public void setYesOrNo(String yesOrNo) {
        this.yesOrNo = yesOrNo;
    }

    public String getSupplementRemark() {
        return supplementRemark;
    }

    public void setSupplementRemark(String supplementRemark) {
        this.supplementRemark = supplementRemark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTpaClaimNo() {
        return tpaClaimNo;
    }

    public void setTpaClaimNo(String tpaClaimNo) {
        this.tpaClaimNo = tpaClaimNo;
    }

    public String getReptId() {
        return reptId;
    }

    public void setReptId(String reptId) {
        this.reptId = reptId;
    }

    public String getAccidentResult() {
        return accidentResult;
    }

    public void setAccidentResult(String accidentResult) {
        this.accidentResult = accidentResult;
    }

    public Integer getClaimConclusion() {
        return claimConclusion;
    }

    public void setClaimConclusion(Integer claimConclusion) {
        this.claimConclusion = claimConclusion;
    }

    public Integer getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getIsSupplement() {
        return isSupplement;
    }

    public void setIsSupplement(String isSupplement) {
        this.isSupplement = isSupplement;
    }

    public String getStatusRemark() {
        return statusRemark;
    }

    public void setStatusRemark(String statusRemark) {
        this.statusRemark = statusRemark;
    }

    public Double getClaimTotalAmout() {
        return claimTotalAmout;
    }

    public void setClaimTotalAmout(Double claimTotalAmout) {
        this.claimTotalAmout = claimTotalAmout;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getCaseRejectReason() {
        return caseRejectReason;
    }

    public void setCaseRejectReason(String caseRejectReason) {
        this.caseRejectReason = caseRejectReason;
    }

    public String getCaseRejectTime() {
        return caseRejectTime;
    }

    public void setCaseRejectTime(String caseRejectTime) {
        this.caseRejectTime = caseRejectTime;
    }

    public String getCaseCancelReason() {
        return caseCancelReason;
    }

    public void setCaseCancelReason(String caseCancelReason) {
        this.caseCancelReason = caseCancelReason;
    }

    public String getCaseCancelTime() {
        return caseCancelTime;
    }

    public void setCaseCancelTime(String caseCancelTime) {
        this.caseCancelTime = caseCancelTime;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getProblemReason() {
        return problemReason;
    }

    public void setProblemReason(String problemReason) {
        this.problemReason = problemReason;
    }

    public Date getProblemTime() {
        return problemTime;
    }

    public void setProblemTime(Date problemTime) {
        this.problemTime = problemTime;
    }

    public BjkEndCase getEndCase() {
        return endCase;
    }

    public void setEndCase(BjkEndCase endCase) {
        this.endCase = endCase;
    }

}
