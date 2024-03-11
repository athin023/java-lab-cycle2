import java.io.*;
import java.util.Scanner;
class percentage {
	public static void main(String[] args){
		int total=0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of subjects");		
		int st = scanner.nextInt();		
               
		int[] mark = new int[100];


		for(int i = 0; i<st; i++)
		{
                System.out.println("Enter the mark ofsubject");
		mark[i] = scanner.nextInt();
		total=total+mark[i];	
		}		
		

		float percentage=total/st;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+percentage);
}
}

