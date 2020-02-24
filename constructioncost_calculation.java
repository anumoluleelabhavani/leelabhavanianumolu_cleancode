
import ConstructionCost.ConstructionCostEstimation;


import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class constructioncost_calculation 
{
    public static void main( String[] args )
    {   
        int Option;
    	Scanner obj= new Scanner(System.in);
		PrintStream Print=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Print.println();
		do {
		Print.println("CONSTRUCTION COST ESTIMATION \n");
		Print.println("Available choice::");
		Print.println("1. Construction with standard materials \n2. Construction with above standard materials ");
		Print.println("3. Construction with high standard materials \n4. Construction with high standard materials and fully automated");
		Print.println("Enter your choice: ");
		Option=obj.nextInt();
    	}while(Option>4);
		Print.print("enter the area of house");
		double Area=obj.nextDouble();
		ConstructionCostEstimation cost =new ConstructionCostEstimation(Option,Area);
     Print.println("the cost estimated is" +cost.getTotalCost()); 
	
     Print.close();
    }
}