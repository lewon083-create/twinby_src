package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gd implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra2 f38705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38706b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd f38707c;

    public gd(ra2 ra2Var) {
        this.f38705a = ra2Var;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f38706b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
        }
    }

    @Override // yads.o11
    public final void a(int i) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i10 = 0; i10 < 4; i10++) {
            if (i == iArr[i10]) {
                hd hdVar = this.f38707c;
                if (hdVar != null) {
                    ng0.a(((bd) hdVar).f36994a.f37337a);
                    return;
                }
                return;
            }
        }
    }

    public final List a() {
        return kotlin.collections.r.c(new qd("noInterestAd", new fd(this)));
    }
}
