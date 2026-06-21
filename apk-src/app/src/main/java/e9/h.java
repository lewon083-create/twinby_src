package e9;

import android.content.Context;
import fh.nd;
import fh.of;
import java.util.concurrent.Executor;
import ka.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements a9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj.a f16320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj.a f16321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj.a f16322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d9.e f16323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj.a f16324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hj.a f16325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hj.a f16326g;

    public h(hj.a aVar, hj.a aVar2, hj.a aVar3, d9.e eVar, hj.a aVar4, hj.a aVar5, hj.a aVar6) {
        this.f16320a = aVar;
        this.f16321b = aVar2;
        this.f16322c = aVar3;
        this.f16323d = eVar;
        this.f16324e = aVar4;
        this.f16325f = aVar5;
        this.f16326g = aVar6;
    }

    @Override // hj.a
    public final Object get() {
        return new com.google.android.gms.internal.consent_sdk.c((Context) this.f16320a.get(), (z8.d) this.f16321b.get(), (f9.d) this.f16322c.get(), (k) this.f16323d.get(), (Executor) this.f16324e.get(), (g9.c) this.f16325f.get(), new of(), new nd(), (f9.c) this.f16326g.get());
    }
}
