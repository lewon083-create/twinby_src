package o;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f29583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f29584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29585d;

    public b(c cVar, c cVar2, int i) {
        this.f29585d = i;
        this.f29583b = cVar2;
        this.f29584c = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f29583b == cVar && cVar == this.f29584c) {
            this.f29584c = null;
            this.f29583b = null;
        }
        c cVar3 = this.f29583b;
        if (cVar3 == cVar) {
            switch (this.f29585d) {
                case 0:
                    cVar2 = cVar3.f29589e;
                    break;
                default:
                    cVar2 = cVar3.f29588d;
                    break;
            }
            this.f29583b = cVar2;
        }
        c cVar4 = this.f29584c;
        if (cVar4 == cVar) {
            c cVar5 = this.f29583b;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f29584c = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f29585d) {
            case 0:
                return cVar.f29588d;
            default:
                return cVar.f29589e;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29584c != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f29584c;
        c cVar2 = this.f29583b;
        this.f29584c = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
