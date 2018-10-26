package first.aws.investments.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InputController {


	@RequestMapping(value = "/investments")
	@ResponseBody
	public String getInvestments() {
		return "hello Credit research team";
	}
}
