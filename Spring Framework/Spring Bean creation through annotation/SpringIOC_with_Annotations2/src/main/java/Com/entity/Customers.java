package Com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customers {

	@Value("1101")
	private int id;
	@Value("Sakshi")
	private String fname;
	@Value("Sutar")
	private String lname;
	@Value("Pune")
	private String city;

	public Customers() {

	}

	public Customers(int id, String fname, String lname, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + "]";
	}
}
