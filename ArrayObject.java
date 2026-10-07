import java.util.Scanner;

import javax.management.relation.RoleList;
public class ArrayObject{
    int rollno;
    String name;
    ArrayObject(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int rollno;
        String name;
        System.out.println("enter number of objects:");
        int n=s.nextInt();
        ArrayObject arr[]=new ArrayObject[n];
        System.out.println("enter "+n+" objects values");
        for(int i=0;i<n;i++){
            rollno=s.nextInt();
            name=s.next();
            arr[i]=new ArrayObject(rollno,name);
        }
       

        for(int i=0;i<n;i++){
            System.out.println("student at "+i+":{"+ arr[i].rollno+" "+arr[i].name+"}");
        }
    }
}