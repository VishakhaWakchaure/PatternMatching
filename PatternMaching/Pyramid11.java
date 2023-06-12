package PatternMaching;

public class Pyramid11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i; s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j%2==0) {
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
//    0
//   010
//  01010
// 0101010
//010101010
