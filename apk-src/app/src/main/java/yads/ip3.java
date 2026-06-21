package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ip3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f39609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nu2 f39610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc3 f39611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ig3 f39612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f39613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39614f;

    public ip3(Context context, d4 d4Var, nu2 nu2Var, uc3 uc3Var, ig3 ig3Var) {
        this.f39609a = d4Var;
        this.f39610b = nu2Var;
        this.f39611c = uc3Var;
        this.f39612d = ig3Var;
        this.f39613e = context.getApplicationContext();
    }

    public final void a(Context context, List list, vo2 vo2Var, Object obj) {
        int i = this.f39614f + 1;
        this.f39614f = i;
        if (i > 5) {
            vo2Var.a(new ee3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new kp3(new fp3(this.f39613e, this.f39609a, this.f39610b, this.f39611c, this.f39612d)).a(context, list, vo2Var, obj);
    }
}
