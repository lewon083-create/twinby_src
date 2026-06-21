package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pq1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (int i10 = 0; i10 != i; i10++) {
            linkedHashMap.put(parcel.readString(), parcel.readString());
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
        LinkedHashMap linkedHashMap2 = null;
        j5 j5VarCreateFromParcel = parcel.readInt() == 0 ? null : j5.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap3.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap2 = linkedHashMap3;
        }
        return new sq1(string, linkedHashMap, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, j5VarCreateFromParcel, linkedHashMap2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new sq1[i];
    }
}
