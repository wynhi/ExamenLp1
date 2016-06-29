package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class TicketDescription extends BaseEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Product productId;
	private Ticket ticketId;
	private String quantity;
	private String priceUnitary;
	private String priceAll;
	private String comment;
	private StatusTicketDescription statusTicketDescription;
	private String createBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private Integer version;
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	public Ticket getTicketId() {
		return ticketId;
	}
	public void setTicketId(Ticket ticketId) {
		this.ticketId = ticketId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPriceUnitary() {
		return priceUnitary;
	}
	public void setPriceUnitary(String priceUnitary) {
		this.priceUnitary = priceUnitary;
	}
	public String getPriceAll() {
		return priceAll;
	}
	public void setPriceAll(String priceAll) {
		this.priceAll = priceAll;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public StatusTicketDescription getStatusTicketDescription() {
		return statusTicketDescription;
	}
	public void setStatusTicketDescription(StatusTicketDescription statusTicketDescription) {
		this.statusTicketDescription = statusTicketDescription;
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
