import java.util.Date;

public class Package {

    private String targetLocation;
    private int distance;
    private int packageValue;
    private Date deliveryDate;
    /*
    Generated an empty constructor and a constructor with parameters
     */
    public Package (){

    }

    public Package(String targetLocation, int distance, int packageValue, Date deliveryDate) {
        this.targetLocation = targetLocation;
        this.distance = distance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate;
    }

    /**
     * Generated getters and setters for the fields
     * @return
     */

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPackageValue() {
        return packageValue;
    }

    public void setPackageValue(int packageValue) {
        this.packageValue = packageValue;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
