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
public final class zr1 implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45525c;

    @NotNull
    public static final xr1 Companion = new xr1();

    @NotNull
    public static final Parcelable.Creator<zr1> CREATOR = new yr1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qk.a[] f45523d = {null, new uk.c(bs1.f37133a)};

    public /* synthetic */ zr1(int i, String str, List list) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, wr1.f44456a.getDescriptor());
            throw null;
        }
        this.f45524b = str;
        this.f45525c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr1)) {
            return false;
        }
        zr1 zr1Var = (zr1) obj;
        return Intrinsics.a(this.f45524b, zr1Var.f45524b) && Intrinsics.a(this.f45525c, zr1Var.f45525c);
    }

    public final int hashCode() {
        return this.f45525c.hashCode() + (this.f45524b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnit(adUnitId=" + this.f45524b + ", networks=" + this.f45525c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45524b);
        List list = this.f45525c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((es1) it.next()).writeToParcel(parcel, i);
        }
    }

    public zr1(String str, ArrayList arrayList) {
        this.f45524b = str;
        this.f45525c = arrayList;
    }
}
