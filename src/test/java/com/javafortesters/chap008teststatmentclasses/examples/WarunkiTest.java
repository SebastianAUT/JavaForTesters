package com.javafortesters.chap008teststatmentclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WarunkiTest {
    @Test
    public void metodapetli(){
        String url = "www.eviltester.com";
        url = url.startsWith("http") ? url : addHttp(url);
        System.out.println(url);
    }

    private String addHttp(String url) {
        return "Http://" + url;
    }

    @Test
    public void sprawdzKotyTest() {
        assertEquals("koty mnoga", "cats",ilekotow(2));
        assertEquals("koty pojedyncza", "cat", ilekotow(1));
        System.out.println(ilekotow(1));
        System.out.println(ilekotow(2));
        System.out.println(ilekotow(3));
    }

    private String ilekotow(int i) {
        return i >= 2 ? "cats" : "cat";
    }

    @Test
    public void sprawdzifa(){
        String url = "www.seleniumsimplified.com";
                if (!url.startsWith("Http://")) {
                    url = addHttp(url);
                }
                    assertEquals("url rowna sie", "Http://www.seleniumsimplified.com", url);
    }

    @Test
    public void sprawdzifaels(){
        String url = "www.seleniumsimplified.com";
        if (url.startsWith("Http://")) {
        }else{
            url = addHttp(url);
        }
        assertEquals("url rowna sie", "Http://www.seleniumsimplified.com", url);
    }

}
