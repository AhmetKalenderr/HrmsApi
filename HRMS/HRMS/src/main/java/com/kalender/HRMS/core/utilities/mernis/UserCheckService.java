package com.kalender.HRMS.core.utilities.mernis;

import org.springframework.web.bind.annotation.RequestParam;

public interface UserCheckService {
	
	boolean checkIfReal( String name, String surname,String identityNumber,String yearOfBirth);
}
