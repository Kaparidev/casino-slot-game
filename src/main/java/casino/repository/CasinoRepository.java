package casino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import casino.entity.Casino;

public interface CasinoRepository extends JpaRepository<Casino, Long>{

}
