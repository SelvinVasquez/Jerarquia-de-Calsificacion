public class DispositivoMovil extends DispositivoElectronico {
    private String codigoTelefono;
    private String camara;
        protected DispositivoMovil(String nombre, String marca, String codigoTelefono, String camara){
        super(nombre, marca);
        this.codigoTelefono = codigoTelefono;
        this.camara = camara;
        }
    @Override
    String mostrarDetalles() {
            System.out.println("Nombre: " + getNombre() + " Marca: " + getMarca() + " Codigo: " + getCodigoTelefono() + " Camara: " + getCamara());
        return null;
    }

    public String getCodigoTelefono() {
        return codigoTelefono;
    }

    public void setCodigoTelefono(String codigoTelefono) {
        this.codigoTelefono = codigoTelefono;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
}


