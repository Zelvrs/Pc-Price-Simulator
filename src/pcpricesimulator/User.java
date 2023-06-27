package pcpricesimulator;


import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gazel
 */
public class User {
    // ALL THIS CODE MADE BY GAZEL AVERROUS

    private String name, password;
    private Components userComponents;
    private static ArrayList<User> userList = new ArrayList<>();
    private UserWishlistForm userWishlistForm;

    public void setUserWishlistForm(UserWishlistForm userWishlistForm) {
        this.userWishlistForm = userWishlistForm;
    }


    public Components getUserComponents() {
        return this.userComponents;
    }

    public UserWishlistForm getUserWishlistForm() {
        return this.userWishlistForm;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        userList.add(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<User> getUserList() {
        return userList;
    }
    
    public static void showUserList(){
        System.out.println("DATA USER\n===============================================");
        for(User c: User.getUserList()){
            System.out.println("Name: " + c.getName() +
                    "\nPassword: " + c.getPassword() + "\n===================================");
        }
    }

    public static void clearUserList(){
        User.userList.clear();
    }
    
    public void setUserComponents(String cpu, String cpuCooler, String motherboard, String memory, String storage, String graphicsCard, String case1, String powerSupply, String monitor, Double total){
       
        this.userComponents = new Components(cpu,cpuCooler,motherboard,memory, storage, graphicsCard, case1, powerSupply, monitor, total);
        this.userWishlistForm = new UserWishlistForm(cpu,cpuCooler,motherboard,memory, storage, graphicsCard, case1, powerSupply, monitor, total);
        
    }
}

