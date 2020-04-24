import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder stb = new StringBuilder(str);
        reverse_string(stb,1,1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        String str = sb.toString();
        String arr[] = str.split("\\s");
        String tarr[] = new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
        	tarr[j]=arr[i];
          	j++;
          if(j==arr.length){
            break;
          }
        }
      for(String b:tarr){
        System.out.print(b+" ");
      }
    }
}