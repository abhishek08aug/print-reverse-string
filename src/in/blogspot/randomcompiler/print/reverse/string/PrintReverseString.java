package in.blogspot.randomcompiler.print.reverse.string;

public class PrintReverseString {
    public static void printReverseString(String s, int index) {
        if(s == null) {
            System.out.println(s);
            return;
        }
        if(index > s.length()-1) {
            return;
        }
        printReverseString(s, index+1);
        System.out.print(s.charAt(index));
    }

}
