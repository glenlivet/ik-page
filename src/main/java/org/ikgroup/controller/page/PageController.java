package org.ikgroup.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/page")
@Controller
public class PageController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(Model uiModel){
		return "login/test";
	}

}
