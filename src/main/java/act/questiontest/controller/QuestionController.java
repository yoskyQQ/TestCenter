package act.questiontest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(names={"sid"})
@RequestMapping(value="/question")
public class QuestionController {
	
//	@Autowired
//	private TestSaveService testService;
	
//	@GetMapping("/tcindex")
//	public String index() {
//		
//		return "th/TC";
//	}
//	@GetMapping("/tcquestionCN")
//	public String tCQuestionCN() {
//		
//		return "th/questioncn";
//	}
//	@GetMapping("/tcquestionMath")
//	public String tCQuestionMath() {
//		
//		return "th/TCQuestionMath";
//	}
//	@GetMapping("/tcquestionEn")
//	public String tCQuestionEN() {
//		
//		return "th/TCQuestionEN";
//	}
//	@GetMapping("/tcquestionPreview")
//	public String tCQuestionPreview() {
//		
//		return "th/TCPriview";
//	}
	
	
	@PostMapping("/englishProcessed")
	@ResponseBody
	public String englishprocessed(@RequestBody JsonAcepter data) throws JSONException {
	
		String q1 =data.getAnswer1();
		String q2 =data.getAnswer2();
		String q3 =data.getAnswer3();
		String q4 =data.getAnswer4();
		System.out.println("q1="+q1+",q2="+q2+",q3="+q3+",q4="+q4);
		String account = data.getAccount();
		int score = 0;
		
		if(q1.equals("c")) {
			score+=25;
		}
		if(q2.equals("c")) {
			score+=25;
		}
		if(q3.equals("c")) {
			score+=25;
		}
		if(q4.equals("a")) {
			score+=25;
		}
		//  sid 之後導入
		int sid =1;
		// 英文 itemid=2
		int itemID=2;
//		testService.saveTestReport(sid,itemID,score);
		
		
		return "分數:"+score;
		

	}
	@PostMapping("/chineseProcessed")
	@ResponseBody
	public String chineseprocessed(@RequestBody JsonAcepter data) throws JSONException {
	
		String q1 =data.getAnswer1();
		String q2 =data.getAnswer2();
		String q3 =data.getAnswer3();
		String q4 =data.getAnswer4();
		System.out.println("q1="+q1+",q2="+q2+",q3="+q3+",q4="+q4);
		String account = data.getAccount();
		int score = 0;
		
		if(q1.equals("c")) {
			score+=25;
		}
		if(q2.equals("c")) {
			score+=25;
		}
		if(q3.equals("c")) {
			score+=25;
		}
		if(q4.equals("a")) {
			score+=25;
		}
			//  sid 之後導入
			int sid =1;
			// 國文 itemid=1
			int itemID=1;
//			testService.saveTestReport(sid,itemID,score);

		
		return "分數:"+score;
		

	}
	@PostMapping("/mathProcessed")
	@ResponseBody
	public String mathprocessed(@RequestBody JsonAcepter data) throws JSONException {
	
		String q1 =data.getAnswer1();
		String q2 =data.getAnswer2();
		String q3 =data.getAnswer3();
		String q4 =data.getAnswer4();
		System.out.println("q1="+q1+",q2="+q2+",q3="+q3+",q4="+q4);
		String account = data.getAccount();
		int score = 0;
		
		if(q1.equals("c")) {
			score+=25;
		}
		if(q2.equals("c")) {
			score+=25;
		}
		if(q3.equals("c")) {
			score+=25;
		}
		if(q4.equals("a")) {
			score+=25;
		}
			//  sid 之後導入
			int sid =1;
			// 數學 itemid=3
			int itemID=3;
//			testService.saveTestReport(sid,itemID,score);

		return "分數:"+score;
		

	}




}
