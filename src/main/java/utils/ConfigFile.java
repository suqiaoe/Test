package utils;

import model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by suqiaoe on 2019/4/9.
 */
public class ConfigFile {
    private static ResourceBundle bundle=ResourceBundle.getBundle("application", Locale.CHINA);
     public static String getUrl(InterfaceName name){
         String url=bundle.getString("baseurl");
         String uri="";
         String testUrl;
         //微信端接口
         if(name == InterfaceName.AUTHORITY){
             uri=bundle.getString("getauthority.uri");
         }
         if(name == InterfaceName.CASELIST){
             uri=bundle.getString("caselist.uri");
         }
         if(name == InterfaceName.GETINSUREDADNINSURANCE){
             uri=bundle.getString("getinsuredandinsurance.uri");
         }
         if(name == InterfaceName.CASESAVE){
             uri=bundle.getString("casesave.uri");
         }
         if(name == InterfaceName.CASEINFO){
             uri=bundle.getString("caseinfo.uri");
         }
         if(name == InterfaceName.CASEDELETE){
             uri=bundle.getString("casedelete.uri");
         }
         if(name == InterfaceName.IMAGELIST){
             uri=bundle.getString("imagelist.uri");
         }
         if(name == InterfaceName.IMAGEUPLOAD){
             uri=bundle.getString("imageupload.uri");
         }
         if(name == InterfaceName.IMAGEDELETE){
             uri=bundle.getString("imagedelete.uri");
         }
         if(name == InterfaceName.IMAGEOCR){
             uri=bundle.getString("imageocr.uri");
         }
         //保健康接口
         if(name == InterfaceName.BJKREPORT){
             uri=bundle.getString("bjkreport.uri");
         }
         if(name == InterfaceName.INDIVIDUALININSURANCE){
             uri=bundle.getString("indicidualinsurance.uri");
         }
         if(name == InterfaceName.BJKPUSHPIC){
             uri=bundle.getString("bjkpushpic.uri");
         }
        testUrl=url+uri;
         return testUrl;
     }
}
