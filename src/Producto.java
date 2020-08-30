public class Producto {
    private String codigoproducto;
    private String nombre;
    private String muestra;
    private ensayo ensayo;
    private String codigo;
    private String calidad;
    private String informefinal;
    private String loteanalizado;

    public Producto(String codigoproducto, String nombre, String muestra, ensayo ensayo, String codigo, String calidad, String informefinal, String loteanalizado) {
        this.codigoproducto = codigoproducto;
        this.nombre = nombre;
        this.muestra = muestra;
        this.ensayo = ensayo;
        this.codigo = codigo;
        this.calidad = calidad;
        this.informefinal = informefinal;
        this.loteanalizado = loteanalizado;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
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

    public ensayo getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(ensayo ensayo) {
        this.ensayo = ensayo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getInformefinal() {
        return informefinal;
    }

    public void setInformefinal(String informefinal) {
        this.informefinal = informefinal;
    }

    public String getLoteanalizado() {
        return loteanalizado;
    }

    public void setLoteanalizado(String loteanalizado) {
        this.loteanalizado = loteanalizado;
    }
}
