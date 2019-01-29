package ks.sample.passwordservice.repository;

import org.springframework.data.repository.CrudRepository;

import ks.sample.passwordservice.entiry.PasswordEntity;

public interface PasswordRepository extends CrudRepository<PasswordEntity, Integer> {

	public PasswordEntity findByUserName(String userName);
}
