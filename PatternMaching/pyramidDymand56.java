package PatternMaching;

public class pyramidDymand56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int sp=n/2;
int st=1;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++) {
		if(j==1||j==st) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
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

                       