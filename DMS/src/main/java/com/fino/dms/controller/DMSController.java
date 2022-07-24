package com.fino.dms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DMSController {

	@GetMapping(path="/test")
	public String test() {
		return "Test";
	}
}
