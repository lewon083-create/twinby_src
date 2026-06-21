package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w22 implements y02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y02 f44261b;

    public w22(ArrayList arrayList) {
        this.f44260a = arrayList;
        this.f44261b = arrayList.isEmpty() ? null : (y02) arrayList.get(0);
    }

    @Override // yads.y02
    public final void a(t12 t12Var) {
        y02 y02Var = this.f44261b;
        if (y02Var != null) {
            y02Var.a(t12Var);
        }
    }

    @Override // yads.y02
    public final y00 getAdAssets() {
        y00 adAssets;
        y02 y02Var = this.f44261b;
        return (y02Var == null || (adAssets = y02Var.getAdAssets()) == null) ? new y00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : adAssets;
    }

    @Override // yads.y02
    public final void loadImages() {
        y02 y02Var = this.f44261b;
        if (y02Var != null) {
            y02Var.loadImages();
        }
    }

    @Override // yads.y02
    public final void a(z00 z00Var) {
        y02 y02Var = this.f44261b;
        if (y02Var != null) {
            y02Var.a(z00Var);
        }
    }
}
