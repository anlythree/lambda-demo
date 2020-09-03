import lambdademo.lambdainterface.LambdaInterface;

/**
 * @author wangli
 * @date 2020/9/1 17:34
 */
public class LambdaTest {

    /**
     * 这个方法的入参和返回值和LambdaInterface中的oneMethod方法一样
     *
     * @param num
     * @return
     */
    public String myPrint(Integer num) {
        return num.toString();
    }

    public void testRealize() {
        // 可以自己实现函数式接口
        LambdaInterface lambdaInterface1 = (num) -> "num:" + num.toString();
        // 可以借用现有方法来作为函数式接口的实现
        LambdaInterface lambdaInterface2 = new LambdaTest()::myPrint;
    }

}
