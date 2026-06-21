package ik;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.om1;
import fj.s0;
import hk.b1;
import hk.c1;
import hk.h0;
import hk.k0;
import hk.l;
import hk.m0;
import hk.n1;
import hk.w1;
import hk.x;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mk.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends x implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f21366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f21368f;

    public d(boolean z5, Handler handler) {
        this.f21366d = handler;
        this.f21367e = z5;
        this.f21368f = z5 ? this : new d(true, handler);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f21366d == this.f21366d && dVar.f21367e == this.f21367e;
    }

    @Override // hk.h0
    public final m0 h(long j10, final w1 w1Var, CoroutineContext coroutineContext) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f21366d.postDelayed(w1Var, j10)) {
            return new m0() { // from class: ik.c
                @Override // hk.m0
                public final void a() {
                    this.f21364b.f21366d.removeCallbacks(w1Var);
                }
            };
        }
        m(coroutineContext, w1Var);
        return n1.f20696b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f21366d) ^ (this.f21367e ? 1231 : 1237);
    }

    @Override // hk.h0
    public final void i(long j10, l lVar) {
        ed.c cVar = new ed.c(12, lVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f21366d.postDelayed(cVar, j10)) {
            lVar.v(new s0(1, this, cVar));
        } else {
            m(lVar.f20688f, cVar);
        }
    }

    @Override // hk.x
    public final void j(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f21366d.post(runnable)) {
            return;
        }
        m(coroutineContext, runnable);
    }

    @Override // hk.x
    public final boolean k(CoroutineContext coroutineContext) {
        return (this.f21367e && Intrinsics.a(Looper.myLooper(), this.f21366d.getLooper())) ? false : true;
    }

    public final void m(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        c1 c1Var = (c1) coroutineContext.get(b1.f20637b);
        if (c1Var != null) {
            c1Var.a(cancellationException);
        }
        ok.e eVar = k0.f20682a;
        ok.d.f30722d.j(coroutineContext, runnable);
    }

    @Override // hk.x
    public final String toString() {
        d dVar;
        String str;
        ok.e eVar = k0.f20682a;
        d dVar2 = n.f28934a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f21368f;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f21366d.toString();
        return this.f21367e ? om1.x(string, ".immediate") : string;
    }
}
