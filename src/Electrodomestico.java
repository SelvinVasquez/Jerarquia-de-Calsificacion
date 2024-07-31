public class Electrodomestico extends DispositivoElectronico{
    private String consumoElectrico;
    private String tipoElectrodomestico;
    public Electrodomestico(String nombre, String marca, String consumoElectrico, String tipoElectrodomestico){
        super(nombre, marca);
        this.consumoElectrico = consumoElectrico;
    this.tipoElectrodomestico = tipoElectrodomestico;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " + getMarca() + " El consumo electronico es de: " + getConsumoElectrico() + " Tipo: " + getTipoElectrodomestico());
        return null;
    }

    public String getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(String consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public String getTipoElectrodomestico() {
        return tipoElectrodomestico;
    }

    public void setTipoElectrodomestico(String tipoElectrodomestico) {
        this.tipoElectrodomestico = tipoElectrodomestico;
    }
}
