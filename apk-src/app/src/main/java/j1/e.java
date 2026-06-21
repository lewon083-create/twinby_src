package j1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends hl.l {
    @Override // hl.l
    public final boolean d(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f26166c != cVar) {
                    return false;
                }
                gVar.f26166c = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hl.l
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f26165b != obj) {
                    return false;
                }
                gVar.f26165b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hl.l
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f26167d != fVar) {
                    return false;
                }
                gVar.f26167d = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hl.l
    public final void n(f fVar, f fVar2) {
        fVar.f26160b = fVar2;
    }

    @Override // hl.l
    public final void o(f fVar, Thread thread) {
        fVar.f26159a = thread;
    }
}
