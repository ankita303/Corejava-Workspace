package com.capg.ank.application2;
import java.io.IOException;
import java.util.Scanner;

import com.capg.ram.application1.EventManagementSystemScanner.menucode;
import com.capg.ram.application1.EventManagementSystemScanner.module1;
import com.capg.ram.application1.EventManagementSystemScanner.submodule1;
import com.capg.ram.application1.EventManagementSystemScanner.submodule2;
import com.capg.ram.application1.EventManagementSystemScanner.submodule3;
public class LearnElectricalEngineering {

	enum module1 {A,B,C,D};
	enum submodule1 {a,b,c};
	enum submodule2  {d,e,f};
	enum submodule3  {g,h,i};
	enum subcode  {X,Y};
	static int subjects;
	static int modules;
	static int students;
	static int feesamount;
	static int additionalcost;
	public static void main(String[] args) throws IOException {
		  String module = null;
		/*InputStreamReader inp = new InputStreamReader(System.in); 
	    BufferedReader br = new BufferedReader(inp);*/
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t WELCOME TO LEARN ELECTRICAL ENGINEERING TUTORIAL!!!");
	    
	    while(true)
		{
	
	  
		System.out.println("......................");
		System.out.println("Main Index:");
		System.out.println("......................");
		System.out.println("A-Choose Subjects");
		System.out.println("B-Fees Structure");
		System.out.println("C-Tests");
		System.out.println("D-Quit Module");
		System.out.println("======================");
	    System.out.println("Enter your Module code (A,B,C,D) : ");


module=br.nextLine();
System.out.println("You entered module is  : " );   

	    
switch(module1.valueOf(module))
{

case A:
	
System.out.println(" Choose Subjects");
System.out.println("======================");
System.out.println("a-Theory Based Subjects");
System.out.println("b-Lab Based Subjects");
System.out.println("Return to Main Menu");
System.out.println("======================");
System.out.println("Enter your Module code (a,b,c) : ");

	module=br.nextLine();
switch(submodule1.valueOf(module))
{

case a:
	
	
	System.out.println("Subjects \t Hours  \t Fees ");
	System.out.println("===============================================");
	System.out.println("X \t Engineering Maths \n \t 200 hrs. \t 2500");
	System.out.println("");
	System.out.println("Y \t Core Engineering \n \t 400 hrs \n\t 4000 ");
	System.out.println("===============================================");
	System.out.println("Enter your Option (X,Y) : ");
	
	
	module=br.nextLine();
	
	
	switch(subcode.valueOf(module))
	{

	case X:
		subjects=2500;
		break;
	case Y:
		subjects=4000;
		break;
	}
	
	
	
	System.out.println("Enter the number of subjects");
	
	guest =Integer.parseInt( br.nextLine());
	System.out.println("you selected no of guests are "+guest);
	 amount=menuitemcost*guest;
	
	System.out.println("Amount for ordered food before discount is Rs"+amount);
	if(guest >= 1 && guest <=25)
		amountdisc=(int) (amount-(amount*0.00));
	if(guest >= 26 && guest <=50)
		amountdisc=(int) (amount-(amount*0.03));
	else if(guest >= 51 && guest <=100)
		amountdisc=(int) ((amount-guest*0.05));
	else if(guest >= 101 && guest <=200)
		amountdisc=(int) ((amount-guest*0.08));	
	else if(guest >= 251)
		amountdisc=(int) ((amount-guest*0.10));	

	System.out.println("Amount for ordered food after Discount for selected guests is  Rs"+amountdisc);
	
	
	
break;
case S:
	
	System.out.println("Item \t Description  \t Charge per Unit ");
	System.out.println("========================================================================");
	System.out.println("1 \t Tent \t   RM400.00 per unit of 10 by 10 ft");
	System.out.println("");
	System.out.println("2 \t Chairs \t RM100.00 per unit of 50 chairs");
	System.out.println("");
	System.out.println("3 \t Tables \t RM80.00 per unit of 10 by 10 tables");
	System.out.println("");
	System.out.println("4 \t Table Cloths \t RM20.00 per unit of 10 by 10 table cloths");
	System.out.println("========================================================================");
	System.out.println("Enter your Menu code (1,2,3,4) : ");
	
	module=br.nextLine();
	
	int i=Integer.parseInt(module);
	switch(i)
	{

	case 1:
		additionalitemcost=400;
		break;
	case 2:
		additionalitemcost=100;
		break;
	case 3:
		additionalitemcost=80;
		break;
	case 4:
		additionalitemcost=20;
		break;
	}
	
	System.out.println("Your Additional Cost : Rs "+additionalitemcost);
	
	
break;	
}
 break;
 
case P:
	System.out.println(" Payment Module");
	System.out.println("======================");
	System.out.println("T-to display total amount to be paid");
	System.out.println("P-to make payment");
	System.out.println("M-Return to Main Menu");
	System.out.println("======================");
	System.out.println("Enter your Module code (T,P,M) : ");

	module=br.nextLine();
	switch(submodule2.valueOf(module))
	{

	case T:
		System.out.println("Total Amount to be Paid : Rs"+(amount+additionalitemcost));
		
	break;
	case P:System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));
	break;	
	}
	break;
	
			
case R:

System.out.println(" Payment Module");
System.out.println("======================");
System.out.println("I-to dispaly invoice for order mode");
System.out.println("S-to display the summary of orders and payments made");
System.out.println("M-Return to Main Menu");
System.out.println("======================");
System.out.println("Enter your Module code (I,S,M) : ");

	module=br.nextLine();
switch(submodule3.valueOf(module))
{

case I:
System.out.println("Invoice Display");
System.out.println("==================");
System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
System.out.println("you selected no of guests are "+guest);
System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));

break;
case S:
	System.out.println("Summary Of Order");
System.out.println("======================");
System.out.println("you selected Food item cost Rs"+amount);
System.out.println("you selected no of guests are "+guest);
System.out.println("Amount for ordered food after Discount for selected guests is  Rs"+amountdisc);
System.out.println("Your Additional Cost : Rs "+additionalitemcost);
System.out.println("\n");
System.out.println("Total Amount to be Paid : Rs"+(amount+additionalitemcost));
System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));

break;	
}
break;
case D:
System.out.println("Quit Module");
System.exit(0);
	break;
		}
		}
	}
}

	
	
	
	
	
	
	
	
	
	