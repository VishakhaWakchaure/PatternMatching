package PatternMaching;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	int count=i;
	for(int j=1;j<=i;j++) {
	System.out.print(count);
		count++;
	}
	System.out.println();
}
	}

}
//
//    1
//   23
//  345
// 4567
//56789
