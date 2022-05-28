package chapters.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("օպերատորների վկայագիր:");
            System.out.println("    1.  if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("ընտրել անհրաժեշտ պունկտը");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(պայման) օպերատոր;");
                System.out.println(" else օպերատոր; ");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch(արտահայտություն)  {");
                System.out.println(" case  հաստատուն:");
                System.out.println(
                        " հետևությունները օպերատորների ");
                System.out.println("break;");
                System.out.println(" //  ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println(" while(պայման)  օպերատոր;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println("    օպերատոր;");
                System.out.println("} while (պայման);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(ներմուծում;պայման;իտերացիա)");
                System.out.println(" օպերատոր;");
                break;

        }
    }
}

