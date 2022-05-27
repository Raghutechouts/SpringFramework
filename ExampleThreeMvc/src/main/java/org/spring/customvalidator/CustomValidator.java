package org.spring.customvalidator;

import org.spring.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Student.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Student student = (Student) target;
		int age = student.getAge();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "customer.age.empty");
		if(age < 18 || age > 60){
            errors.rejectValue("age", "student.age.range.invalid");
        }
	}

}
