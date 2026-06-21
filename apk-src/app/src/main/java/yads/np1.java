package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class np1 implements go1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oo1 f41340a;

    public np1(oo1 oo1Var) {
        this.f41340a = oo1Var;
    }

    @Override // yads.go1
    public final eo1 a(Context context) {
        return this.f41340a.a(context, MediatedNativeAdapter.class);
    }
}
