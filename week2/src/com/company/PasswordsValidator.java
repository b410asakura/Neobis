package com.company;

import java.util.Scanner;

public class PasswordsValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String password = scanner.nextLine();
            boolean isUpper = false;
            boolean isLower = false;
            boolean isNumber = false;
            if(password.length() < 6 || password.length() > 32){
                System.out.println("Senha invalida.");
            } else {
                boolean isValid = true;
                for (int i = 0; i < password.length(); i++) {
                    if(Character.isDigit(password.charAt(i))) isNumber = true;
                    else if (Character.isUpperCase(password.charAt(i))) isUpper = true;
                    else if (Character.isLowerCase(password.charAt(i))) isLower = true;
                    else {
                        isValid = false;
                        break;
                    }
                }
                if(isLower && isNumber && isUpper && isValid){
                    System.out.println("Senha valida.");
                } else System.out.println("Senha invalida.");
            }
        }
    }
}
