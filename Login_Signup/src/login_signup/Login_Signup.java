/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_signup;
public class Login_Signup {
    public static void main(String[] args) {
        Signup_Page signup = new Signup_Page();
            signup.setVisible (true);
            signup.pack();
            signup.setLocationRelativeTo(null);
            signup.setDefaultCloseOperation(Signup_Page.EXIT_ON_CLOSE);
    }
}