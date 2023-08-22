package interfaces;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEmReais);
    BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorNaMoeda);

}