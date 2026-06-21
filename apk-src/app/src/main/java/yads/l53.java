package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f40426b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f40427a;

    public l53(Handler handler) {
        this.f40427a = handler;
    }

    public final k53 a(int i, Object obj) {
        k53 k53VarA = a();
        k53VarA.f40078a = this.f40427a.obtainMessage(i, obj);
        return k53VarA;
    }

    public static k53 a() {
        k53 k53Var;
        ArrayList arrayList = f40426b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    k53Var = new k53();
                } else {
                    k53Var = (k53) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k53Var;
    }
}
