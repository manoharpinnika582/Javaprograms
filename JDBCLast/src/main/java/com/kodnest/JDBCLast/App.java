package com.kodnest.JDBCLast;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	System.out.println("Driver Loaded...");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
