package com.broadband.inquiry.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.broadband.inquiry.service.entity.Inquiry;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Integer>{

}
