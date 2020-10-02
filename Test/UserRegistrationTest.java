package com.BridgeLabz.JunitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class UserRegistrationTest {
	
	
	@Test
    public void FirstNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidFirstName("Prem"));

    }

	@Test
    public void FirstNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidFirstName("Nayak"));
    }

	@Test
    public void FirstNameShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidFirstName("prakash"));
    }

    @Test
    public void FirstNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidFirstName("PP"));
    }
    
    @Test
    public void LastNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidLastName("Prem"));

    }
	@Test
    public void LastNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidLastName("Nayak"));
    }
	@Test
    public void LLastNameShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidLastName("prakash"));
    }

    @Test
    public void LastNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidLastName("PP"));
    }
    
    @Parameterized.Parameters
  public static Collection EmailShouldReturnTrue() {
      UserRegistration userRegistration = new UserRegistration();

      return Arrays.asList(new Object[][]{
              {"abc@yahoo.com",true},
              {"abc111@gmail.com",true},
              {"premprakash@gmail.com",true},
              {"abc.100@abc.com.in",true},
              {"abc@1.com",true},
              {"abc+100@gmail.com",true},
              {"pooja.todkar12@gmail.com",true},
              {"abc@gmail.com.com",true},
      
      });

  }
	@Test
    public void EmailShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidEmail("abc"));
        assertFalse(userRegistration.isValidEmail("abc@.com.my"));
        assertFalse(userRegistration.isValidEmail("abc123@gmail.a"));
        assertFalse(userRegistration.isValidEmail("abc123@.com"));
        assertFalse(userRegistration.isValidEmail("abc123@.com.com"));
        assertFalse(userRegistration.isValidEmail(".abc@abc.com"));
        assertFalse(userRegistration.isValidEmail("abc()*@gmail.com"));
        assertFalse(userRegistration.isValidEmail("abc@%*.com"));
        assertFalse(userRegistration.isValidEmail("abc..2002@gmail.com"));
        assertFalse(userRegistration.isValidEmail("abc.@gmail.com"));
        assertFalse(userRegistration.isValidEmail("abc@abc@gmail.com"));
        assertFalse(userRegistration.isValidEmail("abc@gmail.com.1a"));
        assertFalse(userRegistration.isValidEmail("abc@gmail.com.aa.au"));
    }

    
	
    @Test
    public void NumberShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("91 8460243763"));
    }

    @Test
    public void NumberShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidMobileNum("84602437"));
    }

    @Test
    public void NumberShouldReturnFalseFirst(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidMobileNum("84602456abc"));
    }
	@Test 
	public void NumberShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("918460243763"));
    }

    @Test
    public void NumberShouldReturnTrueFirst(){

        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("9723356591"));

    }

    @Test
    public void NumberShouldReturnTrueSecond(){

        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("+97 8623356591"));

    }

    @Test
    public void PasswordShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidPassword("Prem@1309"));
    }

    @Test
    public void PasswordShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidPassword("Prem13098"));
    }

    @Test
    public void PasswordShouldReturnTrueSecond(){
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.isValidPassword("Premnayak@123"));
    }

    @Test
    public void PasswordShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidPassword("130981998"));
    }
    
    }
