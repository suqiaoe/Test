package model.bjk;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkPicInfo {
    private Long id;
    private Long bjkReturnId;
    private Long bjkReturnContentId;
    private String picKey;
    /** url*/
    private String picUrl;
    /** 单证类型*/
    private Integer documentType;
    /** 照片类型*/
    private Integer picType;


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
    public Long getBjkReturnContentId() {
        return bjkReturnContentId;
    }
    public void setBjkReturnContentId(Long bjkReturnContentId) {
        this.bjkReturnContentId = bjkReturnContentId;
    }
    public String getPicKey() {
        return picKey;
    }
    public void setPicKey(String picKey) {
        this.picKey = picKey;
    }
    public String getPicUrl() {
        return picUrl;
    }
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    public Integer getDocumentType() {
        return documentType;
    }
    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }
    public Integer getPicType() {
        return picType;
    }
    public void setPicType(Integer picType) {
        this.picType = picType;
    }
    @Override
    public String toString() {
        return "PicInfo [id=" + id + ", bjkReturnId=" + bjkReturnId + ", bjkReturnContentId=" + bjkReturnContentId
                + ", picKey=" + picKey + ", picUrl=" + picUrl + ", documentType=" + documentType + ", picType="
                + picType + ", getId()=" + getId() + ", getBjkReturnId()=" + getBjkReturnId()
                + ", getBjkReturnContentId()=" + getBjkReturnContentId() + ", getPicKey()=" + getPicKey()
                + ", getPicUrl()=" + getPicUrl() + ", getDocumentType()=" + getDocumentType() + ", getPicType()="
                + getPicType() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
}
