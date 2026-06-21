package pa;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends cb.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f31360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31361d;

    public g0(e eVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.f31360c = eVar;
        this.f31361d = i;
    }

    @Override // cb.c
    public final boolean T0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) fb.h.a(parcel, Bundle.CREATOR);
            fb.h.c(parcel);
            c0.j(this.f31360c, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.f31360c;
            int i11 = this.f31361d;
            eVar.getClass();
            i0 i0Var = new i0(eVar, i10, strongBinder, bundle);
            f0 f0Var = eVar.f31332f;
            f0Var.sendMessage(f0Var.obtainMessage(1, i11, -1, i0Var));
            this.f31360c = null;
        } else if (i == 2) {
            parcel.readInt();
            fb.h.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) fb.h.a(parcel, k0.CREATOR);
            fb.h.c(parcel);
            e eVar2 = this.f31360c;
            c0.j(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            c0.i(k0Var);
            eVar2.f31348w = k0Var;
            if (eVar2.u()) {
                g gVar = k0Var.f31394e;
                m mVarB = m.b();
                n nVar = gVar == null ? null : gVar.f31354b;
                synchronized (mVarB) {
                    if (nVar == null) {
                        nVar = m.f31397d;
                    } else {
                        n nVar2 = (n) mVarB.f31398b;
                        if (nVar2 == null || nVar2.f31403b < nVar.f31403b) {
                        }
                    }
                    mVarB.f31398b = nVar;
                }
            }
            Bundle bundle2 = k0Var.f31391b;
            c0.j(this.f31360c, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.f31360c;
            int i13 = this.f31361d;
            eVar3.getClass();
            i0 i0Var2 = new i0(eVar3, i12, strongBinder2, bundle2);
            f0 f0Var2 = eVar3.f31332f;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i13, -1, i0Var2));
            this.f31360c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
