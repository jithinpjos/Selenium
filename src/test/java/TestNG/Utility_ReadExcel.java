package TestNG;

import java.util.ArrayList;


public class Utility_ReadExcel {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try {
		          reader=new Xls_Reader("./TestData/TestData.xlsx");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("Register");rowNum++)
		{
			String firstName=reader.getCellData("Register", "FirstName", rowNum);
			String lastName=reader.getCellData("Register", "LastName", rowNum);
			String email=reader.getCellData("Register", "Email", rowNum);
			Object ob[]= {firstName,lastName,email};
			myData.add(ob);
		}
		
		return myData;
		
	}

}
