package yads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92 f39466a;

    public /* synthetic */ i92() {
        this(new f92());
    }

    public final vw1 a(Context context, d4 d4Var, nu2 nu2Var, e61 e61Var, p32 p32Var, String str, va vaVar) {
        e92 nz2Var;
        f92 f92Var = this.f39466a;
        f92Var.getClass();
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0) {
            h61 h61Var = f92Var.f38405a;
            va vaVar2 = va.f43973d;
            h61Var.getClass();
            g61 g61VarA = h61.a(vaVar2);
            h61 h61Var2 = f92Var.f38405a;
            va vaVar3 = va.f43972c;
            h61Var2.getClass();
            nz2Var = new nz2(new h83(e61Var, g61VarA), new h83(e61Var, h61.a(vaVar3)));
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new ij.j();
            }
            f92Var.f38405a.getClass();
            nz2Var = new h83(e61Var, h61.a(vaVar));
        }
        return new vw1(context, nz2Var, p32Var, str, vaVar, new za(context, nu2Var, d4Var), fw2.a(), new n73(nz2Var, Looper.getMainLooper()), new g83());
    }

    public i92(f92 f92Var) {
        this.f39466a = f92Var;
    }
}
