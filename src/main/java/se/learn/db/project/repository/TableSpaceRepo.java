package se.learn.db.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.learn.db.project.entity.TableSpaceData;

@Repository
public interface TableSpaceRepo extends JpaRepository<TableSpaceData, Long> {

}
