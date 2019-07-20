package cdacteamproject.bussinesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkDoneHere {

	@Autowired
	private DaoConnection dc;
	
	public int checkCredentials(Emp e) {
		// TODO Auto-generated method stub
		if(dc.findById(e.getEmpno()).isPresent())
		{
			Emp obj=dc.findById(e.getEmpno()).get();
			if(obj.getDeptid()==e.getDeptid())
				return 1;
		}
		return 0;
	}

}
