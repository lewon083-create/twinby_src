package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class es1 implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qk.a[] f38249d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f38251c;

    @NotNull
    public static final cs1 Companion = new cs1();

    @NotNull
    public static final Parcelable.Creator<es1> CREATOR = new ds1();

    static {
        uk.a1 a1Var = uk.a1.f34493a;
        f38249d = new qk.a[]{null, new uk.g0(a1Var, com.google.android.gms.internal.auth.g.q(a1Var))};
    }

    public /* synthetic */ es1(int i, String str, Map map) {
        if (3 != (i & 3)) {
            uk.o0.e(i, 3, bs1.f37133a.getDescriptor());
            throw null;
        }
        this.f38250b = str;
        this.f38251c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es1)) {
            return false;
        }
        es1 es1Var = (es1) obj;
        return Intrinsics.a(this.f38250b, es1Var.f38250b) && Intrinsics.a(this.f38251c, es1Var.f38251c);
    }

    public final int hashCode() {
        return this.f38251c.hashCode() + (this.f38250b.hashCode() * 31);
    }

    public final String toString() {
        return "MediationPrefetchNetwork(adapter=" + this.f38250b + ", networkData=" + this.f38251c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38250b);
        Map map = this.f38251c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public es1(String str, LinkedHashMap linkedHashMap) {
        this.f38250b = str;
        this.f38251c = linkedHashMap;
    }
}
