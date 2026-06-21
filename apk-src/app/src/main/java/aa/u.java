package aa;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.z80;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements z80 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f711d;

    public u(o oVar, int i, String str) {
        this.f709b = oVar;
        this.f710c = i;
        this.f711d = str;
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void a(t tVar) {
        if (tVar == null || this.f710c != 2 || TextUtils.isEmpty(this.f711d)) {
            return;
        }
        k0.i iVar = new k0.i(1, this, tVar);
        t9.d0 d0Var = t9.g0.f33596l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            iVar.run();
        } else {
            hx.f6279a.execute(iVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.z80
    public final void D(String str) {
    }
}
