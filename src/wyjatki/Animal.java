package wyjatki;

public enum Animal {
    DOG("pies"),
    CAT("kot"),
    PARROT("papuga");

    private  String polishTranslation;

    Animal(String polishTranslation) {
        this.polishTranslation = polishTranslation;
    }

    public String getPolishTranslation() {
        return polishTranslation;
    }
}
