package Regex.博客;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 匹配单个字符
        * */

        // 只能是 a b c 中的一个
        System.out.println("a".matches("[abc]"));// true
        System.out.println("?".matches("[abc]"));// false

        // 不能出现 a b c 中的一个
        System.out.println("a".matches("[^abc]"));// true
        System.out.println("?".matches("[^abc]"));// false

        // a到z和A到Z(包括头尾的范围)
        System.out.println("z".matches("[a-zA-z]")); // true
        System.out.println("aa".matches("[a-zA-z]"));//false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]")); //true

        // [a-z&&[def]] a-z和def的交集。为:d，e，f
        System.out.println("d".matches("[a-z&&[def]]")); //true
        System.out.println("0".matches("[a-z&&[def]]")); //false

        /*
         \表示转义字符
         两个\的理解方式：前面的\是一个转义字符，改变了后面\原本的含义，
         把他变成一个普普通通的\而已。
        */

        //  .  表示任意一个字符
        System.out.println("你".matches("..")); //false
        System.out.println("你".matches(".")); //true
        System.out.println("你我".matches(".."));//true

        // \\d 表示任意的一个数字
        // 简单来记:两个\表示一个\
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true

        // \\w 只能是一位单词字符[a-zA-Z_0-9]
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("你".matches("\\w"));//false

        // 非单词字符 \\W
        System.out.println("你".matches("\\W")); // true

    }
}
