package PatternMaching;

public class Pyramid18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=n-i;s++) {
		System.out.print(" ");
	}
	int ch=64+i-1;
	for(int j=1;j<=2*i-1;j++) {
		System.out.print(ch);
		ch++;
	}
	
	System.out.println();
}
	}

}
  

//                         64
//                       656667
//                     6667686970
//                   67686970717273
//                 686970717273747576