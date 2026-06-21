package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sq1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<sq1> CREATOR = new pq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f43052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f43053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f43054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j5 f43055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f43056h;

    public sq1(String str, Map map, List list, List list2, List list3, j5 j5Var, Map map2) {
        this.f43050b = str;
        this.f43051c = map;
        this.f43052d = list;
        this.f43053e = list2;
        this.f43054f = list3;
        this.f43055g = j5Var;
        this.f43056h = map2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq1)) {
            return false;
        }
        sq1 sq1Var = (sq1) obj;
        return Intrinsics.a(this.f43050b, sq1Var.f43050b) && Intrinsics.a(this.f43051c, sq1Var.f43051c) && Intrinsics.a(this.f43052d, sq1Var.f43052d) && Intrinsics.a(this.f43053e, sq1Var.f43053e) && Intrinsics.a(this.f43054f, sq1Var.f43054f) && Intrinsics.a(this.f43055g, sq1Var.f43055g) && Intrinsics.a(this.f43056h, sq1Var.f43056h);
    }

    public final int hashCode() {
        int iHashCode = (this.f43051c.hashCode() + (this.f43050b.hashCode() * 31)) * 31;
        List list = this.f43052d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f43053e;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f43054f;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j5 j5Var = this.f43055g;
        int iHashCode5 = (iHashCode4 + (j5Var == null ? 0 : j5Var.f39727b.hashCode())) * 31;
        Map map = this.f43056h;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f43050b;
        Map map = this.f43051c;
        List list = this.f43052d;
        List list2 = this.f43053e;
        List list3 = this.f43054f;
        j5 j5Var = this.f43055g;
        Map map2 = this.f43056h;
        StringBuilder sb2 = new StringBuilder("MediationNetwork(adapter=");
        sb2.append(str);
        sb2.append(", networkData=");
        sb2.append(map);
        sb2.append(", impressionTrackingUrls=");
        gf.a.u(sb2, list, ", clickTrackingUrls=", list2, ", adResponseTrackingUrls=");
        sb2.append(list3);
        sb2.append(", adImpressionData=");
        sb2.append(j5Var);
        sb2.append(", biddingInfo=");
        sb2.append(map2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43050b);
        Map map = this.f43051c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.f43052d);
        parcel.writeStringList(this.f43053e);
        parcel.writeStringList(this.f43054f);
        j5 j5Var = this.f43055g;
        if (j5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(j5Var.f39727b);
        }
        Map map2 = this.f43056h;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
    }
}
