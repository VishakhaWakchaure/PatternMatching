package PatternMaching;

public class Pyrimid16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	char ch='A';
	for(int j=1;j<=i;j++) {
		System.out.print(ch);
		ch++;
	}
	char ch2='C';
	for(int k=1;k<=i;k++) {
		System.out.print(ch2);
		ch2++;
	}
	System.out.println();
}
	}

}
//
//      AC
//     ABCD
//    ABCCDE
//   ABCDCDEF
//  ABCDECDEFG
