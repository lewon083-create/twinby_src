package m7;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.b30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28708a = n.i("Schedulers");

    public static void a(b30 b30Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.google.android.gms.internal.consent_sdk.c cVarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListB = cVarN.b(b30Var.f3573g);
            ArrayList arrayListA = cVarN.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    cVarN.k(jCurrentTimeMillis, ((u7.j) it.next()).f34330a);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListB.size() > 0) {
                u7.j[] jVarArr = (u7.j[]) arrayListB.toArray(new u7.j[arrayListB.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    d dVar = (d) it2.next();
                    if (dVar.b()) {
                        dVar.a(jVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                u7.j[] jVarArr2 = (u7.j[]) arrayListA.toArray(new u7.j[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    d dVar2 = (d) it3.next();
                    if (!dVar2.b()) {
                        dVar2.a(jVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
