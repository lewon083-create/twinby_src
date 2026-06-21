package wa;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f35216b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ti.b f35217a;

    static {
        b bVar = new b();
        bVar.f35217a = null;
        f35216b = bVar;
    }

    public static ti.b a(Context context) {
        ti.b bVar;
        b bVar2 = f35216b;
        synchronized (bVar2) {
            try {
                if (bVar2.f35217a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f35217a = new ti.b(context);
                }
                bVar = bVar2.f35217a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
