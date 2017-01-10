package com.whishworks;


import org.junit.Test;


/**
 * Created by mumin on 25/02/14.
 */
public class HelloTest {
    @Test
    public void testHello() throws Exception{


        System.out.println("If you want to understand how jacoco works when run in as part of 'mvn clean install'");
        System.out.println("Thread.sleep of 1 seconds added to give chance to launch 'jvisualvm' to " +
                "inspect the full java argLine for SureFire ");
       Thread.sleep(1000);
        /**
         *
         */

        Hello hello=new Hello();
        hello.sayHello("en");

        // ensure that the code coverage check fails,
        // then uncomment the line below to make it pass.

        //hello.sayHello("fr");
    }
}
