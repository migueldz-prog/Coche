public class TestCoche {
    public static void main(String[] args) {
        Coche c1 = new Coche("Ford", "Mustang", 1888);
        Coche c2 = new Coche("Audi", "GTI", 1967);

        System.out.println("Coche 1 (invalido):");
        c1.mostrarInfo();

        System.out.println("Coche 2:");
        c2.mostrarInfo();
    }
}
