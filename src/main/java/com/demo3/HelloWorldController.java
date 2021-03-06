package com.demo3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stevedavis on 22/04/2017. OK - Another change
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController
{
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public Greeting helloWorld ()
	{
		Greeting g = new Greeting();
		g.setGreeting("Hello World greeting from Branch 4!");

		// Some new changes

		return g;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/helloUniverse")
	public Greeting helloUniverse ()
	{
		Greeting g = new Greeting();
		g.setGreeting("Hello Universe greeting from Branch 4!");

		// Some new changes

		return g;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/age")
	public int getAge ()
	{
		List<String> names = new ArrayList<>();
		names.add("Steve");
		names.add("Karen");
		names.add("Adam");
		names.parallelStream().forEach(System.out::println);

		return getDefaultAge();
	}

	private int getDefaultAge ()
	{
		return 42;
	}
}
