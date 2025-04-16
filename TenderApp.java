# Tender-Management-system
import java.util.*;

// Base Tender class
class Tender {
    String tenderId;
    String title;
    String description;
    String closingDate;
    String status;

    public Tender(String tenderId, String title, String description, String closingDate) {
        this.tenderId = tenderId;
        this.title = title;
        this.description = description;
        this.closingDate = closingDate;
        this.status = "Open";
    }

    public void display() {
        System.out.println("Tender ID: " + tenderId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Closing Date: " + closingDate);
        System.out.println("Status: " + status);
    }
}



class TenderManager {
    List<Tender> tenders = new ArrayList<>();

    public void addTender(Tender t) {
        tenders.add(t);
        System.out.println("Tender added successfully.");
    }

    public void viewTenders() {
        for (Tender t : tenders) {
            t.display();
            System.out.println("--------------------");
        }
    }

    public void deleteTender(String id) {
        tenders.removeIf(t -> t.tenderId.equals(id));
        System.out.println("Tender deleted.");
    }
}

// Main class
public class TenderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TenderManager manager = new TenderManager();

        Tender t1 = new Tender("T001", "Road Repair", "Fix potholes", "2025-05-01");
        manager.addTender(t1);

        System.out.println("\nAll Tenders:");
        manager.viewTenders();
    }
}
