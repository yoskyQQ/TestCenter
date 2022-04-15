package act.model;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemService {
//	@Autowired
//	private StudentDAO iDao;
	@Autowired
	private StudentTestRepository repository;
	
	public void insert(StudentTest item) throws ClassNotFoundException, SQLException {//0413註解19-30
//		 iDao.insert(item);
		repository.save(item);
	}
//	public Item update(Item item) {
//		return iDao.save(item);
//	}
//	public void deleteById(Integer itemId) {
//		iDao.deleteById(itemId);
//	}
//	public Item findById(Integer itemId) {
//		Optional<Item> op1 = iDao.findById(itemId);
//		return op1.get();
//	}
}
