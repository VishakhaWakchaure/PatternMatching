package PatternMaching;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=n;i>=1;i--) {
	for(int j=n;j>=i;j--) {
		System.out.print(j+" ");
	}
	System.out.println();
}
	}

}

//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 
