package first.aws.investments.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import first.aws.investments.response.CreditResearchData;

@RestController
public class InputController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)	
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<CreditResearchData> getInvestments() {
		List<CreditResearchData> resultList = new ArrayList<CreditResearchData>();
		
		resultList.add(buildCreditResearchData("ABC", "Approved", "Energy", "BB+", "C", "$10,000,000"));
		resultList.add(buildCreditResearchData("DEF", "Pending Approval", "Energy", "BB+", "C", "$2,000,000"));
		resultList.add(buildCreditResearchData("GHI", "Declined", "A&D", "AA-", "C", "$5,000,000"));
		return resultList;
	}

	private CreditResearchData buildCreditResearchData(String ticker, String status, String sector, String internalRating, String riskQualifier, String genAcctBV) {
		return new CreditResearchData(ticker, status, sector, internalRating,  riskQualifier,  genAcctBV);
	}
	
	
}
