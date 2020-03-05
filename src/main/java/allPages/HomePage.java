package allPages;


public class HomePage extends Generic {
	String creditCard = "xpath://span[text()='Credit Cards']";
	String findCard ="xpath:(//button[@role='heading'])[2]";
	
	public void url() {
		getUrl("https://www.capitalone.com/");
		
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public String clickCards() throws InterruptedException {
	
		mouseHover(creditCard);
		Thread.sleep(2);
	return findElement(findCard).getText();
		
	}
	
	
	
	
	
}
