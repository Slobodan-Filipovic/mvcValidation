package controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(path = "/helloworld", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) //
	public String helloWorld() {
		return "Hello world form first controller";
	}

	/*
	 * @RequestMapping(value = "/helloworld/{variablePath}", method =
	 * RequestMethod.GET)
	 * 
	 * @ResponseBody public String helloWorld(
	 * 
	 * @PathVariable String variablePath,
	 * 
	 * @RequestParam("id") long id) { return variablePath +" " + id; }
	 */
	@RequestMapping(path = "/helloworld/{variablePath}", method = RequestMethod.GET)
	public String helloWorldWithQueryParameter(@PathVariable String variablePath,
			@RequestParam(required = true) String ime) {
		System.out.println("VARIABLE Path: " + variablePath);
		System.out.println("VARIABLE query parameter: " + ime);
		return variablePath + " " + ime;
	}

}