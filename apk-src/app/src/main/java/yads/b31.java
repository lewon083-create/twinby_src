package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km0 f36909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5 f36910b;

    public b31(km0 km0Var, a5 a5Var) {
        this.f36909a = km0Var;
        this.f36910b = a5Var;
    }

    public final void a(Context context, a31 a31Var) {
        String strA;
        tg tgVar = a31Var.f36622a;
        String str = a31Var.f36623b;
        f31 f31Var = a31Var.f36624c;
        a5 a5Var = this.f36910b;
        a5Var.getClass();
        int iOrdinal = f31Var.ordinal();
        if (iOrdinal == 0) {
            strA = a5Var.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new ij.j();
            }
            strA = tgVar.f43316a;
            if (strA == null) {
                strA = a5Var.a(context);
            }
        }
        km0 km0Var = this.f36909a;
        km0Var.f40249e = strA;
        km0Var.f40245a = tgVar.f43317b;
        String str2 = tgVar.f43318c;
        synchronized (km0.f40244h) {
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        km0Var.f40251g = str2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f27471a;
        }
        this.f36909a.f40248d = str;
    }
}
