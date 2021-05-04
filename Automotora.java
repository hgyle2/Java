package automotora;

public class Automotora {
    private Motocicleta [] motos;

    public Automotora() {
    }

    public Automotora(Motocicleta[] motos) {
        this.motos = motos;
    }

    public Motocicleta[] getMotos() {
        return motos;
    }

    public void setMotos(Motocicleta[] motos) {
        this.motos = motos;
    }
    
    public Motocicleta buscar (int cod_moto){
        for (Motocicleta moto : getMotos()) {
            if (moto != null) {
                if (moto.getCod_moto() == cod_moto) {
                    System.out.println("Moto encontrada " + moto);
                    return moto;
                }
            }
        }
        System.out.println("No existe moto con ese codigo");
        return null;
    }
    
    public void agregar (Motocicleta moto){
        if (buscar(moto.getCod_moto()) == null) {
            for (int i = 0; i < getMotos().length; i++) {
                if (getMotos()[i] == null) {
                    getMotos()[i] = moto;
                    System.out.println("Moto Agregada");
                    break;
                }
            }
        } else {
            System.out.println("Moto ya Registrada");
        }
    }
    
    public void imprimirMotos(){
        for (Motocicleta moto : motos) {
            if (moto != null) {
                System.out.println(moto.toString());
            }
        }
    }
}
