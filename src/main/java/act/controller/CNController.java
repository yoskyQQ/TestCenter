package act.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import act.model.ItemService;
import act.model.StudentTest;
import act.questiontest.controller.JsonAcepter;

@RestController
@RequestMapping("/cnc")
public class CNController {
	
	@Autowired
	ItemService itemService;
	//正確答案ccca
	@ResponseBody
	@PostMapping("/m1")
	public String m1(@RequestBody JsonAcepter data) throws JSONException, ClassNotFoundException, SQLException {
		String q1 = data.getAnswer1();
		String q2 = data.getAnswer2();
		String q3 = data.getAnswer3();
		String q4 = data.getAnswer4();
		System.out.println("q1="+q1+",q2="+q2+",q3="+q3+",q4="+q4);
		String account = data.getAccount();
		System.out.println("account="+account);
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
		
		StudentTest item = new StudentTest();
		item.setIid(1);
		item.setGrade(score);
		item.setSid(3);
		
		itemService.insert(item);
		return "分數:"+score;
	}

	
	
}
