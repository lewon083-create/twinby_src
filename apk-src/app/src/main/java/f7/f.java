package f7;

import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r implements Function0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f16681f = new f(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent component;
        try {
            ClassLoader loader = h.class.getClassLoader();
            e eVar = loader != null ? new e(loader, new a7.l(loader)) : null;
            if (eVar == null || (component = eVar.a()) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(loader, "loader");
            a7.l adapter = new a7.l(loader);
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            int iA = c7.e.a();
            return iA >= 2 ? new h7.d(component) : iA == 1 ? new h7.c(component, adapter) : new h7.a();
        } catch (Throwable unused) {
            g gVar = g.f16682a;
            return null;
        }
    }
}
