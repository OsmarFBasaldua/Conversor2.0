package CaracteristicasMonedas;

import java.math.BigDecimal;


public enum Moneda {
    USD(BigDecimal.valueOf(17.00)),
    CAD(BigDecimal.valueOf(18.67)),
    CLP(BigDecimal.valueOf(0.020)),
    COP(BigDecimal.valueOf(0.004)),
    EUR(BigDecimal.valueOf(12.68)),
    GBP(BigDecimal.valueOf(21.82)),
    JPY(BigDecimal.valueOf(0.12)),
    RUB(BigDecimal.valueOf(0.18));

    // Ultima Actualización 16 ago, 09:11 UTC Conversor Google


    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
