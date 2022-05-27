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
	
	
	
	
	public Employee(int id, String name, Set<Long> phoneNumbers, List<String> knownTechnologies,
			Map<String, Float> techRating) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.knownTechnologies = knownTechnologies;
		this.techRating = techRating;
	}

	public Employee(int id, String name, Address address, Set<Long> phoneNumbers, List<String> knownTechnologies,
			Map<String, Float> techRating) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.knownTechnologies = knownTechnologies;
		this.techRating = techRating;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ ", knownTechnologies=" + knownTechnologies + ", techRating=" + techRating + "]";
	}
	
	
}
