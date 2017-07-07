package springdemo;

public class Organization {

	public String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessSevice(BusinessService businessSevice) {
		this.businessSevice = businessSevice;
	}

	private String slogan;
	private BusinessService businessSevice = new CloudServiceImpl();

	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void corporateSlogann() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
