package com.sampleproject.demo.model;


import java.time.LocalDate;

import jakarta.persistence.*;



@Entity
public class Application {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicationId;

    private String name;
    private String description;
    private String createBy;
    private LocalDate createDate;
    private String lastUpdate;
    private LocalDate lastUpdateDate;

    // Default constructor
    public Application() {
    }

	public Application(int i, String name, String description, String createBy, LocalDate createDate,
			String lastUpdate, LocalDate lastUpdateDate) {
		super();
		this.applicationId = i;
		this.name = name;
		this.description = description;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public LocalDate getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(LocalDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", name=" + name + ", description=" + description
				+ ", createBy=" + createBy + ", createDate=" + createDate + ", lastUpdate=" + lastUpdate
				+ ", lastUpdateDate=" + lastUpdateDate + "]";
	}

 
}
