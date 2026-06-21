package q9;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends qa.a {
    public static final Parcelable.Creator<g3> CREATOR = new f1(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g3[] f31881h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f31882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f31884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f31885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f31886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f31887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f31888p;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g3(android.content.Context r17, k9.h[] r18) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.g3.<init>(android.content.Context, k9.h[]):void");
    }

    public static g3 c() {
        return new g3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static g3 e() {
        return new g3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f31875b);
        j0.g.h0(parcel, 3, 4);
        parcel.writeInt(this.f31876c);
        j0.g.h0(parcel, 4, 4);
        parcel.writeInt(this.f31877d);
        j0.g.h0(parcel, 5, 4);
        parcel.writeInt(this.f31878e ? 1 : 0);
        j0.g.h0(parcel, 6, 4);
        parcel.writeInt(this.f31879f);
        j0.g.h0(parcel, 7, 4);
        parcel.writeInt(this.f31880g);
        j0.g.e0(parcel, 8, this.f31881h, i);
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j0.g.h0(parcel, 10, 4);
        parcel.writeInt(this.f31882j ? 1 : 0);
        boolean z5 = this.f31883k;
        j0.g.h0(parcel, 11, 4);
        parcel.writeInt(z5 ? 1 : 0);
        j0.g.h0(parcel, 12, 4);
        parcel.writeInt(this.f31884l ? 1 : 0);
        j0.g.h0(parcel, 13, 4);
        parcel.writeInt(this.f31885m ? 1 : 0);
        j0.g.h0(parcel, 14, 4);
        parcel.writeInt(this.f31886n ? 1 : 0);
        j0.g.h0(parcel, 15, 4);
        parcel.writeInt(this.f31887o ? 1 : 0);
        j0.g.h0(parcel, 16, 4);
        parcel.writeInt(this.f31888p ? 1 : 0);
        j0.g.m0(parcel, iI0);
    }

    public g3(String str, int i, int i10, boolean z5, int i11, int i12, g3[] g3VarArr, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f31875b = str;
        this.f31876c = i;
        this.f31877d = i10;
        this.f31878e = z5;
        this.f31879f = i11;
        this.f31880g = i12;
        this.f31881h = g3VarArr;
        this.i = z10;
        this.f31882j = z11;
        this.f31883k = z12;
        this.f31884l = z13;
        this.f31885m = z14;
        this.f31886n = z15;
        this.f31887o = z16;
        this.f31888p = z17;
    }

    public g3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public g3(Context context, k9.h hVar) {
        this(context, new k9.h[]{hVar});
    }
}
