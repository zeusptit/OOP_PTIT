import java.util.Scanner;
public class j01014 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- >0){
            long n = input.nextLong();
            long ans = 0;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    while(n % i == 0){
                        n /= i;
                    }
                    ans = Math.max(ans,i);
                }
            }
            ans = Math.max(ans,n);
            System.out.println(ans);
        }
    }
}
