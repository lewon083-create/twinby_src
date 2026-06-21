package ti;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.zl;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class p extends j implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ka.k f33867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f33869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f33870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f33871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l9.c f33872g;

    public p(int i, ka.k kVar, String str, List list, n nVar, b bVar) {
        super(i);
        kVar.getClass();
        str.getClass();
        list.getClass();
        nVar.getClass();
        this.f33867b = kVar;
        this.f33868c = str;
        this.f33869d = list;
        this.f33870e = nVar;
        this.f33871f = bVar;
    }

    public void a() {
        l9.c cVar = this.f33872g;
        if (cVar != null) {
            this.f33867b.L(this.f33834a, cVar.getResponseInfo());
        }
    }

    @Override // ti.j
    public void b() {
        l9.c cVar = this.f33872g;
        if (cVar != null) {
            cVar.a();
            this.f33872g = null;
        }
    }

    @Override // ti.j
    public io.flutter.plugin.platform.f c() {
        l9.c cVar = this.f33872g;
        if (cVar == null) {
            return null;
        }
        return new ef.d(cVar, 2);
    }

    public final void d() {
        l9.c cVar = new l9.c(this.f33871f.f33798b);
        this.f33872g = cVar;
        if (this instanceof d) {
            cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f33872g.setAdUnitId(this.f33868c);
        this.f33872g.setAppEventListener(new o(this));
        List list = this.f33869d;
        k9.h[] hVarArr = new k9.h[list.size()];
        for (int i = 0; i < list.size(); i++) {
            hVarArr[i] = ((y) list.get(i)).f33914a;
        }
        this.f33872g.setAdSizes(hVarArr);
        this.f33872g.setAdListener(new e0(this.f33834a, this.f33867b, this));
        l9.c cVar2 = this.f33872g;
        l9.b bVarC = this.f33870e.c();
        cVar2.getClass();
        pa.c0.e("#008 Must be called on the main UI thread.");
        al.a(cVar2.getContext());
        if (((Boolean) zl.f13030f.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new ed.c(16, cVar2, bVarC));
                return;
            }
        }
        cVar2.f27273b.b(bVarC.f27259a);
    }
}
