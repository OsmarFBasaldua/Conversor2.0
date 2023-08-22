package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String MXN_USD = "De Peso MXN a Dólar USD";
    private static final String MXN_CAD = "De Peso MXN a Dólar CAD";
    private static final String MXN_EUR = "De Peso MXN a Euro EUR";
    private static final String MXN_JPY = "De Peso MXN a Yen JPY";
    private static final String MXN_GBP = "De Peso MXN a Libra GBP";
    private static final String MXN_RUB = "De Peso MXN a Rublo RUB";
    private static final String MXN_CLP = "De Peso MXN a Peso CLP";
    private static final String MXN_COP = "De Peso MXN a Peso COP";

    private static final String USD_MXN = "De Dólar USD a Peso MXN";
    private static final String CAD_MXN = "De Dólar CAD a Peso MXN";
    private static final String EUR_MXN = "De Euro EUR a Peso MXN";
    private static final String JPY_MXN = "De Yen JPY a Peso MXN";
    private static final String GBP_MXN = "De Libra GBP a Peso MXN";
    private static final String RUB_MXN = "De Rublo RUB a Peso MXN";
    private static final String CLP_MXN = "De Peso CLP a Peso MXN";
    private static final String COP_MXN = "De Peso COP a Peso MXN";

    private ConvertidorDeMoneda convertidorDeMonedaUSD = new ConvertidorDeMonedaUSD();
    private ConvertidorDeMoneda convertidorDeMonedaCAD = new ConvertidorDeMonedaEUR();
    private ConvertidorDeMoneda convertidorDeMonedaEUR = new ConvertidorDeMonedaEUR();
    private ConvertidorDeMoneda convertidorDeMonedaJPY = new ConvertidorDeMonedaJPY();
    private ConvertidorDeMoneda convertidorDeMonedaGBP= new ConvertidorDeMonedaGBP();
    private ConvertidorDeMoneda convertidorDeMonedaRUB= new ConvertidorDeMonedaRUB();
    private ConvertidorDeMoneda convertidorDeMonedaCLP= new ConvertidorDeMonedaCLP();
    private ConvertidorDeMoneda convertidorDeMonedaCOP= new ConvertidorDeMonedaCOP();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case MXN_USD -> {
                return convertidorDeMonedaUSD.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_CAD -> {
                return convertidorDeMonedaCAD.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_EUR -> {
                return convertidorDeMonedaEUR.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_JPY -> {
                return convertidorDeMonedaJPY.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_GBP -> {
                return convertidorDeMonedaGBP.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_RUB -> {
                return convertidorDeMonedaRUB.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_CLP -> {
                return convertidorDeMonedaCLP.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case MXN_COP -> {
                return convertidorDeMonedaCOP.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }

            case USD_MXN -> {
                return convertidorDeMonedaUSD.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case CAD_MXN -> {
                return convertidorDeMonedaCAD.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EUR_MXN -> {
                return convertidorDeMonedaEUR.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case JPY_MXN -> {
                return convertidorDeMonedaJPY.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case GBP_MXN -> {
                return convertidorDeMonedaGBP.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case RUB_MXN -> {
                return convertidorDeMonedaRUB.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case CLP_MXN -> {
                return convertidorDeMonedaCLP.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }
            case COP_MXN -> {
                return convertidorDeMonedaCOP.convertirParaMXN(moneda, BigDecimal.valueOf(valorInicial));
            }

            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}