package by.htp.mail_ru_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRuInboxPage {

	private WebDriver driver;
	By goesToSent = By.linkText("Отправленные");
//	By newletter = By.xpath(".//a[@data-title='Написать письмо (N)']");
	By newletter = By.xpath(".//a[@data-name = 'compose']");

	public MailRuInboxPage(WebDriver driver) {
		this.driver = driver;
	}

	public MailRuSentPage goesToSent() {
		driver.findElement(goesToSent).click();
		return new MailRuSentPage(driver);
	}

	public MailRuNewLetterPage goesToNewLetter() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(newletter).click();
		return new MailRuNewLetterPage(driver);
	}

}
