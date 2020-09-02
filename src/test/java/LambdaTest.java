import lambdademo.lambdainterface.impl.MostSurnameImpl;
import lambdademo.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangli
 * @date 2020/9/1 17:34
 */
public class LambdaTest {
    private List<Person> personList = new ArrayList<>();

    {
        personList.add(new Person(1, "赵四"));
        personList.add(new Person(4, "赵六"));
        personList.add(new Person(8, "王五"));
        personList.add(new Person(9, "王二"));
        personList.add(new Person(3, "王六"));
        personList.add(new Person(27, "王七"));
    }

    /**
     * 使用现成的实现
     */
    @Test
    public void getLambdaPersonByFunction(){
        Person.printAve(new MostSurnameImpl(),personList);
    }

    /**
     * 自己用lambda表达式手写一个实现
     */
    @Test
    public void getLambdaPersonByCustom(){
        Person.printAve(personList-> personList.get(0).toString(),personList);
    }

    @Test
    public void test1(){

    }

}
