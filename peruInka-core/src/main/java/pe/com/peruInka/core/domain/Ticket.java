package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Ticket extends BaseEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	         
	
	private Date dateIni;
	private Date dateEn;
	private Customer customerId;
	private StatusTicket statusTicket;
	private String createBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private Integer version;
	public Date getDateIni() {
		return dateIni;
	}
	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}
	public Date getDateEn() {
		return dateEn;
	}
	public void setDateEn(Date dateEn) {
		this.dateEn = dateEn;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public StatusTicket getStatusTicket() {
		return statusTicket;
	}
	public void setStatusTicket(StatusTicket statusTicket) {
		this.statusTicket = statusTicket;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	
	

}
