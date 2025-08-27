package com.telusko.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        System.out.println("srinadh hello");
        return "index";

//        return "index.jsp";

    }


    /*
    Servlet way accept req and handling req
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){


         //servlet way to accept the request data
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1+num2;

        session.setAttribute("result",result);
        return "result.jsp";
    }
    */

    //by springboot
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, @RequestParam("num2") int num2, ModelAndView mv){


        int result = num+num2;

        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){


        Alien alien = new Alien();
        alien.setId(aid);
        alien.setName(aname);


        mv.addObject("alien",alien);
        mv.setViewName("result");
        return mv;
    }
}
