package v7;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import l7.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f34757b = new l6.i(5);

    public static void a(m7.l lVar, String str) {
        WorkDatabase workDatabase = lVar.f28732d;
        com.google.android.gms.internal.consent_sdk.c cVarN = workDatabase.n();
        r3.b bVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = cVarN.e(str2);
            if (iE != 3 && iE != 4) {
                cVarN.o(6, str2);
            }
            linkedList.addAll(bVarI.y(str2));
        }
        m7.c cVar = lVar.f28735g;
        synchronized (cVar.f28707l) {
            try {
                l7.n.g().e(m7.c.f28697m, "Processor cancelling " + str, new Throwable[0]);
                cVar.f28705j.add(str);
                m7.m mVar = (m7.m) cVar.f28703g.remove(str);
                boolean z5 = mVar != null;
                if (mVar == null) {
                    mVar = (m7.m) cVar.f28704h.remove(str);
                }
                m7.c.b(str, mVar);
                if (z5) {
                    cVar.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = lVar.f28734f.iterator();
        while (it.hasNext()) {
            ((m7.d) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        l6.i iVar = this.f34757b;
        try {
            b();
            iVar.j(t.S1);
        } catch (Throwable th2) {
            iVar.j(new l7.q(th2));
        }
    }
}
