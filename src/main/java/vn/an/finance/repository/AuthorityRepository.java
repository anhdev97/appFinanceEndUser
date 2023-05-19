package vn.an.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.an.finance.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
