package IniciadorCM;

import CaracteristicasMonedas.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaCOP extends ConvertidorDeMoneda {

    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnReais) {
        moneda = Moneda.COP;
        return super.convertirParaMoneda(moneda, valorEnReais);

    }

    public BigDecimal convertirParaMXN(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.COP;
        return super.convertirParaMXN(moneda, valorEnMoneda);
    }
}