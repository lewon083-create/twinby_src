package xc;

import d8.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36058d;

    public /* synthetic */ b(int i, Object obj) {
        this.f36057c = i;
        this.f36058d = obj;
    }

    @Override // xc.o
    public final void b() {
        switch (this.f36057c) {
            case 0:
                c cVar = (c) ((h0) this.f36058d).f15632c;
                cVar.f36061b.a("unlinkToDeath", new Object[0]);
                ((k) cVar.f36072n).f36079b.unlinkToDeath(cVar.f36069k, 0);
                cVar.f36072n = null;
                cVar.f36066g = false;
                return;
            default:
                synchronized (((c) this.f36058d).f36065f) {
                    try {
                        if (((c) this.f36058d).f36070l.get() > 0 && ((c) this.f36058d).f36070l.decrementAndGet() > 0) {
                            ((c) this.f36058d).f36061b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f36058d;
                        if (cVar2.f36072n != null) {
                            cVar2.f36061b.a("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f36058d;
                            cVar3.f36060a.unbindService(cVar3.f36071m);
                            c cVar4 = (c) this.f36058d;
                            cVar4.f36066g = false;
                            cVar4.f36072n = null;
                            cVar4.f36071m = null;
                        }
                        ((c) this.f36058d).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
