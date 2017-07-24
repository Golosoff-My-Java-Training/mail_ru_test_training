package by.htp.mail_ru_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import by.htp.mail_ru_test.page.MailRuFirstPage;
import by.htp.mail_ru_test.page.MailRuInboxPage;
import by.htp.mail_ru_test.page.MailRuNewLetterPage;
import by.htp.mail_ru_test.page.MailRuSentPage;
 

public class MailRuTest  extends TestBase{

	private String url = "https://mail.ru";
	private String login = "tathtp";
	private String pasword = "Klopik123";
	private String toAdress = "sviatlana.zakharenka@gmail.com";
	MailRuFirstPage mailRuFirstPage = null;
	MailRuInboxPage mailRuInbox = null;
	MailRuSentPage mailRuSent = null;
	MailRuNewLetterPage mailRuNewLetterPage = null;

	
	@Test
	public void mailRuSendLetterToSvetlana() {
		driver.get(url);
		mailRuFirstPage = new MailRuFirstPage(driver);
		mailRuInbox = mailRuFirstPage.login(login, pasword);
		mailRuNewLetterPage = mailRuInbox.goesToNewLetter();
		mailRuInbox = mailRuNewLetterPage.sendEMail(toAdress);

		
	}
}
