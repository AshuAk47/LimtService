package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.LimitConfiguration;
import com.example.demo.*;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(1000, 1);
	}

	@GetMapping("/limitsconfig")
	public LimitConfiguration retriveLimitsFromConfigurationsFile() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}