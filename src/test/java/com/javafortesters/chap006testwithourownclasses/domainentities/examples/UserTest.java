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
}
