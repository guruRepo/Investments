package first.aws.investments.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InputController {


	@RequestMapping(value = "/dashboard")
	@ResponseBody
	public String getInvestments() {
		return "Hello Credit research team!";
	}
}
