package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dima", "Zetrikin", (byte)12);
        userService.saveUser("Dima", "Zetrikin", (byte)13);
        userService.saveUser("Dima", "Zetrikin", (byte)14);
        userService.saveUser("Dima", "Zetrikin", (byte)15);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
