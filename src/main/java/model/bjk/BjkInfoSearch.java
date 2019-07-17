package model.bjk;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkInfoSearch {
    @XStreamAlias("requestType")
    private String requestType;
    @XStreamAlias("insuredName")
    private String insuredName;
    @XStreamAlias("insuredIdNo")
    private String insuredIdNo;
    @XStreamAlias("prepaidAmt")
    private String prepaidAmt;


    public String getPrepaidAmt() {
        return prepaidAmt;
    }

    public void setPrepaidAmt(String prepaidAmt) {
        this.prepaidAmt = prepaidAmt;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredIdNo() {
        return insuredIdNo;
    }

    public void setInsuredIdNo(String insuredIdNo) {
        this.insuredIdNo = insuredIdNo;
    }
}
