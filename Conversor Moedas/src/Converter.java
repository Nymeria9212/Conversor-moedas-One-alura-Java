
public class Converter {
    private String base_code;
    private String conversion_rate;
    private String target_code;
    private double value;
    private double conversion_result;

    public Converter(String base_code, String target_code, double value) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.value = value;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getValue() {
        return value;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(String conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    @Override
    public String toString() {
        return String.format("Conversão: {Moeda base: %s, Moeda destino: %s, Resultado conversão: %f, Conversão por unidade: %s}",
                base_code, target_code, conversion_result, conversion_rate);
    }
}
