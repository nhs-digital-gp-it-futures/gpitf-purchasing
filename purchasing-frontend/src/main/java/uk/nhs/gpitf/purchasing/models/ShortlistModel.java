package uk.nhs.gpitf.purchasing.models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import lombok.Data;
import uk.nhs.gpitf.purchasing.entities.ProcShortlistRemovalReason;
import uk.nhs.gpitf.purchasing.entities.ProcSolutionBundle;
import uk.nhs.gpitf.purchasing.entities.swagger.SolutionEx2;

@Data
public class ShortlistModel {
	private long procurementId;
	//private List<SolutionEx2> solutions = new ArrayList<>();
	private List<ProcSolutionBundle> bundles = new ArrayList<>();
	private List<ProcShortlistRemovalReason> removalReasons = new ArrayList<>();

	private int numberOfPractices = 0;
	private int numberOfPatients = 0;
	private LocalDate plannedContractStart = null;
	public Integer contractMonthsYears = null;
	public Integer contractMonthsMonths = null;
	public String removeSolutionId = null;
	public Long removalReasonId = null;
	@Size(max = 255)
	public String removalReasonText = "";
	public int DIRECTAWARD_MAXVALUE = 0;
	public String directAwardBundleId = "";
	private int[] possibleContractMonthsYears  = new int[] {0,1,2,3,4,5,6,7,8,9,10};
	private int[] possibleContractMonthsMonths = new int[] {0,1,2,3,4,5,6,7,8,9,10,11}; 
/*	
	public BigDecimal getPrice(String solutionId) {
		for (var solution : solutions) {
			if (solution.getId().equals(solutionId)) {
				return solution.getPrice().multiply(BigDecimal.valueOf(numberOfPatients)).setScale(0, RoundingMode.HALF_UP);
			}
		}
		return BigDecimal.ZERO;
	}
*/	
	public BigDecimal getPriceForBundle(long bundleId) {
		for (var bundle : bundles) {
			if (bundle.getId() == bundleId) {
				return bundle.getPrice().multiply(BigDecimal.valueOf(numberOfPatients)).setScale(0, RoundingMode.HALF_UP);
			}
		}
		return BigDecimal.ZERO;
	}
	
	public boolean canDirectAward(long bundleId) {
		BigDecimal price = getPriceForBundle(bundleId);
		return price.compareTo(new BigDecimal(DIRECTAWARD_MAXVALUE)) <= 0;
		// Direct award no longer depends on whether foundation solution
/*		
		for (var solution : solutions) {
			if (solution.getId().equals(solutionId)) {
				return !solution.isFoundation();
			}
		}
*/
	}
}
