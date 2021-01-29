package ParcelLocker;

import java.util.ArrayList;
import java.util.List;
import Parcel.*;

public class ParcelLocker {
    List<Parcel> ParcelList = new ArrayList<>();
    private int lockerCapacity = 3;

    public void addParcel(Parcel pack) {
        if (pack != null && ParcelList.size() < lockerCapacity) {
            ParcelList.add(pack);
        }
        else {
            throw new IllegalArgumentException("Błąd przy dodawaniu paczki");
        }
    }

    public void showParcels() {
        for (int i = 0; i < ParcelList.size(); i++) {
            System.out.println("Paczka: " + ParcelList.get(i).getCode());
            System.out.println("Waga paczki: " + ParcelList.get(i).getWeight());
        }
    }

    public void deleteParcels() {
        ParcelList.clear();
    }

    public void deleteParcel(String code) {
        if (!ParcelList.removeIf((Parcel p) -> p.getCode().equals(code))) {
            throw new IllegalArgumentException("Nie ma takiej paczki");
        }
    }

    public void quantityInLocker() {
        System.out.println("Ilość Paczek: " + ParcelList.size());
    }

}