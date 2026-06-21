package t9;

import android.content.Context;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.n90;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.ut;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static sa f33652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f33653b = new Object();

    public u(Context context) {
        sa saVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f33653b) {
            try {
                if (f33652a == null) {
                    al.a(context);
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3015g5)).booleanValue()) {
                        saVar = m.w(context);
                    } else {
                        saVar = new sa(new cb(new n90(context.getApplicationContext(), 3)), new ut(new c6(20)));
                        saVar.a();
                    }
                    f33652a = saVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s a(int i, String str, HashMap map, byte[] bArr) {
        s sVar = new s();
        r3.b bVar = new r3.b(this, str, sVar);
        u9.f fVar = new u9.f();
        r rVar = new r(this, i, str, sVar, bVar, bArr, map, fVar);
        if (u9.f.c()) {
            try {
                Map mapE = rVar.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (u9.f.c()) {
                    fVar.e("onNetworkRequest", new com.google.firebase.messaging.y(str, "GET", mapE, bArr2));
                }
            } catch (fa e3) {
                u9.i.h(e3.getMessage());
            }
        }
        f33652a.b(rVar);
        return sVar;
    }
}
