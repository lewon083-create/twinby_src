package a6;

import a0.a0;
import d.r;
import java.util.LinkedHashSet;
import kk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f451d;

    public c(a0 onBackCompletedFallback) {
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "onBackCompletedFallback");
        this.f448a = onBackCompletedFallback;
        this.f449b = new g();
        new LinkedHashSet();
        this.f450c = new LinkedHashSet();
        this.f451d = new LinkedHashSet();
    }

    public final void a(f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.f451d.add(input)) {
            this.f449b.a(this, input, -1);
        }
    }

    public final void b(l input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(l7.o.i(i, "Unsupported priority value: ").toString());
        }
        if (this.f451d.add(input)) {
            this.f449b.a(this, input, i);
        }
    }

    public final void c(f input, b event) {
        Intrinsics.checkNotNullParameter(input, "input");
        g gVar = this.f449b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (gVar.f462g != 0) {
            return;
        }
        r rVarC = gVar.c(-1);
        gVar.f461f = rVarC;
        gVar.f462g = -1;
        gVar.f463h = input;
        if (event != null) {
            if (rVarC != null) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(event, "latestEvent");
                Intrinsics.checkNotNullParameter(event, "event");
                rVarC.f15474f.handleOnBackStarted(new d.a(event));
            }
            t tVar = gVar.f456a;
            i iVar = new i(event);
            tVar.getClass();
            tVar.H(null, iVar);
        }
    }
}
