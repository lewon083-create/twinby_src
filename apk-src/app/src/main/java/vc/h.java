package vc;

import d8.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34842d;

    public /* synthetic */ h(int i, Object obj) {
        this.f34841c = i;
        this.f34842d = obj;
    }

    @Override // vc.e
    public final void a() {
        switch (this.f34841c) {
            case 0:
                synchronized (((i) this.f34842d).f34849f) {
                    try {
                        if (((i) this.f34842d).f34853k.get() > 0 && ((i) this.f34842d).f34853k.decrementAndGet() > 0) {
                            ((i) this.f34842d).f34845b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        i iVar = (i) this.f34842d;
                        if (iVar.f34855m != null) {
                            iVar.f34845b.c("Unbind from service.", new Object[0]);
                            i iVar2 = (i) this.f34842d;
                            iVar2.f34844a.unbindService(iVar2.f34854l);
                            i iVar3 = (i) this.f34842d;
                            iVar3.f34850g = false;
                            iVar3.f34855m = null;
                            iVar3.f34854l = null;
                        }
                        ((i) this.f34842d).c();
                        return;
                    } finally {
                    }
                }
            default:
                i iVar4 = (i) ((h0) this.f34842d).f15632c;
                iVar4.f34845b.c("unlinkToDeath", new Object[0]);
                ((b) iVar4.f34855m).f34833b.unlinkToDeath(iVar4.f34852j, 0);
                iVar4.f34855m = null;
                iVar4.f34850g = false;
                return;
        }
    }
}
