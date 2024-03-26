package Singleton;

public class Laptop {
	private static Laptop instance = null;
    private String brand;
    private String type;

    private Laptop(String type) {
        this.type = type;
        brand = "Default Brand";
    }

    public static Laptop getInstance(String type) {
        if (instance == null) {
            instance = new Laptop(type);
        }
        return instance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

}
