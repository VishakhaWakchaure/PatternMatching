package PatternMaching;

public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=n;i>=1;i--) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
{
	System.out.print(j);	
	}
	System.out.println();
}
	}

}

//12345
// 1234
//  123
//   12
//    1
