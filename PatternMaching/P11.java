package PatternMaching;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;

for(int i=1;i<=n;i++) {
	int count=n;
	int temp=i;
	for(int j=1;j<=n;j++) {
		if(count==n) {
			System.out.print(i+" ");
			
		}else {
			temp=temp+count;
			System.out.print(temp+" ");
		}count--;
		
	}
	System.out.println();
}
	}

}


//1 5 8 10 11 
//2 6 9 11 12 
//3 7 10 12 13 
//4 8 11 13 14 
//5 9 12 14 15 
