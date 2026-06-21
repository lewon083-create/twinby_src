package a1;

import e1.x;
import g0.s1;
import java.util.Objects;
import java.util.concurrent.Executor;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f321b;

    public d(g gVar, x xVar) {
        this.f321b = gVar;
        this.f320a = xVar;
    }

    @Override // g0.s1
    public final void a(Object obj) {
        z0.b bVar = (z0.b) obj;
        Objects.requireNonNull(bVar);
        g gVar = this.f321b;
        if (gVar.f336l == this.f320a) {
            com.google.android.gms.internal.auth.g.e("AudioSource", "Receive BufferProvider state change: " + gVar.f333h + " to " + bVar);
            if (gVar.f333h != bVar) {
                gVar.f333h = bVar;
                gVar.f();
            }
        }
    }

    @Override // g0.s1
    public final void onError(Throwable th2) {
        g gVar = this.f321b;
        if (gVar.f336l == this.f320a) {
            Executor executor = gVar.f334j;
            v vVar = gVar.f335k;
            if (executor == null || vVar == null) {
                return;
            }
            executor.execute(new a0.d(5, vVar, th2));
        }
    }
}
