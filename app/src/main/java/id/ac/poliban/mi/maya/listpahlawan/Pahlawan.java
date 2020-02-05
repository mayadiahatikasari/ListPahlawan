package id.ac.poliban.mi.maya.listpahlawan;

public class Pahlawan {
    private String hero;
    private String namaPahlawan;
    private String descPahlawan;

    public Pahlawan(String hero, String namaPahlawan, String descPahlawan) {
        this.hero = hero;
        this.namaPahlawan = namaPahlawan;
        this.descPahlawan = descPahlawan;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getNamaPahlawan() {
        return namaPahlawan;
    }

    public void setNamaPahlawan(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public String getDescPahlawan() {
        return descPahlawan;
    }

    public void setDescPahlawan(String descPahlawan) {
        this.descPahlawan = descPahlawan;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getNamaPahlawan(), getDescPahlawan());
    }
}
