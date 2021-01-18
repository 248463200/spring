package com.pyh;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("新增一个用户");
    }

    public String update() {
        System.out.println("修改一个用户");
        return "success";
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void select() {
        System.out.println("查询一个用户");
    }
}
