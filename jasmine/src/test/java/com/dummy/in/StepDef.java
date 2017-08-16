package com.dummy.in;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef {
    WebDriver driver;

    @Before

    public void OpenBrowser() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\katuk_000\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @After
    public void CloseBrowser() {

    }

    @Given("^user is on Amazonhomepage$")
    public void user_is_on_Amazonhomepage()  {
     driver.get("http://www.amazon.co.uk/");
    }

    @Given("^user click Sign-In$")
    public void user_click_Sign_In() throws Throwable {
  driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
    }

    @When("^user enters Username and password$")
    public void user_enters_Username_and_password() throws Throwable {
    driver.findElement(By.id("ap_email")).sendKeys("katkam@live.com");
    driver.findElement(By.id("ap_password")).sendKeys("12345");

    }

    @Then("^user clicks on Login button$")
    public void user_clicks_on_Login_button() throws Throwable {
    driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("^user  logged in successfully$")
    public void user_logged_in_successfully() throws Throwable {

    }

    }











