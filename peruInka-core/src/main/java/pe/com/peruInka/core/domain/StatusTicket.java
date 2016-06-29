package pe.com.peruInka.core.domain;

public class StatusTicket extends BaseType {
	
	private static final long serialVersionUID = 1L;

	public enum Status {
		TICKET_ACT("TICKET_ACT"), TICKET_INACT("TICKET_INACT");

		private String statusCode;

		private Status(String s) {
			statusCode = s;
		}

		public String getStatusCode() {
			return statusCode;
		}

	}

}
