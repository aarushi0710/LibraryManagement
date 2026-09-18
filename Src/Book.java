import java.io.Serializable;

public class Book implements Serializable {
   private static final long serialVersionUID = 1L;
   String id;
   String title;
    
   boolean isIssued;

   public Book(String var1, String var2) {
      this.id = var1;
      this.title = var2;
   
      this.isIssued = false;
   }
    @Override
   public String toString() {
      return "ID: " + this.id + " | Title: " + this.title + "+ | Status: " + (this.isIssued ? "Issued" : "Available");
   }
}
