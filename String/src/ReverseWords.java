public class ReverseWords {
    static int count=0;
    public static String wordCount(String s){
        String r="";
        String r1="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                r=r+s.charAt(i);
            } else if (s.charAt(i)==' ') {
                r1=r+r1;
                r=" ";
            }
        }
        return r1;
    }
    public static void main(String[] args) {
        String a="Count the words in the String ";
        System.out.println("No. of words is : "+wordCount(a));
    }
}
