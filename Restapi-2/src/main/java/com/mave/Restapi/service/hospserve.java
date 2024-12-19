package com.mave.Restapi.service;

import com.mave.Restapi.entit.Hospitalent;

public interface hospserve {
	
	public String createhospitalDetail(Hospitalent hospitalent);
	
	public Hospitalent gethospitalDetails(int hno);
	

}
