
  package VAriousConcept;
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.chrome.ChromeDriver; import
  org.testng.annotations.AfterMethod; import
  org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
  
  public class LearnTestNG {
  
  WebDriver driver;
  
  @BeforeMethod public void init() {
  
  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://techfios.com/billing/?ng=admin/");
  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
  
  @Test public void loginTest() {
  
  WebElement USERNAME_FIELD_ELEMENT =
  driver.findElement(By.xpath("//input[@id='username']")); WebElement
  USERPASSWORD_FIELD_ELEMENT =
  driver.findElement(By.xpath("//input[@id='password']")); WebElement
  SIGNIN_BUTTON_ELEMENT =
  driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
  
  
  USERNAME_FIELD_ELEMENT.clear();
  USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
  USERPASSWORD_FIELD_ELEMENT.sendKeys("abc123"); SIGNIN_BUTTON_ELEMENT.click();
  
  }
  
  @AfterMethod public void TearDown() { 
	  driver.close(); 
	  driver.quit(); }
  
  }
 