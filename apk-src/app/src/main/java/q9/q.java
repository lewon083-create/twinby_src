package q9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.km;
import com.google.android.gms.internal.ads.wl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f31957a;

    static {
        x0 w0Var = null;
        try {
            Object objNewInstance = o.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                w0Var = iInterfaceQueryLocalInterface instanceof x0 ? (x0) iInterfaceQueryLocalInterface : new w0(iBinder, "com.google.android.gms.ads.internal.client.IClientApi", 1);
            } else {
                u9.i.h("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            u9.i.h("Failed to instantiate ClientApi class.");
        }
        f31957a = w0Var;
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c(x0 x0Var);

    public final Object d(Context context, boolean z5) {
        boolean z10;
        Object objB;
        Object objC;
        if (!z5) {
            u9.d dVar = r.f31959g.f31960a;
            if (ma.g.f28775b.c(context, 12451000) != 0) {
                u9.i.c("Google Play Services is not available.");
                z5 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(ya.d.a(context, ModuleDescriptor.MODULE_ID) <= ya.d.d(context, ModuleDescriptor.MODULE_ID, false));
        al.a(context);
        if (((Boolean) wl.f11836a.r()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) wl.f11837b.r()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z5 | z12;
            z10 = false;
        }
        x0 x0Var = f31957a;
        Object objC2 = null;
        if (z11) {
            if (x0Var != null) {
                try {
                    objC = c(x0Var);
                } catch (RemoteException e3) {
                    u9.i.i("Cannot invoke local loader using ClientApi class.", e3);
                    objC = null;
                }
                if (objC == null && !z10) {
                    try {
                        objC2 = b();
                    } catch (RemoteException e7) {
                        u9.i.i("Cannot invoke remote loader.", e7);
                    }
                    objC = objC2;
                }
            } else {
                u9.i.h("ClientApi class cannot be loaded.");
            }
            objC = null;
            if (objC == null) {
                objC2 = b();
                objC = objC2;
            }
        } else {
            try {
                objB = b();
            } catch (RemoteException e10) {
                u9.i.i("Cannot invoke remote loader.", e10);
                objB = null;
            }
            if (objB == null) {
                int iIntValue = ((Long) km.f7257a.r()).intValue();
                r rVar = r.f31959g;
                if (rVar.f31964e.nextInt(iIntValue) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    u9.d dVar2 = rVar.f31960a;
                    String str = rVar.f31963d.f34365b;
                    dVar2.getClass();
                    u9.d.a(context, str, bundle, new r3.b(21, dVar2, context));
                }
            }
            if (objB == null) {
                if (x0Var != null) {
                    try {
                        objC2 = c(x0Var);
                    } catch (RemoteException e11) {
                        u9.i.i("Cannot invoke local loader using ClientApi class.", e11);
                    }
                } else {
                    u9.i.h("ClientApi class cannot be loaded.");
                }
                objC = objC2;
            } else {
                objC = objB;
            }
        }
        return objC == null ? a() : objC;
    }
}
