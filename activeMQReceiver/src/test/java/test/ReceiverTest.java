package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ReceiverTest {


    @Test
    public void testReceiveUser(){
        while (true){
            try {
                Thread.sleep(5000);
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
