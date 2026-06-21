package d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements androidx.lifecycle.s, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f15479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.p f15480c;

    public v(r rVar, w wVar, androidx.lifecycle.p pVar) {
        this.f15479b = rVar;
        this.f15480c = pVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15480c.b(this);
    }

    @Override // androidx.lifecycle.s
    public final void d(androidx.lifecycle.u source, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
        r rVar = this.f15479b;
        if (event == nVar) {
            rVar.b(true);
        } else if (event == androidx.lifecycle.n.ON_STOP) {
            rVar.b(false);
        }
        if (event == androidx.lifecycle.n.ON_DESTROY) {
            rVar.a();
            this.f15480c.b(this);
        }
    }
}
