package automotora;

public class Propietario {
    //Atributos
    private String rut;
    private String nombre;
    private int edad;
    private String domicilio;
    
    //Constructores
    public Propietario() {
    }

    public Propietario(String rut, String nombre, int edad, String domicilio) throws Exception {
        setRut(rut);
        setNombre(nombre);
        setEdad(edad);
        setDomicilio(domicilio);
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) throws Exception {
        if (!domicilio.isEmpty()) {
            this.domicilio = domicilio;
        } else {
            throw new Exception("Domicilio no debe estar vacío");
        }
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if (rut.length() == 10) {
            this.rut = rut;
        } else {
            throw new Exception("El Rut debe contener 10 caracteres");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre no debe estar vacío");
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad > 17 ) {
            this.edad = edad;
        } else {
            throw new Exception("La edad debe ser de 18 hacia arriba");
        }
    } 

    @Override
    public String toString() {
        return "Propietario{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + '}';
    }
}
