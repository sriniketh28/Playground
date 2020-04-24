import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++){
           arr[index] = in.nextInt();
       }
       int value = in.nextInt();
       // Function call
       perfect_couple(arr_size, arr, value);
    }
    // Perfect couple function definition
    public static void perfect_couple(int arr_size, int arr[], int value)
    {
        for(int index1 = 0; index1 <= arr_size - 1; index1++)
        {
            for(int index2 = index1 + 1; index2 <= arr_size - 1; index2++)
            {
                int sum = arr[index1] + arr[index2];
                if(sum == value)
                {
                    System.out.println(arr[index1] + "," + " " + arr[index2]);
                }
            }
        }
    }
}
