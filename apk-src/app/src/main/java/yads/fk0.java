package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak0 f38467a;

    public fk0(Context context) {
        this.f38467a = new ak0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        zj0 hqVar;
        u41 u41VarA = v41.a(bArr);
        ak0 ak0Var = this.f38467a;
        ak0Var.getClass();
        int iOrdinal = u41VarA.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            hqVar = new hq();
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new ij.j();
            }
            hqVar = new hq();
        } else {
            hqVar = new pz0();
        }
        return hqVar.a(bArr, ak0Var.f36758a.getApplicationContext());
    }
}
