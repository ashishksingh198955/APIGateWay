package com.efbs.company.companyservice.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efbs.company.companyservice.dto.CompanyDTO;
import com.efbs.company.companyservice.repository.CompanyRepository;
import com.efbs.company.companyservice.utils.ApplicationConstants;

@Service
public class CompanyServiceImpl implements com.efbs.company.companyservice.service.CompanyService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CompanyServiceImpl.class);

	@Autowired
	CompanyRepository companyRepository;

	@Override
	public List<CompanyDTO> findAllCompany() {
		LOGGER.info(ApplicationConstants.METHOD_ENTER_LABEL);
		//
		
				List<CompanyDTO> list= companyRepository.findAllCompany();
				return list;
	}


}
