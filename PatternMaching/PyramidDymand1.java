package PatternMaching;

public class PyramidDymand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int p=1;
int sp=n/2;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	int k=1;
	
	for(int j=1;j<=p;j++) {
		System.out.print(k);
		if(j<=p/2) {
			k++;
	
	}else {
		k--;
	}
	}
	if(i<=n/2) {
		p=p+2;
		sp--;
	}else {
		p=p-2;
		sp++;
	}
	System.out.println();
}
	}

}
 
//                     1
//                    121
//                   12321
//                  1234321
//                   12321
//                    121
//                     1
