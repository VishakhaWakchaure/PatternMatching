package PatternMaching;

public class PyramidDymand23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int sp=n/2;
int st=1;
int k=1;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++) {
		System.out.print(k%2);
		k++;
	}
	if(i<=n/2) {
		st=st+2;
		sp--;
	}else {
		st=st-2;
		sp++;
	}
	System.out.println();
}
	}

}
//                     1
//                    010
//                   10101
//                  0101010
//                   10101
//                    010
//                     1
