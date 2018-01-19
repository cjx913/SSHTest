package com.cjx913.ssh.action;

import com.cjx913.ssh.entity.User;
import com.cjx913.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private static final long serialVersionUID = 1010206991688047850L;
    private User user = new User();
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public User getModel() {
        return user;
    }



    public String login(){
        String username = user.getUsername();
        String password = user.getPassword();
        if(username.equals("cjx913")&&password.equals("123456")){
            return "login";
        }
        return ERROR;
    }

    public String register(){
        return "register";
    }
}
