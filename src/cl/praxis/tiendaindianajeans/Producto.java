package cl.praxis.tiendaindianajeans;

public class Producto {
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;
    private String color;

    public Producto() {
    }

    public Producto(String articulo, String codigo, String color, String descripcion, String marca, String precio, String talla) {
        this.articulo = articulo;
        this.codigo = codigo;
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.talla = talla;
    }

    public String toString() {
        return "Articulo: " + articulo + "\n" +
                "Codigo: " + codigo + "\n" +
                "Color: " + color + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Marca: " + marca + "\n" +
                "Precio: " + precio + "\n" +
                "Talla: " + talla + "\n";
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
