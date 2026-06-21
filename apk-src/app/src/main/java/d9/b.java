package d9;

import java.util.concurrent.Executor;
import ka.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj.a f15724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f15725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f15726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj.a f15727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj.a f15728e;

    public b(hj.a aVar, hj.a aVar2, e eVar, hj.a aVar3, hj.a aVar4) {
        this.f15724a = aVar;
        this.f15725b = aVar2;
        this.f15726c = eVar;
        this.f15727d = aVar3;
        this.f15728e = aVar4;
    }

    @Override // hj.a
    public final Object get() {
        return new a((Executor) this.f15724a.get(), (z8.d) this.f15725b.get(), (k) this.f15726c.get(), (f9.d) this.f15727d.get(), (g9.c) this.f15728e.get());
    }
}
