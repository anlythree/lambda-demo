package lambdademo.lambdainterface;

/**
 * 构建一个函数式接口用于验证Lambda语法
 *
 * @author wangli
 * @date 2020/9/1 17:02
 */
@FunctionalInterface
public interface LambdaInterface {

    /**
     * 函数式接口中的唯一一个方法
     *
     * @param num
     * @return
     */
    String oneMethod(Integer num);
}
