package innerclass;

public class Test {
    public static void main(String[] args) {
        int val = 10;

        A a = new A() {
            @Override
            public void test() {
                // 默认是final修饰的
                // 变量 'val' 从内部类中访问，需要为 final 或有效 final
                System.out.println(val);// 在匿名内部类中能被访问的是没有被修改的变量
            }
        };
    }
}

interface A{
    void test();
}