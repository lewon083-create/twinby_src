package v7;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f34774e = l7.n.i("StopWorkRunnable");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m7.l f34775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34777d;

    public j(m7.l lVar, String str, boolean z5) {
        this.f34775b = lVar;
        this.f34776c = str;
        this.f34777d = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        m7.l lVar = this.f34775b;
        WorkDatabase workDatabase = lVar.f28732d;
        m7.c cVar = lVar.f28735g;
        com.google.android.gms.internal.consent_sdk.c cVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f34776c;
            synchronized (cVar.f28707l) {
                zContainsKey = cVar.f28703g.containsKey(str);
            }
            if (this.f34777d) {
                zJ = this.f34775b.f28735g.i(this.f34776c);
            } else {
                if (!zContainsKey && cVarN.e(this.f34776c) == 2) {
                    cVarN.o(1, this.f34776c);
                }
                zJ = this.f34775b.f28735g.j(this.f34776c);
            }
            l7.n.g().e(f34774e, "StopWorkRunnable for " + this.f34776c + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
