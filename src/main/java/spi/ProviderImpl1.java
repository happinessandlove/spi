package spi;

/**
 * @Author: liuming
 * @Description:
 * @Date: Created in 9:58 2023-11-28
 * @Modified By:
 */
public class ProviderImpl1 implements Provider {
    @Override
    public void doSomething() {
        System.out.println("ProviderImpl1");
    }
}
