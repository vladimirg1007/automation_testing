package use_meInvest;

				//A = [P(1+r)^t ]+ (salary X mycontributionpercent X .5)
				//FutureValue = [PresentValue*(1+RateOfReturn)^time] + Employer Annual MATCH
import java.util.*;
public class Classval {

	static Scanner set = new Scanner(System.in);
	
	double rate;
	double interest;
	double start_amnt;
	double principal;
	
	
	public double start() {
		 System.out.println("Please Enter How Much You want to START with: ");
	       principal = set.nextDouble();
	       return principal;
	}
	
	public double goodintr() {
	     System.out.println("Please Enter Interest Rate: ");
	     	rate = set.nextDouble();
	     	interest = rate/100;
		return interest;
	}
	
	
}
