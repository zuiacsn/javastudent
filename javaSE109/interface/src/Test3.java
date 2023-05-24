

public class Test3 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("zhangsan",13);
        Animal animal2 = new Animal("lisi",14);

        int i = animal2.compareTo(animal1);
        System.out.println(i);

    }
}

// 自定义类型,想要比较大小,需要继承Comparable,重写compareTo方法
class Animal implements Comparable<Animal>{
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Animal o) {
        // o 比较的目标
        // this 当前的对象
/*        if(this.age>o.age){
            return 1;
        } else if (this.age<o.age) {
            return -1;
        }
        return 0;*/
        return this.age-o.age;
    }
}
