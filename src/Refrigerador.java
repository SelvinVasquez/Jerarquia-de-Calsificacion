public class Refrigerador extends DispositivoElectronico{
    private String pantallaTactil;
    private String wifi;
    public Refrigerador(String nombre, String marca, String pantallaTactil, String wifi){
        super(nombre, marca);
        this.pantallaTactil = pantallaTactil;
        this.wifi = wifi;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " + getMarca() + " Tiene Pantalla Tactil: " + getPantallaTactil() + " Tiene conexion wifi: " + getWifi());
        return null;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(String pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }
}
