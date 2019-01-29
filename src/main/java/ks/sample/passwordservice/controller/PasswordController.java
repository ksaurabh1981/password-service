package ks.sample.passwordservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ks.sample.passwordservice.entiry.PasswordEntity;
import ks.sample.passwordservice.service.PasswordService;

@RestController()
@RequestMapping(path="/pwd")
public class PasswordController {

	@Autowired
	private PasswordService service;
	
	@RequestMapping(path="/store", method=RequestMethod.POST)
	public String savePassword(@RequestParam(name="uName") String userName,
			@RequestParam(name="pwd") String password,
			@RequestParam(name="name") String name,
			@RequestParam(name="email") String email) {
		System.out.println(" Calling Store Password");
		
		PasswordEntity pwdEnt = new PasswordEntity(userName, password, name, email);
		//PasswordEntity pwdEnt = new PasswordEntity();
		System.out.println(pwdEnt);
		
		service.storePassword(pwdEnt);
		
		return "Password Saved";
	}
	
	@RequestMapping(path="/find")
	public PasswordEntity fetchPasswordByUserName(@RequestParam(name="uName") String userName) {
		PasswordEntity pwdEnt = service.findPasswordByUserName(userName);
		System.out.println(pwdEnt);
		return pwdEnt;
	}
}
