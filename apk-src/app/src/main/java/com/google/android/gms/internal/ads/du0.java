package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 implements gu0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final du0 f4673e = new du0(new hu0());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4677d;

    public du0(hu0 hu0Var) {
        this.f4677d = hu0Var;
    }

    @Override // com.google.android.gms.internal.ads.gu0
    public void a(boolean z5) {
        if (!this.f4675b && z5) {
            Date date = new Date();
            Date date2 = (Date) this.f4676c;
            if (date2 == null || date.after(date2)) {
                this.f4676c = date;
                if (this.f4674a) {
                    Iterator it = Collections.unmodifiableCollection(fu0.f5441c.f5443b).iterator();
                    while (it.hasNext()) {
                        ou0 ou0Var = ((ut0) it.next()).f11066d;
                        Date date3 = (Date) this.f4676c;
                        ou0Var.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f4675b = z5;
    }

    public du0(oq0 oq0Var, in0 in0Var, to0 to0Var) {
        this.f4674a = false;
        this.f4675b = false;
        this.f4676c = to0Var;
        ed.d dVarE = ((kx0) in0Var.f6553c).E(to0Var.f10674b, to0Var.f10673a, null);
        yq yqVar = new yq(this, in0Var, oq0Var, to0Var, 5);
        Executor executor = to0Var.f10677e;
        this.f4677d = vv.H(vv.J(dVarE, yqVar, executor), Exception.class, new np(this, in0Var), executor);
    }
}
