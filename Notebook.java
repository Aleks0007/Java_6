public class Notebook {
    private String brand;
    private String operatingSystem;
    private String color;
    private int ram;
    private int storage;

    public Notebook(String brand, String operatingSystem, String color, int ram, int storage) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Ноутбук | бренд: " + brand + ", ОС: " + operatingSystem + ", цвет: " + color + ", ОЗУ(Гб): " + ram
                + ", ЖД(Гб): " + storage;
    }
}