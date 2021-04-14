import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    public static final double GIAM50 = 0.5;
    public static final double GIAM30 = 0.7;
    public static final double GIAM10 = 0.9;
    private double quantity;

    public CrispyFlour(String id, String name, int cost, LocalDate manufacturingDate, double quantity) {
        super(id, name, cost, manufacturingDate);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate time = LocalDate.now();
        LocalDate expiryDate = getExpiryDate();
        if (time.isAfter(expiryDate)){
            return 0;
        }else
        if ( time.isBefore(expiryDate) && time.isAfter(expiryDate.minusMonths(2))){
            return getAmount() * 0.6;
        }else
        if (time.isBefore(expiryDate) && time.isAfter(expiryDate.minusMonths(4))){
            return getAmount() * 0.8;
        }else return getAmount() * 0.95;

    }
}
