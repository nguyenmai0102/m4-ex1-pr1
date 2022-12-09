package ra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
    @RequestMapping("hello")
    public String hellojv8(){
        return "hello";
    }

}
