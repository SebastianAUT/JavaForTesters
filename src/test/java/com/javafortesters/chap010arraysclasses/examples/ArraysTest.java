package com.javafortesters.chap010arraysclasses.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.concurrent.SynchronousQueue;

import static org.junit.Assert.assertEquals;

public class ArraysTest {

    String[] tablica = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void testTablicy(){
        User[] uzytkownik = new User[3];
        uzytkownik[0] = new User("login1","haslo1");
        uzytkownik[1] = new User("login2","haslo2");
        uzytkownik[2] = new User("login3","haslo3");

        for (User zmienna : uzytkownik) {
            System.out.println(zmienna.getUsername());
        }

        assertEquals("nazwausera","login1",uzytkownik[0].getUsername());
        assertEquals("nazwausera","login2",uzytkownik[1].getUsername());
        assertEquals("nazwausera","login3",uzytkownik[2].getUsername());
    }

    @Test
    public void testpetli() {
        for (String zmienna : tablica) {
            System.out.println(zmienna);
        }
    }

    @Test
    public void kolejnapetla(){
        String lista = "";

        for(int i=0; i < 5; i++){
            lista = lista + tablica[i];
        }
        System.out.println(lista);
    }


    @Test
    public void testtabloop(){
        User[] uzytkownik = new User[100];
        int j = 0;

        for (User zmienna : uzytkownik) {
            zmienna = new User("login" + j,"haslo" + j);

            assertEquals("name", "haslo" + j, zmienna.getPassword());

            j++;
        }
    }
}
