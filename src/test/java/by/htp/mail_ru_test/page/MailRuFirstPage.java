package by.htp.mail_ru_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MailRuFirstPage {

	private WebDriver driver;
	By loginField = By.xpath(".//input[@id = 'mailbox__login']"); //mailbox__password https://e.mail.ru/login?from=main&rf=mail.ru
	By passwordField = By.xpath(".//input[@id = 'mailbox__password']");
	By loginButton = By.xpath(".//input[@id = 'mailbox__auth__button']");
	

	public MailRuFirstPage(WebDriver driver) {
		this.driver = driver;
	}

	public MailRuInboxPage login(String login, String pasword) {

		driver.findElement(loginField).sendKeys(login);
		driver.findElement(passwordField).sendKeys(pasword);
		driver.findElement(loginButton).click();
		return new MailRuInboxPage(driver);
	}


}
