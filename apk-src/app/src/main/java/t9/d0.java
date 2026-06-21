package t9;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.km;
import com.google.android.gms.internal.ads.kw0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kw0 {
    @Override // com.google.android.gms.internal.ads.kw0
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th2) {
            p9.k kVar = p9.k.C;
            g0 g0Var = kVar.f31297c;
            Context context = kVar.f31302h.f3944e;
            if (context != null) {
                try {
                    if (((Boolean) km.f7258b.r()).booleanValue()) {
                        ua.b.a(context, th2);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th2;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e3) {
            p9.k.C.f31302h.d("AdMobHandler.handleMessage", e3);
        }
    }
}
