package com.efbs.apigateway.models;

import java.util.HashSet;
import java.util.Set;

/**
 * This class <b>AppResponse</b> stores response data for any upcoming user requests.
 *
 * @author QuadProSoft
 *
 */
public class AppResponse<T> extends BaseModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int status;
	private Set<String> errors;
	private String message;
	private T data;

	
	/**
	 * @return the status
	 */
	public int getStatus() {

		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final int status) {

		this.status = status;
	}

	/**
	 * @return the errors
	 */
	public Set<String> getErrors() {

		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(final Set<String> errors) {

		this.errors = errors;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {

		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(final String message) {

		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {

		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(final T data) {

		this.data = data;
	}

	/**
	 * @param error
	 *            the error to be added
	 */
	public void addError(final String error) {

		Set<String> currentErrors = getErrors();
		if (currentErrors == null) {
			currentErrors = new HashSet<>();
		}

		currentErrors.add(error);
		setErrors(currentErrors);
	}

}