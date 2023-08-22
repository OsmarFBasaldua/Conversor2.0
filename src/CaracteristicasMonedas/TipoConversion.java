package CaracteristicasMonedas;

public enum TipoConversion {
    MXN_USD ("De Peso MXN a Dólar USD"),
    MXN_CAD ("De Peso MXN a Dólar CAD"),
    MXN_EUR ("De Peso MXN a Euro EUR"),
    MXN_JPY ("De Peso MXN a Yen JPY"),
    MXN_GBP ("De Peso MXN a Libra GBP"),
    MXN_RUB ("De Peso MXN a Rublo RUB"),
    MXN_CLP ("De Peso MXN a Peso CLP"),
    MXN_COP ("De Peso MXN a Peso COP"),
    USD_MXN ("De Dólar USD a Peso MXN"),
    CAD_MXN ("De Dólar CAD a Peso MXN"),
    EUR_MXN ("De Euro EUR a Peso MXN"),
    JPY_MXN ("DeYen JPY a Peso MXN"),
    GBP_MXN ("De Libra GBP a Peso MXN"),
    RUB_MXN ("De Rublo RUB a Peso MXN"),
    CLP_MXN ("De Peso CLP a Peso MXN"),
    COP_MXN ("De Peso COP a Peso MXN"),


    C_F("Celsius a Fahrenheit"),
    C_K("Celsius a Kelvin"),
    K_F("Kelvin a Fahrenheit"),
    K_C ("Kelvin a Celsius"),
    F_C ("Fahrenheit a Celsius"),
    F_K("Fahrenheit a Kelvin");

    private final String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
