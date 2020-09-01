package com.sample.springbatchexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springbatchexample.model.User;
import com.sample.springbatchexample.service.ServiceImpl;

@RestController
@RequestMapping("/load")
public class LoadController {

	@Autowired
	ServiceImpl serviceImpl;

	@PostMapping("/data")
	public String addData(@RequestBody List<User> list) {

		String result = serviceImpl.writeDataLineByLine(list);
		return result;
	}

}
