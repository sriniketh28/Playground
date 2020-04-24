import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    String str = str1.concat(str1);
    if(str.contains(str2)) {
    System.out.print("Yes");
    }
    else {
    System.out.print("No");
    }
  } 
}