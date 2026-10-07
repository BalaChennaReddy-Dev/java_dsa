public class Array1{
    public static void main(String args[]){
        //primitive arrays
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
            System.out.println("primitive array values are");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("size of the primitive array is: "+n);
        //non primitive arrays
        String s[]={"welcome","to","the","java"};
        int n2=s.length;
            System.out.println("non primitive array values are");

        for(int i=0;i<n2;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
        System.out.println("size of the non primitive array values is: "+n2);
    }
}