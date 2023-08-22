package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaJPY extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.JPY;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }
    @Override
    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.JPY;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}