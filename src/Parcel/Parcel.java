package Parcel;

public abstract class Parcel {
    private String code;
    private int weight;

    public Parcel(String code, int weight) {
        setCode(code);
        setWeight(weight);
    }

    public Parcel(){
        throw new IllegalArgumentException("Nie podano danych paczki");
    }

    public void setCode(String code) {
        if (code.matches("^[A-Z]{3}-[0-9]{4}$")) {
            this.code = code;
        }
        else {
            throw new IllegalArgumentException("Błędny kod paczki");
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public int getWeight() {
        return weight;
    }

    public static Parcel addParcel(String code, int weight){
        if(weight < 0 || weight > 50){
            throw new IllegalArgumentException("Błędna waga paczki.");
        }
        else if(weight < 10){
            return new ParcelA(code, weight);
        }
        else {
            return new ParcelB(code, weight);
        }
    }

    public static Parcel addParcel(){
        throw new IllegalArgumentException("Nie podano danych paczki");
    }
}
