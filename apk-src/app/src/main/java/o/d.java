package o;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f29590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29591c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f29592d;

    public d(f fVar) {
        this.f29592d = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f29590b;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f29589e;
            this.f29590b = cVar3;
            this.f29591c = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29591c) {
            return this.f29592d.f29593b != null;
        }
        c cVar = this.f29590b;
        return (cVar == null || cVar.f29588d == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f29591c) {
            this.f29591c = false;
            this.f29590b = this.f29592d.f29593b;
        } else {
            c cVar = this.f29590b;
            this.f29590b = cVar != null ? cVar.f29588d : null;
        }
        return this.f29590b;
    }
}
