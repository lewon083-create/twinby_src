package yads;

import android.content.Context;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf1 f37269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj f37270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final va3 f37271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x51 f37272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mi0 f37273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dg0 f37274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y42 f37275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uy2 f37276h;
    public final wj1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ic f37277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final bf f37278k;

    public /* synthetic */ c42(Context context, ct1 ct1Var) {
        lf1 lf1Var = new lf1(context, ct1Var);
        this(lf1Var, new lj(context, ct1Var, lf1Var, 8), new va3(), new x51(), new mi0(ct1Var), new dg0(), new y42(), new uy2(), new wj1(), new ic(ct1Var), new bf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sy2 a(JSONObject jSONObject) throws JSONException, b12 {
        Object objS;
        Object objS2;
        Object objS3;
        if (!d42.a(jSONObject, "delay", "url")) {
            throw new b12("Native Ad json has not required attributes");
        }
        long j10 = jSONObject.getLong("delay");
        this.f37271c.getClass();
        String strA = va3.a("url", jSONObject);
        try {
            ij.k kVar = ij.m.f21341c;
            objS = Double.valueOf(jSONObject.optInt("visibilityPercent", 0));
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        Double d10 = (Double) objS;
        double d11 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double dDoubleValue = d10 != null ? d10.doubleValue() : 0.0d;
        if (dDoubleValue >= ConfigValue.DOUBLE_DEFAULT_VALUE) {
            d11 = 100.0d;
            if (dDoubleValue <= 100.0d) {
                d11 = dDoubleValue;
            }
        }
        int i = (int) d11;
        try {
            objS2 = jSONObject.getString("type");
        } catch (Throwable th3) {
            ij.k kVar3 = ij.m.f21341c;
            objS2 = com.google.android.gms.internal.measurement.h5.s(th3);
        }
        if (objS2 instanceof ij.l) {
            objS2 = null;
        }
        String str = (String) objS2;
        if (str != null) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                objS3 = ty2.valueOf(upperCase);
            } catch (Throwable th4) {
                ij.k kVar4 = ij.m.f21341c;
                objS3 = com.google.android.gms.internal.measurement.h5.s(th4);
            }
            obj = (ty2) (objS3 instanceof ij.l ? null : objS3);
        }
        if (obj == null) {
            this.f37276h.getClass();
            obj = StringsKt.y(strA, "/rtbcount/", false) ? ty2.f43490c : StringsKt.y(strA, "/count/", false) ? ty2.f43489b : ty2.f43491d;
        }
        return new sy2(i, j10, obj, strA);
    }

    public c42(lf1 lf1Var, lj ljVar, va3 va3Var, x51 x51Var, mi0 mi0Var, dg0 dg0Var, y42 y42Var, uy2 uy2Var, wj1 wj1Var, ic icVar, bf bfVar) {
        this.f37269a = lf1Var;
        this.f37270b = ljVar;
        this.f37271c = va3Var;
        this.f37272d = x51Var;
        this.f37273e = mi0Var;
        this.f37274f = dg0Var;
        this.f37275g = y42Var;
        this.f37276h = uy2Var;
        this.i = wj1Var;
        this.f37277j = icVar;
        this.f37278k = bfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:396:0x00c5, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.b0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.f12 a(java.lang.String r50, yads.kn r51) throws org.json.JSONException, yads.b12 {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c42.a(java.lang.String, yads.kn):yads.f12");
    }
}
