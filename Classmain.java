package use_meInvest;
			
			//FutureValue = [PresentValue*(1+RateOfReturn)] + Employer Annual MATCH


import java.util.*;
public class Classmain extends Classval{

		static double newAmount;
	static double result;
		static double accum;
	public static void main(String[] args) {
		
		Classmain gather = new Classmain();
		
		Scanner set = new Scanner(System.in);
		double contributions = contYOU(90000, 2);   //(type in 1st field your yearly Salary, 2nd field your percent contribution)
		System.out.println("Total Contributions: $"+contributions);
		
		System.out.println("Please Enter Time Length for Investment in Years: ");
		Scanner setage = new Scanner(System.in);
		int yrlength = setage.nextInt();
     	//int g = 65-age;         
     	
     double Princip=gather.start();
     double Int=gather.goodintr();
	
     System.out.println(Princip +" : " + "Dollars over time with interest of "+Int);
     for(int years = 1; years<=yrlength; years++) {
    	
    
    	newAmount = (Princip * (1+Int))+ contributions;
    	 
    	 Princip = newAmount;
    	
    	 System.out.println(years + "   $" +Princip);
    	 }
    	 	
     }
	
	public static double contYOU(double salary, double your_cont) {  //don't change this method

		double mycont = salary* your_cont/100;
		
		
		  System.out.println("My Annual Contribution= $ "+mycont);
		  
		
		  double theircont = mycont *0.5;
		  System.out.println("Employer's Annual Contribution= $"+theircont);
		  
		  double sums_contr = mycont + theircont;
		  
		  return sums_contr;
		 
		 
		
		
	}


}



