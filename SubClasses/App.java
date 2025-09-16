// 09/16/2025
// cGJ

public class App {
    public static void main(String[] args) {

        System.out.println("Sub Classes!");

        // Create a Chef object.
        Chef myChef = new Chef();
        myChef.makeChicken();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makePasta();

        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeSpecialDish();

        }
    }
