package af;

import ac.g;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.kv0;
import com.google.android.gms.internal.measurement.h5;
import io.sentry.SentryLogEvent;
import java.io.StringReader;
import java.util.ArrayList;
import k0.i;
import k3.f;
import me.p;
import vl.h;
import vl.k;
import wl.a0;
import wl.b0;
import wl.c0;
import wl.f0;
import wl.j0;
import wl.k0;
import wl.m0;
import xl.m;
import xl.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f921a;

    public a(c cVar) {
        this.f921a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public void processHTML(String str) {
        kv0 kv0Var;
        wl.b bVar = new wl.b();
        bVar.i = new k0();
        bVar.f35369j = new j0();
        bVar.f35380u = new String[]{null};
        StringReader stringReader = new StringReader(str);
        b0 b0Var = new b0(0, 0);
        bVar.f35363c = new h();
        bVar.f35368h = c0.f35382c;
        bVar.f35361a = new wl.a(stringReader, 32768);
        bVar.f35367g = b0Var;
        bVar.f35366f = null;
        bVar.f35362b = new m0(bVar.f35361a, b0Var);
        bVar.f35364d = new ArrayList(32);
        bVar.f35365e = "";
        bVar.f35370k = a0.f35333b;
        bVar.f35371l = null;
        bVar.f35372m = false;
        bVar.f35373n = null;
        bVar.f35374o = null;
        bVar.f35375p = new ArrayList();
        bVar.f35376q = new ArrayList();
        bVar.f35377r = new j0();
        bVar.f35378s = true;
        bVar.f35379t = false;
        do {
            m0 m0Var = bVar.f35362b;
            f0 f0Var = m0Var.f35471l;
            StringBuilder sb2 = m0Var.f35467g;
            while (!m0Var.f35465e) {
                m0Var.f35463c.d(m0Var, m0Var.f35461a);
            }
            if (sb2.length() > 0) {
                String string = sb2.toString();
                sb2.delete(0, sb2.length());
                m0Var.f35466f = null;
                f0Var.f35444d = string;
                kv0Var = f0Var;
            } else {
                String str2 = m0Var.f35466f;
                if (str2 != null) {
                    f0Var.f35444d = str2;
                    m0Var.f35466f = null;
                    kv0Var = f0Var;
                } else {
                    m0Var.f35465e = false;
                    kv0Var = m0Var.f35464d;
                }
            }
            bVar.x(kv0Var);
            kv0Var.m();
        } while (kv0Var.f7316c != 6);
        h hVar = bVar.f35363c;
        hVar.getClass();
        f.t(SentryLogEvent.JsonKeys.BODY);
        m mVarH = o.h(SentryLogEvent.JsonKeys.BODY);
        f.v(mVarH);
        b0 b0Var2 = new b0();
        rl.b.v(new u7.f(hVar, b0Var2, mVarH, 7), hVar);
        String strE = ((p) h5.x((b0Var2.isEmpty() ? null : (k) b0Var2.get(0)).z()).a().f28895b.get("PaRes")).e();
        c cVar = this.f921a;
        if (strE == null || strE.isEmpty()) {
            if (cVar.f926p0 != null) {
                cVar.j().runOnUiThread(new g(1, this, str));
            }
        } else if (cVar.f926p0 != null) {
            cVar.j().runOnUiThread(new i(3, this, strE, false));
        }
        cVar.Q(false, false);
    }
}
