package a0;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f170c;

    public /* synthetic */ n1(r1 r1Var, r1 r1Var2, int i) {
        this.f169b = i;
        this.f170c = r1Var2;
    }

    @Override // a0.n0
    public final void a(o0 o0Var) throws Exception {
        int i = this.f169b;
        r1 r1Var = this.f170c;
        switch (i) {
            case 0:
                int i10 = ImageProcessingUtil.f1253a;
                if (r1Var != null) {
                    r1Var.close();
                }
                break;
            default:
                int i11 = ImageProcessingUtil.f1253a;
                r1Var.close();
                break;
        }
    }
}
