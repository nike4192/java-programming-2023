package tests.test3.post;

public class Page {
    private final String title;
    private final String content;

    private PackageShipment shipment = null;

    public Page(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public PackageShipment getShipment() {
        return shipment;
    }

    public void setShipment(PackageShipment shipment) {
        this.shipment = shipment;
    }
}
