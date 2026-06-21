package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3325a;

    public an(zm zmVar, int i) {
        en dnVar;
        switch (i) {
            case 1:
                this.f3325a = new ArrayList();
                try {
                    zmVar.j();
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                }
                try {
                    for (Object obj : zmVar.l()) {
                        en enVarL4 = obj instanceof IBinder ? um.l4((IBinder) obj) : null;
                        if (enVarL4 != null) {
                            this.f3325a.add(new ut(enVarL4));
                        }
                        break;
                    }
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                    return;
                }
                break;
            default:
                this.f3325a = new ArrayList();
                try {
                    zmVar.j();
                } catch (RemoteException e10) {
                    u9.i.f("", e10);
                }
                try {
                    for (Object obj2 : zmVar.l()) {
                        if (obj2 instanceof IBinder) {
                            IBinder iBinder = (IBinder) obj2;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            dnVar = iInterfaceQueryLocalInterface instanceof en ? (en) iInterfaceQueryLocalInterface : new dn(iBinder);
                        } else {
                            dnVar = null;
                        }
                        if (dnVar != null) {
                            this.f3325a.add(new fn(dnVar));
                        }
                        break;
                    }
                } catch (RemoteException e11) {
                    u9.i.f("", e11);
                }
                break;
        }
    }
}
