package util;

public enum CurrencyType {
    TL("TL"),
    USD("USD"),
    EURO("EURO");

    private String value;

    CurrencyType(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
