package ob;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends qa.a {
    public static final Parcelable.Creator<g4> CREATOR = new kb.i(22);
    public final int A;
    public final long B;
    public final String C;
    public final String D;
    public final long E;
    public final int F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f30137h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f30138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f30139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f30140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f30141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f30142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f30143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f30144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f30145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f30146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f30147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f30148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f30149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f30150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f30151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f30152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f30153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f30154z;

    public g4(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z5, boolean z10, String str6, long j13, int i, boolean z11, boolean z12, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z13, long j15, int i10, String str10, int i11, long j16, String str11, String str12, long j17, int i12) {
        pa.c0.f(str);
        this.f30131b = str;
        this.f30132c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f30133d = str3;
        this.f30139k = j10;
        this.f30134e = str4;
        this.f30135f = j11;
        this.f30136g = j12;
        this.f30137h = str5;
        this.i = z5;
        this.f30138j = z10;
        this.f30140l = str6;
        this.f30141m = j13;
        this.f30142n = i;
        this.f30143o = z11;
        this.f30144p = z12;
        this.f30145q = bool;
        this.f30146r = j14;
        this.f30147s = list;
        this.f30148t = str7;
        this.f30149u = str8;
        this.f30150v = str9;
        this.f30151w = z13;
        this.f30152x = j15;
        this.f30153y = i10;
        this.f30154z = str10;
        this.A = i11;
        this.B = j16;
        this.C = str11;
        this.D = str12;
        this.E = j17;
        this.F = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iI0 = j0.g.i0(parcel, 20293);
        j0.g.b0(parcel, 2, this.f30131b);
        j0.g.b0(parcel, 3, this.f30132c);
        j0.g.b0(parcel, 4, this.f30133d);
        j0.g.b0(parcel, 5, this.f30134e);
        j0.g.h0(parcel, 6, 8);
        parcel.writeLong(this.f30135f);
        j0.g.h0(parcel, 7, 8);
        parcel.writeLong(this.f30136g);
        j0.g.b0(parcel, 8, this.f30137h);
        j0.g.h0(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        j0.g.h0(parcel, 10, 4);
        parcel.writeInt(this.f30138j ? 1 : 0);
        j0.g.h0(parcel, 11, 8);
        parcel.writeLong(this.f30139k);
        j0.g.b0(parcel, 12, this.f30140l);
        j0.g.h0(parcel, 14, 8);
        parcel.writeLong(this.f30141m);
        j0.g.h0(parcel, 15, 4);
        parcel.writeInt(this.f30142n);
        j0.g.h0(parcel, 16, 4);
        parcel.writeInt(this.f30143o ? 1 : 0);
        j0.g.h0(parcel, 18, 4);
        parcel.writeInt(this.f30144p ? 1 : 0);
        Boolean bool = this.f30145q;
        if (bool != null) {
            j0.g.h0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        j0.g.h0(parcel, 22, 8);
        parcel.writeLong(this.f30146r);
        j0.g.d0(parcel, 23, this.f30147s);
        j0.g.b0(parcel, 25, this.f30148t);
        j0.g.b0(parcel, 26, this.f30149u);
        j0.g.b0(parcel, 27, this.f30150v);
        j0.g.h0(parcel, 28, 4);
        parcel.writeInt(this.f30151w ? 1 : 0);
        j0.g.h0(parcel, 29, 8);
        parcel.writeLong(this.f30152x);
        j0.g.h0(parcel, 30, 4);
        parcel.writeInt(this.f30153y);
        j0.g.b0(parcel, 31, this.f30154z);
        j0.g.h0(parcel, 32, 4);
        parcel.writeInt(this.A);
        j0.g.h0(parcel, 34, 8);
        parcel.writeLong(this.B);
        j0.g.b0(parcel, 35, this.C);
        j0.g.b0(parcel, 36, this.D);
        j0.g.h0(parcel, 37, 8);
        parcel.writeLong(this.E);
        j0.g.h0(parcel, 38, 4);
        parcel.writeInt(this.F);
        j0.g.m0(parcel, iI0);
    }

    public g4(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z5, boolean z10, long j12, String str6, long j13, int i, boolean z11, boolean z12, Boolean bool, long j14, ArrayList arrayList, String str7, String str8, String str9, boolean z13, long j15, int i10, String str10, int i11, long j16, String str11, String str12, long j17, int i12) {
        this.f30131b = str;
        this.f30132c = str2;
        this.f30133d = str3;
        this.f30139k = j12;
        this.f30134e = str4;
        this.f30135f = j10;
        this.f30136g = j11;
        this.f30137h = str5;
        this.i = z5;
        this.f30138j = z10;
        this.f30140l = str6;
        this.f30141m = j13;
        this.f30142n = i;
        this.f30143o = z11;
        this.f30144p = z12;
        this.f30145q = bool;
        this.f30146r = j14;
        this.f30147s = arrayList;
        this.f30148t = str7;
        this.f30149u = str8;
        this.f30150v = str9;
        this.f30151w = z13;
        this.f30152x = j15;
        this.f30153y = i10;
        this.f30154z = str10;
        this.A = i11;
        this.B = j16;
        this.C = str11;
        this.D = str12;
        this.E = j17;
        this.F = i12;
    }
}
