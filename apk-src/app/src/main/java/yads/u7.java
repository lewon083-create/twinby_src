package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u7 {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yads.f8 a(org.json.JSONObject r19) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.u7.a(org.json.JSONObject):yads.f8");
    }

    public static String a(f8 f8Var) {
        vk.l qVar;
        if (f8Var == null) {
            return null;
        }
        vk.x xVar = new vk.x();
        hl.d.t(xVar, "isEnabled", Boolean.valueOf(f8Var.f38391a));
        hl.d.t(xVar, "isInDebug", Boolean.valueOf(f8Var.f38392b));
        String str = f8Var.f38393c;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter("apiKey", "key");
        uk.a0 a0Var = vk.m.f34887a;
        if (str == null) {
            qVar = vk.t.INSTANCE;
        } else {
            qVar = new vk.q(str, true);
        }
        xVar.a("apiKey", qVar);
        hl.d.u(xVar, "validationTimeoutInSec", Long.valueOf(f8Var.f38394d));
        hl.d.u(xVar, "usagePercent", Integer.valueOf(f8Var.f38395e));
        hl.d.t(xVar, "willBlockAdOnInternalError", Boolean.valueOf(f8Var.f38396f));
        r7 builderAction = new r7(f8Var);
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter("enabledAdUnits", "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        vk.f fVar = new vk.f();
        builderAction.invoke(fVar);
        xVar.a("enabledAdUnits", new vk.e(fVar.f34879a));
        hl.d.v(xVar, "adNetworksCustomParameters", new t7(f8Var));
        return new vk.w(xVar.f34898a).toString();
    }

    public static f8 a(String str) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = a(new JSONObject(str));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (f8) objS;
    }
}
