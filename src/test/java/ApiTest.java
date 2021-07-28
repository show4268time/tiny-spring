import beans.UserService;
import com.work.springframework.beans.factory.config.BeanDefinition;
import com.work.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: philipfry
 * @create: 2021-07-28 15:59
 **/
public class ApiTest {

    @Test
    public void test(){

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registryBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService)beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}
