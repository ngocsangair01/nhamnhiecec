package com.game.hit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.hit.DAO.Account;
import com.game.hit.DTO.AccountDTO;
import com.game.hit.exception.DuplicateEx;
import com.game.hit.exception.NotFoundEx;
import com.game.hit.reponsitories.AccountReponsitory;

@RestController
@RequestMapping("/haha")
public class AccountController {
	
	@Autowired
	private AccountReponsitory accountRepository;
	
	@GetMapping
	public ResponseEntity<?> getAllAccount(){
		List<Account> listAccounts = accountRepository.findAll();
		if (listAccounts.size()==0) {
			throw new NotFoundEx("Khong tìm thấy tài khoản");
		}
		return ResponseEntity.status(200).body(listAccounts);
	}
	
	@PostMapping
	public ResponseEntity<?> createAccount (@RequestBody AccountDTO accountDTO ){
//		Account account = accountRepository.findByUserName(accountDTO.getUsername());
//		if (account!=null) {
//			throw new DuplicateEx("Account has been already exists");
//		}
		Account account2= new Account()	;
		account2.setUsername(accountDTO.getUsername());
		account2.setPassword(accountDTO.getPassword());
		Account account3= accountRepository.save(account2);
		return ResponseEntity.status(201).body(account3);
	}
}