import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FreqofLimitedArrayElements {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt();
			int num[] = new int[n];
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}
			//countElementsMap(num,n);
			countElements(num,n);
			t--;
		}
	}

	private static void countElements(int[] num, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			num[i] -= 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			num[num[i]%n] += n;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]/n + " ");
		}
		System.out.println();
	}

	private static void countElementsMap(int[] num, int n) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> mp = new HashMap<>(); 
		
		for (int i = 1; i <=n; i++) {
			mp.put(i, 0);
		}
        // Traverse through array elements and 
        // count frequencies 
        for (int i = 0; i < n; i++) 
        { 
            if (mp.containsKey(num[i]))  
            { 
                mp.put(num[i], mp.get(num[i]) + 1); 
            }  
            else
            { 
                mp.put(num[i], 1); 
            } 
        } 
        // Traverse through map and print frequencies 
        /*for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
        { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } */
        Iterator<Map.Entry<Integer, Integer>> itr = mp.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.print(entry.getValue()+" ");
		}
		System.out.println();
	}

}
