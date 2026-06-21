package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile w f13311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13312c;

    @Override // com.google.android.gms.internal.auth.w
    public final Object h() {
        w wVar = this.f13311b;
        y yVar = y.f13308b;
        if (wVar != yVar) {
            synchronized (this) {
                try {
                    if (this.f13311b != yVar) {
                        Object objH = this.f13311b.h();
                        this.f13312c = objH;
                        this.f13311b = yVar;
                        return objH;
                    }
                } finally {
                }
            }
        }
        return this.f13312c;
    }

    public final String toString() {
        Object objF = this.f13311b;
        if (objF == y.f13308b) {
            objF = pe.a.f("<supplier that returned ", String.valueOf(this.f13312c), ">");
        }
        return pe.a.f("Suppliers.memoize(", String.valueOf(objF), ")");
    }
}
