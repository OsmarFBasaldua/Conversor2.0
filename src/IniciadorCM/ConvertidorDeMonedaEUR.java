package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaEUR extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.EUR;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }
    @Override
    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EUR;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}