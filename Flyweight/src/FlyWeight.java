
public class FlyWeight {

	public String companyName;
	public String companyLocation;
	public String companyWebsite;
	//Bulky Data
	public byte[] companyLogo;
	
	public FlyWeight(String companyName, String companyLocation, String companyWebsite,
			byte[] companyLogo) {
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyWebsite = companyWebsite;
		this.companyLogo = companyLogo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public byte[] getCompanyLogo() {
		return companyLogo;
	}
	public void setCompanyLogo(byte[] companyLogo) {
		this.companyLogo = companyLogo;
	}
	
	
}

