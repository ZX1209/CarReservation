import com.github.javafaker.Faker;
import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;


public class BasicTest extends UnitTest {

    @Test
    public void createAndRetrieveUser() {
        // Create a new user and save it
    	//OrderTable ordertable =new OrderTable(123l, 9l, "Bob", "zury", "Bob", "Bob", "Bob");
    	//ordertable.save();
       // News testNews = new News(1l,"asdf");
        //testNews.save();
     // Retrieve the user with e-mail address bob@gmail.com
       // OrderTable bob = OrderTable.find("byEmail", "bob@gmail.com").first();

        // Test 
       // assertNotNull(bob);
        //assertEquals("Bob", bob.userID);
    }

    @Test
    public void ExampleTest()
    {
            //Example(String userid, String username, String carid,
            //String visitorid, String visitorname, Date carintime, Date carouttime)

            Example example;
            example = new Example("213516541","jfalsdj","sadf5151","2524165","ajksdfhkj",new Date(),new Date());
            example.save();
    }

}
