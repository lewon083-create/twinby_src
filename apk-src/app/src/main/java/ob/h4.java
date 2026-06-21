package ob;

import android.os.Looper;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.tl;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h4 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30178c;

    public /* synthetic */ h4(int i, Object obj) {
        this.f30177b = i;
        this.f30178c = obj;
    }

    private final void a() {
        sb.k kVar = (sb.k) this.f30178c;
        synchronized (kVar.f32874d) {
            try {
                sb.b bVar = (sb.b) kVar.f32875e;
                if (bVar != null) {
                    bVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        t9.e0 e0Var = (t9.e0) this.f30178c;
        if (e0Var.f33565b) {
            if (!(e0Var.l() && e0Var.m()) && ((Boolean) tl.f10651b.r()).booleanValue()) {
                synchronized (e0Var.f33564a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (e0Var.f33568e == null) {
                            e0Var.f33568e = new ph();
                        }
                        ph phVar = e0Var.f33568e;
                        synchronized (phVar.f9051d) {
                            try {
                                if (phVar.f9049b) {
                                    u9.i.c("Content hash thread already started, quitting...");
                                } else {
                                    phVar.f9049b = true;
                                    phVar.start();
                                }
                            } finally {
                            }
                        }
                        u9.i.g("start fetching content...");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f30178c;
        String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strB)) {
            l7.n.g().f(ConstraintTrackingWorker.f1790l, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f1793j.j(new l7.j());
            return;
        }
        ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f1791g);
        constraintTrackingWorker.f1794k = listenableWorkerA;
        if (listenableWorkerA == null) {
            l7.n.g().e(ConstraintTrackingWorker.f1790l, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f1793j.j(new l7.j());
            return;
        }
        u7.j jVarH = m7.l.O(constraintTrackingWorker.getApplicationContext()).f28732d.n().h(constraintTrackingWorker.getId().toString());
        if (jVarH == null) {
            constraintTrackingWorker.f1793j.j(new l7.j());
            return;
        }
        q7.c cVar = new q7.c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        cVar.b(Collections.singletonList(jVarH));
        if (!cVar.a(constraintTrackingWorker.getId().toString())) {
            l7.n.g().e(ConstraintTrackingWorker.f1790l, pe.a.f("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
            constraintTrackingWorker.f1793j.j(new l7.k());
            return;
        }
        l7.n.g().e(ConstraintTrackingWorker.f1790l, om1.k("Constraints met for delegate ", strB), new Throwable[0]);
        try {
            ed.d dVarStartWork = constraintTrackingWorker.f1794k.startWork();
            dVarStartWork.a(new s9.i(8, constraintTrackingWorker, dVarStartWork, false), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable th2) {
            l7.n nVarG = l7.n.g();
            String str = ConstraintTrackingWorker.f1790l;
            nVarG.e(str, pe.a.f("Delegated worker ", strB, " threw exception in startWork."), th2);
            synchronized (constraintTrackingWorker.f1792h) {
                try {
                    if (constraintTrackingWorker.i) {
                        l7.n.g().e(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.f1793j.j(new l7.k());
                    } else {
                        constraintTrackingWorker.f1793j.j(new l7.j());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.h4.run():void");
    }
}
