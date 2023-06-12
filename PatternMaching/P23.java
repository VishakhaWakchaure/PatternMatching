package PatternMaching;

public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=n;i>=1;i--) {
	int temp=n;
	for(int j=1;j<=i;j++){
		
		System.out.print(temp+" ");
		temp--;
	}
	System.out.println();
}
	}

}

//5 4 3 2 1 
//5 4 3 2 
//5 4 3 
//5 4 
//5 
