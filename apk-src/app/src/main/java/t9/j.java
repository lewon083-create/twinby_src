package t9;

import android.content.Context;
import q9.n1;
import q9.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f33620c;

    public j(l lVar, Context context) {
        this.f33619b = context;
        this.f33620c = lVar;
    }

    @Override // q9.o1
    public final void j0(x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.f33620c.i(this.f33619b, x1Var.f31977c, true, true);
    }
}
