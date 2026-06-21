package yads;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aw implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv f36869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz1 f36870b;

    public aw(lv lvVar, wz1 wz1Var) {
        this.f36869a = lvVar;
        this.f36870b = wz1Var;
    }

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        this.f36870b.f44534a.a();
        lv lvVar = this.f36869a;
        eo2 eo2Var = eo2.f38211u;
        lvVar.getClass();
        lvVar.f40692d.a(lvVar.a(eo2Var, new HashMap()));
        return new p01(false, null);
    }
}
