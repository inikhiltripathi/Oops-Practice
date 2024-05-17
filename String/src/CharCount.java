public class CharCount {
    static int count=0;
    public static int wordCount(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                count++; }
        }
        return count;
    }
    public static void main(String[] args) {
        String a="Count the char in the String";
        System.out.println("No. of chars is : "+wordCount(a));
    }
}
