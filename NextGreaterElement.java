import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        int n = arr.length;

        for(int i = n-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " , ");
        }
        System.out.println();
    }
}
