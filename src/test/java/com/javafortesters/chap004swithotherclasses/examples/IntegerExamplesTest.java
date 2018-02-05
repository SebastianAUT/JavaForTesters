package	com.javafortesters.chap004swithotherclasses.examples;

import	org.junit.Test;
import	static	org.junit.Assert.assertEquals;

public	class	IntegerExamplesTest	{

    @Test
    public	void	integerExploration(){

        Integer four = new Integer("4");
        Integer five = new Integer("5");
        assertEquals("int value returns four", 4, four.intValue());
        assertEquals("int value returns five", 5, five.intValue());
        System.out.println("rgfed");
    }
    @Test
    public	void	convertToHex(){
        assertEquals("11 become b", "b", Integer.toHexString(11));
    }

    @Test
    public	void	minAndmaxvalues(){
        assertEquals("Check max int", Integer.MAX_VALUE, 2147483647);
    }

}