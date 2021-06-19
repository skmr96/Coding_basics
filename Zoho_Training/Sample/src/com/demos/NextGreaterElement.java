//$Id$
package com.demos;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] =   {13, 6, 7, 12}; //{4, 5, 2, 25};
		int n = a.length;
		int nge[]=new int[n];
		Stack<Integer> s = new Stack<Integer>();
		for(int i=n-1;i>=0;i--)
		{
			while(!s.isEmpty() && s.peek()<=a[i])
				s.pop();
			nge[i]=s.empty()?-1:s.peek();
			s.push(a[i]);
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]+"--->"+nge[i]);

	}

}
