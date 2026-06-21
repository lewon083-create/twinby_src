package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends ug implements rp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xr0 f9029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx f9030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ se0 f9031g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(long j10, jx jxVar, se0 se0Var, xr0 xr0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f9026b = obj;
        this.f9027c = str;
        this.f9028d = j10;
        this.f9029e = xr0Var;
        this.f9030f = jxVar;
        Objects.requireNonNull(se0Var);
        this.f9031g = se0Var;
    }

    public final void i() {
        synchronized (this.f9026b) {
            se0 se0Var = this.f9031g;
            String str = this.f9027c;
            p9.k.C.f31304k.getClass();
            se0Var.d((int) (SystemClock.elapsedRealtime() - this.f9028d), str, "", true);
            se0Var.f10277l.b(str);
            se0Var.f10280o.w(str);
            bs0 bs0Var = se0Var.f10281p;
            xr0 xr0Var = this.f9029e;
            xr0Var.a(true);
            bs0Var.b(xr0Var.p());
            this.f9030f.b(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            i();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            vg.f(parcel);
            l4(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void l4(String str) {
        synchronized (this.f9026b) {
            se0 se0Var = this.f9031g;
            String str2 = this.f9027c;
            p9.k.C.f31304k.getClass();
            se0Var.d((int) (SystemClock.elapsedRealtime() - this.f9028d), str2, str, false);
            se0Var.f10277l.c(str2, "error");
            se0Var.f10280o.g(str2, "error");
            bs0 bs0Var = se0Var.f10281p;
            xr0 xr0Var = this.f9029e;
            xr0Var.f(str);
            xr0Var.a(false);
            bs0Var.b(xr0Var.p());
            this.f9030f.b(Boolean.FALSE);
        }
    }
}
