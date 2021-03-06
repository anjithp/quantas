package com.quantas.cdm.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Anjithkumar Paila
 * @since 1.0.0
 *
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
public class Customer extends BaseResource{

	private String profileUserName;
	//will be in saved as a hash or in an encrypted format in the database .
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private List<Address> addresses = new ArrayList<>();
	
	private Map<String, String> customFields = new HashMap<>();
	

	@JsonAnyGetter
	public  Map<String, String> getCustomFields() {
		return new HashMap<>(this.customFields);
	}
	

}

