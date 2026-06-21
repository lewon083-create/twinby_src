package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f39897a;

    public jk3(hk3 hk3Var) {
        this.f39897a = hk3Var;
    }

    public final boolean a() {
        View view = this.f39897a.getView();
        return (view == null || nl3.b(view) || nl3.a(view) < 50) ? false : true;
    }
}
