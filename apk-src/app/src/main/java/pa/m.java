package pa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d, b, c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m f31396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f31397d = new n(0, 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f31398b;

    public /* synthetic */ m(Object obj) {
        this.f31398b = obj;
    }

    public static synchronized m b() {
        try {
            if (f31396c == null) {
                f31396c = new m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f31396c;
    }

    @Override // pa.d
    public void a(ma.b bVar) {
        e eVar = (e) this.f31398b;
        if (bVar.c()) {
            eVar.l(null, eVar.m());
            return;
        }
        c cVar = eVar.f31341p;
        if (cVar != null) {
            cVar.c0(bVar);
        }
    }

    @Override // pa.c
    public void c0(ma.b bVar) {
        ((na.h) this.f31398b).c0(bVar);
    }

    @Override // pa.b
    public void l0(int i) {
        ((na.g) this.f31398b).l0(i);
    }

    @Override // pa.b
    public void n0() {
        ((na.g) this.f31398b).n0();
    }

    public m(e eVar) {
        Objects.requireNonNull(eVar);
        this.f31398b = eVar;
    }
}
