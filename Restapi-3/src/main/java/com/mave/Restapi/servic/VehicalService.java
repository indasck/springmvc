package com.mave.Restapi.servic;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mave.Restapi.entit.VechicalEn;
import com.mave.Restapi.model.vehicalDetail;
import com.mave.Restapi.reposit.VechicalRepositary;

@Service
public class VehicalService  {

	VechicalRepositary vechicalRepositary;
	
	public VehicalService(VechicalRepositary vechicalRepositary) {
		super();
		this.vechicalRepositary = vechicalRepositary;
	}


	
	public VechicalEn createvehical(vehicalDetail vehicalDetail) {
		
		VechicalEn vechicalEn= new VechicalEn();
		
		vechicalEn.setVno(vehicalDetail.getVno());
		vechicalEn.setVBrandname(vehicalDetail.getVBrandname());
		vechicalEn.setPrice(vehicalDetail.getPrice());
		vechicalEn.setCreatedBy(System.getProperty("user.name"));
		vechicalEn.setCreatedAt(LocalDateTime.now());
		
		VechicalEn venEn= vechicalRepositary.save(vechicalEn);
		return venEn ;
	}
	
	public VechicalEn getById(int vno) {
		Optional<VechicalEn> vcno=	vechicalRepositary.findById(vno);
		return vcno.get();
		
	}



	public VechicalEn updatedById(int vno, vehicalDetail vehicalDetail) {
		// TODO Auto-generated method stub
		Optional<VechicalEn> vechical= vechicalRepositary.findById(vno);
		
		if(vechical.isPresent()) {
			VechicalEn vechicalEn= new VechicalEn();
			vechicalEn.setVno(vehicalDetail.getVno());
			vechicalEn.setVBrandname(vehicalDetail.getVBrandname());
			vechicalEn.setPrice(vehicalDetail.getPrice());
			vechicalEn.setCreatedBy(System.getProperty("user.name"));
			vechicalEn.setCreatedAt(LocalDateTime.now());
			
			VechicalEn vehical= vechicalRepositary.save(vechicalEn);
			return vehical;
		}
		else {
			return null;
		}
		
	}



	public void deleteById(int vno) {
		// TODO Auto-generated method stub
	    vechicalRepositary.deleteById(vno);;
	}
	
	

}
