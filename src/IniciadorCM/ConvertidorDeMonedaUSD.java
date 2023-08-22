package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaUSD extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.USD;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }
    @Override
    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.USD;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}



