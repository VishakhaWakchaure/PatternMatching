package PatternMaching;

public class pyramidDymand34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int sp=n/2;
int st=1;
for(int i=1;i<=n;i++) {
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	int k=sp+1;
	for(int j=1;j<=st;j++) {
		System.out.print(k);
		if(j<=st/2) {
			k++;
		}else {
			k--;
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
     
/*
                 4
                343
               23432
              1234321
               23432
                343
                 4
*/