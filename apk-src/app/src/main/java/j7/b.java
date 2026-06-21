package j7;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import g2.x1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f26575a = new b();

    public final x1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        x1 x1VarG = x1.g(null, windowInsets);
        Intrinsics.checkNotNullExpressionValue(x1VarG, "toWindowInsetsCompat(platformInsets)");
        return x1VarG;
    }
}
