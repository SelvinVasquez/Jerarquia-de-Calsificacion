    public class Main {
    public static void main(String[] args) {
    Computadora computadora1 = new Computadora("Pavilon","HP","sfqg221gfq","1458429");
    DispositivoMovil dispositivoMovil1 = new DispositivoMovil("Plus 30","Motorola", "125236", "80 MegaPixeles");
    Electrodomestico electrodomestico1 = new Electrodomestico( "Magnetum", "Society", "120W", "Microondas");
    Laptop laptop1 = new Laptop("Ideapad", "Lenovo","256GB","16 GB");
    Desktop desktop1 = new Desktop("Maximus", "Razer", "750W", "i7 10700K");
    Smartphone smartphone1 = new Smartphone("Pixel art", "Google", "6,8 Pulgadas", "120Hz");
    Tablet tablet1 = new Tablet("A63", "Samsung", "Si", "40 MegaPixeles");
    Refrigerador refrigerador1 = new Refrigerador("Platinum Friege", "LG", "Si", "Si");
    computadora1.mostrarDetalles();
    dispositivoMovil1.mostrarDetalles();
    electrodomestico1.mostrarDetalles();
    laptop1.mostrarDetalles();
    desktop1.mostrarDetalles();
    smartphone1.mostrarDetalles();
    tablet1.mostrarDetalles();
    refrigerador1.mostrarDetalles();
    }
}