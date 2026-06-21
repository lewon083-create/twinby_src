package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iu0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu0 f39644a;

    public iu0(qu0 qu0Var) {
        this.f39644a = qu0Var;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        Context context = view.getContext();
        this.f39644a.a(context, (hu0) m0Var);
        return new p01(false, null);
    }
}
