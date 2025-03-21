package Study.dio.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Study.dio.domain.model.User;
import Study.dio.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	

}
