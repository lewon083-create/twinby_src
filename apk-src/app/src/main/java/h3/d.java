package h3;

import androidx.lifecycle.w0;
import h1.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d extends w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20370d = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f20371b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20372c = false;

    @Override // androidx.lifecycle.w0
    public final void b() {
        j jVar = this.f20371b;
        int i = jVar.f20343d;
        for (int i10 = 0; i10 < i; i10++) {
            a aVar = (a) jVar.f20342c[i10];
            ka.d dVar = aVar.f20364n;
            dVar.a();
            dVar.f27309c = true;
            b bVar = aVar.f20366p;
            if (bVar != null) {
                aVar.j(bVar);
            }
            a aVar2 = dVar.f27307a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f27307a = null;
            if (bVar != null) {
                boolean z5 = bVar.f20368b;
            }
            dVar.f27310d = true;
            dVar.f27308b = false;
            dVar.f27309c = false;
            dVar.f27311e = false;
        }
        int i11 = jVar.f20343d;
        Object[] objArr = jVar.f20342c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        jVar.f20343d = 0;
    }
}
