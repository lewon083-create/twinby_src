package aa;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.a10;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.at0;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.d60;
import com.google.android.gms.internal.ads.ei0;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hj0;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.ns1;
import com.google.android.gms.internal.ads.oj0;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qq0;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.sj0;
import com.google.android.gms.internal.ads.t40;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.y50;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ls1 f650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ls1 f651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qs1 f652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qs1 f653h;
    public final qs1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qs1 f654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qs1 f655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qs1 f656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ms1 f657m;

    public m(ls1 ls1Var, qs1 qs1Var, qs1 qs1Var2, i20 i20Var, qs1 qs1Var3, ls1 ls1Var2, qs1 qs1Var4, ls1 ls1Var3, ml mlVar, d60 d60Var, ls1 ls1Var4, ls1 ls1Var5) {
        this.f647b = ls1Var;
        this.f652g = qs1Var;
        this.f653h = qs1Var2;
        this.i = i20Var;
        this.f654j = qs1Var3;
        this.f648c = ls1Var2;
        this.f655k = qs1Var4;
        this.f649d = ls1Var3;
        this.f656l = mlVar;
        this.f657m = d60Var;
        this.f650e = ls1Var4;
        this.f651f = ls1Var5;
    }

    public y50 a() {
        rr0 rr0Var = (rr0) this.f647b.j();
        u9.a aVarA = ((j10) this.f652g).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f653h.j();
        String packageName = ((d10) ((i20) this.i).f6343b).a().getPackageName();
        gr.G(packageName);
        wk wkVar = al.f2915a;
        return new y50(rr0Var, aVarA, applicationInfo, packageName, q9.s.f31967e.f31968a.w(), (PackageInfo) this.f654j.j(), ls1.b(this.f648c), ((a10) this.f655k).j(), (String) this.f649d.j(), ((ml) this.f656l).c(), ((d60) this.f657m).a(), (b80) this.f650e.j(), ((Integer) this.f651f.j()).intValue());
    }

    public sj0 b() {
        Context contextA = ((d10) this.f652g).a();
        rr0 rr0Var = (rr0) this.f647b.j();
        oj0 oj0Var = (oj0) this.f648c.j();
        k60 k60Var = (k60) this.f649d.j();
        at0 at0Var = (at0) this.f650e.j();
        bt0 bt0Var = (bt0) this.f653h.j();
        t40 t40Var = (t40) this.f651f.j();
        gx gxVar = hx.f6279a;
        gr.G(gxVar);
        return new sj0(contextA, rr0Var, oj0Var, k60Var, at0Var, bt0Var, t40Var, gxVar, (ScheduledExecutorService) this.f656l.j(), (ei0) ((ls1) this.i).j(), (as0) ((ls1) this.f654j).j(), ((hj0) this.f657m).a(), (qd0) ((ls1) this.f655k).j());
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f646a) {
            case 0:
                n10 n10Var = (n10) ((ns1) this.f652g).f8433a;
                Context contextA = ((d10) this.f653h).a();
                xe xeVar = (xe) this.f647b.j();
                qq0 qq0Var = (qq0) this.f648c.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new l(n10Var, contextA, xeVar, qq0Var, gxVar, (ScheduledExecutorService) this.f649d.j(), (wd0) this.f650e.j(), (bt0) this.f651f.j(), ((j10) this.f656l).a(), ((ml) this.f657m).a(), (jq0) ((ls1) this.i).j(), (i0) ((ls1) this.f654j).j(), (c0) ((ls1) this.f655k).j());
            case 1:
                return a();
            default:
                return b();
        }
    }

    public m(ns1 ns1Var, d10 d10Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, ls1 ls1Var5, j10 j10Var, ml mlVar, ls1 ls1Var6, ls1 ls1Var7, ls1 ls1Var8) {
        this.f652g = ns1Var;
        this.f653h = d10Var;
        this.f647b = ls1Var;
        this.f648c = ls1Var2;
        this.f649d = ls1Var3;
        this.f650e = ls1Var4;
        this.f651f = ls1Var5;
        this.f656l = j10Var;
        this.f657m = mlVar;
        this.i = ls1Var6;
        this.f654j = ls1Var7;
        this.f655k = ls1Var8;
    }

    public m(qs1 qs1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4, qs1 qs1Var2, ls1 ls1Var5, qs1 qs1Var3, ls1 ls1Var6, ls1 ls1Var7, hj0 hj0Var, ls1 ls1Var8) {
        this.f652g = qs1Var;
        this.f647b = ls1Var;
        this.f648c = ls1Var2;
        this.f649d = ls1Var3;
        this.f650e = ls1Var4;
        this.f653h = qs1Var2;
        this.f651f = ls1Var5;
        this.f656l = qs1Var3;
        this.i = ls1Var6;
        this.f654j = ls1Var7;
        this.f657m = hj0Var;
        this.f655k = ls1Var8;
    }
}
