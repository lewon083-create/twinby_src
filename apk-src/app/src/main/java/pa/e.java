package pa;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ma.d[] f31326y = new ma.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f31327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l6.h f31328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f31329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f31330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ma.g f31331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f31332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f31333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f31334h;
    public y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f31335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IInterface f31336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f31337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0 f31338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f31340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f31341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f31342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f31343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile String f31344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile ni.i f31345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ma.b f31346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile k0 f31348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f31349x;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context, Looper looper, int i, b bVar, c cVar) {
        p0 p0VarA = p0.a(context);
        ma.g gVar = ma.g.f28775b;
        c0.i(bVar);
        c0.i(cVar);
        this(context, looper, p0VarA, gVar, i, bVar, cVar, null);
    }

    public void a(String str) {
        this.f31327a = str;
        f();
    }

    public int b() {
        return ma.g.f28774a;
    }

    public boolean c() {
        return false;
    }

    public final void d() {
        int iC = this.f31331e.c(this.f31329c, b());
        if (iC == 0) {
            this.f31335j = new m(this);
            w(2, null);
            return;
        }
        w(1, null);
        this.f31335j = new m(this);
        int i = this.f31349x.get();
        f0 f0Var = this.f31332f;
        f0Var.sendMessage(f0Var.obtainMessage(3, i, iC, null));
    }

    public abstract IInterface e(IBinder iBinder);

    public final void f() {
        this.f31349x.incrementAndGet();
        ArrayList arrayList = this.f31337l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    x xVar = (x) arrayList.get(i);
                    synchronized (xVar) {
                        xVar.f31447a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f31334h) {
            this.i = null;
        }
        w(1, null);
    }

    public Account g() {
        return null;
    }

    public ma.d[] h() {
        return f31326y;
    }

    public final ma.d[] i() {
        k0 k0Var = this.f31348w;
        if (k0Var == null) {
            return null;
        }
        return k0Var.f31392c;
    }

    public Executor j() {
        return null;
    }

    public Bundle k() {
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(j jVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleK = k();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f31345t == null || (attributionSource = (AttributionSource) this.f31345t.f29407c) == null || attributionSource.getAttributionTag() == null) ? this.f31344s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.f31342q;
        int i10 = ma.g.f28774a;
        Scope[] scopeArr = h.f31362p;
        Bundle bundle = new Bundle();
        ma.d[] dVarArr = h.f31363q;
        h hVar = new h(6, i, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        hVar.f31367e = this.f31329c.getPackageName();
        hVar.f31370h = bundleK;
        if (set != null) {
            hVar.f31369g = (Scope[]) set.toArray(new Scope[0]);
        }
        if (c()) {
            Account accountG = g();
            if (accountG == null) {
                accountG = new Account("<<default account>>", "com.google");
            }
            hVar.i = accountG;
            if (jVar != 0) {
                hVar.f31368f = ((cb.a) jVar).f2256c;
            }
        } else if (this instanceof jb.a) {
            hVar.i = null;
        }
        hVar.f31371j = f31326y;
        hVar.f31372k = h();
        if (u()) {
            hVar.f31375n = true;
        }
        try {
            synchronized (this.f31334h) {
                try {
                    y yVar = this.i;
                    if (yVar != null) {
                        yVar.c0(new g0(this, this.f31349x.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i11 = this.f31349x.get();
            f0 f0Var = this.f31332f;
            f0Var.sendMessage(f0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f31349x.get();
            i0 i0Var = new i0(this, 8, null, null);
            f0 f0Var2 = this.f31332f;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i12, -1, i0Var));
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f31349x.get();
            i0 i0Var2 = new i0(this, 8, null, null);
            f0 f0Var22 = this.f31332f;
            f0Var22.sendMessage(f0Var22.obtainMessage(1, i122, -1, i0Var2));
        }
    }

    public Set m() {
        return Collections.EMPTY_SET;
    }

    public final IInterface n() {
        IInterface iInterface;
        synchronized (this.f31333g) {
            try {
                if (this.f31339n == 5) {
                    throw new DeadObjectException();
                }
                if (!r()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f31336k;
                c0.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String o();

    public abstract String p();

    public boolean q() {
        return b() >= 211700000;
    }

    public final boolean r() {
        boolean z5;
        synchronized (this.f31333g) {
            z5 = this.f31339n == 4;
        }
        return z5;
    }

    public final boolean s() {
        boolean z5;
        synchronized (this.f31333g) {
            int i = this.f31339n;
            z5 = true;
            if (i != 2 && i != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    public void t() {
        System.currentTimeMillis();
    }

    public boolean u() {
        return this instanceof bb.b;
    }

    public final /* synthetic */ boolean v(int i, int i10, IInterface iInterface) {
        synchronized (this.f31333g) {
            try {
                if (this.f31339n != i) {
                    return false;
                }
                w(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void w(int i, IInterface iInterface) {
        l6.h hVar;
        c0.b((i == 4) == (iInterface != null));
        synchronized (this.f31333g) {
            try {
                this.f31339n = i;
                this.f31336k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    h0 h0Var = this.f31338m;
                    if (h0Var != null) {
                        p0 p0Var = this.f31330d;
                        String str = this.f31328b.f27975a;
                        c0.i(str);
                        this.f31328b.getClass();
                        if (this.f31343r == null) {
                            this.f31329c.getClass();
                        }
                        boolean z5 = this.f31328b.f27976b;
                        p0Var.getClass();
                        p0Var.c(new m0(str, z5), h0Var);
                        this.f31338m = null;
                    }
                } else if (i == 2 || i == 3) {
                    h0 h0Var2 = this.f31338m;
                    if (h0Var2 != null && (hVar = this.f31328b) != null) {
                        String str2 = hVar.f27975a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        p0 p0Var2 = this.f31330d;
                        String str3 = this.f31328b.f27975a;
                        c0.i(str3);
                        this.f31328b.getClass();
                        if (this.f31343r == null) {
                            this.f31329c.getClass();
                        }
                        boolean z10 = this.f31328b.f27976b;
                        p0Var2.getClass();
                        p0Var2.c(new m0(str3, z10), h0Var2);
                        this.f31349x.incrementAndGet();
                    }
                    h0 h0Var3 = new h0(this, this.f31349x.get());
                    this.f31338m = h0Var3;
                    String strP = p();
                    boolean zQ = q();
                    this.f31328b = new l6.h(strP, zQ);
                    if (zQ && b() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f31328b.f27975a)));
                    }
                    p0 p0Var3 = this.f31330d;
                    String str4 = this.f31328b.f27975a;
                    c0.i(str4);
                    this.f31328b.getClass();
                    String name = this.f31343r;
                    if (name == null) {
                        name = this.f31329c.getClass().getName();
                    }
                    ma.b bVarB = p0Var3.b(new m0(str4, this.f31328b.f27976b), h0Var3, name, j());
                    if (!bVarB.c()) {
                        String str5 = this.f31328b.f27975a;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i10 = bVarB.f28761c;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (bVarB.f28762d != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarB.f28762d);
                        }
                        int i11 = this.f31349x.get();
                        j0 j0Var = new j0(this, i10, bundle);
                        f0 f0Var = this.f31332f;
                        f0Var.sendMessage(f0Var.obtainMessage(7, i11, -1, j0Var));
                    }
                } else if (i == 4) {
                    c0.i(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public e(Context context, Looper looper, p0 p0Var, ma.g gVar, int i, b bVar, c cVar, String str) {
        this.f31327a = null;
        this.f31333g = new Object();
        this.f31334h = new Object();
        this.f31337l = new ArrayList();
        this.f31339n = 1;
        this.f31346u = null;
        this.f31347v = false;
        this.f31348w = null;
        this.f31349x = new AtomicInteger(0);
        c0.j(context, "Context must not be null");
        this.f31329c = context;
        c0.j(looper, "Looper must not be null");
        c0.j(p0Var, "Supervisor must not be null");
        this.f31330d = p0Var;
        c0.j(gVar, "API availability must not be null");
        this.f31331e = gVar;
        this.f31332f = new f0(this, looper);
        this.f31342q = i;
        this.f31340o = bVar;
        this.f31341p = cVar;
        this.f31343r = str;
    }
}
