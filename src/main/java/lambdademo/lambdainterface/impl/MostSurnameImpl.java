package lambdademo.lambdainterface.impl;

import lambdademo.lambdainterface.LambdaInterface;
import lambdademo.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wangli
 * @date 2020/9/1 17:13
 */
public class MostSurnameImpl implements LambdaInterface {
    /**
     * 第二种策略：返回list中性别最多的姓和该姓的人数
     * @param person
     * @return
     */
    @Override
    public String returnAve(List<Person> person) {
        String surname = "";
        Integer num = 0;
        for (Map.Entry<String, List<Person>> entry : person.stream().collect(Collectors.groupingBy(p -> p.getName().substring(0, 1))).entrySet()) {
            String k = entry.getKey();
            List<Person> v = entry.getValue();
            if (v.size() > num) {
                surname = k;
                num = v.size();
            }
        }
        return surname+"："+num;
    }
}
