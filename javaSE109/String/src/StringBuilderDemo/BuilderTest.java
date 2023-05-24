package StringBuilderDemo;

import java.util.Arrays;

public class BuilderTest {
    public static void main(String[] args) {
        String s = "0P";

        s = s.toLowerCase();
        System.out.println(s);

        String[] split = s.split("[.[^a-zA-Z]]");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
        }

        String str = sb.toString();
        System.out.println(str);

        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println();
            }
            left++;
            right--;
        }



/*        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j >=0 ; j--) {
                if(split[i] != split[j]){
                    return false;
                }
            }
            return true;
        }*/

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
