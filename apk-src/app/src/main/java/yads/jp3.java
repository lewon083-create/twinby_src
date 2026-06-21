package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jp3 implements vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp3 f39928a;

    public jp3(kp3 kp3Var) {
        this.f39928a = kp3Var;
    }

    public final void a() {
        kp3 kp3Var = this.f39928a;
        vo2 vo2Var = kp3Var.f40306c;
        if (kp3Var.f40307d != 0 || vo2Var == null) {
            return;
        }
        vo2Var.onSuccess(kp3Var.f40305b);
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        r0.f40307d--;
        this.f39928a.f40305b.addAll((List) obj);
        a();
    }

    @Override // yads.vo2
    public final void a(ee3 ee3Var) {
        kp3 kp3Var = this.f39928a;
        kp3Var.f40307d--;
        a();
    }
}
