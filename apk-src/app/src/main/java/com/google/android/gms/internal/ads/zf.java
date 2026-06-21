package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.SentryBaseEvent;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zf extends ig {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ox0 f12986l = new ox0(7);
    public final fd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f12987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oq0 f12988k;

    public zf(qf qfVar, jd jdVar, int i, Context context, fd fdVar, oq0 oq0Var) {
        super(qfVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", jdVar, i, 27);
        this.f12987j = context;
        this.i = fdVar;
        this.f12988k = oq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00eb, B:65:0x00f1, B:21:0x0041, B:23:0x0047, B:63:0x00e8, B:24:0x004d, B:26:0x0075, B:28:0x007b, B:30:0x0081, B:33:0x0089, B:39:0x0095, B:41:0x009b, B:45:0x00a6, B:47:0x00ad, B:46:0x00ab, B:48:0x00b0, B:50:0x00b6, B:52:0x00bc, B:42:0x00a0, B:55:0x00c3, B:57:0x00d8, B:61:0x00e1), top: B:83:0x000d }] */
    @Override // com.google.android.gms.internal.ads.ig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zf.a():void");
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            wk wkVar = al.Z2;
            q9.s sVar = q9.s.f31967e;
            byte[] bArrA = sf.a((String) sVar.f31970c.a(wkVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals(SentryBaseEvent.JsonKeys.USER)) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(sf.a((String) sVar.f31970c.a(al.f2919a3)))));
            }
            Context context = this.f12987j;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f6481b.f9476b;
            return rs.e(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final he c() {
        String str;
        c91 c91Var;
        wk wkVar = al.f3074k3;
        q9.s sVar = q9.s.f31967e;
        int iIntValue = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? ((Integer) sVar.f31970c.a(al.f3163q3)).intValue() : this.i.A();
        he heVar = new he((String) this.f6485f.invoke(null, this.f12987j, Boolean.FALSE, ""));
        oq0 oq0Var = this.f12988k;
        if (oq0Var == null || (c91Var = (c91) oq0Var.f8762c) == null) {
            str = "E";
        } else {
            try {
                str = (String) c91Var.get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        heVar.H = str;
        return heVar;
    }
}
