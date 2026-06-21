package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w23 extends m23 {
    public static final Parcelable.Creator<w23> CREATOR = new t23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44262b;

    public w23(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(v23.a(parcel));
        }
        this.f44262b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f44262b.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            v23 v23Var = (v23) this.f44262b.get(i10);
            parcel.writeLong(v23Var.f43858a);
            parcel.writeByte(v23Var.f43859b ? (byte) 1 : (byte) 0);
            parcel.writeByte(v23Var.f43860c ? (byte) 1 : (byte) 0);
            parcel.writeByte(v23Var.f43861d ? (byte) 1 : (byte) 0);
            int size2 = v23Var.f43863f.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                u23 u23Var = (u23) v23Var.f43863f.get(i11);
                parcel.writeInt(u23Var.f43530a);
                parcel.writeLong(u23Var.f43531b);
            }
            parcel.writeLong(v23Var.f43862e);
            parcel.writeByte(v23Var.f43864g ? (byte) 1 : (byte) 0);
            parcel.writeLong(v23Var.f43865h);
            parcel.writeInt(v23Var.i);
            parcel.writeInt(v23Var.f43866j);
            parcel.writeInt(v23Var.f43867k);
        }
    }

    public w23(ArrayList arrayList) {
        this.f44262b = Collections.unmodifiableList(arrayList);
    }
}
