package com.game.hit.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.hit.DAO.Account;
@Repository
public interface AccountReponsitory extends JpaRepository<Account, Integer> {
	Account findByUsername(String username);
}
