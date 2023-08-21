package br.com.code.controller;

import br.com.code.model.Password;

import java.security.SecureRandom;

public class PasswordGenerator {

    public static String generatePassword(int lenght, int passwordType) {
        String passwordOrException = "";
        Password password;
        SecureRandom secureRandom;

        try {
            password = new Password();
            password.setLenght(lenght);
            secureRandom = new SecureRandom();

            String lowercaseLetters = "abcdefghijklmnopqrstuvxwyz";
            String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
            String numbers = "0123456789";
            String specialChars = "!@#$%^&*()/-";

            switch (passwordType) {
                default -> {
                    // Alfabeto minusculo + numeros
                    String chars = lowercaseLetters + numbers;

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        int randomIndex = secureRandom.nextInt(chars.length());
                        pass += String.valueOf(chars.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
                case 1 -> {
                    // Alfabeto minusculo + Alfabeto maiusculo + numeros
                    String chars = lowercaseLetters + numbers + uppercaseLetters;
                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        int randomIndex = secureRandom.nextInt(chars.length());
                        pass += String.valueOf(chars.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));
                    break;
                }
                case 2 -> {
                    // Alfabeto minusculo + Alfabeto maiusculo + numeros + caracteres especiais - Completo
                    String chars = lowercaseLetters + numbers + uppercaseLetters + specialChars;

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        int randomIndex = secureRandom.nextInt(chars.length());
                        pass += String.valueOf(chars.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
                case 3 -> {
                    // Numeros apenas
                    int randomIndex = secureRandom.nextInt(numbers.length());

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        pass += String.valueOf(numbers.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
                case 4 -> {
                    // Alfabeto minusculo apenas
                    int randomIndex = secureRandom.nextInt(lowercaseLetters.length());

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        pass += String.valueOf(lowercaseLetters.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
                case 5 -> {
                    // Alfabeto minusculo apenas
                    int randomIndex = secureRandom.nextInt(uppercaseLetters.length());

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        pass += String.valueOf(uppercaseLetters.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
                case 6 -> {
                    // Caracteres especiais apenas
                    int randomIndex = secureRandom.nextInt(specialChars.length());

                    String pass = "";

                    for (int i = 0; i < lenght; i++) {
                        pass += String.valueOf(specialChars.charAt(randomIndex));
                    }

                    password.setPasswordGenerate(new StringBuilder(pass));

                    break;
                }
            }

            passwordOrException = password.getPasswordGenerate().toString();

        } catch (Exception e) {
            passwordOrException = "Erro ao gerar uma senha aleatória.";
        }

        return passwordOrException;
    }

}
