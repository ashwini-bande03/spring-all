package com.spring.jdbc.UserBean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
public class UserBean {
 // Member variables
 private int userid;
 private String username;
 private String password;
 private String address;
 private JdbcTemplate jt;
 // Constructor with all parameters
 public UserBean(int userid, String username, String password, String address,JdbcTemplate jt) {
 super();
 this.userid = userid;
 this.username = username;
 this.password = password;
 this.address = address;
 this.jt = jt;
 }
 // Getters and setters
 public int getUserid() {
 return userid;
 }
 public void setUserid(int userid) {
 this.userid = userid;
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
 public String getAddress() {
 return address;
 }
 public void setAddress(String address) {
 this.address = address;
 }
 public JdbcTemplate getJt() {
 return jt;
 }
 public void setJt(JdbcTemplate jt) {
 this.jt = jt;
 }
 // Default constructor
 public UserBean() {
 super();
 }
 // Method to create a new table
 public void create() {
 jt.execute("create table users(userid int, username varchar(40), password varchar(40), address varchar(50))");
 System.out.println("New table created successfully..");
 }
 // Method to insert a user record
 public void insert() {
 int data = jt.update("insert into users(userid, username, password, address) values(101,'Ashwini','9999','Hyd')");
 System.out.println(data + " user data inserted....");
 }
 // Method to update a user record
 public void updateUser() {
 int updateData = jt.update("update users set password = 'srikar aleti', address='hyd' where userid = 101 ");
 System.out.println(updateData + " record updated successfully");
 }
 // Method to delete a user record
 public void deleteUser() {
 int deleteRecord = jt.update("delete from users where userid = 101");
 System.out.println(deleteRecord + " record deleted successfully...");
 }
 // Method to get a single user record
 public void getOneRecord() {
 List<Map<String, Object>> oneRecord = jt.queryForList("select * from users where userid = 101");
 Iterator<Map<String, Object>> it = oneRecord.iterator();
 while (it.hasNext()) {
 Object obj = it.next();
 System.out.println(obj.toString());
 }
 }
 // Method to retrieve all user records
 public void allRecord() {
 List<Map<String, Object>> allRec = jt.queryForList("select * from users");
 Iterator<Map<String, Object>> it = allRec.iterator();
 while (it.hasNext()) {
 Object obj = it.next();
 System.out.println(obj.toString());
 }
 }
}