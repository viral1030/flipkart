package com.flipkart.page.indexpage;

import javax.management.loading.PrivateClassLoader;
import javax.management.loading.PrivateMLet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Init.Common;
import com.flipkart.pages.AbstractPage;
import com.flipkart.pages.DashboardPage;

public class IndexPage extends AbstractPage {

	public IndexPage(WebDriver driver) {
		
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	/*
	 * @FindBy(xpath = ".//*[@id='email']") private WebElement email;
	 * 
	 * @FindBy(xpath = ".//*[@id='pass']") private WebElement pass;
	 * 
	 * @FindBy(xpath = ".//*[@id='loginbutton']") private WebElement submit;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public DashboardPage login() {
	 * 
	 * email.clear(); email.sendKeys("krazzyvir@gmail.com");
	 * 
	 * pass.clear(); pass.sendKeys("8518krazzyvir1933");
	 * 
	 * pass.submit();
	 * 
	 * return new DashboardPage(driver);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @FindBy(xpath = ".//*[@id='u_0_1x']") private WebElement post;
	 * 
	 * 
	 * @FindBy(xpath=".//*[@id='u_0_1m']/div/div[4]/div/ul/li[3]/button")
	 * private WebElement button;
	 * 
	 * public DashboardPage post_fb() { email.clear();
	 * email.sendKeys("krazzyvir@gmail.com");
	 * 
	 * pass.clear(); pass.sendKeys("8518krazzyvir1933");
	 * 
	 * pass.submit();
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 5);
	 * wait.until(ExpectedConditions
	 * .presenceOfElementLocated(By.linkText("okey")));
	 * 
	 * 
	 * 
	 * post.sendKeys(
	 * "Life is not a problem to be solved, but a reality to be experienced. ");
	 * button.click();
	 * 
	 * 
	 * return new DashboardPage(driver);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @FindBy(xpath=".//*[@id='gbwa']/div[1]/a") private WebElement box;
	 * 
	 * @FindBy(xpath=".//*[@id='gb23']/span[1]") private WebElement
	 * gmail_button;
	 * 
	 * @FindBy(xpath=".//*[@id='gmail-sign-in']") private WebElement signin;
	 * 
	 * @FindBy(xpath=".//*[@id='Email']") private WebElement email_google;
	 * 
	 * @FindBy(xpath=".//*[@id='Passwd']") private WebElement passwd;
	 * 
	 * @FindBy(xpath=".//*[@id='signIn']") private WebElement submit_sigin;
	 * 
	 * 
	 * 
	 * 
	 * public DashboardPage google_search() { box.click(); gmail_button.click();
	 * 
	 * signin.click(); email_google.clear();
	 * 
	 * email_google.sendKeys("Krazzyvir@gmail.com");
	 * 
	 * passwd.clear();
	 * 
	 * passwd.sendKeys("8518krazzyvir1933");
	 * 
	 * submit_sigin.click();
	 * 
	 * return new DashboardPage(driver);
	 * 
	 * }
	 */

	@FindBy(xpath = ".//*[@id='fk-top-search-box']")
	private WebElement searchbox;

	@FindBy(xpath = ".//*[@id='fk-header-search-form']/div/div/div[2]/input[1]")
	private WebElement searchbutton;
	
	
	@FindBy(xpath =".//*[@id='price_range']/li[7]/a/input")
	private WebElement pricerange;
	
	@FindBy(xpath=".//*[@id='price_range']/li[7]/a/input")
	private WebElement brand_filter1;
	
	@FindBy(xpath="")
	private WebElement brand_filter2;
	public DashboardPage flipkart_search() {

		common.pause(3);
		searchbox.sendKeys("nokia");

		searchbutton.click();
		common.pause(3);
		pricerange.click();
		common.pause(3);

		
		return new DashboardPage(driver);
	}

	@FindBy(xpath = ".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[5]/a")
	private WebElement login;

	@FindBy(xpath = ".//*[@id='fk-mainbody-id']/div/div/div[1]/div[3]/a")
	private WebElement signup;

	@FindBy(xpath = ".//*[@id='signup_email_id']")
	private WebElement email;

	@FindBy(xpath = ".//*[@id='signup_password']")
	private WebElement password;

	@FindBy(xpath = ".//*[@id='signup_password_repeat']")
	private WebElement repass;

	@FindBy(xpath = ".//*[@id='fk-mainbody-id']/div/div/div[1]/div/div[6]/div[2]/a")
	private WebElement signupnow;

	@FindBy(xpath=".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[4]/ul/li[9]/a")
	private WebElement logout;
	
	@FindBy(xpath=".//*[@id='fk-mainhead-id']/div[1]/div/div[1]")
	private WebElement MyAccount;
	
	Common common = new Common(driver);

	public DashboardPage flipkart_signup() {

		login.click();

		signup.click();

		email.sendKeys("kryfdggdsdterwzxcsfsra@gmail.com");
		common.pause(1);
		password.sendKeys("1028krazzyvir");
		common.pause(1);
		repass.sendKeys("1028krazzyvir");
        common.pause(1);
		signupnow.click();
		common.pause(4);
/*
		Actions action = new Actions(driver);
		WebElement we1 = driver.findElement(By
				.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[1]"));

		
		common.pause(3);
		action.moveToElement(we1).moveToElement(MyAccount).build()
				.perform();

		common.pause(3);
		common.waitForElement(".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[4]/ul/li[9]/a");
		logout.click();
*/		return new DashboardPage(driver);
	}

	@FindBy(xpath = ".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[5]/a")
	private WebElement we;

	@FindBy(xpath = ".//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[1]/a")
	private WebElement move_to_element;

	@FindBy(xpath = ".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[4]/a")
	private WebElement select_element;

	
	
	public DashboardPage filter_flipcart() throws Exception {

		Actions action = new Actions(driver);
		WebElement we1 = driver.findElement(By
				.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[1]/a/img"));

		System.out.println("move to element electrical");

		/*
		 * action.moveToElement(driver.findElement(By.xpath(
		 * ".//*[@id='fk-mainhead-id']/div[2]/div/div[1]/ul/li[1]/a/span"
		 * ))).build().perform();
		 */
		common.pause(3);
		action.moveToElement(we).moveToElement(move_to_element).build()
				.perform();
		System.out.println("after moving to electrical ");
		common.pause(3);
		common.log(" after move to the electrical element");
		common.log("wait for the element nokia display");
		/* common.pause(2); */
		/*
		 * common.waitForElement(
		 * ".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[4]/a");
		 */

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath(".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[4]/a")));

		select_element.click();

		return new DashboardPage(driver);
	}

}
