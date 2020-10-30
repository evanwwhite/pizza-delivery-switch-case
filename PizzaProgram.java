//Evan White
import java.util.Scanner;
public class PizzaProgram {
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in); 

//Size
String sizeName = " ";
double sizeAmount = 0;

String toppingName = " ";
double toppingAmount = 0;

String locationName = " ";
double locationAmount = 0;

System.out.println("What size would you like?");
System.out.println();
System.out.println("[1]Large " + "[2]Medium " + "[3]Small ");
String size2 = input.next();

	if(size2.equals("1"))
{
	sizeAmount = 6.00;
	sizeName = "Large";
}
	
	if(size2.equals("2"))
{
	sizeAmount = 5.00;
	sizeName = "Medium";
}
	
	if(size2.equals("3"))
{
	sizeAmount = 4.00;
	sizeName = "Small"; 
}
	//Toppings
	   System.out.println("What topping would you like?");
	   System.out.println();
	   System.out.println("[1]Pepperoni " + "[2]Beef " + "[3]Sausage " + "[4]Cheese ");
	
	   int choice = input.nextInt();
	
	switch(choice)
	{
	case 1: toppingAmount = 1.50;
	     toppingName = "Pepperoni";
	     break;
	case 2: toppingAmount = 2.00;
	     toppingName = "Beef";
	     break;
	case 3: toppingAmount = 2.50;
	     toppingName = "Sausage";
	     break;
	case 4: toppingAmount = 1.00;
	     toppingName = "Cheese";
	     break;
	}
	//Location
	System.out.println("What location would you like?");
	System.out.println();
	System.out.println("[1]In Resturant " + "[2]Take Out " + "[3]Delivery ");
	int location = input.nextInt();
	
	if(location == 1)
	{
		locationAmount = 0.00;
		locationName = "In Resturant";
	}
	
	else if(location == 2)
	{
		locationAmount = 0.00;
		locationName = "Take Out";
	}
	
	else
	{
		locationAmount = 2.00;
		locationName = "Delivery";
	}
	//Check Model
	double totalAmount = (sizeAmount + toppingAmount + locationAmount);
	System.out.println("          Pizza Place          ");
	System.out.println();
	System.out.println(String.format("Pizza Size :        %-12s %10.2f", sizeName, sizeAmount));
	System.out.println(String.format("Topping Cost :      %-12s %10.2f", toppingName, toppingAmount));
	System.out.println(String.format("Location :          %-12s %10.2f", locationName, locationAmount));
	System.out.println(String.format("%43s", "-----------"));
	System.out.println(String.format("Total Cost :     %26.2f", totalAmount));
	}
}
/*
What size would you like?

[1]Large [2]Medium [3]Small 
1
What topping would you like?

[1]Pepperoni [2]Beef [3]Sausage [4]Cheese 
1
What location would you like?

[1]In Resturant [2]Take Out [3]Delivery 
1
          Pizza Place          

Pizza Size :        Large              6.00
Topping Cost :      Pepperoni          1.50
Location :          In Resturant       0.00
                                -----------
Total Cost :                           7.50
*/