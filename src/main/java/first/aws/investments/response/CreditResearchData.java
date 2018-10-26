package first.aws.investments.response;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class CreditResearchData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String ticker;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String status;

	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String sector;


	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String internalRating;
	

	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String riskQualifier;
	
	@Getter
	@Setter(AccessLevel.PUBLIC)
	private String genAcctBV;
	
	
	
	public CreditResearchData(String ticker, String status, String sector, String internalRating, String riskQualifier, String genAcctBV) {
		this.ticker = ticker;
		this.status = status;
		this.sector = sector;
		this.internalRating = internalRating;
		this.riskQualifier = riskQualifier;
		this.genAcctBV = genAcctBV;
	}

}
