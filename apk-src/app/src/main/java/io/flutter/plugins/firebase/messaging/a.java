package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import ob.a0;
import ob.h4;
import ri.g;
import ri.h;
import ri.k;
import ri.l;
import ri.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends Service {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f25772g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f25773h = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f25774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f25775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ka.k f25776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25777e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25778f = new ArrayList();

    public static m b(Context context, ComponentName componentName, boolean z5, int i, boolean z10) {
        m gVar;
        a0 a0Var = new a0(26);
        HashMap map = f25773h;
        m mVar = (m) map.get(a0Var);
        if (mVar != null) {
            return mVar;
        }
        if (Build.VERSION.SDK_INT < 26 || z10) {
            gVar = new g(context, componentName);
        } else {
            if (!z5) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            gVar = new l(context, componentName, i);
        }
        map.put(a0Var, gVar);
        return gVar;
    }

    public final void a(boolean z5) {
        if (this.f25776d == null) {
            this.f25776d = new ka.k(this);
            m mVar = this.f25775c;
            if (mVar != null && z5) {
                mVar.d();
            }
            ka.k kVar = this.f25776d;
            ((ExecutorService) kVar.f27324c).execute(new h4(8, kVar));
        }
    }

    public final void c() {
        ArrayList arrayList = this.f25778f;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f25776d = null;
                    ArrayList arrayList2 = this.f25778f;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f25777e) {
                        this.f25775c.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        k kVar = this.f25774b;
        if (kVar != null) {
            return kVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25774b = new k(this);
            this.f25775c = null;
        }
        this.f25775c = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ka.k kVar = this.f25776d;
        if (kVar != null) {
            ((a) kVar.f27326e).c();
        }
        synchronized (this.f25778f) {
            this.f25777e = true;
            this.f25775c.c();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        this.f25775c.e();
        synchronized (this.f25778f) {
            ArrayList arrayList = this.f25778f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new h(this, intent, i10));
            a(true);
        }
        return 3;
    }
}
