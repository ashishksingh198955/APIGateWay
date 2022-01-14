package com.efbs.company.companyservice.service;

import java.util.List;

import com.efbs.company.companyservice.dto.CompanyDTO;


public interface CompanyService {

	/**
	 * The <code>CompanyService</code> interface responsible to communicate with database for User module.
	 *
	 * @author Ashish Kumar Singh
	 */

	public List<CompanyDTO> findAllCompany();
}
