package aa;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ms1;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10 f724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ls1 f727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ls1 f728e;

    public z(d10 d10Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, ls1 ls1Var4) {
        this.f724a = d10Var;
        this.f725b = ls1Var;
        this.f726c = ls1Var2;
        this.f727d = ls1Var3;
        this.f728e = ls1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final /* bridge */ /* synthetic */ Object j() {
        return new o(this.f724a.a(), ((Long) this.f725b.j()).longValue(), (PackageInfo) this.f726c.j(), (a0) this.f727d.j(), (ScheduledExecutorService) this.f728e.j());
    }
}
