package DynamicProgramming;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	private static  Map<Integer,Integer> table= new HashMap<>();
		
	//recursion + memoization approach => o(n)
	private static int getFib(int k) {
		
		if(table.containsKey(k)) return table.get(k);
		if(k<=2) return 1;
		int fibNum=getFib(k-1)+getFib(k-2);
		table.put(k, fibNum);
		return fibNum;	
	}
	
	//bottoms up approach  => o(n)
	private static int getFibBottomsUpApproach(int k) {		
		for(int i=1;i<=k;i++) {
			if(i<=2) {
				table.put(i, 1);
			}else {
				int fibV=table.get(i-1)+table.get(i-2);
				table.put(i, fibV);
			}
			
		}	
		return table.get(k);
	}
	
	
	public static void main(String[] args) {
		System.out.println(getFib(6));
		
		System.out.println(getFibBottomsUpApproach(6));
	}

}
