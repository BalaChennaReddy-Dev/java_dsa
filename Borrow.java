// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;

class Borrow{
    public static int b_count(long n1,long n2){
        int count=0;
        int borrow=0;
        while(n1>0||n2>0){
            long a=n1%10;
            long b=n2%10;
            if(a-borrow<b){
                count++;
                borrow=1;
            }
            else{
                borrow=0;
            }
            n1=n1/10;
            n2=n2/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n1=s.nextLong();
        long n2=s.nextLong();
        System.out.println(b_count(n1,n2));
        
    }
}