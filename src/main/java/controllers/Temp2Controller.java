package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Temp2Controller {

	 @RequestMapping(path = "/temp2")
	public String home() {
		return "temp2";
	}
}
