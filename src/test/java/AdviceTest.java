import com.fzf.advice.AdviceTarget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @Data:2022/4/28 17:29
 * @description:some description
 * @Function:
 */
public class AdviceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
        AdviceTarget target = applicationContext.getBean(AdviceTarget.class);
        target.testAdvice("p1",123);
    }
}
