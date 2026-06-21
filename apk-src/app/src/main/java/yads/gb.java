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
public final class gb implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<gb> CREATOR = new fb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38691d;

    public gb(String str, String str2, ArrayList arrayList) {
        this.f38689b = str;
        this.f38690c = arrayList;
        this.f38691d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return Intrinsics.a(this.f38689b, gbVar.f38689b) && Intrinsics.a(this.f38690c, gbVar.f38690c) && Intrinsics.a(this.f38691d, gbVar.f38691d);
    }

    public final int hashCode() {
        return this.f38691d.hashCode() + eb.a(this.f38690c, this.f38689b.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f38689b;
        List list = this.f38690c;
        String str2 = this.f38691d;
        StringBuilder sb2 = new StringBuilder("AdUnitIdBiddingSettings(adUnitId=");
        sb2.append(str);
        sb2.append(", mediationNetworks=");
        sb2.append(list);
        sb2.append(", rawData=");
        return a0.u.o(sb2, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38689b);
        List list = this.f38690c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((sq1) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f38691d);
    }
}
