package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public enum x extends a0 {
    public x() {
        super("Text", 7);
    }

    @Override // wl.a0
    public final boolean c(kv0 kv0Var, b bVar) {
        if (kv0Var.f7316c == 5) {
            bVar.o((f0) kv0Var);
            return true;
        }
        if (kv0Var.i()) {
            bVar.e(this);
            bVar.v();
            bVar.f35370k = bVar.f35371l;
            return bVar.x(kv0Var);
        }
        if (!kv0Var.j()) {
            return true;
        }
        bVar.v();
        bVar.f35370k = bVar.f35371l;
        return true;
    }
}
