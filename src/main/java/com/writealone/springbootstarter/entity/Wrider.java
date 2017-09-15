package com.writealone.springbootstarter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author  Jang
 * Sept 15, 2017
 */

@Entity
@Table(name="WA_WRIDER", schema="WRITA")
public class Wrider {

	@Id
	private String wriderId;
	private String wriderName;
	private String wriderEmail;
	private String wriderPass;

	public Wrider() {
		
	}
	
	public Wrider(String wriderId, String wriderName, String wriderEmail,
			String wriderPass) {
		super();
		this.wriderId = wriderId;
		this.wriderName = wriderName;
		this.wriderEmail = wriderEmail;
		this.wriderPass = wriderPass;
	}
	/**
	 * @return the wriderId
	 */
	public String getWriderId() {
		return wriderId;
	}
	/**
	 * @param wriderId the wriderId to set
	 */
	public void setWriderId(String wriderId) {
		this.wriderId = wriderId;
	}
	/**
	 * @return the wriderName
	 */
	public String getWriderName() {
		return wriderName;
	}
	/**
	 * @param wriderName the wriderName to set
	 */
	public void setWriderName(String wriderName) {
		this.wriderName = wriderName;
	}
	/**
	 * @return the wriderEmail
	 */
	public String getWriderEmail() {
		return wriderEmail;
	}
	/**
	 * @param wriderEmail the wriderEmail to set
	 */
	public void setWriderEmail(String wriderEmail) {
		this.wriderEmail = wriderEmail;
	}
	/**
	 * @return the wriderPass
	 */
	public String getWriderPass() {
		return wriderPass;
	}
	/**
	 * @param wriderPass the wriderPass to set
	 */
	public void setWriderPass(String wriderPass) {
		this.wriderPass = wriderPass;
	}

}
