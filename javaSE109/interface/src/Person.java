import java.util.Objects;


/*public interface Cloneable{
    空接口:标记接口 证明当类是可以被克隆的
}*/

public class Person implements Cloneable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

        // 深拷贝
/*        Person tmp = (Person)super.clone();
        return tmp;*/
    }
}
