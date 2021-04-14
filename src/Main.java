import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("1","potato",10000, LocalDate.of(2020, 6,14),2);
        materials[1] = new CrispyFlour("12","",12000, LocalDate.of(2020, 5,20),1);
        materials[2] = new CrispyFlour("13","potato",12000, LocalDate.of(2020, 6,20),1.5);
        materials[3] = new CrispyFlour("41","potato",12000, LocalDate.of(2020, 5,20),1);
        materials[4] = new CrispyFlour("15","potato",12000, LocalDate.of(2020, 6,20),1);
        materials[5] = new Meat("2","Fish",20000,LocalDate.of(2021,4,10),4);
        materials[6] = new Meat("2","Duck",15000,LocalDate.of(2021, 4,10),3);
        materials[7] = new Meat("2","chicken",300000,LocalDate.of(2021, 4,05),5);
        materials[8] = new Meat("2","Pork",20000,LocalDate.of(2021, 4,11),2);
        materials[9] = new Meat("2","Beef",40000,LocalDate.of(2021, 4,10),3);
        ManagerMaterial o = new ManagerMaterial(materials);
//  tổng tiền thực tế phải trả khi giảm giá!
        System.out.println(o.totalRealMoney());
//  Chênh lệch số tiền giữa giảm giá và không giảm giá !
        System.out.println(o.totalNoDiscount(materials) - o.totalRealMoney());
    }

}
