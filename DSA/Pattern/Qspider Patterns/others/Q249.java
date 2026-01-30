import java.util.Scanner;
class Q249{
	public static void main(String[] args){
		// The line `Scanner sc=new Scanner(System.in);` in Java is creating a new Scanner object named `sc`
		// that is used to read input from the standard input stream, which is typically the keyboard. This
		// allows the program to accept user input during runtime.
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
		
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j%2==1 )
					System.out.printf("%-4d", 1+(j-1)*n+(i-j));
				else if(j%2==0 )
					System.out.printf("%-4d", j*n+1-i);
			}			 
			System.out.println();
		}
	}
}