package com.BridgeLabz.JunitTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
public class UserRegistrationTest {
	
	
	@Test
    public void whenGivenFirstNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidFirstName("Prem"));

    }
	@Test
    public void whenGivenFirstNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidFirstName("Nayak"));
    }

	@Test
    public void whenGivenEmailShouldReturnFalse() {
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
    public void whenGivenFirstNameShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidFirstName("prakash"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidFirstName("PP"));
    }
	
    @Test
    public void whenGivenNumberShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("91 8460243763"));
    }

    @Test
    public void whenGivenNumberShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidMobileNum("84602437"));
    }

    @Test
    public void whenGivenNumberShouldReturnFalseFirst(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidMobileNum("84602456abc"));
    }
	@Test 
	public void whenGivenNumberShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("918460243763"));
    }

    @Test
    public void whenGivenNumberShouldReturnTrueFirst(){

        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("9723356591"));

    }
    @Test
    public void whenGivenNumberShouldReturnTrueSecond(){

        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidMobileNum("+97 8623356591"));

    }
    @Test
    public void whenGivenPasswordShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.isValidPassword("Prem@1309"));
    }

    @Test
    public void whenGivenPasswordShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidPassword("Prem13098"));
    }
    @Test
    public void whenGivenPasswordShouldReturnTrueSecond(){
        UserRegistration userRegistration = new UserRegistration();
        assertTrue(userRegistration.isValidPassword("Premnayak@123"));
    }
    @Test
    public void whenGivenPasswordShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.isValidPassword("130981998"));
    }
    
    }
