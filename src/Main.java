import Parcel.*;
import ParcelLocker.*;

import static Parcel.Parcel.addParcel;

public class Main {

    public static void main(String[] args) {
        Parcel paczka = addParcel("AAA-4234", 5);
        Parcel paczka2 = addParcel("CCC-4444", 32);
        ParcelLocker paczkomat = new ParcelLocker();

        paczkomat.addParcel(paczka);
        paczkomat.addParcel(paczka2);
        paczkomat.addParcel(paczka2);
        paczkomat.showParcels();
        paczkomat.quantityInLocker();
    }
}
