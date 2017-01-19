package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Burak Köken on 18.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView showHomePage(){
        return new ModelAndView("Home");
    }

    @RequestMapping("/person/{personId}")
    public ModelAndView showPersonInfo(@PathVariable String personId){
        ModelAndView modelAndView = new ModelAndView("PersonInfo");
        modelAndView.addObject("personId", personId);

        return  modelAndView;
    }

    @RequestMapping("/person/{personId}/{personName}")
    public ModelAndView showPerson(@PathVariable("personId") String personId,
                                   @PathVariable("personName") String name){
        ModelAndView modelAndView = new ModelAndView("Person");
        modelAndView.addObject("personId", personId);
        modelAndView.addObject("personName", name);

        return modelAndView;
    }


}
