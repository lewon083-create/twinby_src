package yads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class je0 implements ch3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f39843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j62 f39844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f39845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f39846d;

    public je0(w5 w5Var, int i, j62 j62Var, z30 z30Var) {
        this.f39843a = w5Var;
        this.f39844b = j62Var;
        this.f39845c = z30Var;
        this.f39846d = new AtomicInteger(i);
    }

    @Override // yads.ch3
    public final void a() {
        if (this.f39846d.decrementAndGet() == 0) {
            this.f39843a.a(v5.f43884p);
            this.f39844b.a();
        }
    }

    @Override // yads.ch3
    public final void b() {
        if (this.f39846d.getAndSet(0) > 0) {
            this.f39843a.a(v5.f43884p);
            this.f39845c.a(y30.f44899f);
            this.f39844b.a();
        }
    }

    @Override // yads.ch3
    public final void c() {
    }
}
