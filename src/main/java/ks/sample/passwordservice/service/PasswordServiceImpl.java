package ks.sample.passwordservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ks.sample.passwordservice.entiry.PasswordEntity;
import ks.sample.passwordservice.repository.PasswordRepository;

@Service
public class PasswordServiceImpl implements PasswordService {

	@Autowired
	private PasswordRepository repo;
	
	
	@Override
	public void storePassword(PasswordEntity passwordEntity) {
		repo.save(passwordEntity);
		
	}

	@Override
	public PasswordEntity findPasswordByUserName(String userName) {
		return repo.findByUserName(userName);
		
	}

}
