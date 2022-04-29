import com.fzf.pojo.Dog;
import com.fzf.pojo.Master;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author
 * @Data:2022/4/28 14:40
 * @description:some description
 * @Function:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigFile.class)
public class AnonTest {
    @Autowired
    private Master master;

    @Autowired
    private Dog dog;

    @Test
    public void master(){
        System.out.println(master);
        master.getPet().shout();
        System.out.println(dog);
    }

}
