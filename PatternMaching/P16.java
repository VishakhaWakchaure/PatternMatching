package PatternMaching;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		if(i==1||i==j||i==n||j==1) {
			System.out.print("*"+"");
		}else {
			System.out.print("#"+" ");
		}
	}
	System.out.println();
}
	}

}

//*
//* *
//* # *
//* # # *
//* * * * *
