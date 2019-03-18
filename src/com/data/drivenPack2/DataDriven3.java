package com.data.drivenPack2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven3
{
    @Parameters({"URL"})
    @Test
    public void sample1(String url)
    {
        System.out.println("dd3.Hello");
        System.out.println(" URL is "+url);
    }
    @Test(groups = "smoke")
    public void Rample2()
    {
        System.out.println("dd3.Bye");
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
