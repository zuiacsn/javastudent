/**
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');
        char[] chars = new char[26];
        System.out.println(chars[0]);
    }

    public String setstring (String str) {
        if(str == null){
            return "";
        }

        int[] arr = new int[52];

        String s = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
               if(arr[c-65] == 0){
                   arr[c-65]++;
                   s+=c;
               }
            }else{
                if(arr[c-71] == 0){
                    arr[c-71]++;
                    s+=c;
                }
            }
        }

        return s;
    }

    public void merge(int A[], int m, int B[], int n) {
        int end = m+n-1;
        while(true){

            if(m < 1){
                for (int i = n-1; i >=0 ; i--) {
                    A[end] = B[i];
                    end--;
                }
                break;
            }

            if(n<1){
                for (int i = m-1; i >=0 ; i--) {
                    A[end] = B[i];
                    end--;
                }
                break;
            }

            if(A[m-1]>=B[n-1]){
                A[end] = A[m-1];
                m--;
            }else{
                A[end] = B[n-1];
                n--;
            }
            end--;
        }
    }
}