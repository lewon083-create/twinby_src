package yads;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ah1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yg1 f36715a = new yg1();

    public final String a(Context context) {
        Object objS;
        try {
            ij.k kVar = ij.m.f21341c;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService("locale");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = io.flutter.plugin.platform.b.c(systemService).getApplicationLocales();
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    this.f36715a.getClass();
                    objS = yg1.a(locale);
                } else {
                    yg1 yg1Var = this.f36715a;
                    Locale locale2 = applicationLocales.get(0);
                    yg1Var.getClass();
                    objS = yg1.a(locale2);
                }
            } else {
                Locale locale3 = context.getResources().getConfiguration().locale;
                this.f36715a.getClass();
                objS = yg1.a(locale3);
            }
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        if (objS instanceof ij.l) {
            objS = null;
        }
        return (String) objS;
    }

    public final List b(Context context) {
        try {
            ij.k kVar = ij.m.f21341c;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            jj.e eVarB = kotlin.collections.r.b();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                yg1 yg1Var = this.f36715a;
                Locale locale = locales.get(i);
                yg1Var.getClass();
                eVarB.add(yg1.a(locale));
            }
            return kotlin.collections.r.a(eVarB);
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            com.google.android.gms.internal.measurement.h5.s(th2);
            return null;
        }
    }
}
