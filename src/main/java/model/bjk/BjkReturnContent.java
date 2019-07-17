package model.bjk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkReturnContent {
    private Long id;
    /** 外层return的id*/
    private Long bjkReturnId;
    /** 保健康案件号*/
    private String baoCaseNo;
    /** 险种类型*/
    private String insuranceType;
    /** 保险名称*/
    private String insuranceName;
    /** 保单号*/
    private String policyNo;
    /** 收款银行名称*/
    private String accountBankName;
    /** 银行网点*/
    private String accidentDetailAddress;
    /** 账户名*/
    private String accountName;
    /** 收款账号*/
    private String accountNo;
    /** 收款账号类型*/
    private String accountType;
    /** 联系人电话*/
    private String contactPhone;
    /** 联系人邮箱*/
    private String contactEmail;
    /** 联系人地址*/
    private String contactAddress;
    /** 联系人姓名*/
    private String contactName;
    /** 联系人身份证号*/
    private String contactCertNo;
    /** 联系人证件类型*/
    private String contactCertType;
    /** 邮编*/
    private String postCode;
    /** 报案机构代码*/
    private String reportOrganization;
    /** 出险类型*/
    private String threatenedType;
    /** 事故类型*/
    private String accidentType;
    /** 就诊人姓名*/
    private String applicantName;
    /** 证件号码*/
    private String applicantCertNo;
    /** 投保团体*/
    private String insureOrganization;
    /** 申请金额*/
    private Double applyAmnt;
    /** 出险时间*/
    private String accidentTime;
    /** 照片数量*/
    private String picCount;
    /** 发票数量*/
    private String invoiceNum;
    /** 就诊医院*/
    private String hospital;
    /** 病因*/
    private String pathogeny;
    /** 所有照片信息*/
    private String picInfos;
    /** 批次号*/
    private String batchId;
    /** 理赔照片*/
    private List<BjkPicInfo> picInfoList = new ArrayList<BjkPicInfo>();
    /** 就诊类型*/
    private String seeDoctorType;
    /** tpa案件号*/
    private String claimNo;
    /** 结案日期*/
    private String endCaseDate;
    /** 年免赔额*/
    private BigDecimal outDutyAmnt;
    /** 赔付金额*/
    private BigDecimal realPay;
    /** ftp地址*/
    private String attach;
    /** 人保健核心案件号*/
    private String reptId;
    /** 受理日期*/
    private String rgtDate;
    /** 流水号*/
    private String serialNumber;

    private  String Code;
    /** 蚂蚁报案号*/
    private String channelCaseNo;
    public String getClaimNo() {
        return claimNo;
    }
    public void setClaimNo(String claimNo) {
        this.claimNo = claimNo;
    }
    public String getEndCaseDate() {
        return endCaseDate;
    }
    public void setEndCaseDate(String endCaseDate) {
        this.endCaseDate = endCaseDate;
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
    public String getSeeDoctorType() {
        return seeDoctorType;
    }
    public void setSeeDoctorType(String seeDoctorType) {
        this.seeDoctorType = seeDoctorType;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public String getContactCertNo() {
        return contactCertNo;
    }
    public void setContactCertNo(String contactCertNo) {
        this.contactCertNo = contactCertNo;
    }
    public String getContactCertType() {
        return contactCertType;
    }
    public void setContactCertType(String contactCertType) {
        this.contactCertType = contactCertType;
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
    public String getInsuranceType() {
        return insuranceType;
    }
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public String getPolicyNo() {
        return policyNo;
    }
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    public String getAccountBankName() {
        return accountBankName;
    }
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }
    public String getAccidentDetailAddress() {
        return accidentDetailAddress;
    }
    public void setAccidentDetailAddress(String accidentDetailAddress) {
        this.accidentDetailAddress = accidentDetailAddress;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getContactAddress() {
        return contactAddress;
    }
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }
    public String getReportOrganization() {
        return reportOrganization;
    }
    public void setReportOrganization(String reportOrganization) {
        this.reportOrganization = reportOrganization;
    }
    public String getThreatenedType() {
        return threatenedType;
    }
    public void setThreatenedType(String threatenedType) {
        this.threatenedType = threatenedType;
    }
    public String getAccidentType() {
        return accidentType;
    }
    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }
    public String getApplicantName() {
        return applicantName;
    }
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public String getApplicantCertNo() {
        return applicantCertNo;
    }
    public void setApplicantCertNo(String applicantCertNo) {
        this.applicantCertNo = applicantCertNo;
    }
    public String getInsureOrganization() {
        return insureOrganization;
    }
    public void setInsureOrganization(String insureOrganization) {
        this.insureOrganization = insureOrganization;
    }
    public Double getApplyAmnt() {
        return applyAmnt;
    }
    public void setApplyAmnt(Double applyAmnt) {
        this.applyAmnt = applyAmnt;
    }
    public String getAccidentTime() {
        return accidentTime;
    }
    public void setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
    }
    public String getPicCount() {
        return picCount;
    }
    public void setPicCount(String picCount) {
        this.picCount = picCount;
    }
    public String getInvoiceNum() {
        return invoiceNum;
    }
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    public String getHospital() {
        return hospital;
    }
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public String getPathogeny() {
        return pathogeny;
    }
    public void setPathogeny(String pathogeny) {
        this.pathogeny = pathogeny;
    }
    public String getPicInfos() {
        return picInfos;
    }
    public void setPicInfos(String picInfos) {
        this.picInfos = picInfos;
    }
    public String getBatchId() {
        return batchId;
    }
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    public List<BjkPicInfo> getPicInfoList() {
        return picInfoList;
    }
    public void setPicInfoList(List<BjkPicInfo> picInfoList) {
        this.picInfoList = picInfoList;
    }
    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public String getReptId() {
        return reptId;
    }
    public void setReptId(String reptId) {
        this.reptId = reptId;
    }
    public String getRgtDate() {
        return rgtDate;
    }
    public void setRgtDate(String rgtDate) {
        this.rgtDate = rgtDate;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getChannelCaseNo() {
        return channelCaseNo;
    }

    public void setChannelCaseNo(String channelCaseNo) {
        this.channelCaseNo = channelCaseNo;
    }

    @Override
    public String toString() {
        return "BjkReturnContent{" +
                "id=" + id +
                ", bjkReturnId=" + bjkReturnId +
                ", baoCaseNo='" + baoCaseNo + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                ", policyNo='" + policyNo + '\'' +
                ", accountBankName='" + accountBankName + '\'' +
                ", accidentDetailAddress='" + accidentDetailAddress + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", accountType='" + accountType + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactCertNo='" + contactCertNo + '\'' +
                ", contactCertType='" + contactCertType + '\'' +
                ", postCode='" + postCode + '\'' +
                ", reportOrganization='" + reportOrganization + '\'' +
                ", threatenedType='" + threatenedType + '\'' +
                ", accidentType='" + accidentType + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", applicantCertNo='" + applicantCertNo + '\'' +
                ", insureOrganization='" + insureOrganization + '\'' +
                ", applyAmnt=" + applyAmnt +
                ", accidentTime='" + accidentTime + '\'' +
                ", picCount='" + picCount + '\'' +
                ", invoiceNum='" + invoiceNum + '\'' +
                ", hospital='" + hospital + '\'' +
                ", pathogeny='" + pathogeny + '\'' +
                ", picInfos='" + picInfos + '\'' +
                ", batchId='" + batchId + '\'' +
                ", picInfoList=" + picInfoList +
                ", seeDoctorType='" + seeDoctorType + '\'' +
                ", claimNo='" + claimNo + '\'' +
                ", endCaseDate='" + endCaseDate + '\'' +
                ", outDutyAmnt=" + outDutyAmnt +
                ", realPay=" + realPay +
                ", attach='" + attach + '\'' +
                ", reptId='" + reptId + '\'' +
                ", rgtDate='" + rgtDate + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", channelCaseNo='" + channelCaseNo + '\'' +
                '}';
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getCode() {
        return Code;
    }
}
