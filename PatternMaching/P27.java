package PatternMaching;

public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	System.out.println();
}
	}

}

//    1
//    12
//   123
//  1234
// 12345
