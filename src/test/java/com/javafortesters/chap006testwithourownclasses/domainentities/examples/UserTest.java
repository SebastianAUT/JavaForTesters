package com.javafortesters.chap006testwithourownclasses.domainentities.examples;


import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultUsernameAndPassword(){

        User user = new User();

        assertEquals("Default username expected","username",user.getUsername());
        assertEquals("Default password expected","password",user.getPassword());
    }
    @Test
    public void canConstructWithUsernameAdnPassword(){
        User user = new User("admin","pA55w0rD");

        assertEquals("Given username expected", "admin", user.getUsername());
        assertEquals("Given password expected", "pA55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("setter password expected","PaZZwor6", user.getPassword());
    }
}
