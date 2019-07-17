package config;

import lombok.Data;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by suqiaoe on 2019/4/9.
 */
@Data
public class TestConfig {
    //用户权限查询接口
    public static String authorityUrl;
    //微信端案件列表接口
    public static String caselistUrl;
    public static String getinsuredandinsuranceUrl;

    //保健康报案接口
    public static String bjkreportUrl;
    //保健康个人保险险种查询接口
    public static String bjkindividualinsuranceUrl;
    //保健康材料补充接口
    public  static String bjkpushpicUrl;
    //声明一个客户端
    public static DefaultHttpClient defaultHttpClient;
    //用来存储cookies信息的变量
    public static CookieStore store;
}
