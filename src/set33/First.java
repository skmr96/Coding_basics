/* Input: mat[M][N] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
index = (2, 0) and (3, 4)
Output:
Rectangle
4 6 7 5 5
2 4 8 9 4
sum 54  */
import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int m1 = in.nextInt();
		int n1 = in.nextInt();
		int m2 = in.nextInt();int s=0;
		int n2 = in.nextInt();
		int mat[][] = {  {1, 2, 3, 4, 6}, 
					     {5, 3, 8, 1, 2}, 
						 {4, 6, 7, 5, 5}, 
						 {2, 4, 8, 9, 4} 
						};
		for(int i=m1;i<=m2;i++)
		{
			for(int j=n1;j<=n2;j++)
			{
				System.out.print(mat[i][j]+" ");
				s=s+mat[i][j];
			}
			System.out.println();
		}
		
		System.out.println(s);
	}

}
