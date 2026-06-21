package q9;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends qa.a {
    public static final Parcelable.Creator<d3> CREATOR = new f1(8);
    public final long A;
    public final long B;
    public final Bundle C = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f31803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f31805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31807h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f31808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z2 f31809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Location f31810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f31811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bundle f31812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f31813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f31814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f31815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f31816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f31817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f31818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f31819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f31820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f31821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f31822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f31823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f31824z;

    public d3(int i, long j10, Bundle bundle, int i10, List list, boolean z5, int i11, boolean z10, String str, z2 z2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, o0 o0Var, int i12, String str5, List list3, int i13, String str6, int i14, long j11, long j12) {
        this.f31801b = i;
        this.f31802c = j10;
        this.f31803d = bundle == null ? new Bundle() : bundle;
        this.f31804e = i10;
        this.f31805f = list;
        this.f31806g = z5;
        this.f31807h = i11;
        this.i = z10;
        this.f31808j = str;
        this.f31809k = z2Var;
        this.f31810l = location;
        this.f31811m = str2;
        this.f31812n = bundle2 == null ? new Bundle() : bundle2;
        this.f31813o = bundle3;
        this.f31814p = list2;
        this.f31815q = str3;
        this.f31816r = str4;
        this.f31817s = z11;
        this.f31818t = o0Var;
        this.f31819u = i12;
        this.f31820v = str5;
        this.f31821w = list3 == null ? new ArrayList() : list3;
        this.f31822x = i13;
        this.f31823y = str6;
        this.f31824z = i14;
        this.A = j11;
        this.B = j12;
    }

    public final boolean a(d3 d3Var) {
        return d3Var != null && this.f31801b == d3Var.f31801b && this.f31802c == d3Var.f31802c && u9.i.a(this.f31803d, d3Var.f31803d) && this.f31804e == d3Var.f31804e && pa.c0.m(this.f31805f, d3Var.f31805f) && this.f31806g == d3Var.f31806g && this.f31807h == d3Var.f31807h && this.i == d3Var.i && pa.c0.m(this.f31808j, d3Var.f31808j) && pa.c0.m(this.f31809k, d3Var.f31809k) && pa.c0.m(this.f31810l, d3Var.f31810l) && pa.c0.m(this.f31811m, d3Var.f31811m) && u9.i.a(this.f31812n, d3Var.f31812n) && u9.i.a(this.f31813o, d3Var.f31813o) && pa.c0.m(this.f31814p, d3Var.f31814p) && pa.c0.m(this.f31815q, d3Var.f31815q) && pa.c0.m(this.f31816r, d3Var.f31816r) && this.f31817s == d3Var.f31817s && this.f31819u == d3Var.f31819u && pa.c0.m(this.f31820v, d3Var.f31820v) && pa.c0.m(this.f31821w, d3Var.f31821w) && this.f31822x == d3Var.f31822x && pa.c0.m(this.f31823y, d3Var.f31823y) && this.f31824z == d3Var.f31824z;
    }

    public final boolean c() {
        Bundle bundle = this.f31803d;
        return bundle.getBoolean("is_sdk_preload", false) || bundle.getBoolean("zenith_v2", false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return a(d3Var) && this.A == d3Var.A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31801b), Long.valueOf(this.f31802c), this.f31803d, Integer.valueOf(this.f31804e), this.f31805f, Boolean.valueOf(this.f31806g), Integer.valueOf(this.f31807h), Boolean.valueOf(this.i), this.f31808j, this.f31809k, this.f31810l, this.f31811m, this.f31812n, this.f31813o, this.f31814p, this.f31815q, this.f31816r, Boolean.valueOf(this.f31817s), Integer.valueOf(this.f31819u), this.f31820v, this.f31821w, Integer.valueOf(this.f31822x), this.f31823y, Integer.valueOf(this.f31824z), Long.valueOf(this.A), Long.valueOf(this.B)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.h0(parcel, 1, 4);
        parcel.writeInt(this.f31801b);
        j0.g.h0(parcel, 2, 8);
        parcel.writeLong(this.f31802c);
        j0.g.V(parcel, 3, this.f31803d);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31804e);
        j0.g.d0(parcel, 5, this.f31805f);
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(this.f31806g ? 1 : 0);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f31807h);
        j0.g.h0(parcel, 8, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j0.g.b0(parcel, 9, this.f31808j);
        j0.g.a0(parcel, 10, this.f31809k, i);
        j0.g.a0(parcel, 11, this.f31810l, i);
        j0.g.b0(parcel, 12, this.f31811m);
        j0.g.V(parcel, 13, this.f31812n);
        j0.g.V(parcel, 14, this.f31813o);
        j0.g.d0(parcel, 15, this.f31814p);
        j0.g.b0(parcel, 16, this.f31815q);
        j0.g.b0(parcel, 17, this.f31816r);
        j0.g.h0(parcel, 18, 4);
        parcel.writeInt(this.f31817s ? 1 : 0);
        j0.g.a0(parcel, 19, this.f31818t, i);
        j0.g.h0(parcel, 20, 4);
        parcel.writeInt(this.f31819u);
        j0.g.b0(parcel, 21, this.f31820v);
        j0.g.d0(parcel, 22, this.f31821w);
        j0.g.h0(parcel, 23, 4);
        parcel.writeInt(this.f31822x);
        j0.g.b0(parcel, 24, this.f31823y);
        j0.g.h0(parcel, 25, 4);
        parcel.writeInt(this.f31824z);
        j0.g.h0(parcel, 26, 8);
        parcel.writeLong(this.A);
        j0.g.h0(parcel, 27, 8);
        parcel.writeLong(this.B);
        j0.g.m0(parcel, iI0);
    }
}
