package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Before Mobile Test Only");
    }

    @After("@MobileTest")
    public void AfterValidation(){
        System.out.println("After Mobile Test Only");
    }
}
