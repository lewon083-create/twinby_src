package ti;

import com.google.android.gms.ads.MobileAds;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi.g f33900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33901b = false;

    public u0(hi.g gVar) {
        this.f33900a = gVar;
    }

    public final void a(o9.b bVar) {
        if (this.f33901b) {
            return;
        }
        try {
            Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, "Flutter-GMA-7.0.0");
        } catch (Exception unused) {
        }
        this.f33900a.success(new g0(bVar));
        this.f33901b = true;
    }
}
