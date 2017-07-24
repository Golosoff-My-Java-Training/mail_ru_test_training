package by.htp.mail_ru_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(newletter));
		driver.findElement(newletter).click();
		return new MailRuNewLetterPage(driver);
	}

}
