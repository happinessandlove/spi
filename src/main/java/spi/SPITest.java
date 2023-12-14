package spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: liuming
 * @Description:
 * @Date: Created in 9:53 2023-11-28
 * @Modified By:
 */
public class SPITest {
    public static void main(String[] args) {
        // 获取接口的所有实现类
        Iterator<Provider> providers = ServiceLoader.load(Provider.class).iterator();
        while (providers.hasNext()) {
            // 调用实现类的方法
            providers.next().doSomething();
        }
    }
}

