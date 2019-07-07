import java.util.Scanner;

public class OperationsUsingPlus {
	
	static int add(int num1,int num2) {
		return num1+num2;
	}
	static int sub(int n1,int n2) {
		return add(n1,-n2);
	}
	static int mul(int n1, int n2) {
		int sum = 0;
		n1 = (n1<0)?-n1:n1;
		n2 = (n2 <0)?-n2:n2;
		for(int i = 0; i < n2; i++) {
			sum = add(sum,n1);
		}
		return sum;
	}
	static int div(int n1, int n2)
	{
		if(n1 < n2) {
			return 0;
		}
		n1 = (n1<0)?-n1:n1;
		n2 = (n2 <0)?-n2:n2;
		int div = 0;
		while(n1 >= n2) {
			//if(n1 >= n2)
				div++;
			n1 = sub(n1,n2);
			
		}
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Addition "+ add(num1,num2));
		System.out.println("Subtraction "+ sub(num1,num2));
		System.out.println("Multiplication "+mul(num1,num2));
		System.out.println("division "+div(num1,num2));
		
		sc.close();

	}

}

