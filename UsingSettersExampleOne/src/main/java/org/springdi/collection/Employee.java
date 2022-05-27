package org.springdi.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private Set<Long> phoneNumbers;
	private List<String> knownTechnologies;
	private Map<String,Float> techRating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<String> getKnownTechnologies() {
		return knownTechnologies;
	}
	public void setKnownTechnologies(List<String> knownTechnologies) {
		this.knownTechnologies = knownTechnologies;
	}
	public Map<String, Float> getTechRating() {
		return techRating;
	}
	public void setTechRating(Map<String, Float> techRating) {
		this.techRating = techRating;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ ", knownTechnologies=" + knownTechnologies + ", techRating=" + techRating + "]";
	}
	
	
}
