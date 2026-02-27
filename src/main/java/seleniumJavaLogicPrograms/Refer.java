package seleniumJavaLogicPrograms;

/*
public class Refer {
	
	🔹 1️⃣ Read data from Excel using Apache POI
	Maven dependency
	<dependency>
	    <groupId>org.apache.poi</groupId>
	    <artifactId>poi-ooxml</artifactId>
	    <version>5.2.5</version>
	</dependency>

	Code
	import org.apache.poi.ss.usermodel.*;
	import java.io.FileInputStream;

	public class ReadExcel {
	    public static void main(String[] args) throws Exception {
	        FileInputStream fis = new FileInputStream("data.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet sheet = wb.getSheetAt(0);

	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                System.out.print(cell.toString() + " ");
	            }
	            System.out.println();
	        }
	        wb.close();
	    }
	}

	🔹 2️⃣ Read data from properties file
	config.properties
	url=https://google.com
	username=admin
	password=1234

	Code
	import java.io.FileInputStream;
	import java.util.Properties;

	public class ReadProperties {
	    public static void main(String[] args) throws Exception {
	        Properties prop = new Properties();
	        prop.load(new FileInputStream("config.properties"));

	        System.out.println(prop.getProperty("url"));
	        System.out.println(prop.getProperty("username"));
	    }
	}

	🔹 3️⃣ Handle Dropdown using Java logic
	import org.openqa.selenium.*;
	import org.openqa.selenium.support.ui.Select;

	Select dropdown = new Select(driver.findElement(By.id("country")));

	for (WebElement option : dropdown.getOptions()) {
	    if (option.getText().equals("India")) {
	        option.click();
	        break;
	    }
	}


	✅ Works even if selectByVisibleText() fails

	🔹 4️⃣ Find Broken Links
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;

	List<WebElement> links = driver.findElements(By.tagName("a"));

	for (WebElement link : links) {
	    String url = link.getAttribute("href");
	    if (url == null || url.isEmpty()) continue;

	    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
	    conn.setConnectTimeout(3000);
	    conn.connect();

	    if (conn.getResponseCode() >= 400) {
	        System.out.println("Broken: " + url);
	    }
	}

	🔹 5️⃣ Take Screenshot
	import org.openqa.selenium.*;
	import java.io.File;
	import org.apache.commons.io.FileUtils;

	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("screenshot.png"));

	🔹 6️⃣ Read data from JSON file
	Maven dependency
	<dependency>
	  <groupId>com.fasterxml.jackson.core</groupId>
	  <artifactId>jackson-databind</artifactId>
	  <version>2.17.0</version>
	</dependency>

	JSON (data.json)
	{
	  "name": "John",
	  "age": 30
	}

	Code
	import com.fasterxml.jackson.databind.ObjectMapper;
	import java.io.File;
	import java.util.Map;

	ObjectMapper mapper = new ObjectMapper();
	Map<String, Object> data =
	        mapper.readValue(new File("data.json"), Map.class);

	System.out.println(data.get("name"));

	🔹 7️⃣ Count number of links on a webpage
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links: " + links.size());

	🔹 8️⃣ Handle Dynamic Web Table using Java logic
	List<WebElement> rows =
	        driver.findElements(By.xpath("//table/tbody/tr"));

	for (int i = 1; i <= rows.size(); i++) {
	    String cellValue =
	        driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[2]")).getText();

	    if (cellValue.equals("John")) {
	        System.out.println("Row found at: " + i);
	        break;
	    }
	}


	✅ Works when rows change dynamically
	✅ Interview favorite question

	🔹 Summary Table (VERY IMPORTANT)
	Task	Core Concept
	Excel Read	Apache POI
	Properties	Properties class
	Dropdown	Select + Java loop
	Broken links	HttpURLConnection
	Screenshot	TakesScreenshot
	JSON Read	Jackson
	Count links	findElements()
	Dynamic table	XPath + loops
	*/