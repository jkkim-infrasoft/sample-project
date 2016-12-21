package kr.co.infrasoft.sample_project.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@Autowired
	MainService mainService;
	
	@RequestMapping(path = "/")
	public ModelAndView index(@RequestParam(name="a", defaultValue="0") Integer a,
			@RequestParam(name="b", defaultValue="0") Integer b) {
		ModelAndView result = new ModelAndView("index");
		result.addObject("a", a.toString());
		result.addObject("b", b.toString());
		result.addObject("sum", mainService.add(a, b).toString());
		return result;
	}
}
