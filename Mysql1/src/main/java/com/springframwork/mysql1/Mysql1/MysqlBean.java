package com.springframwork.mysql1.Mysql1;

public class MysqlBean {
	private String url;
    private String username;
    private String password;

    // Constructors, getters, and setters
    public MysqlBean() {
    }

    public MysqlBean(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

}
