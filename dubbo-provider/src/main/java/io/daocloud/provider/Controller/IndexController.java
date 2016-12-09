package io.daocloud.provider.Controller;

import io.daocloud.service.ExService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private ExService exService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Provider IP: " + exService.getName());
        return "index";
    }

}
