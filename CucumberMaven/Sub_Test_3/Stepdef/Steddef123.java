package Stepdef;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Steddef123 {
		
		static WebDriver obj;
		@Given("^launch Demoguru99 website$")
		public void url() {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\win\\eclipse-workspace\\CucumberMaven\\driver\\chromedriver.exe");
			
			 obj=new ChromeDriver();
			
			obj.get("http://demo.guru99.com/test/newtours/login.php");
			
			obj.manage().window().maximize();

		}
		@When("^login with user credentials$")
		public void product() {
			
			obj.findElement(By.name("userName")).sendKeys("tt");
			obj.findElement(By.name("password")).sendKeys("tt");
			obj.findElement(By.name("submit")).click();
			
			
		}
		@Then("^user logouts$") 
		public void select() {
			obj.findElement(By.partialLinkText("SIGN-OFF")).click();
			obj.close();
		}

	}



