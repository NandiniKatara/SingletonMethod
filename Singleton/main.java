package Singleton;

public class main {
 public static void main(String[] args) {
     Laptop dell = Laptop.getInstance("laptop");
     dell.setBrand("Dell");

     Laptop hp = Laptop.getInstance("laptop");
     hp.setBrand("HP");

     Laptop lenovo = Laptop.getInstance("laptop");
     lenovo.setBrand("Lenovo");

     System.out.println("Type of Dell is " + dell.getType());
     System.out.println("Type of HP is " + hp.getType());
     System.out.println("Type of Lenovo is " + lenovo.getType());
 }
}
