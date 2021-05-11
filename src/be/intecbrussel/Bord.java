package be.intecbrussel;

public class Bord implements IOppervlakte{
    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur){
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    public String toString(){
        return this.materiaal + " " + this.kleur;
    }
    @Override
    public double oppervlakte(){
        return oppervlakte();
    }
}
