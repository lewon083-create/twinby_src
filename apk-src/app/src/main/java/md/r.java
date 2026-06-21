package md;

import com.google.android.gms.internal.ads.oc;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements vd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f28870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vd.c f28871b;

    public r(Set set, vd.c cVar) {
        this.f28870a = set;
        this.f28871b = cVar;
    }

    @Override // vd.c
    public final void a(vd.a aVar) {
        if (this.f28870a.contains(fd.b.class)) {
            this.f28871b.a(aVar);
            return;
        }
        throw new oc("Attempting to publish an undeclared event " + aVar + ".");
    }
}
