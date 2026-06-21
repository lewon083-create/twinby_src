package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f13502c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f13503d = new AtomicReference();

    public o(b bVar, Executor executor) {
        this.f13500a = bVar;
        this.f13501b = executor;
    }

    public final void a(yc.g gVar, yc.f fVar, boolean z5) {
        f0.a();
        p pVar = (p) this.f13502c.get();
        if (pVar == null) {
            fVar.a(new n1(3, "No available form can be built.").a());
            return;
        }
        b bVar = (b) this.f13500a.j();
        bVar.getClass();
        c cVar = bVar.f13332b;
        g7 g7VarA = g7.a(new d6(4, (d6) cVar.f13338b));
        d6 d6Var = new d6(8, pVar);
        d6 d6Var2 = new d6(7);
        d6 d6Var3 = (d6) cVar.f13338b;
        g7 g7Var = (g7) cVar.f13342f;
        f fVar2 = (f) cVar.i;
        g7 g7Var2 = (g7) cVar.f13339c;
        g7 g7VarA2 = g7.a(new m.h3(d6Var3, (g7) cVar.f13340d, g7VarA, g7Var2, d6Var, new n(g7VarA, new t.x1(d6Var3, g7VarA, g7Var, fVar2, d6Var2, g7Var2)), (g7) cVar.f13343g));
        if (((g7) d6Var2.f13360c) != null) {
            throw new IllegalStateException();
        }
        d6Var2.f13360c = g7VarA2;
        k kVar = (k) d6Var2.j();
        kVar.f13442n = z5;
        kVar.b(gVar, fVar);
    }

    public final void b() {
        p pVar = (p) this.f13502c.get();
        if (pVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        b bVar = (b) this.f13500a.j();
        bVar.getClass();
        c cVar = bVar.f13332b;
        g7 g7VarA = g7.a(new d6(4, (d6) cVar.f13338b));
        d6 d6Var = new d6(8, pVar);
        d6 d6Var2 = new d6(7);
        d6 d6Var3 = (d6) cVar.f13338b;
        g7 g7Var = (g7) cVar.f13342f;
        f fVar = (f) cVar.i;
        g7 g7Var2 = (g7) cVar.f13339c;
        g7 g7VarA2 = g7.a(new m.h3(d6Var3, (g7) cVar.f13340d, g7VarA, g7Var2, d6Var, new n(g7VarA, new t.x1(d6Var3, g7VarA, g7Var, fVar, d6Var2, g7Var2)), (g7) cVar.f13343g));
        if (((g7) d6Var2.f13360c) != null) {
            throw new IllegalStateException();
        }
        d6Var2.f13360c = g7VarA2;
        k kVar = (k) d6Var2.j();
        kVar.f13441m = true;
        f0.f13385a.post(new l(0, this, kVar));
    }
}
