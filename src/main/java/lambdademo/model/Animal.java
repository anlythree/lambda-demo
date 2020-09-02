package lambdademo.model;

import com.sun.javafx.image.IntPixelGetter;

/**
 * @author wangli
 * @date 2020/9/1 18:18
 */
public class Animal {

    private static String name;

    private static Integer age;

    public Animal(String name, Integer age) {
        Animal.name = name;
        Animal.age = age;
    }

    public Animal() {
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Animal.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Animal.age = age;
    }
}
