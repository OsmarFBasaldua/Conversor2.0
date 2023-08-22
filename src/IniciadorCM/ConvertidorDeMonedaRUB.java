package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaRUB extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.RUB;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }
    @Override
    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.RUB;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}