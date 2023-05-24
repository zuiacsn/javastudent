public class Test4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        * 1.继承Cloneable接口
        * 2.实现clone方法
        * 3.抛出异常
        * 4.强转
        * */
        Person p1 = new Person();
        // p1.clone() 返回值是Object
       /* protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }*/
        Person p2 = (Person)p1.clone();
    }
}



