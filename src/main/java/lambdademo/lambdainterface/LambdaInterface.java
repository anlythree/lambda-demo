package lambdademo.lambdainterface;

import lambdademo.model.Person;
import java.util.List;

/**
 * @author wangli
 * @date 2020/9/1 17:02
 */
public interface LambdaInterface {

    /**
     * 计算平均
     * @param person
     */
    String returnAve(List<Person> person);
}
