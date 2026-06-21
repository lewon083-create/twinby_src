package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f22587a = C0071c4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0646z0 f22588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Qe f22589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Te f22590d;

    public L0() {
        C0646z0 c0646z0 = new C0646z0();
        this.f22588b = c0646z0;
        this.f22589c = new Qe(c0646z0);
        this.f22590d = new Te();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Qe qe2 = this.f22589c;
        qe2.f22884a.a(null);
        qe2.f22885b.a(pluginErrorDetails);
        Te te2 = this.f22590d;
        Intrinsics.b(pluginErrorDetails);
        te2.getClass();
        this.f22587a.execute(new cp(0, this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Qe qe2 = this.f22589c;
        qe2.f22884a.a(null);
        qe2.f22885b.a(pluginErrorDetails);
        if (qe2.f22887d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f24595a) {
            Te te2 = this.f22590d;
            Intrinsics.b(pluginErrorDetails);
            te2.getClass();
            this.f22587a.execute(new a1.c(this, pluginErrorDetails, str, 18));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qe qe2 = this.f22589c;
        qe2.f22884a.a(null);
        qe2.f22886c.a(str);
        Te te2 = this.f22590d;
        Intrinsics.b(str);
        te2.getClass();
        this.f22587a.execute(new a0.i1(this, str, str2, pluginErrorDetails, 7));
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        l02.f22588b.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        Intrinsics.b(c0621y0);
        C0284kc c0284kcI = c0621y0.f().i();
        Intrinsics.b(c0284kcI);
        c0284kcI.f24229a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l02.f22588b.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        Intrinsics.b(c0621y0);
        C0284kc c0284kcI = c0621y0.f().i();
        Intrinsics.b(c0284kcI);
        c0284kcI.f24229a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails) {
        l02.f22588b.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        Intrinsics.b(c0621y0);
        C0284kc c0284kcI = c0621y0.f().i();
        Intrinsics.b(c0284kcI);
        c0284kcI.f24229a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
