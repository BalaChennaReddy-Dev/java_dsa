import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        System.out.println("enter "+n+" elements in array");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("the elements in array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        s.close();
    }
}