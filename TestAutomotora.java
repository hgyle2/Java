package automotora;

public class TestAutomotora {

    public static void main(String[] args) {
        try {
            Propietario p = new Propietario("14865762-3", "Juan", 24, "Los Olivos 1325");
            Motocicleta m1 = new Motocicleta(145, "Yamaha", "MT-10", 2021, 14490000, 'N', p);
            Motocicleta m2 = new Motocicleta(140, "Yamaha", "MT-09", 2021, 10790000, 'N', p);
            Motocicleta m3 = new Motocicleta(120, "Harley Davidson", "Forty-eight", 2021, 12608695, 'N', p);
            Motocicleta m4 = new Motocicleta(120, "Harley Davidson", "CVO-Limited", 2021, 16300000, 'N', p);
            
            Motocicleta[] motos = new Motocicleta[6];
            Automotora a = new Automotora(motos);
            a.agregar(m1);
            a.agregar(m2);
            a.agregar(m3);
            a.agregar(m4);
            a.imprimirMotos();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
