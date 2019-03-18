package com.data.drivenPack2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven4
{

    @Test(groups="smoke")
    public void day2test1()
    {
        System.out.println("Printing from Dd4 class test1");
    }

    @BeforeTest
    public void preRequisite()
    {
        System.out.println("Executed in Before Test");
    }
    @AfterTest
    public void postrequisite()
    {
        System.out.println("Executed in After Test");
    }
}
