package uk.nhs.gpitf.purchasing.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.nhs.gpitf.purchasing.entities.EvaluationBundleScore;
import uk.nhs.gpitf.purchasing.entities.EvaluationScoreValue;

@Repository
public interface EvaluationBundleScoreRepository extends CrudRepository<EvaluationBundleScore, Integer> {
}
