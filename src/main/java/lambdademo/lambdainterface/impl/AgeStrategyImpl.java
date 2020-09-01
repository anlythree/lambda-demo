package lambdademo.lambdainterface.impl;

import lambdademo.lambdainterface.LambdaInterface;
import lambdademo.model.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangli
 * @date 2020/9/1 17:07
 */
public class AgeStrategyImpl implements LambdaInterface {

    /**
     * 第一种策略：计算年龄的平均值
     * @param person
     */
    @Override
    public String returnAve(List<Person> person) {
        Double aveAge = person.stream().collect(Collectors.averagingInt(Person::getAge));
        return aveAge.toString();
    }
}
