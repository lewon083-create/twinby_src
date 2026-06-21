package oa;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f29882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.d f29883b;

    public /* synthetic */ q(a aVar, ma.d dVar) {
        this.f29882a = aVar;
        this.f29883b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (pa.c0.m(this.f29882a, qVar.f29882a) && pa.c0.m(this.f29883b, qVar.f29883b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29882a, this.f29883b});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(this.f29882a, "key");
        iVar.b(this.f29883b, "feature");
        return iVar.toString();
    }
}
