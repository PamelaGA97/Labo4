import java.util.Random;

public class CompositeMain {
    private final Random random = new Random();

    private SimpleProduct ram4gb;
    private SimpleProduct ram8gb;
    private SimpleProduct disk500gb;
    private SimpleProduct disk1tb;
    private SimpleProduct cpuAMD;
    private SimpleProduct cpuIntel;
    private SimpleProduct monitor20inch;
    private SimpleProduct monitor30inch;
    private SimpleProduct simpleMouse;
    private SimpleProduct gammerMouse;

    private CompositeProduct normalPC;
    private CompositeProduct homePC;
    private CompositeProduct pc2x1;

    private void buildProducts(){
        ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");
        ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000, "KingStone");
        disk500gb = new SimpleProduct("Disco Duro 500GB", 1500, "ACME");
        disk1tb = new SimpleProduct("Disco Duro 1TB", 2000, "ACME");
        cpuAMD = new SimpleProduct("AMD", 4000, "AMD");
        cpuIntel = new SimpleProduct("Intel i7", 4500, "Intel");
        monitor20inch = new SimpleProduct("Monitor 20", 1500, "HP");
        monitor30inch = new SimpleProduct("Monitor 30", 2000, "HP");
        simpleMouse = new SimpleProduct("Raton Simple", 150, "Genious");
        gammerMouse = new SimpleProduct("Raton Gamer", 750, "Alien");

        normalPC = new CompositeProduct("Normal PC");
        normalPC.addProduct(ram8gb);
        normalPC.addProduct(disk1tb);
        normalPC.addProduct(cpuIntel);
        normalPC.addProduct(monitor30inch);
        normalPC.addProduct(gammerMouse);

        homePC = new CompositeProduct("Casa PC");
        homePC.addProduct(ram4gb);
        homePC.addProduct(disk500gb);
        homePC.addProduct(cpuAMD);
        homePC.addProduct(monitor20inch);
        homePC.addProduct(simpleMouse);

        pc2x1 = new CompositeProduct("Paquete PC normal + Casa");
        pc2x1.addProduct(normalPC);
        pc2x1.addProduct(homePC);
    }

    private void orderSimpleProducts(){
        SaleOrder simpleProductOrder = new SaleOrder(random.nextInt(), "Jose Perez");
        simpleProductOrder.addProduct(ram4gb);
        simpleProductOrder.addProduct(disk1tb);
        simpleProductOrder.addProduct(simpleMouse);
        simpleProductOrder.printOrder();
    }

    private void orderNormalPC(){
        SaleOrder normalOrder = new SaleOrder(random.nextInt(), "Mario Sanchez");
        normalOrder.addProduct(normalPC);
        normalOrder.printOrder();
    }

    private void orderHomePC(){
        SaleOrder homeOrder = new SaleOrder(random.nextInt(), "Maria Lopez");
        homeOrder.addProduct(homePC);
        homeOrder.printOrder();
    }

    private void orderCombo(){
        SaleOrder customOrder = new SaleOrder(random.nextInt(), "Paquete 2x1");
        customOrder.addProduct(pc2x1);
        customOrder.printOrder();
    }

    private void orderBig(){
        SaleOrder customOrder = new SaleOrder(random.nextInt(), "Lucia Taya");
        customOrder.addProduct(homePC);
        customOrder.addProduct(ram8gb);
        customOrder.addProduct(ram4gb);
        customOrder.addProduct(monitor20inch);
        customOrder.addProduct(monitor30inch);
        customOrder.addProduct(gammerMouse);
        customOrder.printOrder();
    }

    public static void main(String[] args){
        CompositeMain main = new CompositeMain();
        main.buildProducts();

        main.orderSimpleProducts();
        main.orderHomePC();
        main.orderNormalPC();
        main.orderCombo();
        main.orderBig();
    }
}
