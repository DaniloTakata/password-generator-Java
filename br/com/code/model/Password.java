package br.com.code.model;

public class Password {

    private int lenght;
    private StringBuilder passwordGenerate;

    public Password() {}

    public Password(int lenght, StringBuilder passwordGenerate) {
        this.lenght = lenght;
        this.passwordGenerate = passwordGenerate;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public StringBuilder getPasswordGenerate() {
        return passwordGenerate;
    }

    public void setPasswordGenerate(StringBuilder passwordGenerate) {
        this.passwordGenerate = passwordGenerate;
    }

    @Override
    public String toString() {
        return "Password {" +
                "lenght=" + lenght +
                ", passwordGenerate=" + passwordGenerate +
                '}';
    }
}
