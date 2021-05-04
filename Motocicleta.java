package automotora;

public class Motocicleta {
    //Atributos
    private int cod_moto;
    private String marca;
    private String modelo;
    private int año;
    private int precio;
    private char estado;
    private Propietario propietario;
    
    //Constructores
    public Motocicleta() {
    }

    public Motocicleta(int cod_moto, String marca, String modelo, int año, int precio, char estado, Propietario propietario) throws Exception {
        setCod_moto(cod_moto);
        setMarca(marca);
        setModelo(modelo);
        setAño(año);
        setPrecio(precio);
        setEstado(estado);
        setPropietario(propietario);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getCod_moto() {
        return cod_moto;
    }

    public void setCod_moto(int cod_moto) throws Exception {
        if (cod_moto > 9) {
            this.cod_moto = cod_moto;
        } else {
            throw new Exception("Codigo debe tener al menos 2 digitos");
        }
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) throws Exception {
        if (estado == 'U' || estado == 'N') {
            this.estado = estado;
        } else {
            throw new Exception("El estado solo debe ser 'U' de usado o 'N' de nuevo");
        }   
    }
    
    public void mostrarDatosMoto(){
        System.out.println("Codigo de la moto: " + getCod_moto());
        System.out.println("Marca de la moto: " + getMarca());
        System.out.println("Modelo de la moto: " + getModelo());
        System.out.println("Año: " + getAño());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Estado: " + getEstado());
    }
    
    public int cantidadMotosUsadas(){
        int total = 0;
        if (estado == 'U') {
            total++;
            System.out.println("La cantidad de motos usadas es: " + total);
        } 
        return total;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "cod_moto=" + cod_moto + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + ", estado=" + estado + ", propietario=" + propietario + '}';
    }
}
