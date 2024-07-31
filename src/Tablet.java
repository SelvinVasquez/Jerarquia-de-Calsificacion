public class Tablet extends DispositivoElectronico{
    private String huellaDigital;
    private String camaraFrontal;
    public Tablet(String nombre, String marca, String huellaDigital, String camaraFrontal){
        super(nombre, marca);
        this.huellaDigital = huellaDigital;
        this.camaraFrontal = camaraFrontal;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " + getMarca() + " Tiene huella digital: " + getHuellaDigital() + " La camara frontal es de: " + getCamaraFrontal());
        return null;
    }

    public String getCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(String camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public String getHuellaDigital() {
        return huellaDigital;
    }

    public void setHuellaDigital(String huellaDigital) {
        this.huellaDigital = huellaDigital;
    }
}
