package androidx.media3.exoplayer.dash;

import ac.c;
import ad.m0;
import fh.nd;
import i4.b0;
import io.sentry.TransactionOptions;
import j3.x;
import java.util.List;
import l7.i;
import m7.a;
import p3.g;
import v3.f;
import w3.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f1620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nd f1623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final le.a f1624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1626g;

    public DashMediaSource$Factory(g gVar) {
        m0 m0Var = new m0(gVar);
        this.f1620a = m0Var;
        this.f1621b = gVar;
        this.f1622c = new a(28);
        this.f1624e = new le.a(1);
        this.f1625f = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f1626g = 5000000L;
        this.f1623d = new nd();
        ((c) m0Var.f841e).f738b = true;
    }

    @Override // i4.b0
    public final void a(i iVar) {
        c cVar = (c) this.f1620a.f841e;
        cVar.getClass();
        cVar.f739c = iVar;
    }

    @Override // i4.b0
    public final void b() {
        ((c) this.f1620a.f841e).getClass();
    }

    @Override // i4.b0
    public final void c(boolean z5) {
        ((c) this.f1620a.f841e).f738b = z5;
    }

    @Override // i4.b0
    public final i4.a d(x xVar) {
        xVar.f26407b.getClass();
        e eVar = new e();
        List list = xVar.f26407b.f26398c;
        return new f(xVar, this.f1621b, !list.isEmpty() ? new a1.e(9, eVar, list, false) : eVar, this.f1620a, this.f1623d, this.f1622c.n(xVar), this.f1624e, this.f1625f, this.f1626g);
    }
}
