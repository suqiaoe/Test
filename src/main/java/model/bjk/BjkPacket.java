package model.bjk;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by suqiaoe on 2019/4/17.
 */
@XStreamAlias("PACKET")
public class BjkPacket {
        /** packet标签中需要的属性*/
        private String version;
        private String type;
        @XStreamAlias("HEAD")
        private BjkHead bjkHead;
        /**
         * 个团的body
         */
        /** 保健康传输的外层据*/
        private BjkReturn bjkReturnBody;
        /** 保健康报案传输的内层数据*/
        private BjkReturnContent bjkReturnContentBody;
        /** 保健康信息查询接口--垫付金额*/
        private BjkInfoSearch bjkInfoSearch;

        /** 案件状态（picc）保健康传输的内层数据*/
        private BjkPicStatus bjkPicStatus;

        /** 理赔进度推送内层数据*/
        private BjkProgress bjkProgress;

        /** 保健康报案我方响应数据*/
        private BjkReportResponse bjkReportResponse;

        /** 个险的body*/
        @XStreamAlias("BODY")
        private BjkBody bjkBody;


        public BjkInfoSearch getBjkInfoSearch() {
            return bjkInfoSearch;
        }

        public void setBjkInfoSearch(BjkInfoSearch bjkInfoSearch) {
            this.bjkInfoSearch = bjkInfoSearch;
        }

        public BjkReportResponse getBjkReportResponse() {
            return bjkReportResponse;
        }

        public void setBjkReportResponse(BjkReportResponse bjkReportResponse) {
            this.bjkReportResponse = bjkReportResponse;
        }

        public BjkProgress getBjkProgress() {
            return bjkProgress;
        }

        public void setBjkProgress(BjkProgress bjkProgress) {
            this.bjkProgress = bjkProgress;
        }

        public BjkPicStatus getBjkPicStatus() {
            return bjkPicStatus;
        }

        public void setBjkPicStatus(BjkPicStatus bjkPicStatus) {
            this.bjkPicStatus = bjkPicStatus;
        }

        public BjkBody getBjkBody() {
            return bjkBody;
        }

        public void setBjkBody(BjkBody bjkBody) {
            this.bjkBody = bjkBody;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public BjkHead getBjkHead() {
            return bjkHead;
        }

        public void setBjkHead(BjkHead bjkHead) {
            this.bjkHead = bjkHead;
        }

        public BjkReturnContent getBjkReturnContentBody() {
            return bjkReturnContentBody;
        }

        public void setBjkReturnContentBody(BjkReturnContent bjkReturnContentBody) {
            this.bjkReturnContentBody = bjkReturnContentBody;
        }

        public BjkReturn getBjkReturnBody() {
            return bjkReturnBody;
        }

        public void setBjkReturnBody(BjkReturn bjkReturnBody) {
            this.bjkReturnBody = bjkReturnBody;
        }


    }
