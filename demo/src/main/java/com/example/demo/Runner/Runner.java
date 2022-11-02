package com.example.demo.Runner;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Details;
import com.example.demo.Repository.RepoClass;

@Component
public class Runner implements CommandLineRunner {
	@Autowired
	RepoClass repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.saveAll(List.of(new Details(1, "saru", "chennai", "987654321", LocalDateTime.now())));
		System.out.println("data saved");

	}

}
