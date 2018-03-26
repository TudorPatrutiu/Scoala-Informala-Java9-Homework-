import java.util.Date;

public class Delivery implements Runnable {

    private Package aPackage;
    private static final int PRICE = 1;
    private int groupRevenue;

    public Delivery (){
    }

    public synchronized void run() {
        try {
            if (aPackage.getTargetLocation() == "Apahida") {
                groupRevenue = PRICE * aPackage.getDistance();
            }
            wait();
            System.out.println(Thread.currentThread().getName()+ " Sending a group of packages ");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }

    public static int getPRICE() {
        return PRICE;
    }

    public int getGroupRevenue() {
        return groupRevenue;
    }

    public void setGroupRevenue(int groupRevenue) {
        this.groupRevenue = groupRevenue;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }
}
