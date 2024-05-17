public class Pattern3 {
    public static void main(String[] args) {
        int a=4;
        int i,j;
        for (i=1;i<=4;i++){
            for(j=a-i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
