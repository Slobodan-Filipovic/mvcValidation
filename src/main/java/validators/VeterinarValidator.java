package validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import models.Veterinar;

public class VeterinarValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Veterinar.class.isAssignableFrom(arg0);//similar to instanceof
	}

	public void validate(Object o, Errors errors) {
		Veterinar veterinar = (Veterinar) o;
		if(veterinar == null) {
			throw new NullPointerException();
		}
		else {
			if(veterinar.getName() == null || veterinar.getName().length() == 0) {
				errors.rejectValue("name", "Name is required!");
				return;
			}
			if(veterinar.getLastName() == null || veterinar.getLastName().length() == 0) {
				errors.rejectValue("lastname", "Lastname is required!");
				return;
			}
			if(veterinar.getTelephone() == null || veterinar.getTelephone().length() == 0) {
				errors.rejectValue("telephone", "Telephone is required!");
				return;
			}
		}
		
	}

}
