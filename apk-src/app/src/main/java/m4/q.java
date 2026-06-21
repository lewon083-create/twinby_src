package m4;

import android.net.Uri;
import i4.u;
import m3.z;
import p3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28674b = u.f21015b.getAndIncrement();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.l f28675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f28677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f28678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f28679g;

    public q(p3.h hVar, p3.l lVar, int i, p pVar) {
        this.f28677e = new c0(hVar);
        this.f28675c = lVar;
        this.f28676d = i;
        this.f28678f = pVar;
    }

    @Override // m4.k
    public final void load() {
        this.f28677e.f31132c = 0L;
        p3.j jVar = new p3.j(this.f28677e, this.f28675c);
        try {
            jVar.a();
            Uri uri = this.f28677e.f31131b.getUri();
            uri.getClass();
            this.f28679g = this.f28678f.m(uri, jVar);
        } finally {
            z.h(jVar);
        }
    }

    @Override // m4.k
    public final void d() {
    }
}
