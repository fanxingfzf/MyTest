import com.fzf.pojo.Cat;
import com.fzf.pojo.Master;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @Data:2022/4/28 14:35
 * @description:some description
 * @Function:注解实现配置文件spring-config.xml
 */
@Configuration
@ComponentScan(basePackages = "com.fzf.pojo")
public class ConfigFile {
    @Bean
    public Cat cat(){
        return new Cat();
    }

    @Bean
    public Master master(){
        Master master=new Master();
        master.setName("注解");
        master.setPet(cat());
        return master;
    }
}
