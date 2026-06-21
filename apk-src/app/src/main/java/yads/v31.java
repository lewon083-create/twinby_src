package yads;

import android.graphics.Bitmap;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v31 implements l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x31 f43868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t31 f43870c;

    public v31(x31 x31Var, String str, t31 t31Var) {
        this.f43868a = x31Var;
        this.f43869b = str;
        this.f43870c = t31Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
    }

    @Override // yads.l41
    public final void a(k41 k41Var, boolean z5) {
        Bitmap bitmap = k41Var.f40062a;
        if (bitmap != null) {
            x31 x31Var = this.f43868a;
            String str = this.f43869b;
            t31 t31Var = this.f43870c;
            oi2 oi2Var = x31Var.f44591b;
            oi2Var.f41547b.putAll(kotlin.collections.i0.c(new Pair(str, bitmap)));
            ((zl.s) t31Var).b(bitmap);
        }
    }
}
