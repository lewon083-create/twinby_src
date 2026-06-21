package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<hp> CREATOR = new gp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is1 f39290c;

    public hp(ArrayList arrayList, is1 is1Var) {
        this.f39289b = arrayList;
        this.f39290c = is1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return Intrinsics.a(this.f39289b, hpVar.f39289b) && Intrinsics.a(this.f39290c, hpVar.f39290c);
    }

    public final int hashCode() {
        int iHashCode = this.f39289b.hashCode() * 31;
        is1 is1Var = this.f39290c;
        return iHashCode + (is1Var == null ? 0 : is1Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.f39289b + ", mediationPrefetchSettings=" + this.f39290c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f39289b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((gb) it.next()).writeToParcel(parcel, i);
        }
        is1 is1Var = this.f39290c;
        if (is1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            is1Var.writeToParcel(parcel, i);
        }
    }
}
