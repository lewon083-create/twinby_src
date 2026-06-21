package yads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kd extends jb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final od f40166l;

    public kd(@NotNull Context context) {
        this(context, new li1());
    }

    @Override // yads.jb2, yads.n11
    public final void a(Context context, String str) {
        this.f40166l.a(str);
    }

    public final void setAdtuneWebViewListener(@NotNull pd pdVar) {
        this.f40166l.f41511c = pdVar;
    }

    public final void setOptOutUrl(@Nullable String str) {
        this.f40166l.f41512d = str;
    }

    public /* synthetic */ kd(Context context, li1 li1Var) {
        this(context, li1Var, new od(new dd(context)));
    }

    public kd(Context context, li1 li1Var, od odVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.f40166l = odVar;
        if (li1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(odVar);
    }

    @Override // yads.jb2
    public final void e() {
    }
}
