package oa;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f29859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f29860c;

    public k(Looper looper, kb.c cVar, String str) {
        this.f29858a = new j0.a(looper);
        pa.c0.j(cVar, "Listener must not be null");
        this.f29859b = cVar;
        pa.c0.f(str);
        this.f29860c = new i(cVar, str);
    }

    public void a(j jVar) {
        ((j0.a) this.f29858a).execute(new ed.c(20, this, jVar));
    }

    public k(u2.h hVar) {
        this.f29858a = hVar;
    }
}
