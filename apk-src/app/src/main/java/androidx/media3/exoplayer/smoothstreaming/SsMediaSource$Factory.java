package androidx.media3.exoplayer.smoothstreaming;

import a0.b1;
import a1.e;
import com.google.android.gms.internal.measurement.i4;
import fh.nd;
import g4.d;
import i4.b0;
import io.sentry.TransactionOptions;
import j3.x;
import java.util.List;
import l7.i;
import m7.a;
import p3.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource$Factory implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f1639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f1640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nd f1641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f1642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final le.a f1643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1644f;

    public SsMediaSource$Factory(g gVar) {
        i4 i4Var = new i4();
        i4Var.f13782c = gVar;
        i4Var.f13783d = new i(4);
        this.f1639a = i4Var;
        this.f1640b = gVar;
        this.f1642d = new a(28);
        this.f1643e = new le.a(1);
        this.f1644f = TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION;
        this.f1641c = new nd();
        i4Var.f13781b = true;
    }

    @Override // i4.b0
    public final void a(i iVar) {
        this.f1639a.f13783d = iVar;
    }

    @Override // i4.b0
    public final void c(boolean z5) {
        this.f1639a.f13781b = z5;
    }

    @Override // i4.b0
    public final i4.a d(x xVar) {
        xVar.f26407b.getClass();
        b1 b1Var = new b1(13);
        List list = xVar.f26407b.f26398c;
        return new d(xVar, this.f1640b, !list.isEmpty() ? new e(9, b1Var, list, false) : b1Var, this.f1639a, this.f1641c, this.f1642d.n(xVar), this.f1643e, this.f1644f);
    }
}
