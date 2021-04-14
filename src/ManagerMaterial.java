import java.lang.invoke.SwitchPoint;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class ManagerMaterial {
    Material[] materials;

    public ManagerMaterial(Material[] materials) {
        this.materials = materials;
    }

    // Tiền thực tế phải trả của bột khi giảm giá
    public double totalRealMoneyOfCrispyFlour(Material[] materials) {
        double total1 = 0;

        for (Material o : materials) {
            if (o != null) {
                if (o instanceof CrispyFlour) {
                    total1 += ((CrispyFlour) o).getRealMoney();
                }

            }

        }return total1;
    }
// Tiền thực tế phải trả của thịt khi giảm giá!
    public double totalRealMoneyOfMeat(Material[] materials){
        double total2 = 0;
        for (Material o : materials) {
            if (o != null) {
                if (o instanceof Meat) {
                    total2 += ((Meat) o).getRealMoney();
                }
            }

        }
        return total2;
    }
    public double totalRealMoney(){
        double total = totalRealMoneyOfCrispyFlour(materials) + totalRealMoneyOfMeat(materials);
        return total;
    }
//
    public double totalNoDiscount(Material[] materials) {
        double total = 0;
        for (Material o : materials) {
            if (o != null) {
                total += o.getAmount();
            }

        }return total;
    }


//    public int choice(Scanner scanner){
//        int input;
//        do {
//            System.out.print("Nhấn 1 nếu bạn muốn thêm bột chiên hoặc 2 nếu bạn muốn thêm thịt: ");
//            input = scanner.nextInt();
//        }while (input < 0);
//        return input;
//    }
//
//    public  Material[] addMaterial(Material[] materials,Scanner scanner){
//        switch (choice(scanner)){
//            case 1:
//                System.out.print("Mời bạn nhập mã vật liệu: ");
//                String id = scanner.nextLine();
//                System.out.print("Mời bạn nhập tên vật liệu: ");
//                String name = scanner.nextLine();
//                System.out.print("Mời bạn nhập cost vật liệu: ");
//                int cost = scanner.nextInt();
//                System.out.print("Mời bạn nhập manufacturingDate vật liệu: ");
//                LocalDate manufacturingDate = scanner.;
//                System.out.print("Mời bạn nhập quantity vật liệu: ");
//
//                double quantity = scanner.nextDouble();
//                Material o = new CrispyFlour(id,name,cost,manufacturingDate,quantity);
//                for( int i = 0; i < materials.length; i++ ){
//                    materials[i]
//                }
//        }
//    }
}
