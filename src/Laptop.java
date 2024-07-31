public class Laptop extends DispositivoElectronico{
    private String capacidadAlmacenamiento;
    private String memoriaRam;
    public Laptop(String nombre, String marca, String capacidadAlmacenamiento, String memoriaRam){
        super(nombre,marca);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.memoriaRam = memoriaRam;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " + getMarca() + " Capacidad: " + getCapacidadAlmacenamiento() + " MemoriaRam: " + getMemoriaRam());
        return null;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
