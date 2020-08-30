public class certificado {
    private int idCertificado;
    private String calidad;
    private String validez;
    private String loteconcreto;
    private String determina;
    private String resultado;
    private Producto producto;
    private String muestra;

    public certificado(int idcertificado, String calidad, String validez, String loteconcreto, String determina, String resultado, Producto producto, String muestra) {
        this.idCertificado = idcertificado;
        this.calidad = calidad;
        this.validez = validez;
        this.loteconcreto = loteconcreto;
        this.determina = determina;
        this.resultado = resultado;
        this.producto = producto;
        this.muestra = muestra;
    }

    public int getIdcertificado() {
        return idCertificado;
    }

    public void setIdcertificado(int idcertificado) {
        this.idCertificado = idcertificado;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }

    public String getLoteconcreto() {
        return loteconcreto;
    }

    public void setLoteconcreto(String loteconcreto) {
        this.loteconcreto = loteconcreto;
    }

    public String getDetermina() {
        return determina;
    }

    public void setDetermina(String determina) {
        this.determina = determina;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getMuestra() {
        return muestra;
    }

    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }
}
