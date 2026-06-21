package ge;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import he.m;
import he.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements je.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f20136j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f20137k = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.g f20141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zd.d f20142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gd.c f20143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yd.a f20144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20145h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20138a = new HashMap();
    public final HashMap i = new HashMap();

    public l(Context context, ScheduledExecutorService scheduledExecutorService, fd.g gVar, zd.d dVar, gd.c cVar, yd.a aVar) {
        this.f20139b = context;
        this.f20140c = scheduledExecutorService;
        this.f20141d = gVar;
        this.f20142e = dVar;
        this.f20143f = cVar;
        this.f20144g = aVar;
        gVar.a();
        this.f20145h = gVar.f16760c.f16773b;
        AtomicReference atomicReference = k.f20135a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = k.f20135a;
        if (atomicReference2.get() == null) {
            k kVar = new k();
            while (true) {
                if (atomicReference2.compareAndSet(null, kVar)) {
                    oa.c.b(application);
                    oa.c.f29825f.a(kVar);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        b4.d(new a7.h(2, this), scheduledExecutorService);
    }

    public final synchronized e a(fd.g gVar, zd.d dVar, gd.c cVar, Executor executor, he.c cVar2, he.c cVar3, he.c cVar4, he.g gVar2, he.h hVar, m mVar, bb.e eVar) {
        if (!this.f20138a.containsKey("firebase")) {
            gVar.a();
            gd.c cVar5 = gVar.f16759b.equals("[DEFAULT]") ? cVar : null;
            Context context = this.f20139b;
            synchronized (this) {
                e eVar2 = new e(dVar, cVar5, executor, cVar2, cVar3, cVar4, gVar2, hVar, mVar, new bb.e(gVar, dVar, gVar2, cVar3, context, mVar, this.f20140c), eVar);
                cVar3.b();
                cVar4.b();
                cVar2.b();
                this.f20138a.put("firebase", eVar2);
                f20137k.put("firebase", eVar2);
            }
        }
        return (e) this.f20138a.get("firebase");
    }

    public final he.c b(String str) {
        n nVar;
        he.c cVar;
        String strF = z.f("frc_", this.f20145h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f20140c;
        Context context = this.f20139b;
        HashMap map = n.f20552c;
        synchronized (n.class) {
            try {
                HashMap map2 = n.f20552c;
                if (!map2.containsKey(strF)) {
                    map2.put(strF, new n(context, strF));
                }
                nVar = (n) map2.get(strF);
            } finally {
            }
        }
        HashMap map3 = he.c.f20489d;
        synchronized (he.c.class) {
            try {
                String str2 = nVar.f20554b;
                HashMap map4 = he.c.f20489d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new he.c(scheduledExecutorService, nVar));
                }
                cVar = (he.c) map4.get(str2);
            } finally {
            }
        }
        return cVar;
    }

    public final e c() {
        synchronized (this) {
            try {
                try {
                    he.c cVarB = b("fetch");
                    he.c cVarB2 = b("activate");
                    he.c cVarB3 = b("defaults");
                    m mVar = new m(this.f20139b.getSharedPreferences("frc_" + this.f20145h + "_firebase_settings", 0));
                    he.h hVar = new he.h(this.f20140c, cVarB2, cVarB3);
                    fd.g gVar = this.f20141d;
                    yd.a aVar = this.f20144g;
                    gVar.a();
                    h3.e eVar = gVar.f16759b.equals("[DEFAULT]") ? new h3.e(aVar) : null;
                    if (eVar != null) {
                        j jVar = new j(eVar);
                        synchronized (hVar.f20517a) {
                            hVar.f20517a.add(jVar);
                        }
                    }
                    h3.e eVar2 = new h3.e(14);
                    eVar2.f20375c = cVarB2;
                    eVar2.f20376d = cVarB3;
                    ScheduledExecutorService scheduledExecutorService = this.f20140c;
                    bb.e eVar3 = new bb.e(13, false);
                    eVar3.f2021e = Collections.newSetFromMap(new ConcurrentHashMap());
                    eVar3.f2019c = eVar2;
                    eVar3.f2020d = scheduledExecutorService;
                    return a(this.f20141d, this.f20142e, this.f20143f, this.f20140c, cVarB, cVarB2, cVarB3, d(cVarB, mVar), hVar, mVar, eVar3);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final synchronized he.g d(he.c cVar, m mVar) {
        zd.d dVar;
        yd.a kVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        fd.g gVar;
        try {
            dVar = this.f20142e;
            fd.g gVar2 = this.f20141d;
            gVar2.a();
            kVar = gVar2.f16759b.equals("[DEFAULT]") ? this.f20144g : new com.google.firebase.messaging.k(1);
            scheduledExecutorService = this.f20140c;
            random = f20136j;
            fd.g gVar3 = this.f20141d;
            gVar3.a();
            str = gVar3.f16760c.f16772a;
            gVar = this.f20141d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new he.g(dVar, kVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f20139b, gVar.f16760c.f16773b, str, mVar.f20547a.getLong("fetch_timeout_in_seconds", 60L), mVar.f20547a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.i);
    }
}
