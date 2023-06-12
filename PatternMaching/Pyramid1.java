package PatternMaching;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}
		System.out.println();


		}
	}

}

//
//    *
//   ***
//  *****
// *******
//*********
