package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile q f1464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f1465b;

    static {
        q qVar = new q();
        Map map = Collections.EMPTY_MAP;
        f1465b = qVar;
    }

    public static q a() {
        q qVar;
        z0 z0Var = z0.f1519c;
        q qVar2 = f1464a;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (q.class) {
            try {
                qVar = f1464a;
                if (qVar == null) {
                    Class cls = p.f1456a;
                    q qVar3 = null;
                    if (cls != null) {
                        try {
                            qVar3 = (q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qVar = qVar3 != null ? qVar3 : f1465b;
                    f1464a = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
