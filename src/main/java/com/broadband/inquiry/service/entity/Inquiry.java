package com.broadband.inquiry.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Inquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer inquiryId;
	private String email;
	private String body;
	private String mobile;
}
