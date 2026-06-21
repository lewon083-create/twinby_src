package n;

import hl.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f28958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.yandex.div.core.dagger.b f28959c = new com.yandex.div.core.dagger.b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28960a = new b();

    public static a B() {
        if (f28958b != null) {
            return f28958b;
        }
        synchronized (a.class) {
            try {
                if (f28958b == null) {
                    f28958b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28958b;
    }
}
