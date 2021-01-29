import Parcel.*;
import ParcelLocker.*;

public class Main {

    public static void main(String[] args) {
        Parcel paczka = new ParcelA("AAA-4234", 32);
        Parcel paczka2 = new ParcelB("CCC-4444", 32);
        ParcelLocker paczkomat = new ParcelLocker();

        paczkomat.addParcel(paczka);
        paczkomat.addParcel(paczka2);
        paczkomat.addParcel(paczka2);
        paczkomat.showParcels();
        paczkomat.quantityInLocker();
    }
}
