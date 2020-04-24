import java.util.Scanner;
public class Main   
{  
     public static void main(String[] args) {  
    	 Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        int[] freq = new int[str.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }   
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.print(string[i]+""+freq[i]+" ");  
        }  
    }  
}