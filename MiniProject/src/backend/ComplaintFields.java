package backend;

public class ComplaintFields {
	
	private String dateReceived;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
	private String state;
	private String zipCode;
	private String submittedVia;
	private String dateSentToCompany;
	private String companyResponse;
	private String timelyResponse;
	private String consumerDisputed;
	private String complaintId;
	
	
	
	public ComplaintFields() {
		super();
	}


	public ComplaintFields(String dateReceived, String product, String issue, String company, String state,
			String zipCode, String submittedVia, String companyResponse, String timelyResponse, String complaintId) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.issue = issue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.complaintId = complaintId;
	}
	
	
	public ComplaintFields(String dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedVia, String dateSentToCompany,
			String companyResponse, String timelyResponse, String consumerDisputed, String complaintId) {
		super();
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSentToCompany = dateSentToCompany;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		this.complaintId = complaintId;
	}



	public String getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSubmittedVia() {
		return submittedVia;
	}
	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}
	public String getDateSentToCompany() {
		return dateSentToCompany;
	}
	public void setDateSentToCompany(String dateSentToCompany) {
		this.dateSentToCompany = dateSentToCompany;
	}
	public String getCompanyResponse() {
		return companyResponse;
	}
	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}
	public String getTimelyResponse() {
		return timelyResponse;
	}
	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}
	public String getConsumerDisputed() {
		return consumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	
	

}
