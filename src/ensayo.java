public class ensayo {
    private String codigoEnsayo;
    private String nombre;
    private String muestra;
    private String informefinal;

    public ensayo(String codigoensayo, String nombre, String muestra, String informefinal) {
        this.codigoEnsayo = codigoensayo;
        this.nombre = nombre;
        this.muestra = muestra;
        this.informefinal = informefinal;
    }

    public String getCodigoensayo() {
        return codigoEnsayo;
    }

    public void setCodigoensayo(String codigoensayo) {
        this.codigoEnsayo = codigoensayo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMuestra() {
        return muestra;
    }

    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }

    public String getInformefinal() {
        return informefinal;
    }

    public void setInformefinal(String informefinal) {
        this.informefinal = informefinal;
    }
}
