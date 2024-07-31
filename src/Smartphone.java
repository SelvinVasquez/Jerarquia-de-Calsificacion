public class Smartphone extends DispositivoElectronico{
    private String tamañoPantalla;
    private String tasadeRefresco;
    public Smartphone(String nombre, String marca, String tamañoPantalla, String tasadeRefresco){
        super(nombre, marca);
        this.tamañoPantalla=tamañoPantalla;
        this.tasadeRefresco = tasadeRefresco;
    }

    @Override
    String mostrarDetalles() {
        System.out.println("Nombre: " + getNombre() + " Marca: " +getMarca() + " El tamaño de la pantalla es : " + getTamañoPantalla() + " La tasa de refresco de la pantalla es de : " + getTasadeRefresco()  );
        return null;
    }

    public String getTasadeRefresco() {
        return tasadeRefresco;
    }

    public void setTasadeRefresco(String tasadeRefresco) {
        this.tasadeRefresco = tasadeRefresco;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
}
