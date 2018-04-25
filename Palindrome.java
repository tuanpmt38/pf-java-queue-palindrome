import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String strr = "able was I ere I saw elba";
        Stack stack = new Stack();
        for(int i = 0;i < strr.length();i++){
            stack.push(strr.charAt(i));
        }
        String reverse ="";
        while (!stack.isEmpty()){
            reverse = reverse +stack.pop();
        }
        if(strr.equals(reverse)){
            System.out.println("The string is a palindrome");
        }else {
            System.out.println("The String is not a palindrome");
        }
    }
}
    