package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vi0 implements zh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11387a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11392f;

    public vi0(Context context, s10 s10Var, rr0 rr0Var, r81 r81Var, gl glVar) {
        this.f11388b = context;
        this.f11389c = s10Var;
        this.f11392f = rr0Var;
        this.f11391e = r81Var;
        this.f11390d = glVar;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(eq0 eq0Var, xp0 xp0Var) {
        String string;
        bq0 bq0Var;
        switch (this.f11387a) {
            case 0:
                Context context = this.f11388b;
                if ((context instanceof Activity) && jl.a(context)) {
                    try {
                        string = xp0Var.f12266v.getString("tab_url");
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                    }
                }
                break;
            default:
                if (((gl) this.f11390d) == null || (bq0Var = xp0Var.f12260s) == null || bq0Var.f3852a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final ed.d b(eq0 eq0Var, xp0 xp0Var) {
        String string;
        switch (this.f11387a) {
            case 0:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3158pe)).booleanValue()) {
                    zd1 zd1VarA = ((sd0) this.f11392f).a();
                    zd1VarA.v("action", "cstm_tbs_rndr");
                    zd1VarA.w();
                }
                try {
                    string = xp0Var.f12266v.getString("tab_url");
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                return vv.J(n81.f8237c, new ui0(this, string != null ? Uri.parse(string) : null, eq0Var, xp0Var, (zp0) eq0Var.f5033b.f4348d, 0), (Executor) this.f11390d);
            default:
                fk0 fk0Var = new fk0(new View(this.f11388b), null, l80.f7437u, (yp0) xp0Var.f12264u.get(0));
                oq0 oq0Var = new oq0(eq0Var, xp0Var, (String) null);
                s10 s10Var = (s10) this.f11389c;
                r10 r10Var = new r10(s10Var.f10129d, s10Var.f10131e, oq0Var, fk0Var);
                g60 g60Var = (g60) r10Var.f9663n.j();
                q60 q60Var = (q60) r10Var.f9666q.j();
                w80 w80Var = (w80) r10Var.f9668s.j();
                t80 t80Var = (t80) r10Var.B.j();
                n30 n30Var = (n30) r10Var.f9658h.j();
                hi hiVar = new hi();
                hiVar.f6146g = new AtomicBoolean(false);
                hiVar.f6141b = g60Var;
                hiVar.f6142c = q60Var;
                hiVar.f6143d = w80Var;
                hiVar.f6144e = t80Var;
                hiVar.f6145f = n30Var;
                bq0 bq0Var = xp0Var.f12260s;
                fl flVar = new fl(hiVar, bq0Var.f3853b, bq0Var.f3852a);
                rr0 rr0Var = (rr0) this.f11392f;
                Objects.requireNonNull(rr0Var);
                n90 n90Var = new n90(15, this, flVar);
                hi hiVar2 = new hi(rr0Var, pr0.CUSTOM_RENDER_SYN, null, rr0.f10029d, Collections.EMPTY_LIST, ((gx) ((r81) this.f11391e)).b(new do0(2, n90Var)));
                hi hiVarA = ((rr0) hiVar2.f6146g).a(hiVar2.r(), pr0.CUSTOM_RENDER_ACK);
                return new hi((rr0) hiVarA.f6146g, hiVarA.f6143d, (String) hiVarA.f6141b, (ed.d) hiVarA.f6142c, (List) hiVarA.f6144e, vv.J((ed.d) hiVarA.f6145f, new cr(1, vv.d(r10Var.i0())), hx.f6285g)).r();
        }
    }

    public vi0(Context context, Executor executor, w10 w10Var, wp0 wp0Var, sd0 sd0Var) {
        this.f11388b = context;
        this.f11389c = w10Var;
        this.f11390d = executor;
        this.f11391e = wp0Var;
        this.f11392f = sd0Var;
    }
}
