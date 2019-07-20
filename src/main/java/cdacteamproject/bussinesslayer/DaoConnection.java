package cdacteamproject.bussinesslayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoConnection extends JpaRepository<Emp, Integer>{

}
