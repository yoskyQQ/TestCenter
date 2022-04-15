package act.questiontest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(names={"sid"})
public class QuestionEntryController {

	
	
	@GetMapping("/question/{url}")
	public String thyquestionurl(@PathVariable("url") String url) {
		return "th/question/"+url;
	}
	 
}
