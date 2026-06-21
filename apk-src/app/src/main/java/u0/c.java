package u0;

import a0.q2;
import com.google.android.gms.internal.measurement.b4;
import g0.f2;
import g0.h2;
import g0.n;
import g0.x2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f33991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x2 f33994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f33995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f33996f;

    public /* synthetic */ c(d dVar, String str, String str2, x2 x2Var, n nVar, n nVar2) {
        this.f33991a = dVar;
        this.f33992b = str;
        this.f33993c = str2;
        this.f33994d = x2Var;
        this.f33995e = nVar;
        this.f33996f = nVar2;
    }

    @Override // g0.f2
    public final void a(h2 h2Var) {
        d dVar = this.f33991a;
        if (dVar.e() == null) {
            return;
        }
        dVar.G();
        dVar.F(dVar.H(this.f33992b, this.f33993c, this.f33994d, this.f33995e, this.f33996f));
        dVar.r();
        g gVar = dVar.f33998r;
        gVar.getClass();
        b4.e();
        Iterator it = gVar.f34010b.iterator();
        while (it.hasNext()) {
            gVar.e((q2) it.next());
        }
    }
}
