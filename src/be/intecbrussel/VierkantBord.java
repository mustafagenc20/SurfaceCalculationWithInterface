package be.intecbrussel;

public class VierkantBord extends Bord{

    private double zijde;

    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }

    @Override
    public double oppervlakte(){
        double oppervlakte = zijde * zijde;
        return oppervlakte;
    }
}
