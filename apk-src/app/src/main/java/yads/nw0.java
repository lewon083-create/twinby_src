package yads;

import android.content.Context;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.g f41359b = ij.h.b(new mw0(this));

    public nw0(Context context) {
        this.f41358a = context;
    }

    public final Object a(String str, ow0 frame) {
        hk.l lVar = new hk.l(1, nj.f.b(frame));
        lVar.t();
        hr hrVar = new hr(str, new kw0(lVar), new lw0(lVar));
        hrVar.f42665j = false;
        UUID uuidRandomUUID = UUID.randomUUID();
        hrVar.f42672q = uuidRandomUUID;
        ((ep2) this.f41359b.getValue()).a(hrVar);
        lVar.v(new jw0(this, uuidRandomUUID));
        Object objS = lVar.s();
        if (objS == nj.a.f29512b) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS;
    }
}
