package com.healthy.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@GetMapping("/pat")
	String getPat() {
		return "testing";
	}
}
