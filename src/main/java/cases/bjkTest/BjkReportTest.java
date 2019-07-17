package cases.bjkTest;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;
import config.TestConfig;
import model.*;
import model.bjk.BjkPacket;
import model.bjk.BjkPicInfo;
import model.bjk.BjkReturn;
import model.bjk.BjkReturnContent;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.BjkUtil;
import utils.ConfigFile;
import utils.DatabaseUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkReportTest {
        @BeforeTest(groups = "bjkreport",description = "测试准备工作，获取httpclient对象")
        public void beforeTest(){
            TestConfig.defaultHttpClient=new DefaultHttpClient();
            TestConfig.bjkreportUrl= ConfigFile.getUrl(InterfaceName.BJKREPORT);
        }
        @Test(groups = "bjkreport",description = "测试")
        public void bjkreport1()throws IOException {
            SqlSession session= DatabaseUtil.getSqlSession();
            BjkPicInfo picInfo=session.selectOne("BjkPicInfo",4);
            BjkReturnContent bjkreportcase=session.selectOne("BjkReturnContent",4);
            System.out.println(TestConfig.bjkreportUrl);

            String result=getResult(bjkreportcase,picInfo);
            JSONObject jsonObject = new JSONObject(result);
            String code=jsonObject.getString("code");

            Assert.assertEquals(code,bjkreportcase.getCode());
        }
        @Test(groups = "bjkreport",description = "测试")
        public void bjkreport2()throws IOException {
            SqlSession session= DatabaseUtil.getSqlSession();
            BjkPicInfo picInfo=session.selectOne("BjkPicInfo",2);
            BjkReturnContent bjkreportcase=session.selectOne("BjkReturnContent",2);
            System.out.println(TestConfig.bjkreportUrl);

            String result=getResult(bjkreportcase,picInfo);
            JSONObject jsonObject = new JSONObject(result);
            String code=jsonObject.getString("code");

            Assert.assertEquals(code,bjkreportcase.getCode());
    }
        private String getResult(BjkReturnContent bjkreportcase, BjkPicInfo picInfo ) throws IOException {
            //下边的代码为写完接口的测试代码
            HttpPost post = new HttpPost(TestConfig.bjkreportUrl);
            JSONObject param = new JSONObject();
            List<BjkPicInfo> picInfoList = new ArrayList<BjkPicInfo>(1);
            picInfo.getPicKey();
            picInfo.getPicUrl();
            picInfo.getDocumentType();
            picInfo.getPicType();

		    picInfoList.add(picInfo);
            bjkreportcase.setPicInfoList(picInfoList);
            //报案接口必填项
            bjkreportcase.getBaoCaseNo();
            bjkreportcase.getInsuranceType();
            bjkreportcase.getAccountName();
            bjkreportcase.getAccountNo();
            bjkreportcase.getContactPhone();
            bjkreportcase.getContactName();
            bjkreportcase.getAccidentType();
            bjkreportcase.getApplicantName();
            bjkreportcase.getApplicantCertNo();
            bjkreportcase.getApplyAmnt();
            bjkreportcase.getAccidentTime();
            bjkreportcase.getPicCount();
            bjkreportcase.getHospital();
            bjkreportcase.getSeeDoctorType();
            //报案接口非必填项
            bjkreportcase.getInsuranceName();
            bjkreportcase.getPolicyNo();
            bjkreportcase.getAccountBankName();
            bjkreportcase.getContactEmail();
            bjkreportcase.getPostCode();
            bjkreportcase.getReportOrganization();
            bjkreportcase.getThreatenedType();
            bjkreportcase.getAccidentDetailAddress();
            bjkreportcase.getInvoiceNum();
            bjkreportcase.getPathogeny();
            bjkreportcase.getBatchId();
            bjkreportcase.getContactAddress();
            bjkreportcase.getInsureOrganization();

            BjkPacket bjkPacket1 = new BjkPacket();
            bjkPacket1.setVersion("1.0");
            bjkPacket1.setType("REQUEST");
            bjkPacket1.setBjkReturnContentBody(bjkreportcase);
            //bjkXml1.setBjkBody(bjkBody1);
            XStream xStream3 = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));
            xStream3.alias("PACKET", BjkPacket.class);
            xStream3.useAttributeFor(BjkPacket.class, "version");
            xStream3.useAttributeFor(BjkPacket.class, "type");
            xStream3.aliasField("BODY", BjkPacket.class, "bjkReturnContentBody");
            xStream3.alias("PicInfo", BjkPicInfo.class);
            String xmlString1 = xStream3.toXML(bjkPacket1);
            String XML1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+xmlString1;

            String content = null;
            try {
                content = BjkUtil.encryptBase64("1000000000000001", XML1);
            } catch (Exception e) {
                //logger.error("异常", e);
            }
            //logger.info("content==="+content);

            String Rcontent = "<?xml version='1.0' encoding='UTF-8'?>" +
                    "<PACKET version='1.0' type='REQUEST'>" +
                    "<BODY> " +
                    "<tpaId>001</tpaId> " +
                    "<content>"+content+"</content>"+
                    "<UUID>0b356bc651974a859bc2d4c4bf401d99</UUID> " +
                    "<serviceName>bao.insurance.claim.caseReport.report</serviceName> " +
                    "<timeStamp>1540973065126</timeStamp> " +
                    "<contentType>xml</contentType> " +
                    "<fileName>PH_LPCR_20180611_1333344911002.xml</fileName> " +
                    "<tpaCaseNo>3929731723888641</tpaCaseNo> " +
                    "<baoCaseNo>20190417123456700</baoCaseNo> " +
                    "</BODY> " +
                    "</PACKET>";
            //System.out.println(Rcontent);
            param.put("xml",Rcontent);
            //设置请求头信息 设置header
            post.setHeader("content-type","application/json");
            //将参数信息添加到方法中
            StringEntity entity = new StringEntity(param.toString(),"utf-8");
            post.setEntity(entity);
            //声明一个对象来进行响应结果的存储
            String result;
            //执行post方法
            HttpResponse response = TestConfig.defaultHttpClient.execute(post);
            //获取响应结果
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            //System.out.println(result);
            //TestConfig.store = TestConfig.defaultHttpClient.getCookieStore();
            JSONObject jsonObject = new JSONObject(result);
            String successResult=jsonObject.getString("successResult");
            System.out.println(successResult);
            XStream xStream = new XStream();

            BjkPacket bjkPacket = null;
            xStream.aliasField("BODY", BjkPacket.class,"bjkReturnBody");
            xStream.alias("PACKET", BjkPacket.class);

            bjkPacket = (BjkPacket)xStream.fromXML(successResult);
            BjkReturn bjkReturn = bjkPacket.getBjkReturnBody();

            String key = "1000000000000001";
            String key1 = "rbsz!2018QDDF878bZdlDG!201UJHKDCaerfd";
            String decryptBase64 = BjkUtil.decryptBase64(key, bjkReturn.getContent());
            String requestXml = BjkUtil.encryptBase64(key1, decryptBase64);
            System.out.println(decryptBase64);
            return result;


        }
}


