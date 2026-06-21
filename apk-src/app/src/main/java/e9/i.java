package e9;

import java.util.concurrent.Executor;
import ka.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj.a f16327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f16328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9.e f16329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj.a f16330d;

    public i(hj.a aVar, hj.a aVar2, d9.e eVar, hj.a aVar3) {
        this.f16327a = aVar;
        this.f16328b = aVar2;
        this.f16329c = eVar;
        this.f16330d = aVar3;
    }

    @Override // hj.a
    public final Object get() {
        return new s7.g((Executor) this.f16327a.get(), (f9.d) this.f16328b.get(), (k) this.f16329c.get(), (g9.c) this.f16330d.get());
    }
}
