package cases.bjkTest;

import config.TestConfig;
import model.bjk.BjkReturnContent;
import model.InterfaceName;
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
import utils.ConfigFile;
import utils.DatabaseUtil;

import java.io.IOException;
import java.util.Map;

/**
 * Created by suqiaoe on 2019/4/17.
 */
public class BjkSelectIndividualInsuranceTest {
    @BeforeTest(groups = "bjkindividualinsurance",description = "测试准备工作，获取httpclient对象")
    public void beforeTest(){
        TestConfig.defaultHttpClient=new DefaultHttpClient();
        TestConfig.bjkindividualinsuranceUrl= ConfigFile.getUrl(InterfaceName.INDIVIDUALININSURANCE);
    }
    @Test(groups = "bjkreport",description = "测试")
    public void bjkindividualinsurance()throws IOException {
        SqlSession session= DatabaseUtil.getSqlSession();
        BjkReturnContent bjkreportcase=session.selectOne("Bjkindividualinsurance",2);
        System.out.println(TestConfig.bjkindividualinsuranceUrl);

        String result=getResult(bjkreportcase);
        System.out.println(result);
        JSONObject jsonObject = new JSONObject(result);
        String code=jsonObject.getString("code");


        Assert.assertEquals(code,bjkreportcase.getBaoCaseNo());


    }
    private String getResult(BjkReturnContent bjkreportcase ) throws IOException {
        //下边的代码为写完接口的测试代码
        HttpPost post = new HttpPost(TestConfig.bjkindividualinsuranceUrl);
        //JSONObject param = new JSONObject();
        Map<String,String> param = new java.util.HashMap<String,String>();
        String  baoCaseNo=bjkreportcase.getBaoCaseNo();
        String idNo=bjkreportcase.getApplicantCertNo();
        param.put("baoCaseNo",baoCaseNo);
        param.put("idNo",idNo);
        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
       // StringEntity entity = new StringEntity(param.toString(),"utf-8");
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象来进行响应结果的存储
        String result;
        //执行post方法
        HttpResponse response = TestConfig.defaultHttpClient.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        //System.out.println(result);
        TestConfig.store = TestConfig.defaultHttpClient.getCookieStore();
        return result;
    }
}
