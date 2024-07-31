public class Computadora extends DispositivoElectronico{
    private String modelo;
    private String codigoComputadora;
    public Computadora(String nombre, String marca, String modelo, String codigoComputadora) {
    super(nombre,marca);
    this.modelo = modelo;
    this.codigoComputadora = codigoComputadora;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre () + " Marca: " + getMarca() + " Modelo: " + getModelo() + " Codigo: " + getCodigoComputadora() + " - ");
        return null;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCodigoComputadora() {
        return codigoComputadora;
    }

    public void setCodigoComputadora(String codigoComputadora) {
        this.codigoComputadora = codigoComputadora;
    }
}
