package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13696f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13698h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l1 l1Var, Activity activity, g0 g0Var) {
        super(l1Var.f13860b, true);
        this.f13698h = activity;
        this.i = g0Var;
        this.f13697g = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f13696f) {
            case 0:
                try {
                    Context context = (Context) this.f13698h;
                    pa.c0.i(context);
                    String strA = ob.y1.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = ob.y1.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    j0 j0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    m1 m1Var = (m1) this.f13697g;
                    boolean z5 = boolValueOf == null || !boolValueOf.booleanValue();
                    m1Var.getClass();
                    try {
                        j0VarAsInterface = i0.asInterface(ya.d.c(context, z5 ? ya.d.f36575d : ya.d.f36574c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (ya.a e3) {
                        m1Var.d(e3, true, false);
                    }
                    m1Var.f13882e = j0VarAsInterface;
                    if (m1Var.f13882e != null) {
                        int iA = ya.d.a(context, ModuleDescriptor.MODULE_ID);
                        t0 t0Var = new t0(133005L, Math.max(iA, r6), Boolean.TRUE.equals(boolValueOf) || ya.d.d(context, ModuleDescriptor.MODULE_ID, false) < iA, (Bundle) this.i, ob.y1.a(context));
                        j0 j0Var = m1Var.f13882e;
                        pa.c0.i(j0Var);
                        j0Var.initialize(new xa.b(context), t0Var, this.f13834b);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e7) {
                    ((m1) this.f13697g).d(e7, true, false);
                    return;
                }
                break;
            case 1:
                j0 j0Var2 = ((m1) this.f13697g).f13882e;
                pa.c0.i(j0Var2);
                j0Var2.logHealthData(5, (String) this.f13698h, new xa.b(this.i), new xa.b(null), new xa.b(null));
                break;
            case 2:
                j0 j0Var3 = ((m1) this.f13697g).f13882e;
                pa.c0.i(j0Var3);
                j0Var3.getMaxUserProperties((String) this.f13698h, (g0) this.i);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.i;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                j0 j0Var4 = ((l1) this.f13697g).f13860b.f13882e;
                pa.c0.i(j0Var4);
                j0Var4.onActivityCreatedByScionActivityInfo(v0.a((Activity) this.f13698h), bundle, this.f13835c);
                break;
            default:
                j0 j0Var5 = ((l1) this.f13697g).f13860b.f13882e;
                pa.c0.i(j0Var5);
                j0Var5.onActivitySaveInstanceStateByScionActivityInfo(v0.a((Activity) this.f13698h), (g0) this.i, this.f13835c);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.j1
    public void b() {
        switch (this.f13696f) {
            case 2:
                ((g0) this.i).W2(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(l1 l1Var, Bundle bundle, Activity activity) {
        super(l1Var.f13860b, true);
        this.i = bundle;
        this.f13698h = activity;
        this.f13697g = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(m1 m1Var, Context context, Bundle bundle) {
        super(m1Var, true);
        this.f13698h = context;
        this.i = bundle;
        this.f13697g = m1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(m1 m1Var, String str, g0 g0Var) {
        super(m1Var, true);
        this.f13698h = str;
        this.i = g0Var;
        Objects.requireNonNull(m1Var);
        this.f13697g = m1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(m1 m1Var, String str, Object obj) {
        super(m1Var, false);
        this.f13698h = str;
        this.i = obj;
        this.f13697g = m1Var;
    }
}
