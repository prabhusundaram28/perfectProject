package square;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectGit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing profile\\Automation_Workspaces\\Workspace_1\\Beta\\driver\\chromedriver_V84.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	}

}
