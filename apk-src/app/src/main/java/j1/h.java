package j1;

import com.google.android.gms.internal.play_billing.d1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f26169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f26170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26171d;

    public final void a(Runnable runnable, Executor executor) {
        l lVar = this.f26170c;
        if (lVar != null) {
            lVar.a(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.f26171d = true;
        k kVar = this.f26169b;
        boolean z5 = kVar != null && kVar.f26173c.k(obj);
        if (z5) {
            this.f26168a = null;
            this.f26169b = null;
            this.f26170c = null;
        }
        return z5;
    }

    public final void c() {
        this.f26171d = true;
        k kVar = this.f26169b;
        if (kVar == null || !kVar.f26173c.cancel(true)) {
            return;
        }
        this.f26168a = null;
        this.f26169b = null;
        this.f26170c = null;
    }

    public final boolean d(Throwable th2) {
        this.f26171d = true;
        k kVar = this.f26169b;
        boolean z5 = kVar != null && kVar.f26173c.l(th2);
        if (z5) {
            this.f26168a = null;
            this.f26169b = null;
            this.f26170c = null;
        }
        return z5;
    }

    public final void finalize() {
        l lVar;
        k kVar = this.f26169b;
        if (kVar != null) {
            j jVar = kVar.f26173c;
            if (!jVar.isDone()) {
                jVar.l(new d1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f26168a, 4));
            }
        }
        if (this.f26171d || (lVar = this.f26170c) == null) {
            return;
        }
        lVar.k(null);
    }
}
