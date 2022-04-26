package online.uzdevs.springmybatis.controller;

import online.uzdevs.springmybatis.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMapper mapper;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("listemployees", mapper.getAllEmployees());
        return mav;
    }
}
