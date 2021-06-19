//$Id$
/*
 * Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
I/P:

3 3
1 2 3
4 5 6
7 8 9

O/P: 38
 */
public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int m = matrix.length-1;
		int n = matrix.length-1;
		int upperDiagonal=0,lowerDiagonal=0;
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				upperDiagonal=upperDiagonal+matrix[i][j];
			}
		}
		for(int i=0;i<=m;i++)
		{
			for(int j=n,k=0;k<=i;j--,k++)
			{
				lowerDiagonal=lowerDiagonal+matrix[i][j];
			}
		}
		if(upperDiagonal>lowerDiagonal)
			System.out.println("UD :"+upperDiagonal);
		else
			System.out.println("LD :"+lowerDiagonal);

	}

}
