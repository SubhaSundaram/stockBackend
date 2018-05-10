package com.example.stockdemo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class UserDetails{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int uid;

@Column
String username;

@Column
String email;

@Column
String password;

@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.EAGER)
@JoinColumn(name="uid")
private List<Portfolio> portfolio;

/**
 * @return the email
 */
public String getEmail() {
    return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
    this.email = email;
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
 * @return the portfolio
 */
public List<Portfolio> getPortfolio() {
    return portfolio;
}

/**
 * @param portfolio the portfolio to set
 */
public void setPortfolio(List<Portfolio> portfolio) {
    this.portfolio = portfolio;
}

/**
 * @return the uid
 */
public int getUid() {
    return uid;
}

/**
 * @param uid the uid to set
 */
public void setUid(int uid) {
    this.uid = uid;
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

@Override
public String toString() {
    return "[ "+username+" , "+email+" , "+password+" , "+portfolio+" ] ";
}
}