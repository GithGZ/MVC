import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
   @RequestMapping(path = "/print.do",method = RequestMethod.GET)
   public void print() {
	   System.out.println("123456");
   }
}
