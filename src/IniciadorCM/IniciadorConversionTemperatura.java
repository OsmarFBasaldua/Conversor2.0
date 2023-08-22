package IniciadorCM;

public class IniciadorConversionTemperatura {

    ConvertidorDeTemperatura convertidorDeTemperatura = new ConvertidorDeTemperatura();
    private static final String C_F = "Celsius a Fahrenheit";
    private static final String C_K = "Celsius a Kelvin";
    private static final String K_F = "Kelvin a Fahrenheit";
    private static final String K_C = "Kelvin a Celsius";
    private static final String F_C = "Fahrenheit a Celsius";
    private static final String F_K = "Fahrenheit a Kelvin";


    public double operarConversao(String operacionTemperatura, double valorInicial) throws Exception {
        switch (operacionTemperatura){
            case C_F -> {
                return convertidorDeTemperatura.convertirCelsiusParaFahrenheit(valorInicial);
            }
            case C_K -> {
                return convertidorDeTemperatura.convertirCelsiusParaKelvin(valorInicial);
            }
            case K_C -> {
                return convertidorDeTemperatura.convertirKelvinParaCelsius(valorInicial);
            }
            case K_F -> {
                return convertidorDeTemperatura.convertirKelvinParaFahrenheit(valorInicial);
            }
            case F_C -> {
                return convertidorDeTemperatura.convertirFahrenheitParaCelsius(valorInicial);
            }
            case F_K -> {
                return convertidorDeTemperatura.convertirFahrenheitParaKelvin(valorInicial);
            }
            default -> throw new Exception("Elección Inválida");
        }
    }
}