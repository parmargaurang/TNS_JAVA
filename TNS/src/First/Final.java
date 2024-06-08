package First;


import java.io.*;
import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		try {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length :- ");
		int length=Integer.parseInt(br.readLine());
		System.out.println("Enter the breadth :- ");
		int breadth=Integer.parseInt(br.readLine());
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length :- ");
		int length=sc.nextInt();
		System.out.println("Enter the breadth :- ");
		int breadth=sc.nextInt();*/
		
		Area area=new Area(length,breadth);
		
		System.out.println("The Area of rectangle is "+area.getArea());
		}
		catch(Exception  e) {
			
		}

	}

}
