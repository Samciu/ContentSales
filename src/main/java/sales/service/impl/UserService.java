package sales.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import sales.dao.impl.UserDao;
import sales.model.User;

@Service
public class UserService {
	
	@Resource
	private UserDao dao;
	
	public User getUserByAccount(String userName, String password) {
        //return dao.checkInfo("buyer", "37254660e226ea65ce6f1efd54233424");
        //return dao.checkInfo("seller", "981c57a5cfb0f868e064904b8745766f");
        return dao.checkInfo(userName, password);
    }
}
