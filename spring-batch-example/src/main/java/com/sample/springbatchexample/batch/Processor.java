package com.sample.springbatchexample.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.sample.springbatchexample.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {

	@Override
	public User process(User user) throws Exception {
		user.setName(user.getName());
		user.setDept(user.getDept());
		user.setTime(new Date());
		user.setId(user.getId());
		return user;
	}
}
