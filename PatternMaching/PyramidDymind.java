package PatternMaching;

public class PyramidDymind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int sp=n/2;            //{3,2,1,0,1,2,3
int st=1;               //{1,3,5,7,5,3,1
for(int i=1;i<=n;i++) {
	//to print star
	for(int s=1;s<=sp;s++) {
		System.out.print(" ");
	}
	//to print star
	for(int j=1;j<=st;j++) {
		System.out.print("*");
		
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

//                  *
//                 ***
//                *****
//               *******
//                *****
//                 ***
//                  *
