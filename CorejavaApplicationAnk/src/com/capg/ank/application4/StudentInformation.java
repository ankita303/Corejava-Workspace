package com.capg.ank.application4;
public class StudentInformation extends StudentRecordDetails implements StudentInterface{
int sid; String sname; String add; double Marks;

public void studentinfo(int sid, String sname)
	{
	this.sid=sid;
	this.sname=sname;
	}
public void studentaddress(String add)
	{
		this.add=add;
	}
public void studentdtls()
{
	System.out.println("Student Id: "+sid);
	System.out.println("Student Name: "+sname);
	System.out.println("Student Address: "+add);
}
public void studentdetails()
{
	System.out.println("Student's Academic Records 2021");
	System.out.println("WBCHSE BOARD");
}
	public static void main(String[] args) {
		StudentInformation s1=new StudentInformation();
		s1.studentdetails();
		s1.schoolname();
		s1.studentinfo(2017007,"Ankita");
		s1.studentaddress("Kolkata");
		s1.studentdtls();
		
		SubjectDetails x1=new SubjectDetails();
		SubjectDetails x2=new SubjectDetails(85,80);
		
		SubjectDetails.getRemarks();
		

	}

}
