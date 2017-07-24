package by.htp.mail_ru_test.page;


import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailRuNewLetterPage {

	private WebDriver driver;
	private String justLetterText = "Hi there! It's Golosoff's test letter text.";
	
	By newLetterTo = By.xpath(".//textarea[@data-original-name='To']");
	By newLetterTheme = By.xpath(".//input[@name='Subject']");
	By newLeterTextArea = By.xpath(".//body[@id='tinymce']");
	By newLetterSendButton = By.xpath(".//div[@data-name='send']");
	By textAreaIframe = By.xpath(".//iframe[contains(@id,'toolkit')]");
	

	public MailRuNewLetterPage(WebDriver driver) {
		this.driver = driver;
	}

	public MailRuMessageSentNoticePage sendEMail(String toAdress, String justLetterTheme) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(newLetterSendButton));
		driver.findElement(newLetterTo).sendKeys(toAdress);
		driver.findElement(newLetterTheme).sendKeys(justLetterTheme);
		driver.switchTo().frame(driver.findElement(textAreaIframe));
		driver.findElement(newLeterTextArea).clear();
		driver.findElement(newLeterTextArea).sendKeys(justLetterText);
		driver.switchTo().defaultContent();
		driver.findElement(newLetterSendButton).click();
		return new MailRuMessageSentNoticePage(driver);
		
	}

}
