package com.game.hit.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String username;
	private String password;
	private String IdFigure;
	private int gold;
	private int diamond;
	private int rankPoint;
	private String avartar;
	private String friend;
	private String history;
	private String rank;
	private String nameInGame;
	public Account() {
		super();
	}
	public Account(int id, String username, String password, String role, String idFigure, int gold, int diamond,
			int rankPoint, String avartar, String friend, String history, String rank, String nameInGame) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		IdFigure = idFigure;
		this.gold = gold;
		this.diamond = diamond;
		this.rankPoint = rankPoint;
		this.avartar = avartar;
		this.friend = friend;
		this.history = history;
		this.rank = rank;
		this.nameInGame = nameInGame;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdFigure() {
		return IdFigure;
	}
	public void setIdFigure(String idFigure) {
		IdFigure = idFigure;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getDiamond() {
		return diamond;
	}
	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}
	public int getRankPoint() {
		return rankPoint;
	}
	public void setRankPoint(int rankPoint) {
		this.rankPoint = rankPoint;
	}
	public String getAvartar() {
		return avartar;
	}
	public void setAvartar(String avartar) {
		this.avartar = avartar;
	}
	public String getFriend() {
		return friend;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getNameInGame() {
		return nameInGame;
	}
	public void setNameInGame(String nameInGame) {
		this.nameInGame = nameInGame;
	}

}
