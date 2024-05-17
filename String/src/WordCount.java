public class WordCount {
    static int count=0;
    public static int wordCount(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
            count++; }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String a="Count the words in the String";
        System.out.println("No. of words is : "+wordCount(a));
    }
}
/*--Output--
No. of words is : 6
 */