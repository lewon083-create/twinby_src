package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg f41925a = new pg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fh f41926b;

    public static final fh a(Context context) {
        fh fhVar;
        fh fhVar2 = f41926b;
        if (fhVar2 != null) {
            return fhVar2;
        }
        synchronized (f41925a) {
            Context contextA = uz.a(context);
            fhVar = f41926b;
            if (fhVar == null) {
                fhVar = new fh(new zg(contextA));
                f41926b = fhVar;
            }
        }
        return fhVar;
    }
}
