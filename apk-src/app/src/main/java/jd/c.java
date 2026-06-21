package jd;

import a0.b1;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.w0;
import java.util.concurrent.ConcurrentHashMap;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile c f26618b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f26619a;

    public c(b1 b1Var) {
        c0.i(b1Var);
        this.f26619a = b1Var;
        new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!kd.a.f27375b.contains(str) && kd.a.a(bundle, str2) && kd.a.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            m1 m1Var = (m1) this.f26619a.f45c;
            m1Var.c(new w0(m1Var, str, str2, bundle, true));
        }
    }
}
