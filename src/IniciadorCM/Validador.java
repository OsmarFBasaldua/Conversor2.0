package IniciadorCM;

public class Validador {
    public boolean verificar(String operacion){
        ;
        return !operacion.matches("[+-]?\\d*(\\.\\d+)?");
    }
    public double transformarEnDouble(String operacion){
        return Double.parseDouble(operacion);
    }
}
