package com.models;

public class Users {
	public Integer user_id;
	public String username;
	public String password;
	public Integer salary;
	
	public Users(Integer user_id, String username, String password, Integer salary) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.salary = salary;
	}
	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", username=" + username + ", password=" + password + ", salary=" + salary
				+ "]";
	}
	
	
	
}
