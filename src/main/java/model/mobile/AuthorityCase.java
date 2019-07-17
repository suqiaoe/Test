package model.mobile;

import lombok.Data;

/**
 * Created by suqiaoe on 2019/4/9.
 */
@Data
public class AuthorityCase {
    private int ID;
    private String idNo;
    private String idType;
    private String systemType;
    private String insuranceCompanyName;
    private String code;
    private Boolean authority;

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }


    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Boolean getAuthority() {
        return authority;
    }

    public void setAuthority(Boolean authority) {
        this.authority = authority;
    }
}
