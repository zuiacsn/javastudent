package Regex.博客;

import java.util.regex.Pattern;

public class Test5 {
    public static void main(String[] args) {
        // 校验身份证号

        String str = "(^\\d{8}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}$)|(^\\d{6}(18|19|20)\\d{2}(0\\d|10|11|12)([0-2]\\d|30|31)\\d{3}(\\d|X|x)$)";
        System.out.println("123456".matches(str));
        System.out.println("411426200412141434".matches(str));
    }
}
