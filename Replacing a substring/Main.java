import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1 = in.nextLine();
      String strr = in.nextLine();
      System.out.print(str.replace(str1,strr));
    }
}