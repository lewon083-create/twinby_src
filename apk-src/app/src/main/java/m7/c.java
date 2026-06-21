package m7;

import aa.y;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.om1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l7.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, t7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28697m = n.i("Processor");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f28699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b30 f28700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x7.b f28701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WorkDatabase f28702f;
    public final List i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f28704h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f28703g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet f28705j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28706k = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f28698b = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f28707l = new Object();

    public c(Context context, b30 b30Var, x7.b bVar, WorkDatabase workDatabase, List list) {
        this.f28699c = context;
        this.f28700d = b30Var;
        this.f28701e = bVar;
        this.f28702f = workDatabase;
        this.i = list;
    }

    public static boolean b(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            n.g().e(f28697m, om1.k("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f28756t = true;
        mVar.h();
        ed.d dVar = mVar.f28755s;
        if (dVar != null) {
            zIsDone = dVar.isDone();
            mVar.f28755s.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f28744g;
        if (listenableWorker == null || zIsDone) {
            n.g().e(m.f28738u, "WorkSpec " + mVar.f28743f + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n.g().e(f28697m, om1.k("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(b bVar) {
        synchronized (this.f28707l) {
            this.f28706k.add(bVar);
        }
    }

    @Override // m7.b
    public final void c(String str, boolean z5) {
        synchronized (this.f28707l) {
            try {
                this.f28704h.remove(str);
                n.g().e(f28697m, c.class.getSimpleName() + " " + str + " executed; reschedule = " + z5, new Throwable[0]);
                Iterator it = this.f28706k.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(str, z5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(String str) {
        boolean z5;
        synchronized (this.f28707l) {
            try {
                z5 = this.f28704h.containsKey(str) || this.f28703g.containsKey(str);
            } finally {
            }
        }
        return z5;
    }

    public final void e(b bVar) {
        synchronized (this.f28707l) {
            this.f28706k.remove(bVar);
        }
    }

    public final void f(String str, l7.g gVar) {
        synchronized (this.f28707l) {
            try {
                n.g().h(f28697m, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f28704h.remove(str);
                if (mVar != null) {
                    if (this.f28698b == null) {
                        PowerManager.WakeLock wakeLockA = v7.k.a(this.f28699c, "ProcessorForegroundLck");
                        this.f28698b = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f28703g.put(str, mVar);
                    Intent intentB = t7.b.b(this.f28699c, str, gVar);
                    Context context = this.f28699c;
                    if (Build.VERSION.SDK_INT >= 26) {
                        a2.a.s(context, intentB);
                    } else {
                        context.startService(intentB);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(String str, bb.e eVar) {
        synchronized (this.f28707l) {
            try {
                if (d(str)) {
                    n.g().e(f28697m, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f28699c;
                b30 b30Var = this.f28700d;
                x7.b bVar = this.f28701e;
                WorkDatabase workDatabase = this.f28702f;
                bb.e eVar2 = new bb.e(15);
                Context applicationContext = context.getApplicationContext();
                List list = this.i;
                if (eVar == null) {
                    eVar = eVar2;
                }
                m mVar = new m();
                mVar.i = new l7.j();
                w7.j jVar = new w7.j();
                mVar.f28754r = jVar;
                mVar.f28755s = null;
                mVar.f28739b = applicationContext;
                mVar.f28745h = bVar;
                mVar.f28747k = this;
                mVar.f28740c = str;
                mVar.f28741d = list;
                mVar.f28742e = eVar;
                mVar.f28744g = null;
                mVar.f28746j = b30Var;
                mVar.f28748l = workDatabase;
                mVar.f28749m = workDatabase.n();
                mVar.f28750n = workDatabase.i();
                mVar.f28751o = workDatabase.o();
                y yVar = new y(13);
                yVar.f721c = this;
                yVar.f722d = str;
                yVar.f723e = jVar;
                jVar.a(yVar, (j0.e) this.f28701e.f35979d);
                this.f28704h.put(str, mVar);
                ((v7.i) this.f28701e.f35977b).execute(mVar);
                n.g().e(f28697m, gf.a.k(c.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f28707l) {
            try {
                if (this.f28703g.isEmpty()) {
                    Context context = this.f28699c;
                    String str = t7.b.f33528k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f28699c.startService(intent);
                    } catch (Throwable th2) {
                        n.g().f(f28697m, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f28698b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f28698b = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.f28707l) {
            n.g().e(f28697m, "Processor stopping foreground work " + str, new Throwable[0]);
            zB = b(str, (m) this.f28703g.remove(str));
        }
        return zB;
    }

    public final boolean j(String str) {
        boolean zB;
        synchronized (this.f28707l) {
            n.g().e(f28697m, "Processor stopping background work " + str, new Throwable[0]);
            zB = b(str, (m) this.f28704h.remove(str));
        }
        return zB;
    }
}
