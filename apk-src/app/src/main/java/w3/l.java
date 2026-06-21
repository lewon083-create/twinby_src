package w3;

import ad.j0;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f35074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.d f35075h;

    public l(j3.o oVar, j0 j0Var, r rVar, ArrayList arrayList) {
        super(oVar, j0Var, rVar, arrayList);
        Uri.parse(((b) j0Var.get(0)).f35025a);
        long j10 = rVar.f35093e;
        j jVar = j10 <= 0 ? null : new j(null, rVar.f35092d, j10);
        this.f35074g = jVar;
        this.f35075h = jVar == null ? new m4.d(new j(null, 0L, -1L)) : null;
    }

    @Override // w3.m
    public final String a() {
        return null;
    }

    @Override // w3.m
    public final v3.g c() {
        return this.f35075h;
    }

    @Override // w3.m
    public final j d() {
        return this.f35074g;
    }
}
