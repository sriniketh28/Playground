import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder stb = new StringBuilder(str);
        StringBuilder sb = new StringBuilder("");
        int str_len = str.length();
        for(int i=(str_len-1);i>=0;i--){
            char ch = str.charAt(i);
        	sb.append(ch);
        }
       if(stb.toString().equals(sb.toString())){
       		System.out.print("Yes");
       }
      else{
      		System.out.print("No");
      }
      
    } 
}
