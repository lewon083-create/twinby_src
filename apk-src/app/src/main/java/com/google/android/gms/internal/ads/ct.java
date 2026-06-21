package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ct extends NativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo f4306a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ut f4308c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4307b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4309d = new ArrayList();

    public ct(fo foVar) {
        new AtomicLong();
        this.f4306a = foVar;
        ut utVar = null;
        try {
            List listC = foVar.c();
            if (listC != null) {
                for (Object obj : listC) {
                    en enVarL4 = obj instanceof IBinder ? um.l4((IBinder) obj) : null;
                    if (enVarL4 != null) {
                        this.f4307b.add(new ut(enVarL4));
                    }
                }
            }
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
        try {
            List listT = this.f4306a.T();
            if (listT != null) {
                for (Object obj2 : listT) {
                    q9.l1 l1VarL4 = obj2 instanceof IBinder ? q9.m2.l4((IBinder) obj2) : null;
                    if (l1VarL4 != null) {
                        this.f4309d.add(new d8.u(l1VarL4));
                    }
                }
            }
        } catch (RemoteException e7) {
            u9.i.f("", e7);
        }
        try {
            en enVarM = this.f4306a.m();
            if (enVarM != null) {
                utVar = new ut(enVarM);
            }
        } catch (RemoteException e10) {
            u9.i.f("", e10);
        }
        this.f4308c = utVar;
        try {
            if (this.f4306a.o() != null) {
                new an(this.f4306a.o(), 1);
            }
        } catch (RemoteException e11) {
            u9.i.f("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void a() {
        try {
            this.f4306a.K();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String b() {
        try {
            return this.f4306a.d();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String c() {
        try {
            return this.f4306a.k();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String d() {
        try {
            return this.f4306a.f();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String e() {
        try {
            return this.f4306a.i();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ut f() {
        return this.f4308c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final k9.r g() {
        q9.y1 y1VarN;
        try {
            y1VarN = this.f4306a.N();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            y1VarN = null;
        }
        if (y1VarN != null) {
            return new k9.r(y1VarN);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double h() {
        try {
            double dN = this.f4306a.n();
            if (dN == -1.0d) {
                return null;
            }
            return Double.valueOf(dN);
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String i() {
        try {
            return this.f4306a.e();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ xa.a j() {
        try {
            return this.f4306a.A();
        } catch (RemoteException e3) {
            u9.i.f("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f4306a.I2(bundle);
        } catch (RemoteException e3) {
            u9.i.f("Failed to record native event", e3);
        }
    }
}
