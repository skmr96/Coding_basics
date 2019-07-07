import java.util.Scanner;

public class MatrixRec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int matrix[][] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
		
		int rStart = sc.nextInt();
		int cStart = sc.nextInt();
		int rEnd = sc.nextInt();
		int cEnd = sc.nextInt();
		int sum = 0;
		for(int i = rStart; i <= rEnd;i++) {
			//System.out.println("i= " + i);
			for(int j = cStart;j <= cEnd;j++) {
				//System.out.println("i= " + i+"j = " + j);
				System.out.print(matrix[i][j]+"    ");
				sum += matrix[i][j];
			}
			System.out.println();
		}
		System.out.print(sum);
	}

}
