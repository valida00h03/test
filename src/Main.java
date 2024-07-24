public class Main {
    public static void main(String[] args) {
        String a="Hello World!";
        char space=' ';
        String reverse="";
        char ch;

        for(int i=0; i<a.length();i++){
            ch=a.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
}