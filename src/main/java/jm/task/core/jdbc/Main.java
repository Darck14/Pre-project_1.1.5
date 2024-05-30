package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dima", "Vivo", (byte)24);
        userService.saveUser("Mike", "Miker", (byte)32);
        userService.saveUser("Vova", "Bigest", (byte)56);
        userService.saveUser("Vika", "Apple", (byte)16);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
