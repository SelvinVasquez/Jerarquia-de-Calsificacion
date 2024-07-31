public class Desktop extends DispositivoElectronico{
    private String fuentedePoder;
    private String procesador;

    public Desktop(String nombre, String marca, String fuentedePoder,String procesador){
        super(nombre,marca);
        this.fuentedePoder = fuentedePoder;
        this.procesador = procesador;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " +getMarca() + " La fuente de poder es de : " + getFuentedePoder() + " El Procesador es de: " + getProcesador());
        return null;
    }

    public String getFuentedePoder() {
        return fuentedePoder;
    }

    public void setFuentedePoder(String fuentedePoder) {
        this.fuentedePoder = fuentedePoder;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}

