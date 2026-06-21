package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 implements ep0, e80, jr0, k81, hl1, o31, td0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12221c;

    public static xo0 c(b31 b31Var) {
        return new xo0(7, new in0(10, b31Var));
    }

    public static xo0 d(byte[] bArr) {
        return new xo0(9, sl1.a(bArr));
    }

    public static xo0 e(int i) {
        return new xo0(9, sl1.a(ae1.a(i)));
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public /* synthetic */ Object a(Object obj) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            ((xr0) this.f12221c).h();
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.hl1
    public Object b(String str) {
        kl1 kl1Var = (kl1) this.f12221c;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return kl1Var.e(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return kl1Var.e(str, null);
    }

    public synchronized ed.d f(n90 n90Var, dp0 dp0Var, z50 z50Var) {
        b50 b50VarH;
        try {
            if (z50Var != null) {
                this.f12221c = z50Var;
            } else {
                this.f12221c = (z50) dp0Var.d((cp0) n90Var.f8249d).c();
            }
            b50VarH = ((z50) this.f12221c).h();
        } catch (Throwable th2) {
            throw th2;
        }
        return b50VarH.c(b50VarH.b());
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public Object g() {
        z50 z50Var;
        synchronized (this) {
            z50Var = (z50) this.f12221c;
        }
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        return (ez) this.f12221c;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        cz0 cz0Var = (cz0) obj;
        xy0 xy0Var = (xy0) ((gz0) this.f12221c).f5989d;
        synchronized (xy0Var.f12386n) {
            yc ycVar = xy0Var.f12389q;
            String strH = cz0Var.h();
            ycVar.b();
            ((zc) ycVar.f9560c).J(strH);
        }
    }

    public List j(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itE = ((n31) this.f12221c).e(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            m31 m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) m31Var.next());
        }
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* bridge */ /* synthetic */ ed.d x(n90 n90Var, dp0 dp0Var) {
        return f(n90Var, dp0Var, null);
    }

    public /* synthetic */ xo0(int i, Object obj) {
        this.f12220b = i;
        this.f12221c = obj;
    }

    public /* synthetic */ xo0(xu1 xu1Var, jx1 jx1Var, ws1 ws1Var) {
        this.f12220b = 13;
        this.f12221c = jx1Var;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f12220b) {
            case 1:
                or0 or0Var = (or0) this.f12221c;
                ((sr0) obj).x((pr0) or0Var.f8765b, or0Var.f8766c);
                break;
            case 12:
                ((yu1) obj).r();
                break;
            default:
                ((yu1) obj).k((jx1) this.f12221c);
                break;
        }
    }

    public /* synthetic */ xo0(xu1 xu1Var, Object obj, long j10) {
        this.f12220b = 12;
        this.f12221c = obj;
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
    }
}
