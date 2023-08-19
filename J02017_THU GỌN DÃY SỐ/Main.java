import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)arr[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i = 1; i < n; i++){
            if(st.isEmpty() || (arr[i] + st.peek()) % 2 != 0){
                st.push(arr[i]);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        System.out.println(st.size());
    }
}