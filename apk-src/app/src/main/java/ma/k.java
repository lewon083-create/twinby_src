package ma;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.internal.ads.la;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements la {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f28782d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f28784c;

    public k(Context context, int i) {
        switch (i) {
            case 1:
                this.f28783b = context;
                break;
            default:
                this.f28783b = context.getApplicationContext();
                break;
        }
    }

    public static k b(Context context) {
        c0.i(context);
        synchronized (k.class) {
            if (f28782d == null) {
                n nVar = s.f28801a;
                synchronized (s.class) {
                    if (s.f28805e == null) {
                        s.f28805e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f28782d = new k(context, 0);
            }
        }
        return f28782d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.k.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static o e(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < oVarArr.length; i++) {
                if (oVarArr[i].equals(pVar)) {
                    return oVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    @Override // com.google.android.gms.internal.ads.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.oa a(com.google.android.gms.internal.ads.qa r15) throws com.google.android.gms.internal.ads.ua {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.k.a(com.google.android.gms.internal.ads.qa):com.google.android.gms.internal.ads.oa");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r18) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.k.c(int):boolean");
    }
}
