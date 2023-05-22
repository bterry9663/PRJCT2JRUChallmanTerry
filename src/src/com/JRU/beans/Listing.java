package src.com.JRU.beans;

public class Listing {

	private String listingId;
	private String title;
	private String description;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String salary;
	private String careerField;
	private String contactEmail;

	public Listing(String listingId, String title, String description, String address, String city, String state,
			String zipcode, String salary, String careerField, String contactEmail) {

		this.listingId = listingId;
		this.title = title;
		this.description = description;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.salary = salary;
		this.careerField = careerField;
		this.contactEmail = contactEmail;

	}

	public Listing(String listingID, String careerField) {
		this.listingId = listingId;
		this.careerField = careerField;
	}

	public Listing() {
	}

	public String getListingId() {
		return this.listingId;
	}

	public void setListingId(String listingId) {
		this.listingId = listingId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCareerField() {
		return this.careerField;
	}

	public void setCareerField(String careerField) {
		this.careerField = careerField;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Override
	public String toString() {
		return "\n\n[ Listing Id = " + listingId + ",\n\n Title = " + title + ",\n Address = " + address + ", City = "
				+ city + ", State = " + state + ", zipcode = " + zipcode + ",\n salary = $" + salary
				+ ".00, careerField = " + careerField + ",\n contactEmail = " + contactEmail + ", \n Description = "
				+ description + " ]\n\n\n";

	}

}// class brace
