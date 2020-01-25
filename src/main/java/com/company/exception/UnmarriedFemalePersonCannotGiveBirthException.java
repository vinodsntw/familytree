package com.company.exception;

public class UnmarriedFemalePersonCannotGiveBirthException extends Exception {

    public UnmarriedFemalePersonCannotGiveBirthException() {
        super("Unmarried female person cannot give birth to a child.");
    }
}
