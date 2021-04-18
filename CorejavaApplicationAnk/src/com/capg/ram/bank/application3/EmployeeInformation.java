package com.capg.ram.bank.application3;
public class EmployeeInformation extends BankAccountDetails implements EmployeeInteface{
	int empno;double sal;String address;
	//EmployeeInterface methods
	public void employeeInfo(int empno,double sal) throws Exception
	{
		this.empno=empno;
		this.sal=sal;
	}
	public void employeeAddress(String address) throws Exception
	{
		this.address=address;
	}
	public void employeeDetais() throws Exception
	{
		System.out.println("Employee no :"+empno);
		System.out.println("Employee address :"+address);
		System.out.println("Employee sal :"+sal);
		System.out.println("Employee Country:"+country);
	}
	
		// abstract class method
	public void accountDetails() throws Exception
	{
		System.out.println("This my Account :1234");
		System.out.println("Breanch B.E.M.L LAYOUT");
	}
	
	
	public void show()
	{
		System.out.println("Sub class  method");
	}

	public static void main(String[] args) {
		try {
       
		EmployeeInformation emp=new EmployeeInformation();
		// abstract class 
		emp.accountDetails();
		emp.bankDetails();
		//interface methods
		emp.employeeInfo(100,55000);
		emp.employeeAddress("Bangalore");
		emp.employeeDetais();
		emp.show(); //sub class method
		//Bank RBI Class
				
		BankRBI bank=new BankRBI();  
		BankRBI bank1=new BankRBI(2,2);
		
		BankRBI.getBankDetails();
		}
		catch(Exception ee)
		{
			System.out.println("I can handle this exception"+ee);
		}
		
	
	}

}
