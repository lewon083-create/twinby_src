package androidx.media3.exoplayer.hls;

import fh.nd;
import i4.b0;
import j3.x;
import java.util.List;
import l7.i;
import m4.d;
import m7.a;
import p3.g;
import t9.h0;
import x0.v;
import x3.h;
import y3.c;
import y3.l;
import z3.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f1629c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f1634h = new a(28);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f1631e = new h0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yf.a f1632f = z3.c.f46025p;
    public final le.a i = new le.a(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nd f1633g = new nd();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1636k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f1637l = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1635j = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1630d = true;

    public HlsMediaSource$Factory(g gVar) {
        this.f1627a = new d(gVar);
    }

    @Override // i4.b0
    public final void a(i iVar) {
        this.f1629c = iVar;
    }

    @Override // i4.b0
    public final void c(boolean z5) {
        this.f1630d = z5;
    }

    @Override // i4.b0
    public final i4.a d(x xVar) {
        xVar.f26407b.getClass();
        if (this.f1628b == null) {
            c cVar = new c();
            cVar.f36311a = new i(4);
            this.f1628b = cVar;
        }
        i iVar = this.f1629c;
        if (iVar != null) {
            this.f1628b.f36311a = iVar;
        }
        c cVar2 = this.f1628b;
        cVar2.f36312b = this.f1630d;
        List list = xVar.f26407b.f26398c;
        boolean zIsEmpty = list.isEmpty();
        s vVar = this.f1631e;
        if (!zIsEmpty) {
            vVar = new v(10, vVar, list, false);
        }
        h hVarN = this.f1634h.n(xVar);
        this.f1632f.getClass();
        d dVar = this.f1627a;
        le.a aVar = this.i;
        return new l(xVar, dVar, cVar2, this.f1633g, hVarN, aVar, new z3.c(dVar, aVar, vVar), this.f1637l, this.f1635j, this.f1636k);
    }

    @Override // i4.b0
    public final void b() {
    }
}
