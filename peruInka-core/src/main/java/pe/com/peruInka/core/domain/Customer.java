package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Customer extends BaseEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

    private Enterprice enterpriceId;
    private Person personId;
    private StatusCustomer statusCustomer;
    private String createBy;
    private Date dateCreated;
    private Date dateLastUpdated;
    private String lastUpdatedBy;
    private Integer version;
	public Enterprice getEnterpriceId() {
		return enterpriceId;
	}
	public void setEnterpriceId(Enterprice enterpriceId) {
		this.enterpriceId = enterpriceId;
	}
	public Person getPersonId() {
		return personId;
	}
	public void setPersonId(Person personId) {
		this.personId = personId;
	}
	public StatusCustomer getStatusCustomer() {
		return statusCustomer;
	}
	public void setStatusCustomer(StatusCustomer statusCustomer) {
		this.statusCustomer = statusCustomer;
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
