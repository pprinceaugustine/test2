package mavenTestNG;

import static org.junit.Assert.*;

import javax.net.ssl.HostnameVerifier;

import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

import graphql.Assert;

public class Login_test_page {
 Login_page loginpageobj;
 
 public Login_test_page () {
	loginpageobj = new Login_page();
}
 @Test
 public void getTabDisplay(){
 Assert.assertTrue(loginpageobj.womentabDisplay().isDisplayed());
 }
@Test
public void getverifyTabDisplay(){
loginpageobj.verifyWomenTab();
String title = loginpageobj.getTitlte();
Assert.assertTrue(title.contains("women"));
}

}
