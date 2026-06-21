package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ed extends jb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gd f38070l;

    public ed(@NotNull Context context) {
        this(context, new li1());
    }

    @Override // yads.jb2, yads.n11
    public final void a(Context context, String str) {
        this.f38070l.a(str);
    }

    public final void setAdtuneWebViewListener(@NotNull hd hdVar) {
        this.f38070l.f38707c = hdVar;
    }

    public /* synthetic */ ed(Context context, li1 li1Var) {
        this(context, li1Var, new gd(new ra2(context)));
    }

    public ed(Context context, li1 li1Var, gd gdVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f38070l = gdVar;
        if (li1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(gdVar);
    }

    @Override // yads.jb2
    public final void e() {
    }
}
