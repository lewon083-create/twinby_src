package a7;

import a0.b1;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f504a;

    static {
        t gVar;
        try {
            gVar = new b1(1, (WebViewProviderFactoryBoundaryInterface) rl.b.c(WebViewProviderFactoryBoundaryInterface.class, hl.d.l()));
        } catch (ClassNotFoundException unused) {
            gVar = new g();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f504a = gVar;
    }
}
