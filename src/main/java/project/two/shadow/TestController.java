package project.two.shadow;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
 @ResponseBody
 @RequestMapping("/") 
 public String home(){
 System.out.println("Hello Boot!!");
 return "Hello Boot!!"; 
 }
 @RequestMapping("/hello.do")
 public String hello(Model model){
System.out.println("안녕하세요");
model.addAttribute("message","hello.jsp 입니다.!");
System.out.println(model.getAttribute("message"));
return "hello";
 } 
}

