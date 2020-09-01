package com.sample.springbatchexample.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import com.opencsv.CSVWriter;
import com.sample.springbatchexample.model.User;

@org.springframework.stereotype.Service
public class ServiceImpl {

	public String createNewFile() {

		return "File Created Successfully";
	}

	public String writeDataLineByLine(List<User> list) {

		File file = new File("src/main/resources/users.csv");

		try {
			// create FileWriter object with file as parameter
			//FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(new FileWriter(file, true));

			// add data to csv

			// ListIterator<User> listIterator = list.listIterator();

			int size = list.size();
			for (int i = 0; i < size; i++) {

				String[] data = { list.get(i).getId(), list.get(i).getName(), list.get(i).getDept(),
						list.get(i).getSalary() };
				writer.writeNext(data);
			}

			/*
			 * String[] data2 = { "7", "sandeep", "2", "8300" }; writer.writeNext(data2);
			 */
			// closing writer connection
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Success";
	}
}
