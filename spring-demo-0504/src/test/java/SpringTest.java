import com.fzf.pojo.Master;
import com.fzf.pojo.Pet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author
 * @Data:2022/4/27 16:07
 * @description:some description
 * @Function:
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring-config.xml")
public class SpringTest {

    //控制反转
//    @Test
//    public  void Test(){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
//        //Master master=new Master();
//
//        Master master= (Master) applicationContext.getBean("master");
//        master.sayHello();
//    }

    //依赖注入
    @Resource
    private Master master;

    @Test
    public void testMaster(){
       //master.sayHello();
        //System.out.println(master);
        master.getPet().shout();
        for (Object o : master.getStringList()) {
            System.out.println(o);
        }

        System.out.println(master.getMap().get("k2"));
    }

    @Test
    public void testMaster2(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Master master2= (Master) applicationContext.getBean("master3");
        Master master3= (Master) applicationContext.getBean("master3");

        //System.out.println(master2);
        System.out.println(master2==master3);
        applicationContext.close();
        //master2.getPet().shout();
    }

    /**
     * 解耦
     */
    @Test
    public void testPet(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Pet pet = (Pet) applicationContext.getBean(Pet.class);
        pet.shout();
    }

}
