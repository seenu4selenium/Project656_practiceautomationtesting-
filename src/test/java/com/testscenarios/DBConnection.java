package com.testscenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBConnection {
	private static Connection cnn;
	private static Statement stmt;
	private static ResultSet rs;

	public static String P_NAME;
	public static String P_EMAIL;
	public static String P_MOBILE;
	public static String P_ADDRESS;

	public static void main(String[] args) throws Exception {
		// Connect the DB
		String databaseURL = "jdbc:mysql://127.0.0.1:3306/656batch";
		String username = "root";
		String password = "admin@123";

		Class.forName("com.mysql.cj.jdbc.Driver");
		cnn = DriverManager.getConnection(databaseURL, username, password);

		// Write the sql query
		//String myquery = "SELECT * FROM P_LOAN;";
		String myqry = "SELECT * FROM P_LOAN WHERE P_NAME = 'SRAVANTHI';";
		stmt = cnn.createStatement();

		// Run the sql query
		rs = stmt.executeQuery(myqry);
		// rs = stmt.executeQuery(myqry);
		// The statement execution results will store into rs variable [temp store into
		// RMA location]
		// Print the results into Console
		// Run while loop n number of rows ...
		while (rs.next()) {
			// for(int i =1;i<=2;i++) {
			P_NAME = rs.getString(1);
			P_EMAIL = rs.getString(2);
			P_MOBILE = rs.getString(3);
			P_ADDRESS = rs.getString(4);

			// sravanthi p sdgds sdgsdf sdfgf
			System.out.println(P_NAME + "\t" + P_EMAIL + "\t" + P_MOBILE + "\t" + P_ADDRESS + "\t");
			// System.out.println(P_EMAIL + "\t" + P_MOBILE );

		} // while loop end

		// Close the database connection
		cnn.close();

		/*****************************************/

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// wait time
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys(P_EMAIL);
		driver.findElement(By.name("password")).sendKeys(P_MOBILE);

	}

}
