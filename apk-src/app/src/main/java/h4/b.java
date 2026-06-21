package h4;

import j3.o;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20387h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o[] f20388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f20391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f20392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long[] f20393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f20394p;

    public b(String str, String str2, int i, String str3, long j10, String str4, int i10, int i11, int i12, int i13, String str5, o[] oVarArr, List list, long[] jArr, long j11) {
        this.f20390l = str;
        this.f20391m = str2;
        this.f20380a = i;
        this.f20381b = str3;
        this.f20382c = j10;
        this.f20383d = str4;
        this.f20384e = i10;
        this.f20385f = i11;
        this.f20386g = i12;
        this.f20387h = i13;
        this.i = str5;
        this.f20388j = oVarArr;
        this.f20392n = list;
        this.f20393o = jArr;
        this.f20394p = j11;
        this.f20389k = list.size();
    }

    public final b a(o[] oVarArr) {
        return new b(this.f20390l, this.f20391m, this.f20380a, this.f20381b, this.f20382c, this.f20383d, this.f20384e, this.f20385f, this.f20386g, this.f20387h, this.i, oVarArr, this.f20392n, this.f20393o, this.f20394p);
    }

    public final long b(int i) {
        if (i == this.f20389k - 1) {
            return this.f20394p;
        }
        long[] jArr = this.f20393o;
        return jArr[i + 1] - jArr[i];
    }
}
