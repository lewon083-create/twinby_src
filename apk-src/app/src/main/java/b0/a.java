package b0;

import a0.i0;
import a0.u1;
import androidx.lifecycle.q0;
import d0.b;
import d0.c;
import d0.d;
import d0.e;
import d0.f;
import g0.d0;
import ij.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
        i0 HLG_10_BIT = i0.f113e;
        Intrinsics.checkNotNullExpressionValue(HLG_10_BIT, "HLG_10_BIT");
        new d0.a();
        new c();
        e eVar = e.f15498b;
        new f();
        new d();
    }

    public a() {
        h.b(new q0(1, this));
    }

    public abstract b a();

    public boolean b(u1 sessionConfig, d0 cameraInfoInternal) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return true;
    }
}
