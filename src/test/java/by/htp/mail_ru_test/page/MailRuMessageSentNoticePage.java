package by.htp.mail_ru_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRuMessageSentNoticePage {

	private WebDriver driver;
	private By letterSentNotice = By.xpath(".//div[@class = 'message-sent__title']");
	private By goesToSent = By.linkText("Отправленные");

	public MailRuMessageSentNoticePage(WebDriver driver) {
		this.driver  = driver;
	}

	public boolean checkForLetterSentMessage() {
		boolean isLetterSentMessagePresent = false;
		
		if (driver.findElements(letterSentNotice).size() > 0){
			isLetterSentMessagePresent = true;
		}
		return isLetterSentMessagePresent;
	}

	public MailRuSentPage goesToSent() {
		driver.findElement(goesToSent).click();
		return new MailRuSentPage(driver);
	}

}
