package uk.nhs.gpitf.purchasing.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.nhs.gpitf.purchasing.entities.*;

@Repository
public interface PatientCountRunRepository extends CrudRepository<PatientCountRun, Long> {
	Optional<PatientCountRun> findAllByOrderByRunDate();
}
