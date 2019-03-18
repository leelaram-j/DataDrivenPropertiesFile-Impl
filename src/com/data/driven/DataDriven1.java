package com.data.driven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;

public class DataDriven1
{
    WebDriver driver;
    @Test
    public void sample1()
    {
        System.out.println("dd1.Hello");
    }
    @Test(groups = "smoke")
    public void Rample2() throws IOError, IOException
    {
        System.out.println("dd1.Bye");
        Properties prop= new Properties();
        FileInputStream fis = new FileInputStream("//Users//lee//Documents//DataDrivenExternal//dataDrivenInput.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        if(prop.getProperty("browser").equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeLocation"));
            driver = new ChromeDriver();
        }
        else if(prop.getProperty("browser").equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxLocation"));
            driver = new FirefoxDriver();
        }
        driver.get(prop.getProperty("url"));
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Executed in Before Suite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Executed in After Suite");
    }
}
