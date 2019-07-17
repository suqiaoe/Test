package cases.mobileTest;

import config.TestConfig;
import model.mobile.AuthorityCase;
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

/**
 * Created by suqiaoe on 2019/4/9.
 */

public class AuthorityTest {
  @BeforeTest(groups = "authority",description = "测试准备工作，获取httpclient对象")
  public void beforeTest(){
    TestConfig.defaultHttpClient=new DefaultHttpClient();
    TestConfig.authorityUrl= ConfigFile.getUrl(InterfaceName.AUTHORITY);
    System.out.println(TestConfig.authorityUrl);
  }
  @Test(groups = "authority",description = "用户查询权限成功")
  public void authorityTrue()throws IOException {
    //测试准备工作，从数据库读请求参数
    SqlSession session= DatabaseUtil.getSqlSession();
    AuthorityCase authoritycase=session.selectOne("AuthorityCase",1);

    //执行测试
    String result=getResult(authoritycase);
    JSONObject jsonObject = new JSONObject(result);
    String code=jsonObject.getString("code");
    String insuranceCompanyName=jsonObject.getJSONObject("successResult").getString("insuranceCompanyName");
    Boolean authority=jsonObject.getJSONObject("successResult").getBoolean("authority");
    //判断响应结果里的code、权限、保险公司名字
    Assert.assertEquals(code,authoritycase.getCode());
    Assert.assertEquals(authority,authoritycase.getAuthority());
    Assert.assertEquals(insuranceCompanyName,authoritycase.getInsuranceCompanyName());

  }
  @Test(groups = "authority",description = "用户查询权限失败")
  public void authorityFalse()throws IOException{
    SqlSession session= DatabaseUtil.getSqlSession();
    AuthorityCase authoritycase=session.selectOne("AuthorityCase",2);
    System.out.println(TestConfig.authorityUrl);

    String result=getResult(authoritycase);
    JSONObject jsonObject = new JSONObject(result);
    String code=jsonObject.getString("code");
    String insuranceCompanyName=jsonObject.getJSONObject("successResult").getString("insuranceCompanyName");
    Boolean authority=jsonObject.getJSONObject("successResult").getBoolean("authority");
    //判断响应结果里的code、权限、保险公司名字
    Assert.assertEquals(code,authoritycase.getCode());
    Assert.assertEquals(authority,authoritycase.getAuthority());
    Assert.assertEquals(insuranceCompanyName,authoritycase.getInsuranceCompanyName());


  }
  @Test(groups = "authority",description = "唯一号查询权限")
  public void authorityID()throws IOException{
    SqlSession session= DatabaseUtil.getSqlSession();
    AuthorityCase authoritycase=session.selectOne("AuthorityCase",3);
    System.out.println(TestConfig.authorityUrl);

    String result=getResult(authoritycase);
    JSONObject jsonObject = new JSONObject(result);
    String code=jsonObject.getString("code");
    String insuranceCompanyName=jsonObject.getJSONObject("successResult").getString("insuranceCompanyName");
    Boolean authority=jsonObject.getJSONObject("successResult").getBoolean("authority");
    //判断响应结果里的code、权限、保险公司名字
    Assert.assertEquals(code,authoritycase.getCode());
    Assert.assertEquals(authority,authoritycase.getAuthority());
    Assert.assertEquals(insuranceCompanyName,authoritycase.getInsuranceCompanyName());
  }
  private String getResult(AuthorityCase authoritycase) throws IOException {
    //下边的代码为写完接口的测试代码
    HttpPost post = new HttpPost(TestConfig.authorityUrl);
    JSONObject param = new JSONObject();
    param.put("idNo",authoritycase.getIdNo());
    param.put("idType",authoritycase.getIdType());
    param.put("systemType",authoritycase.getSystemType());
    System.out.println("请求参数："+param);
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
    System.out.println("响应结果："+result);
    TestConfig.store = TestConfig.defaultHttpClient.getCookieStore();
    return result;
  }
}
