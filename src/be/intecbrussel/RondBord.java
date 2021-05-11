package be.intecbrussel;

public class RondBord extends Bord{
    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte(){
        double oppervlakte = 3.14 * (diameter / 2) * (diameter / 2);
        return oppervlakte;
    }

}
