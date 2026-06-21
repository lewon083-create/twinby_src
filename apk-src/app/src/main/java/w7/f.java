package w7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wa.a {
    @Override // wa.a
    public final boolean c(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f35197c != cVar) {
                    return false;
                }
                hVar.f35197c = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wa.a
    public final boolean d(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f35196b != obj) {
                    return false;
                }
                hVar.f35196b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wa.a
    public final boolean e(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f35198d != gVar) {
                    return false;
                }
                hVar.f35198d = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wa.a
    public final void u(g gVar, g gVar2) {
        gVar.f35191b = gVar2;
    }

    @Override // wa.a
    public final void v(g gVar, Thread thread) {
        gVar.f35190a = thread;
    }
}
