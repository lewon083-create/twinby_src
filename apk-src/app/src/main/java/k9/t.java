package k9;

import q9.b2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27287a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b2 f27288b;

    public final void a(b2 b2Var) {
        synchronized (this.f27287a) {
            this.f27288b = b2Var;
        }
    }
}
