package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r81 f4585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr0 f4586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4588e;

    public /* synthetic */ dk0(rr0 rr0Var, r81 r81Var, Object obj, Object obj2, int i) {
        this.f4584a = i;
        this.f4586c = rr0Var;
        this.f4585b = r81Var;
        this.f4588e = obj2;
        this.f4587d = obj;
    }

    public static final String c(int i, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        bq0 bq0Var;
        switch (this.f4584a) {
            case 0:
                return !xp0Var.f12262t.isEmpty();
            default:
                return (((gl) this.f4587d) == null || (bq0Var = xp0Var.f12260s) == null || bq0Var.f3852a == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.ug, com.google.android.gms.internal.ads.x60] */
    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        ci0 ci0VarA;
        switch (this.f4584a) {
            case 0:
                Iterator it = xp0Var.f12262t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            ci0VarA = ((bi0) this.f4587d).a((String) it.next(), xp0Var.f12266v);
                        } catch (kq0 unused) {
                        }
                    } else {
                        ci0VarA = null;
                    }
                }
                if (ci0VarA == null) {
                    return vv.y(new fj0(3, "Unable to instantiate mediation adapter class."));
                }
                jx jxVar = new jx();
                com.google.android.gms.internal.measurement.i4 i4Var = new com.google.android.gms.internal.measurement.i4();
                i4Var.f13782c = ci0VarA;
                i4Var.f13783d = jxVar;
                i4Var.f13781b = false;
                ci0VarA.f4218c.n0(i4Var);
                if (xp0Var.M) {
                    Bundle bundle = ((iq0) eq0Var.f5032a.f9149c).f6572d.f31812n;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                rr0 rr0Var = this.f4586c;
                pr0 pr0Var = pr0.ADAPTER_LOAD_AD_SYN;
                Objects.requireNonNull(rr0Var);
                ck0 ck0Var = new ck0(this, eq0Var, xp0Var, ci0VarA);
                r81 r81Var = this.f4585b;
                hi hiVar = new hi(rr0Var, pr0Var, null, rr0.f10029d, Collections.EMPTY_LIST, ((gx) r81Var).b(new do0(2, ck0Var)));
                hi hiVarA = ((rr0) hiVar.f6146g).a(hiVar.r(), pr0.ADAPTER_LOAD_AD_ACK);
                cr crVar = new cr(1, jxVar);
                gx gxVar = hx.f6285g;
                hi hiVar2 = new hi((rr0) hiVarA.f6146g, hiVarA.f6143d, (String) hiVarA.f6141b, (ed.d) hiVarA.f6142c, (List) hiVarA.f6144e, vv.J((ed.d) hiVarA.f6145f, crVar, gxVar));
                return ((rr0) hiVar2.f6146g).a(hiVar2.r(), pr0.ADAPTER_WRAP_ADAPTER).e(new ck0(this, eq0Var, xp0Var, ci0VarA)).r();
            default:
                jx jxVar2 = new jx();
                cf cfVar = new cf(27);
                z7 z7Var = new z7(this, jxVar2, eq0Var, xp0Var, cfVar, 4, false);
                synchronized (cfVar) {
                    cfVar.f4193c = z7Var;
                }
                bq0 bq0Var = xp0Var.f12260s;
                fl flVar = new fl(cfVar, bq0Var.f3853b, bq0Var.f3852a);
                pr0 pr0Var2 = pr0.CUSTOM_RENDER_SYN;
                rr0 rr0Var2 = this.f4586c;
                Objects.requireNonNull(rr0Var2);
                zd1 zd1Var = new zd1(18, (Object) this, (Object) flVar, false);
                r81 r81Var2 = this.f4585b;
                hi hiVar3 = new hi(rr0Var2, pr0Var2, null, rr0.f10029d, Collections.EMPTY_LIST, ((gx) r81Var2).b(new do0(2, zd1Var)));
                hi hiVarA2 = ((rr0) hiVar3.f6146g).a(hiVar3.r(), pr0.CUSTOM_RENDER_ACK);
                cr crVar2 = new cr(1, jxVar2);
                gx gxVar2 = hx.f6285g;
                return new hi((rr0) hiVarA2.f6146g, hiVarA2.f6143d, (String) hiVarA2.f6141b, (ed.d) hiVarA2.f6142c, (List) hiVarA2.f6144e, vv.J((ed.d) hiVarA2.f6145f, crVar2, gxVar2)).r();
        }
    }
}
