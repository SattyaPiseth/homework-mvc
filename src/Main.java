import controller.UserController;
import model.dto.UserDto;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        System.out.println("======== List of all users ========");
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("======== Add new user ========");
        userController.addNewUser(new UserDto("sattya", "sattya123@gmail.com"));
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("======== Delete user by id ========");
        userController.deleteUserById(1);
        System.out.println("======== List of all users ========");
        userController.getAllUsers().forEach(System.out::println);
        System.out.println("======== Update user by id ========");
        userController.updateUser(3,new UserDto("sattya", "ilv@gmail.com"));
        System.out.println("======== List of all users ========");
        userController.getAllUsers().forEach(System.out::println);
    }
}