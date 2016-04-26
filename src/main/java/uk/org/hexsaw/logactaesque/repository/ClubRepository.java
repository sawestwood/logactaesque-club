package uk.org.hexsaw.logactaesque.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uk.org.hexsaw.logactaesque.model.Club;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clubs", path = "clubs")
public interface ClubRepository extends PagingAndSortingRepository<Club, Integer> {

    List<Club> findByName(@Param("name") String name);

}
