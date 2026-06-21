package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t02 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u02 f43146a;

    public t02(u02 u02Var) {
        this.f43146a = u02Var;
    }

    @Override // yads.f51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.f51
    public final void a(Map map) {
        this.f43146a.f43509b.f41547b.putAll(map);
        this.f43146a.f43510c.a();
        Iterator it = this.f43146a.f43514g.iterator();
        if (it.hasNext()) {
            throw com.google.android.gms.internal.ads.om1.i(it);
        }
    }
}
