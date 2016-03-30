package controller;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Test.Smartphone;

@Controller
public class contr {
	
	@RequestMapping(value="/phone-page")  
    private ModelAndView selectTag() {  
        ModelAndView mav = new ModelAndView("phone-form");  
          
        LinkedHashMap<Integer, String> states = new LinkedHashMap<Integer, String>();
        states.put(1, "Alabama");
        states.put(2, "Alaska");
        states.put(3, "Arizona");
        states.put(4, "Arkansas");
        states.put(5, "California");
        mav.addObject("state", states);
        
        mav.setViewName("z");
        return mav;  
    }  
      
    @RequestMapping(value="/phone-result")  
    private ModelAndView processPhone(@ModelAttribute Smartphone smartphone) {  
        ModelAndView mav = new ModelAndView("phone-result");  
        mav.addObject("smartphone", smartphone);          
        return mav;  
    } 

}
