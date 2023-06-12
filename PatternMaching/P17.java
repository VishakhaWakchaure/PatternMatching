package PatternMaching;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			int k=n;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}

}
//
//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 
