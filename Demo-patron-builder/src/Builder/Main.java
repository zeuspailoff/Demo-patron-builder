package Builder;

public class Main {
    public static void main(String[] args) {

       vehiculo coche = new CoheBuilder("BMW")

               .setpuertas(5)
               .setMotor("electric")
               .build();
        System.out.println("marca: " + coche.getMarca());
        System.out.println("puertas: " + coche.getPuertas());
        System.out.println("motor: " + coche.getMotor());


    }
}