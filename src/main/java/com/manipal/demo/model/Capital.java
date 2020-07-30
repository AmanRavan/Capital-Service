package com.manipal.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capital")
public class Capital {
	@Id
	private String countryCode;
	private String capitalZipCode;
	private String capitalName;
	private String capitalLanguage;
	private Long capitalPopulation;
	@Column(nullable = true)
	private int port;
	public Capital () {}
	public Capital(String countryCode, String capitalZipCode, String capitalName, String capitalLanguage,
			Long capitalPopulation) {
		super();
		this.countryCode = countryCode;
		this.capitalZipCode = capitalZipCode;
		this.capitalName = capitalName;
		this.capitalLanguage = capitalLanguage;
		this.capitalPopulation = capitalPopulation;
	}
	public String getcountryCode() {
		return countryCode;
	}
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getcapitalZipCode() {
		return capitalZipCode;
	}
	public void setcapitalZipCode(String capitalZipCode) {
		this.capitalZipCode = capitalZipCode;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	public String getCapitalLanguage() {
		return capitalLanguage;
	}
	public void setCapitalLanguage(String capitalLanguage) {
		this.capitalLanguage = capitalLanguage;
	}
	public Long getCapitalPopulation() {
		return capitalPopulation;
	}
	public void setCapitalPopulation(Long capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
}
