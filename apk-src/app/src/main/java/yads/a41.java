package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a41 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk.q f36626a;

    public a41(jk.q qVar) {
        this.f36626a = qVar;
    }

    @Override // yads.f51
    public final void a(String str, Bitmap bitmap) {
        ((jk.p) this.f36626a).i(new r31(str, bitmap));
    }

    @Override // yads.f51
    public final void a(Map map) {
        jk.p pVar = (jk.p) this.f36626a;
        pVar.getClass();
        pVar.f26721e.g(null, false);
    }
}
