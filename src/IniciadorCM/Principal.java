package IniciadorCM;
import CaracteristicasMonedas.TipoConversion;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convertir Moneda";
        String conversionDeTemperatura =  "Convertir Temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige tipo de conversión",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacaoMoedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.MXN_USD.getDescripcion(),
                                TipoConversion.MXN_CAD.getDescripcion(),
                                TipoConversion.MXN_EUR.getDescripcion(),
                                TipoConversion.MXN_JPY.getDescripcion(),
                                TipoConversion.MXN_GBP.getDescripcion(),
                                TipoConversion.MXN_RUB.getDescripcion(),
                                TipoConversion.MXN_CLP.getDescripcion(),
                                TipoConversion.MXN_COP.getDescripcion(),
                                TipoConversion.USD_MXN.getDescripcion(),
                                TipoConversion.CAD_MXN.getDescripcion(),
                                TipoConversion.EUR_MXN.getDescripcion(),
                                TipoConversion.JPY_MXN.getDescripcion(),
                                TipoConversion.GBP_MXN.getDescripcion(),
                                TipoConversion.RUB_MXN.getDescripcion(),
                                TipoConversion.CLP_MXN.getDescripcion(),
                                TipoConversion.COP_MXN.getDescripcion()},
                        "Escolha").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversao(operacaoMoedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Temperatura", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.C_F.getDescripcion(),
                                TipoConversion.C_K.getDescripcion(),
                                TipoConversion.F_C.getDescripcion(),
                                TipoConversion.F_K.getDescripcion(),
                                TipoConversion.K_C.getDescripcion(),
                                TipoConversion.K_F.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}