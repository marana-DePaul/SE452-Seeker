package se452.group9.seeker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se452.group9.seeker.model.Application;

public interface ApplicationRepository extends JpaRepository <Application, Long>{

}
