package v7;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;
import l7.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f34758d = l7.n.i("EnqueueRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7.f f34759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6.i f34760c = new l6.i(5);

    public d(m7.f fVar) {
        this.f34759b = fVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(m7.f r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.d.a(m7.f):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        l6.i iVar = this.f34760c;
        m7.f fVar = this.f34759b;
        m7.l lVar = fVar.f28710b;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(fVar.f28712d);
            HashSet hashSetP0 = m7.f.p0(fVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(fVar.f28712d);
                    z5 = false;
                    break;
                } else if (hashSetP0.contains((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
            if (z5) {
                throw new IllegalStateException("WorkContinuation has cycles (" + fVar + ")");
            }
            WorkDatabase workDatabase = lVar.f28732d;
            workDatabase.c();
            try {
                boolean zA = a(fVar);
                workDatabase.h();
                if (zA) {
                    g.a(lVar.f28730b, RescheduleReceiver.class, true);
                    m7.e.a(lVar.f28731c, lVar.f28732d, lVar.f28734f);
                }
                iVar.j(t.S1);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th2) {
            iVar.j(new l7.q(th2));
        }
    }
}
