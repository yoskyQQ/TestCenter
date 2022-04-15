//package tl.questiontest.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import tl.entity.Test;
//
//@Service
//public class TestSaveService {
//
//	@Autowired
//	private TestRepository testRepo;
//	
//	
//	
//	public boolean saveTestReport(int sid, int itemID, int score) {
//		try {
//			Date today=new Date();
//			Test newtest=new Test(sid,itemID,score,today);
//			testRepo.save(newtest);
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//		
//	}
//}
