package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ve f44663a;

    public static final dg a(Context context) {
        ve veVar;
        ve veVar2 = f44663a;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.f44005c) {
            Context contextA = uz.a(context);
            veVar = f44663a;
            if (veVar == null) {
                veVar = new ve(new te(contextA), pg1.a().a());
                f44663a = veVar;
            }
        }
        return veVar;
    }
}
