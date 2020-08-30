public class control {
    private String codigoControl;
    private String calidad;
    private Producto producto;
    private String nombre;
    private String muestras;

    public control(String codigocontrol, String calidad, Producto producto, String nombre, String muestras) {
        this.codigoControl = codigocontrol;
        this.calidad = calidad;
        this.producto = producto;
        this.nombre = nombre;
        this.muestras = muestras;
    }

    public String getCodigocontrol() {
        return codigoControl;
    }

    public void setCodigocontrol(String codigocontrol) {
        this.codigoControl = codigocontrol;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMuestras() {
        return muestras;
    }

    public void setMuestras(String muestras) {
        this.muestras = muestras;
    }
}
