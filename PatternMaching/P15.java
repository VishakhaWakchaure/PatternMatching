package PatternMaching;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		if(i%2==1) {
			System.out.print(1+" ");
		}else {
			System.out.print(0+" ");
		}
	}
	System.out.println();
}
	}

}

//1 
//0 0 
//1 1 1 
//0 0 0 0 
//1 1 1 1 1 
