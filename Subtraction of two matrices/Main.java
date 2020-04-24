import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat1[][]=new int[r][c];
    int mat2[][]=new int[r][c];
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	mat1[i][j]=in.nextInt();
        }
    }
    
    for(int k=0;k<r;k++){
    	for(int l=0;l<c;l++){
        	mat2[k][l]=in.nextInt();
        }
    }
    
    for(int p=0;p<r;p++){
    	for(int q=0;q<c;q++){
        	System.out.print((mat1[p][q]-mat2[p][q])+" ");
        }
      System.out.print("\n");
    }
  }
}