package by.htp.mail_ru_test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRuSentPage {

	private WebDriver driver;
	private By next = By.xpath(".//div[@data-title = 'Следующая страница']");
	private By prev = By.xpath(".//div[@data-title = 'Предыдущая страница']"); //data-name="next"

	public MailRuSentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void printNuberOfLetters() {
		System.out.println(driver.findElement(prev).getAttribute("aria-disabled"));
		System.out.println(driver.findElement(next).getAttribute("aria-disabled"));
		
		
	}

	public boolean checkForLetterIsPresent(String justLetterTheme) {
		boolean isLetterPresentFlag = false;
		String letterXpathLocator = ".//div[text() = '" + justLetterTheme + "']";
		
		if (driver.findElements(By.xpath(letterXpathLocator)).size() > 0){
			isLetterPresentFlag = true;
		}
		return isLetterPresentFlag;
	}

}
