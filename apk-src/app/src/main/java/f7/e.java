package f7;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f16678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7.l f16679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v7.f f16680c;

    public e(ClassLoader loader, a7.l consumerAdapter) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f16678a = loader;
        this.f16679b = consumerAdapter;
        this.f16680c = new v7.f(loader);
    }

    public final WindowLayoutComponent a() {
        v7.f fVar = this.f16680c;
        fVar.getClass();
        b7.a classLoader = new b7.a(fVar, 0);
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        boolean zB = false;
        try {
            classLoader.invoke();
            if (com.google.android.gms.internal.auth.g.N("WindowExtensionsProvider#getWindowExtensions is not valid", new b7.a(fVar, 1)) && com.google.android.gms.internal.auth.g.N("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && com.google.android.gms.internal.auth.g.N("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = c7.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (com.google.android.gms.internal.auth.g.N("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return com.google.android.gms.internal.auth.g.N("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
