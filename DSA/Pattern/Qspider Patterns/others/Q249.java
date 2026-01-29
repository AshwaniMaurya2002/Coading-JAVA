import java.util.Scanner;
class Q249{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j%2==1)
					System.out.printf("%-4d", (j-1)*n+(i-j));
				else
					System.out.printf("%-4d", j*n+1-i);
			}			 
			System.out.println();
		}
	}
}