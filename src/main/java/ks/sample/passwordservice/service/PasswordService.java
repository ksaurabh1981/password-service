package ks.sample.passwordservice.service;

import ks.sample.passwordservice.entiry.PasswordEntity;

public interface PasswordService {

	public void storePassword(PasswordEntity passwordEntity);
	
	public PasswordEntity findPasswordByUserName(String userName);
}
