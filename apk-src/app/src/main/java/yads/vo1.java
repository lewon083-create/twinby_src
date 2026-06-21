package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.initialize.MediatedAdapterInitializer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up1 f44104a;

    public vo1(up1 up1Var) {
        this.f44104a = up1Var;
    }

    public final MediatedAdapterInitializer a(Context context, sq1 sq1Var, nu2 nu2Var) {
        e00 e00VarA = this.f44104a.a(sq1Var);
        if (e00VarA == null) {
            return null;
        }
        new to1(new zo1(new d4(e00VarA), nu2Var, null)).a(context, sq1Var, com.monetization.ads.mediation.base.a.class);
        return null;
    }
}
