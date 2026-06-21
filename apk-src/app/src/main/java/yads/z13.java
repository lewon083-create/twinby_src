package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z13 implements dg1 {
    @Override // yads.dg1
    public final void a() {
        synchronized (a23.f36618a) {
            Object obj = a23.f36619b;
            synchronized (obj) {
                if (a23.f36620c) {
                    return;
                }
                long jA = a23.a();
                synchronized (obj) {
                    a23.f36621d = jA;
                    a23.f36620c = true;
                }
            }
        }
    }

    @Override // yads.dg1
    public final void b() {
    }
}
