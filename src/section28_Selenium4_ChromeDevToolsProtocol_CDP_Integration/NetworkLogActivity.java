package section28_Selenium4_ChromeDevToolsProtocol_CDP_Integration;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.emulation.Emulation;
import org.openqa.selenium.devtools.v113.network.Network;
import org.openqa.selenium.devtools.v113.network.model.Request;
import org.openqa.selenium.devtools.v113.network.model.Response;

public class NetworkLogActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		STEP 1 - Initiate Chromium Driver (which is Chrome Driver)
		ChromeDriver driver = new ChromeDriver();
		
		
		//log file
		
		
//		STEP 2 - Create object for the Chrome DevTools with "getDevTools()" method
//		         which allows to send() the built-in Selenium commands for CDP (Chrome DevTools Protocol)    
		DevTools devTools = driver.getDevTools();
		
//		STEP 3 - Initiate DevTools sessions to send commands from Selenium
		devTools.createSession();
		
//		Send commands to CDP Methods -> CDP Methods will invoke and get access to Chrome DevTools
//		Commands can be explored through this site, https://chromedevtools.github.io/devtools-protocol/

//		https://chromedevtools.github.io/devtools-protocol/tot/Network/#method-enable
		devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request -> 
			{
				Request req = request.getRequest();
				System.out.println("REQUEST url: " + req.getUrl());
//				req.getHeaders();
			});
		
		//Events will get fired when HTTP response is available
		devTools.addListener(Network.responseReceived(), response -> 
			{
				Response res = response.getResponse();
				System.out.println("RESPONE url: " + res.getUrl());
				System.out.println("RESPONE status: " + res.getStatus());
				
				if(res.getStatus().toString().startsWith("4")) {
					System.out.println("RESPONE url: " + res.getUrl() + "is failling with status code " + res.getStatus());
				}
			});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector("button[routerLink*='library']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
