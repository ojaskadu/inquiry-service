package com.broadband.inquiry.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadband.inquiry.service.entity.Inquiry;
import com.broadband.inquiry.service.repository.InquiryRepository;

@Service
public class InquiryService {
	
	@Autowired
	private InquiryRepository repository;
	
	public Inquiry saveInquiry(Inquiry inquiry)
	{
		return repository.save(inquiry);
	}
	
	public Inquiry getInquiry(Integer inquiryId)
	{
		return repository.findById(inquiryId).orElse(null);
	}
}
