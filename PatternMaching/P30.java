package PatternMaching;

public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print("-");
	}
	int k=1;
	for(int j=i;j<=n;i++) {
		System.out.print(k);
		k++;
	}
	System.out.println();
}
	}

}
