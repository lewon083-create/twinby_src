package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw0 f4696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4697b = true;

    public dw0(fw0 fw0Var) {
        this.f4696a = fw0Var;
    }

    public static dw0 a(Context context, String str) {
        fw0 ew0Var;
        try {
            try {
                try {
                    IBinder iBinderB = ya.d.c(context, ya.d.f36573b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        ew0Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        ew0Var = iInterfaceQueryLocalInterface instanceof fw0 ? (fw0) iInterfaceQueryLocalInterface : new ew0(iBinderB, "com.google.android.gms.gass.internal.clearcut.IGassClearcut", 1);
                    }
                    ew0Var.h3(new xa.b(context), str);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new dw0(ew0Var);
                } catch (Exception e3) {
                    throw new pv0(e3);
                }
            } catch (RemoteException | pv0 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new dw0(new gw0());
            }
        } catch (Exception e7) {
            throw new pv0(e7);
        }
    }
}
