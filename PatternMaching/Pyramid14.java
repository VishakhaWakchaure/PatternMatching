package PatternMaching;

public class Pyramid14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	for(int j=i;j>=1;j--) {
		System.out.print(j);
	}

	for(int k=2;k<=i;k++) {
		System.out.print(k);
		
	}
	System.out.println();
}
	}
	}
//    1
//   212
//  32123
// 4321234
//543212345
