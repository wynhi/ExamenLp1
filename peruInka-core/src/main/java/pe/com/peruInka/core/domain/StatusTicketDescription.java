package pe.com.peruInka.core.domain;

public class StatusTicketDescription extends BaseType {
	
	private static final long serialVersionUID = 1L;

	public enum Status {
		TICKETDESCRIPTION_ACT("TICKETDESCRIPTION_ACT"), TICKETDESCRIPTION_INACT("TICKETDESCRIPTION_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
