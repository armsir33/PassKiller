package pk.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pk.model.Credential;

@RepositoryRestResource(collectionResourceRel="challenge", path="challenge")
public interface ChallengeRepository extends CrudRepository<Credential, Long> {
	public List<Credential> findByName(@Param("name") String name);
}
