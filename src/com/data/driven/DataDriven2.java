package com.data.driven;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven2
{

    @Test(groups="smoke")
    public void day2test1()
    {
        System.out.println("Printing from Dd2 class test1");
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
