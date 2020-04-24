import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int prod=1;
    for(int i=1;i<=n;i++){
    	prod*=i;
    }
    System.out.print(prod);
  }
}