// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Reverse {
    public static void main(String[] args) {
        String s="hello world";
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            System.out.print(s.charAt(i));
        }
      System.out.println();
    }
}