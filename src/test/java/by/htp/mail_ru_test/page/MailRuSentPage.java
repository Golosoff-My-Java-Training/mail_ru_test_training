package by.htp.mail_ru_test.page;
//class="b-toolbar__btn b-toolbar__btn_disabled b-toolbar__btn_last js-shortcut"
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

}
