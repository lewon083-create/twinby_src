package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.sentry.SentryLockReason;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5556f;

    public g(Context context) {
        this.f5552b = 0;
        this.f5553c = context.getApplicationContext();
        String packageName = (c2.b.d() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? a6.j.p(context.getSystemService(a6.j.q())).getClientPackageName() : context.getPackageName();
        this.f5554d = packageName;
    }

    public boolean a() {
        return (this.f5552b != 2 || ((yg) this.f5555e) == null || ((z9) this.f5556f) == null) ? false : true;
    }

    public boolean b(int i) {
        return ((ru1[]) this.f5553c)[i] != null;
    }

    public boolean d(g gVar, int i) {
        return gVar != null && Objects.equals(((ru1[]) this.f5553c)[i], ((ru1[]) gVar.f5553c)[i]) && Objects.equals(((d[]) this.f5554d)[i], ((d[]) gVar.f5554d)[i]);
    }

    public gk0 e() throws RemoteException {
        if (!a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(SentryLockReason.JsonKeys.PACKAGE_NAME, (String) this.f5554d);
        try {
            wg wgVar = (wg) ((yg) this.f5555e);
            Parcel parcelD0 = wgVar.D0();
            vg.c(parcelD0, bundle);
            Parcel parcelP1 = wgVar.p1(parcelD0, 1);
            Bundle bundle2 = (Bundle) vg.b(parcelP1, Bundle.CREATOR);
            parcelP1.recycle();
            return new gk0(3, bundle2);
        } catch (RemoteException e3) {
            rs.m("RemoteException getting install referrer information");
            this.f5552b = 0;
            throw e3;
        }
    }

    public synchronized void f() {
        to0 to0Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Z6)).booleanValue() && !p9.k.C.f31302h.g().n().f12774j) {
            ((ArrayDeque) this.f5555e).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((du0) this.f5556f) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f5555e;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        to0Var = (to0) arrayDeque.pollFirst();
                        if (to0Var == null) {
                            break;
                        }
                        zq0 zq0Var = to0Var.f10679g;
                        if (zq0Var != null) {
                            oq0 oq0Var = (oq0) this.f5553c;
                            synchronized (oq0Var) {
                                tq0 tq0Var = (tq0) ((ConcurrentHashMap) oq0Var.f8762c).get(zq0Var);
                                if (tq0Var == null) {
                                    break;
                                }
                                xq0 xq0Var = (xq0) oq0Var.f8763d;
                                tq0Var.a();
                                if (tq0Var.f10695a.size() < xq0Var.f12283f) {
                                    break;
                                }
                            }
                        }
                    }
                    du0 du0Var = new du0((oq0) this.f5553c, (in0) this.f5554d, to0Var);
                    this.f5556f = du0Var;
                    zd1 zd1Var = new zd1(19, this, to0Var);
                    synchronized (du0Var) {
                        r71 r71VarJ = vv.J((x61) du0Var.f4677d, n20.f8163m, to0Var.f10677e);
                        r71VarJ.a(new l81(0, r71VarJ, zd1Var), to0Var.f10677e);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    @Override // com.google.android.gms.internal.ads.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(com.google.android.gms.internal.ads.tk0 r29) {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g.n(com.google.android.gms.internal.ads.tk0):void");
    }

    public g(z2 z2Var, kx0 kx0Var, byte[] bArr, y5[] y5VarArr, int i) {
        this.f5553c = z2Var;
        this.f5554d = kx0Var;
        this.f5555e = bArr;
        this.f5556f = y5VarArr;
        this.f5552b = i;
    }

    public g(p9 p9Var, int i) {
        Objects.requireNonNull(p9Var);
        this.f5556f = p9Var;
        this.f5553c = new ik0(5, new byte[5]);
        this.f5554d = new SparseArray();
        this.f5555e = new SparseIntArray();
        this.f5552b = i;
    }

    public g(oq0 oq0Var, sq0 sq0Var, in0 in0Var) {
        this.f5552b = 1;
        this.f5553c = oq0Var;
        this.f5554d = in0Var;
        this.f5555e = new ArrayDeque();
        sq0Var.f10376a = new in0(3, this);
    }

    public g(ru1[] ru1VarArr, d[] dVarArr, no noVar, f fVar) {
        int length = ru1VarArr.length;
        ix.o(length == dVarArr.length);
        this.f5553c = ru1VarArr;
        this.f5554d = (d[]) dVarArr.clone();
        this.f5555e = noVar;
        this.f5556f = fVar;
        this.f5552b = length;
    }

    @Override // com.google.android.gms.internal.ads.m9
    public void c(yo0 yo0Var, b2 b2Var, r9 r9Var) {
    }
}
