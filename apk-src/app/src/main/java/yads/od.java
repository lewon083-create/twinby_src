package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class od implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f41509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41510b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pd f41511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41512d;

    public od(dd ddVar) {
        this.f41509a = ddVar;
    }

    public final void a() {
        pd pdVar = this.f41511c;
        if (pdVar != null) {
            vc vcVar = (vc) pdVar;
            vcVar.f43993a.f44636b.a();
            ng0.a(vcVar.f43993a.f44635a);
        }
    }

    public final List b() {
        return kotlin.collections.s.f(new qd("adtuneRendered", new nd(this)), new qd("adtuneClosed", new ld(this)), new qd("openOptOut", new md(this)));
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f41510b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
            pd pdVar = this.f41511c;
            if (pdVar != null) {
                ((vc) pdVar).f43993a.f44637c.a(str);
            }
        } catch (URISyntaxException unused) {
            a();
        }
    }

    @Override // yads.o11
    public final void a(int i) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i10 = 0; i10 < 4; i10++) {
            if (i == iArr[i10]) {
                a();
                return;
            }
        }
    }
}
