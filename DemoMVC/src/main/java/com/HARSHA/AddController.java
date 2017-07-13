package com.HARSHA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harsha_000
 *
 */

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public void add(){
		System.out.println("lets Rock!!");
	}

}
