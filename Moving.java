// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;

class Moving {
    static String arrange(String s){
    StringBuilder s1=new StringBuilder();
    StringBuilder s2=new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
            s1.append(s.charAt(i));
        }
        else{
            s2.append(s.charAt(i));
        }
    }
    return s1.append(s2).toString();
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=arrange(s);
        System.out.println(ans);
    }
}