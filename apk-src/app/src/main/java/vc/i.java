package vc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.oc;
import d8.h0;
import d8.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f34843n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f34845b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f34851h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h0 f34854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f34855m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f34847d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f34848e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34849f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f34852j = new f(0, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f34853k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34846c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public i(Context context, u uVar, Intent intent) {
        this.f34844a = context;
        this.f34845b = uVar;
        this.f34851h = intent;
    }

    public static void b(i iVar, uc.e eVar) {
        d dVar = iVar.f34855m;
        u uVar = iVar.f34845b;
        ArrayList<e> arrayList = iVar.f34847d;
        if (dVar != null || iVar.f34850g) {
            if (!iVar.f34850g) {
                eVar.run();
                return;
            } else {
                uVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(eVar);
                return;
            }
        }
        uVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(eVar);
        h0 h0Var = new h0(2, iVar);
        iVar.f34854l = h0Var;
        iVar.f34850g = true;
        if (iVar.f34844a.bindService(iVar.f34851h, h0Var, 1)) {
            return;
        }
        uVar.c("Failed to bind to the service.", new Object[0]);
        iVar.f34850g = false;
        for (e eVar2 : arrayList) {
            oc ocVar = new oc("Failed to bind to the service.");
            sb.g gVar = eVar2.f34835b;
            if (gVar != null) {
                gVar.c(ocVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f34843n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f34846c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f34846c, 10);
                    handlerThread.start();
                    map.put(this.f34846c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f34846c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f34848e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((sb.g) it.next()).c(new RemoteException(String.valueOf(this.f34846c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
