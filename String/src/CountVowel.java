public class CountVowel {
    static int count=0;
    public static int vowelCount(String s){
        char c;
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++; }
        }
        return count;
    }
    public static void main(String[] args) {
        String a="Count the vowels in the String";
        System.out.println("No. of Vowel is : "+vowelCount(a));
    }
}
/*--Output--
No. of Vowel is : 8
 */