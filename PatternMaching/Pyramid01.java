
package PatternMaching;

public class Pyramid01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i; s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++) {
		if(i%2==1) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}
	System.out.println();
}
	}

}
//
//    1
//   000
//  11111
// 0000000
//111111111
