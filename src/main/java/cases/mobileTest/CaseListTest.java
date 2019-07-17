package cases.mobileTest;

import config.TestConfig;
import model.InterfaceName;
import model.mobile.AuthorityCase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ConfigFile;
import utils.DatabaseUtil;

import java.io.IOException;

/**
 * Created by suqiaoe on 2019/4/30.
 */
public class CaseListTest {
    @BeforeTest(groups = "caselist",description = "准备工作")
    public  void beforeTest(){
        TestConfig.defaultHttpClient=new DefaultHttpClient();
        TestConfig.caselistUrl= ConfigFile.getUrl(InterfaceName.CASELIST);
        System.out.println(TestConfig.caselistUrl);
    }
  @Test(groups = "caselist",description = "测试")
    public void caselistTrue()throws IOException {
      SqlSession session= DatabaseUtil.getSqlSession();
      AuthorityCase authoritycase=session.selectOne("AuthorityCase",1);

  }
}
