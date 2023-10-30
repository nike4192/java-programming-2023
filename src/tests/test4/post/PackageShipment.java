package tests.test3.post;

import java.util.ArrayList;
import java.util.Date;

public class PackageShipment {
    private final String fromAddress;
    private final String toAddress;
    private Date sendingDate;
    private final ArrayList<Page> pages = new ArrayList<>();
    private final double weight;
    private PackageStatus status = PackageStatus.PROCESSING;

    public PackageShipment(String fromAddress, String toAddress, double weight) {
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.weight = weight;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
        this.status = PackageStatus.PRE_TRANSIT;
    }

    public void send() {
        if (sendingDate == null) {
            setSendingDate(new Date());
        }
    }

    public void addPage(Page page) {
        if (status == PackageStatus.PROCESSING && page.getShipment() == null) {
            pages.add(page);
            page.setShipment(this);
        }
    }

    public void removePage(Page page) {
        if (status == PackageStatus.PROCESSING && page.getShipment() == this) {
            pages.remove(page);
            page.setShipment(null);
        }
    }

    public int getPagesCount() {
        return pages.size();
    }

    public Page getPage(int index) {
        return index > 0 && index < pages.size()
            ? pages.get(index)
            : null;
    }

    public double getWeight() {
        return weight;
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    public void printInfo(boolean withPages) {
        System.out.println("From: " + fromAddress);
        System.out.println("To: " + toAddress);
        System.out.println("Sending Date: " + sendingDate);
        System.out.println("Weight: " + weight);
        System.out.println("Number of pages: " + getPagesCount());

        if (withPages) {
            int pagesCount = getPagesCount();
            for (int i = 0; i < pages.size(); i++) {
                Page page = pages.get(i);
                System.out.println("Page: " + (i + 1) + " / " + pagesCount);
                System.out.println("  Title: " + page.getTitle());
                System.out.println("  Content: " + page.getContent());
            }
        }
    }
}
