package z3;

import ad.g1;
import ad.j0;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46107h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f46108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f46109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f46110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f46111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f46112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f46113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f46114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j3.l f46115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0 f46116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f46117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g1 f46118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f46119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f46120v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f46121w;

    public l(int i, String str, List list, long j10, boolean z5, long j11, boolean z10, int i10, long j12, int i11, long j13, long j14, boolean z11, boolean z12, boolean z13, j3.l lVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z11);
        this.f46103d = i;
        this.f46107h = j11;
        this.f46106g = z5;
        this.i = z10;
        this.f46108j = i10;
        this.f46109k = j12;
        this.f46110l = i11;
        this.f46111m = j13;
        this.f46112n = j14;
        this.f46113o = z12;
        this.f46114p = z13;
        this.f46115q = lVar;
        this.f46116r = j0.r(list2);
        this.f46117s = j0.r(list3);
        this.f46118t = g1.a(map);
        this.f46121w = j0.r(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) ad.q.j(list3);
            this.f46119u = gVar.f46092f + gVar.f46090d;
        } else if (list2.isEmpty()) {
            this.f46119u = 0L;
        } else {
            i iVar = (i) ad.q.j(list2);
            this.f46119u = iVar.f46092f + iVar.f46090d;
        }
        this.f46104e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f46119u, j10) : Math.max(0L, this.f46119u + j10) : -9223372036854775807L;
        this.f46105f = j10 >= 0;
        this.f46120v = kVar;
    }

    @Override // d4.a
    public final Object a(List list) {
        return this;
    }
}
