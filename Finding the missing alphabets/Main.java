import java.util.Scanner;
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str = str1.toLowerCase();
        int str_len = str.length();
        int stat[] = new int[26];
        for(int j=0;j<26;j++){
        	stat[j]=0;
        }
        for(int i=0;i<str_len;i++){
        if(str.charAt(i)!=' ') {
           int z=(int)(str.charAt(i)-97);
           stat[z]++;
        }
        }
        for(int r=0;r<26;r++){  
        	if(stat[r]==0) {
        	char ch = (char)(r+97);	
        	System.out.print(ch+" ");
        	}
       }
    }
}