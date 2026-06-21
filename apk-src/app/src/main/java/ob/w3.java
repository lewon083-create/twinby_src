package ob;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends q3 {
    public static final boolean F(String str) {
        String str2 = (String) d0.f30042t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(StringUtils.COMMA)) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.v3 D(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.w3.D(java.lang.String):ob.v3");
    }

    public final String E(String str) {
        e1 e1Var = this.f30373c.f30605b;
        z3.T(e1Var);
        String strP = e1Var.P(str);
        if (TextUtils.isEmpty(strP)) {
            return (String) d0.f30038r.a(null);
        }
        Uri uri = Uri.parse((String) d0.f30038r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strP).length() + 1 + String.valueOf(authority).length());
        sb2.append(strP);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
