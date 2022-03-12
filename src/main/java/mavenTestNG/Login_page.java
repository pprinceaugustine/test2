package mavenTestNG;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends BasePage {

	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womentab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresstab;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement  tshirttab;
	
	public Login_page () {
		PageFactory.initElements(driver, this);
	}
	public WebElement womentabDisplay() {
		return womentab;
	}
	public WebElement dresstabDisplay() {
		return dresstab;
	}
	public WebElement tshirttabDisplay() {
		return tshirttab;
    }
    public void verifyWomenTab() {
	womentab.click();
}
    public void verifyDressTab() {
    	dresstab.click();
    }
    public void verifyTshirtTab() {
    	tshirttab.click();
    }
}






