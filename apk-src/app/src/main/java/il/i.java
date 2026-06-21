package il;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f21381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f21382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f21383c;

    public /* synthetic */ i(Method method, Method method2, Method method3) {
        this.f21381a = method;
        this.f21382b = method2;
        this.f21383c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
