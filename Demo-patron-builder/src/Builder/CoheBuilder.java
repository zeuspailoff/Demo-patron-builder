package Builder;

import static Builder.vehiculo.*;

public class CoheBuilder {
    vehiculo Vehiculo;
    public CoheBuilder (String marca){
        Vehiculo = new vehiculo();
        vehiculo.marca= marca;
    }
    public CoheBuilder setpuertas(int puertas){
        Vehiculo.puertas = puertas;
        return this;
    }
    public CoheBuilder setMotor(String motor) {
        Vehiculo.motor= motor;
        return this;
    }
    public vehiculo build(){
        return this.Vehiculo;
    }
}
