package ob;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.r81;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29963d;

    public /* synthetic */ b3(int i, Object obj, Object obj2) {
        this.f29961b = i;
        this.f29962c = obj2;
        this.f29963d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29961b) {
            case 0:
                d3 d3Var = ((c3) this.f29963d).f29987d;
                d3Var.f30067e = null;
                if (((ma.b) this.f29962c).f28761c != 7777) {
                    d3Var.R();
                    return;
                }
                if (d3Var.f30070h == null) {
                    d3Var.f30070h = Executors.newScheduledThreadPool(1);
                }
                d3Var.f30070h.schedule(new ac.g(27, this), ((Long) d0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 1:
                ni.i iVar = (ni.i) this.f29962c;
                JobParameters jobParameters = (JobParameters) this.f29963d;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((g3) ((Service) iVar.f29407c)).c(jobParameters);
                return;
            case 2:
                ((q.f) this.f29963d).f31542c.d((Bundle) this.f29962c);
                return;
            case 3:
                for (r7.c cVar : (ArrayList) this.f29962c) {
                    Object obj = ((s7.d) this.f29963d).f32791e;
                    cVar.f32268b = obj;
                    cVar.d(cVar.f32270d, obj);
                }
                return;
            case 4:
                sb.j jVar = (sb.j) this.f29963d;
                Task task = (Task) this.f29962c;
                if (task.h()) {
                    jVar.f32871e.n();
                    return;
                }
                try {
                    jVar.f32871e.l(jVar.f32870d.g(task));
                    return;
                } catch (sb.e e3) {
                    if (!(e3.getCause() instanceof Exception)) {
                        jVar.f32871e.m(e3);
                        return;
                    } else {
                        jVar.f32871e.m((Exception) e3.getCause());
                        return;
                    }
                } catch (Exception e7) {
                    jVar.f32871e.m(e7);
                    return;
                }
            case 5:
                sb.k kVar = (sb.k) this.f29963d;
                synchronized (kVar.f32874d) {
                    try {
                        OnCompleteListener onCompleteListener = (OnCompleteListener) kVar.f32875e;
                        if (onCompleteListener != null) {
                            onCompleteListener.onComplete((Task) this.f29962c);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 6:
                sb.k kVar2 = (sb.k) this.f29963d;
                synchronized (kVar2.f32874d) {
                    try {
                        sb.d dVar = (sb.d) kVar2.f32875e;
                        if (dVar != null) {
                            dVar.onSuccess(((Task) this.f29962c).getResult());
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 7:
                sb.m mVar = (sb.m) this.f29962c;
                try {
                    mVar.l(((Callable) this.f29963d).call());
                    return;
                } catch (Exception e10) {
                    mVar.m(e10);
                    return;
                } catch (Throwable th2) {
                    mVar.m(new RuntimeException(th2));
                    return;
                }
            case 8:
                t9.i iVar2 = (t9.i) this.f29962c;
                r81 r81Var = (r81) this.f29963d;
                p9.k kVar3 = p9.k.C;
                t9.l lVar = kVar3.f31308o;
                Context context = iVar2.f33608a;
                if (lVar.b(context, iVar2.f33611d, iVar2.f33612e)) {
                    r81Var.execute(new t9.c(iVar2, 3));
                    return;
                } else {
                    kVar3.f31308o.c(context, iVar2.f33611d, iVar2.f33612e);
                    return;
                }
            case 9:
                ((ii.q) ((ka.k) this.f29963d).f27326e).a("onAdEvent", (HashMap) this.f29962c, null);
                return;
            case 10:
                v7.i iVar3 = (v7.i) this.f29962c;
                try {
                    ((Runnable) this.f29963d).run();
                    return;
                } finally {
                    iVar3.a();
                }
            case 11:
                v7.l lVar2 = (v7.l) this.f29963d;
                w7.j jVar2 = lVar2.f34781b;
                ListenableWorker listenableWorker = lVar2.f34784e;
                u7.j jVar3 = lVar2.f34783d;
                try {
                    l7.g gVar = (l7.g) ((w7.j) this.f29962c).get();
                    if (gVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + jVar3.f34332c + ") but did not provide ForegroundInfo");
                    }
                    l7.n.g().e(v7.l.f34780h, "Updating notification for " + jVar3.f34332c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    v7.m mVar2 = lVar2.f34785f;
                    Context context2 = lVar2.f34782c;
                    UUID id2 = listenableWorker.getId();
                    mVar2.getClass();
                    w7.j jVar4 = new w7.j();
                    ((x7.b) mVar2.f34787a).b(new j7(mVar2, jVar4, id2, gVar, context2, 4, false));
                    jVar2.l(jVar4);
                    return;
                } catch (Throwable th3) {
                    jVar2.k(th3);
                    return;
                }
            default:
                n2.g gVar2 = ((SwipeDismissBehavior) this.f29963d).f14476a;
                if (gVar2 == null || !gVar2.g()) {
                    return;
                }
                View view = (View) this.f29962c;
                Field field = g2.n0.f19900a;
                view.postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ b3(int i, Object obj, Object obj2, boolean z5) {
        this.f29961b = i;
        this.f29962c = obj;
        this.f29963d = obj2;
    }

    public b3(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z5) {
        this.f29961b = 12;
        this.f29963d = swipeDismissBehavior;
        this.f29962c = view;
    }
}
