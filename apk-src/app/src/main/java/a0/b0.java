package a0;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import g0.t2;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f26r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SparseArray f27s = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f30c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f31d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f32e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f33f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t.p f34g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t.u0 f35h;
    public t.y0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h3.e f36j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.firebase.messaging.y f37k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d2 f38l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j1.k f39m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0.i0 f40n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f43q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.l0 f28a = new g0.l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29b = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ed.d f42p = k0.l.f26777d;

    public b0(Context context, w0.c cVar) {
        ComponentCallbacks2 componentCallbacks2;
        d0 d0Var;
        String string;
        Bundle bundle;
        d2 t2Var;
        j1.k kVarW;
        boolean z5 = true;
        this.f41o = 1;
        Context contextN = com.google.android.gms.internal.auth.g.n(context);
        while (true) {
            if (!(contextN instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (contextN instanceof Application) {
                    componentCallbacks2 = (Application) contextN;
                    break;
                }
                contextN = ((ContextWrapper) contextN).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof d0) {
            d0Var = (d0) componentCallbacks2;
        } else {
            try {
                Context contextN2 = com.google.android.gms.internal.auth.g.n(context);
                Bundle bundle2 = contextN2.getPackageManager().getServiceInfo(new ComponentName(contextN2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException e3) {
                e = e3;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (ClassNotFoundException e7) {
                e = e7;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (IllegalAccessException e10) {
                e = e10;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InstantiationException e11) {
                e = e11;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NullPointerException e13) {
                e = e13;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                com.google.android.gms.internal.auth.g.l("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
            if (string == null) {
                com.google.android.gms.internal.auth.g.k("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                d0Var = null;
            } else {
                d0Var = (d0) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (d0Var == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        e0 cameraXConfig = d0Var.getCameraXConfig();
        this.f30c = cameraXConfig;
        g0.x1 x1VarB = (g0.x1) cameraXConfig.L.g(e0.V, null);
        if (x1VarB != null) {
            com.google.android.gms.internal.auth.g.e("CameraX", "QuirkSettings from CameraXConfig: " + x1VarB);
        } else {
            try {
                bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) g0.z1.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.internal.auth.g.e("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            }
            if (bundle == null) {
                com.google.android.gms.internal.auth.g.O("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                x1VarB = null;
                com.google.android.gms.internal.auth.g.e("CameraX", "QuirkSettings from app metadata: " + x1VarB);
            } else {
                x1VarB = wa.a.b(context, bundle);
                com.google.android.gms.internal.auth.g.e("CameraX", "QuirkSettings from app metadata: " + x1VarB);
            }
        }
        if (x1VarB == null) {
            x1VarB = g0.y1.f19807b;
            com.google.android.gms.internal.auth.g.e("CameraX", "QuirkSettings by default: " + x1VarB);
        }
        g0.y1.f19808c.f19809a.P(x1VarB);
        ((Integer) this.f30c.L.g(e0.W, -1)).getClass();
        Executor sVar = (Executor) this.f30c.L.g(e0.P, null);
        Handler handler = (Handler) this.f30c.L.g(e0.Q, null);
        sVar = sVar == null ? new s() : sVar;
        this.f31d = sVar;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f33f = handlerThread;
            handlerThread.start();
            this.f32e = j0.g.F(handlerThread.getLooper());
        } else {
            this.f33f = null;
            this.f32e = handler;
        }
        Integer num = (Integer) this.f30c.g(e0.R, null);
        this.f43q = num;
        synchronized (f26r) {
            try {
                if (num != null) {
                    f2.g.e("minLogLevel", num.intValue(), 3, 6);
                    SparseArray sparseArray = f27s;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    b();
                }
            } finally {
            }
        }
        d2 d2Var = (d2) this.f30c.L.g(e0.U, d2.f64a);
        Objects.requireNonNull(d2Var);
        long jA = d2Var.a();
        if (d2Var instanceof g0.k0) {
            switch (((g0.k0) d2Var).f19632b) {
                case 0:
                    t2Var = new g0.k0(jA, 0);
                    break;
                default:
                    t2Var = new g0.k0(jA, 1);
                    break;
            }
        } else {
            t2Var = new t2(jA, d2Var);
        }
        this.f38l = t2Var;
        this.f40n = new g0.i0(sVar);
        synchronized (this.f29b) {
            if (this.f41o != 1) {
                z5 = false;
            }
            f2.g.h("CameraX.initInternal() should only be called once per instance", z5);
            this.f41o = 2;
            kVarW = i0.o.w(new y(0, this, context));
        }
        this.f39m = kVarW;
    }

    public static void a(Integer num) {
        synchronized (f26r) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f27s;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b() {
        SparseArray sparseArray = f27s;
        if (sparseArray.size() == 0) {
            com.google.android.gms.internal.auth.g.f13212c = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            com.google.android.gms.internal.auth.g.f13212c = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            com.google.android.gms.internal.auth.g.f13212c = 4;
        } else if (sparseArray.get(5) != null) {
            com.google.android.gms.internal.auth.g.f13212c = 5;
        } else if (sparseArray.get(6) != null) {
            com.google.android.gms.internal.auth.g.f13212c = 6;
        }
    }
}
