import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][]=new int[r][c];
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	mat[i][j]=in.nextInt();
        }
    }
    int tmat[][]=new int[c][r];
    
    for(int g=0;g<c;g++){
    	for(int f=0;f<r;f++){
    		tmat[g][f]=mat[f][g];
        }
    }
    
    for(int q=0;q<c;q++) {
    	for(int s=0;s<r;s++) {
    		System.out.print(tmat[q][s]+" ");
    	}
    	System.out.print("\n");
    }
  }
}