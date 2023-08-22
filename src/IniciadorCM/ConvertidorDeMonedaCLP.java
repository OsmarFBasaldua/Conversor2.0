package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaCLP extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.CLP;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }
    @Override
    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.CLP;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}