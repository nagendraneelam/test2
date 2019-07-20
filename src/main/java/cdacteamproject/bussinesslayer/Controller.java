package cdacteamproject.bussinesslayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	WorkDoneHere w;
	
	@PostMapping("/elogin")
	public int empLogin(@RequestBody Emp e)
	{
		return w.checkCredentials(e);
	}
}
