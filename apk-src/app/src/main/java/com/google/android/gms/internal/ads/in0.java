package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class in0 implements y71, al0, k81, sb.c, ly0, n31, o31, td0, yz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6553c;

    public /* synthetic */ in0(int i, Object obj) {
        this.f6552b = i;
        this.f6553c = obj;
    }

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo0a(Object obj) {
        yu1 yu1Var = (yu1) obj;
        switch (this.f6552b) {
            case 16:
                yu1Var.c((vs1) this.f6553c);
                break;
            default:
                bs bsVar = (bs) this.f6553c;
                yu1Var.j(bsVar);
                int i = bsVar.f3860a;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.yz1
    public r51 b(int i, pi piVar, int[] iArr) {
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < piVar.f9070a) {
            int i12 = i;
            pi piVar2 = piVar;
            rz1 rz1Var = new rz1(i12, piVar2, i10, (uz1) this.f6553c, iArr[i10]);
            int length = objArrCopyOf.length;
            int i13 = i11 + 1;
            int iD = s41.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = rz1Var;
            i10++;
            i11 = i13;
            i = i12;
            piVar = piVar2;
        }
        return x41.x(i11, objArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public /* synthetic */ void c(Object obj, FileOutputStream fileOutputStream) {
        ((pm1) obj).c(fileOutputStream);
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public Object d(FileInputStream fileInputStream) {
        try {
            qo1 qo1VarO = ((sn1) ((pm1) this.f6553c)).o();
            kn1 kn1Var = kn1.f7271a;
            int i = tm1.f10663a;
            kn1 kn1Var2 = kn1.f7272b;
            rn1 rn1Var = (rn1) qo1VarO;
            rn1Var.getClass();
            dn1 dn1Var = new dn1(fileInputStream);
            sn1 sn1VarL = sn1.l(rn1Var.f10002a, dn1Var, kn1Var2);
            dn1Var.i(0);
            if (sn1.w(sn1VarL, true)) {
                return sn1VarL;
            }
            throw new co1(new dp1().getMessage());
        } catch (co1 e3) {
            throw new jy0("Cannot read proto.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.n31
    public /* synthetic */ Iterator e(xo0 xo0Var, CharSequence charSequence) {
        return new k31(charSequence, (b31) this.f6553c, 0);
    }

    public void f(String str, qs1 qs1Var) {
        if (qs1Var == null) {
            throw new NullPointerException("provider");
        }
        ((LinkedHashMap) this.f6553c).put(str, qs1Var);
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public /* synthetic */ Object mo8h() {
        return (b) this.f6553c;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f6552b) {
            case 4:
                ((xr0) this.f6553c).h();
                return;
            default:
                ht0 ht0Var = (ht0) this.f6553c;
                synchronized (ht0Var) {
                    try {
                        ht0Var.f6252m.set(false);
                        if (obj != null) {
                            ht0Var.f6250k.a();
                            ht0Var.f6256q.set(true);
                            ht0Var.b(obj);
                        }
                        if (obj == null || ht0Var.f6246f == null) {
                            ht0Var.c(obj == null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public void j(String str, qs1 qs1Var) {
        f(str, qs1Var);
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f6552b) {
            case 4:
                return;
            default:
                ht0 ht0Var = (ht0) this.f6553c;
                synchronized (ht0Var) {
                    try {
                        ht0Var.f6252m.set(false);
                        if ((th2 instanceof et0) && ((et0) th2).f5066b == 0) {
                            throw null;
                        }
                        ht0Var.c(true);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ly0
    public /* synthetic */ Object l() {
        return (pm1) this.f6553c;
    }

    public os1 m() {
        return new os1((LinkedHashMap) this.f6553c);
    }

    @Override // sb.c
    public /* synthetic */ void onFailure(Exception exc) {
        cw cwVar = (cw) this.f6553c;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((dv0) cwVar.f4349e).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public void r(r40 r40Var) {
        up0 up0Var = (up0) this.f6553c;
        qc0 qc0Var = (qc0) r40Var;
        synchronized (up0Var) {
            try {
                up0Var.f11045e = qc0Var;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3075k4)).booleanValue()) {
                    qc0Var.f9451u.f5889a = up0Var.f11044d;
                }
                up0Var.f11045e.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ in0(xu1 xu1Var, Object obj, int i) {
        this.f6552b = i;
        this.f6553c = obj;
    }

    @Override // com.google.android.gms.internal.ads.y71
    public ed.d h() {
        Bundle bundle;
        String str;
        HashMap map;
        w51 w51VarA;
        jn0 jn0Var = (jn0) this.f6553c;
        wk wkVar = al.f3005fc;
        q9.s sVar = q9.s.f31967e;
        String lowerCase = ((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? jn0Var.f6894e.f6575g.toLowerCase(Locale.ROOT) : jn0Var.f6894e.f6575g;
        if (((Boolean) sVar.f31970c.a(al.f2918a2)).booleanValue()) {
            te0 te0Var = jn0Var.f6897h;
            synchronized (te0Var) {
                bundle = new Bundle(te0Var.f10592b);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) sVar.f31970c.a(al.T4)).booleanValue()) {
            yw ywVarN = p9.k.C.f31302h.g().n();
            str = (TextUtils.isEmpty(ywVarN.f12770e) || ywVarN.f12772g == null) ? "EMPTY" : ywVarN.b() ? "VALID" : "INVALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) sVar.f31970c.a(al.f3057j2)).booleanValue()) {
            lk0 lk0Var = jn0Var.f6892c;
            String str3 = jn0Var.f6898j;
            synchronized (lk0Var) {
                try {
                    w51 w51VarA2 = lk0Var.a(str3, lowerCase);
                    w51 w51VarI = lk0Var.i(lowerCase);
                    map = new HashMap();
                    for (Map.Entry entry : (t51) w51VarA2.entrySet()) {
                        String str4 = (String) entry.getKey();
                        if (w51VarI.containsKey(str4)) {
                            ok0 ok0Var = (ok0) w51VarI.get(str4);
                            List list = (List) entry.getValue();
                            map.put(str4, new ok0(str4, ok0Var.f8713b, ok0Var.f8714c, ok0Var.f8715d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    d61 d61VarA = w51VarI.entrySet().a();
                    while (d61VarA.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) d61VarA.next();
                        String str5 = (String) entry2.getKey();
                        if (!map.containsKey(str5) && ((ok0) entry2.getValue()).f8715d) {
                            map.put(str5, (ok0) entry2.getValue());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jn0Var.a(arrayList, map);
        } else {
            lk0 lk0Var2 = jn0Var.f6892c;
            for (Map.Entry entry3 : (t51) lk0Var2.a(jn0Var.f6898j, lowerCase).entrySet()) {
                String str6 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle3 = jn0Var.f6894e.f6572d.f31812n;
                arrayList.add(jn0Var.b(str6, list2, bundle3 != null ? bundle3.getBundle(str6) : null, true, true));
            }
            synchronized (lk0Var2) {
                w51VarA = TextUtils.isEmpty(p9.k.C.f31302h.g().n().f12770e) ? w51.f11648h : w51.a(lk0Var2.f7552b);
            }
            jn0Var.a(arrayList, w51VarA);
        }
        x41 x41VarV = x41.v(arrayList);
        x50 x50Var = new x50(arrayList, bundle2, str2);
        r81 r81Var = jn0Var.f6890a;
        e81 e81Var = new e81(x41VarV, true, false);
        e81Var.f4874q = new d81(e81Var, x50Var, r81Var);
        e81Var.w();
        return e81Var;
    }

    public in0() {
        this.f6552b = 11;
        this.f6553c = new AtomicBoolean(false);
    }

    public in0(int i) {
        this.f6552b = 13;
        this.f6553c = ix.K(i);
    }

    private final void g(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        up0 up0Var = (up0) this.f6553c;
        synchronized (up0Var) {
            up0Var.f11045e = null;
        }
    }
}
