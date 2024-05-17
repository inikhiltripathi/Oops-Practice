public class Palindrome {
    public static boolean palindrome(String s){
        String r="";
        for (int i=s.length()-1;i>=0;i--){
            r += s.charAt(i);
        }
        return r.equalsIgnoreCase(s);
    }
    public static void main(String[] args) {
        String a="Madam";
        System.out.println("Word is Palindrome : "+palindrome(a));
    }
}
/*--Output--
Word is Palindrome : true
 */