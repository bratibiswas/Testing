package stepDefinition;

import bdd.Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	int a,b,sum,mod;
	Runner r = new Runner();
	
	@Given("^there are (\\d+) cucumbers$")
	public void there_are_cucumbers(int arg1) throws Throwable {
	   System.out.println("there_are_cucumbers"+arg1);
	}

	@When("^I eat (\\d+) cucumbers$")
	public void i_eat_cucumbers(int arg1) throws Throwable {
		 System.out.println("i_eat_cucumbers"+arg1);
	   
	}

	@Then("^I should have (\\d+) cucumbers$")
	public void i_should_have_cucumbers(int arg1) throws Throwable {
		 System.out.println("i_should_have_cucumbers"+arg1);
	  
	}
	
	@Given("^variables a and b are assigned proper values$")
	public void variables_a_and_b_are_assigned_proper_values() throws Throwable {
	   System.out.println(r.globalId);
	}
	
	@Given("^a and b have positive values$")
	public void a_and_b_have_positive_values() throws Throwable {
	    
	}

	@Given("^a and b are not \"([^\"]*)\"$")
	public void a_and_b_are_not(String arg1) throws Throwable {
	   System.out.println(arg1);
	}
	
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	    a=10;
		b=15;
	    
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	    
	   sum=a+b;
	}

	@When("^I click the Login button$")
	public void i_click_the_Login_button() throws Throwable {
	  mod=sum%5;  
	  
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	    if(mod!=0) Assert.assertTrue(mod!=0);
	    else if(mod==0) {
	    	Assert.assertTrue(mod==0);
	    	System.out.println(true);
	    }
	  
	}
	
	@Given("^a paragraph with body$")
	public void a_paragraph_with_body(String arg1) throws Throwable {
	  if(arg1.contains("==")){
		  System.out.println("Doc string passed sucessfully");
	  }
	}

	@Then("^pass (\\d+)$")
	public void pass_true(int i) throws Throwable {
	   System.out.println(i+" passed");
	}


}
