package Ornekler;

import java.util.Scanner;

public class ornke {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter a:");
		a=input.nextInt();
		
		System.out.println("Enter b:");
		b=input.nextInt();
		
		if(a>b) {
			System.out.println("a greater than b");
		}else if(a<b) {
			System.out.println("a smaller than b");
		}else {
			System.out.println("a equal to b");
		}
				
	}

}
