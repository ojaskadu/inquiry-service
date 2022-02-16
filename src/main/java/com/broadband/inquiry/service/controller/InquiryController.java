package com.broadband.inquiry.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broadband.inquiry.service.entity.Inquiry;
import com.broadband.inquiry.service.service.InquiryService;

@RestController
@CrossOrigin
@RequestMapping("/Inquiry")
public class InquiryController {

	@Autowired
	private InquiryService inquiryService;
	
	@PostMapping("/addInquiry")
	public Inquiry postInquiryDetails(@RequestBody Inquiry inquiry) {
		return inquiryService.saveInquiry(inquiry);
	}
	
	@GetMapping("/getInquiry/{inquiryID}")
	public Inquiry getInquiryDetails(@PathVariable Integer inquiryID)
	{
		return inquiryService.getInquiry(inquiryID);
	}
}
