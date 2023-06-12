package PatternMaching;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int count=1;
for(int i=1;i<=n;i++) {
	
	for(int j=1;j<=n;j++) {
		System.out.print(count+" ");
		count++;
		if(count==10) {
			count=1;
		}
	}
	System.out.println();
}
	}

}

//1 2 3 4 5 
//6 7 8 9 1 
//2 3 4 5 6 
//7 8 9 1 2 
//3 4 5 6 7 
