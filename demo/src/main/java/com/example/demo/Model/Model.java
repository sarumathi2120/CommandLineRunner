package com.example.demo.Model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Model {
	@Id
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private LocalDateTime createdTime;

}
