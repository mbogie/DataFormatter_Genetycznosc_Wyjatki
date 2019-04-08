package generyczna;

public class Kot implements Comparable<Kot> {
    private String imie;

    public Kot(String imie) {
        this.imie = imie;
    }

    @Override
    public int compareTo(Kot o) {
        return this.imie.compareTo(o.imie);
    }

    @Override
    public String toString() {
        return "Kot{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
