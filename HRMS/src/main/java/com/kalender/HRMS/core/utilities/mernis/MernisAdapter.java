package com.kalender.HRMS.core.utilities.mernis;

import com.kalender.HRMS.services.Mernis.FakeMernis;

public class MernisAdapter implements UserCheckService {

	@Override
	public boolean checkIfReal(String name, String surname, String identityNumber, String yearOfBirth) {
			FakeMernis fakeMernis = new FakeMernis();
			
			boolean result=fakeMernis.doğrula(name, surname, identityNumber, yearOfBirth);		
		return result;
	}

}
