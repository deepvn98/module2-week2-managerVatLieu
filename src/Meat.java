import java.time.LocalDate;

public class Meat extends Material implements Discount{
    public static final double GIAM30 = 0.7;
    public static final double GIAM50 = 0.5;
    public static final double GIAM10 = 0.9;

    private double weight;

    public Meat(String id, String name, int cost, LocalDate manufacturingDate, double weight) {
        super(id, name, cost, manufacturingDate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney(){
    LocalDate time = LocalDate.now();
    LocalDate expiryDate = getExpiryDate();
    if (time.isAfter(expiryDate)){
        return 0;
    }else
        if ( time.isBefore(expiryDate) && time.isAfter(expiryDate.minusDays(3))){
            return getAmount() * 0.5;
        }else
            if (time.isBefore(expiryDate) && time.isAfter(expiryDate.minusDays(5))){
                return getAmount() * 0.8;
            }else return getAmount() * 0.9;

    }
}
