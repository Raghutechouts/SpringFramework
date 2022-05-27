package org.spring.SampleAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Branch {
	
	@Value("${branchName.name}")
	private String branchName;
	
	public void methodBranch() {
		System.out.println("This is my branch "+branchName);
	}
}
