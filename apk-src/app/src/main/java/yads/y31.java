package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y31 implements l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z31 f44902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f44903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w41 f44904c;

    public y31(z31 z31Var, Map map, w41 w41Var) {
        this.f44902a = z31Var;
        this.f44903b = map;
        this.f44904c = w41Var;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
        this.f44902a.a(this.f44903b);
    }

    @Override // yads.l41
    public final void a(k41 k41Var, boolean z5) {
        String str = this.f44904c.f44275c;
        Bitmap bitmap = k41Var.f40062a;
        if (bitmap != null) {
            if (str != null) {
                this.f44903b.put(str, bitmap);
                this.f44902a.f45241c.a(str, bitmap);
            }
            this.f44902a.a(this.f44903b);
        }
    }
}
