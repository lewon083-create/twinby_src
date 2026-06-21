package yads;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class fa2 {
    public static pd3 a(jd3 jd3Var) {
        ce1 ce1Var = jd3Var.f39839b;
        if (ce1Var == null || !Intrinsics.a(ce1Var.f37349b, "omid")) {
            throw new ld3(jd3Var, kd3.f40167c);
        }
        try {
            URL url = new URL(ce1Var.f37350c);
            String str = jd3Var.f39838a;
            String str2 = jd3Var.f39840c;
            if (str2 == null || str2.length() == 0) {
                return new pd3(null, url, null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("VendorKey is null or empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("VerificationParameters is null or empty");
            }
            return new pd3(str, url, str2);
        } catch (MalformedURLException unused) {
            throw new ld3(jd3Var, kd3.f40168d);
        }
    }
}
