package online.uzdevs.springmybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/")
    public String index(){
        return "list-employees";
    }
}
