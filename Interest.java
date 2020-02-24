
import simple_compound_interest.calculateInterest;

import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class Interest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principalAmount,interestRate;
        int timePeriod;
       PrintStream Print=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Print.println();

        Print.println("Enter your Principal Amount : ");
        principalAmount = sc.nextDouble();
        Print.println("Enter rate : ");
        interestRate = sc.nextDouble();
        Print.println("Enter time : ");
        timePeriod = sc.nextInt();

        calculateInterest Interest = new calculateInterest(principalAmount,interestRate,timePeriod);

        Print.println("Simple Interest is : " + Interest.findSimpleInterest());
        Print.println("Compound Interest is : " + Interest.findCompoundInterest());

    }
}