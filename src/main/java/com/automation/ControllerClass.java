package com.automation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ControllerClass {
		@GetMapping(value = "/get")
		public String get() {
			return "Hello World";
		}
	}

