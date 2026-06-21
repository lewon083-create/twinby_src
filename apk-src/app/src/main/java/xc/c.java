package xc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import d8.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f36059o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f36061b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f36067h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f36071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f36072n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36063d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f36064e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f36065f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vc.f f36069k = new vc.f(1, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f36070l = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36062c = "IntegrityService";
    public final sc.c i = sc.c.f32884c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f36068j = new WeakReference(null);

    public c(Context context, n nVar, Intent intent) {
        this.f36060a = context;
        this.f36061b = nVar;
        this.f36067h = intent;
    }

    public static void b(c cVar, sc.d dVar) {
        m mVar = cVar.f36072n;
        n nVar = cVar.f36061b;
        ArrayList arrayList = cVar.f36063d;
        if (mVar != null || cVar.f36066g) {
            if (!cVar.f36066g) {
                dVar.run();
                return;
            } else {
                nVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dVar);
                return;
            }
        }
        nVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar);
        h0 h0Var = new h0(3, cVar);
        cVar.f36071m = h0Var;
        cVar.f36066g = true;
        if (cVar.f36060a.bindService(cVar.f36067h, h0Var, 1)) {
            return;
        }
        nVar.a("Failed to bind to the service.", new Object[0]);
        cVar.f36066g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(new d("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f36059o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f36062c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f36062c, 10);
                    handlerThread.start();
                    map.put(this.f36062c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f36062c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f36064e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((sb.g) it.next()).c(new RemoteException(String.valueOf(this.f36062c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
