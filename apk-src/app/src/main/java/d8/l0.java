package d8;

import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.v4;
import com.google.android.gms.internal.play_billing.w4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15647a = 0;

    static {
        int i = m0.J1;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + StringUtils.PROCESS_POSTFIX_DELIMITER + message;
            int i = o1.f14257a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static s4 b(int i, int i10, j jVar) {
        try {
            r4 r4VarR = s4.r();
            v4 v4VarR = w4.r();
            v4VarR.e(jVar.f15636a);
            String str = jVar.f15637b;
            v4VarR.d();
            w4.o((w4) v4VarR.f14184c, str);
            v4VarR.f(i);
            r4VarR.e(v4VarR);
            r4VarR.f(i10);
            return (s4) r4VarR.b();
        } catch (Exception e3) {
            o1.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }

    public static s4 c(int i, int i10, j jVar, String str) {
        try {
            v4 v4VarR = w4.r();
            v4VarR.e(jVar.f15636a);
            String str2 = jVar.f15637b;
            v4VarR.d();
            w4.o((w4) v4VarR.f14184c, str2);
            v4VarR.f(i);
            if (str != null) {
                v4VarR.d();
                w4.n((w4) v4VarR.f14184c, str);
            }
            r4 r4VarR = s4.r();
            r4VarR.e(v4VarR);
            r4VarR.f(i10);
            return (s4) r4VarR.b();
        } catch (Throwable th2) {
            o1.h("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static u4 d(int i) {
        try {
            t4 t4VarQ = u4.q();
            t4VarQ.d();
            u4.p((u4) t4VarQ.f14184c, i);
            return (u4) t4VarQ.b();
        } catch (Exception e3) {
            o1.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }
}
