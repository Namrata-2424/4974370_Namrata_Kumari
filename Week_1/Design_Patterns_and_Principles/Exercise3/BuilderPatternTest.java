package Exercise3;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .build();

        Computer officeComputer = new Computer.ComputerBuilder()
                .setCPU("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setPowerSupply("500W")
                .build();

        // Print the configurations
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
