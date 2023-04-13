package controler;

import java.util.ArrayList;
import java.util.Scanner;

import menu.Crush;
import menu.Item;
import menu.Toppings;

public class ToppingsCon {
	public static Item toppingCon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose topping");
		System.out.println("*************************************************************************");
		ArrayList toppings=Toppings.toppings();
		int i=1;
		for (Object o: toppings) {
			Item topping=(Item)o;
			System.out.println(i++ +") "+topping.itemName);
			
		}
		System.out.println("*************************************************************************");
		System.out.println("TYPE THE SERIAL NUMBER TO GIVE YOUR ORDER! ");
		
		int choice=sc.nextInt();
		Item topping=(Item)toppings.get(choice-1);
		System.out.println("You choose \n"+topping.itemName);
		System.out.println("***************************");
		return topping;
	}
}
