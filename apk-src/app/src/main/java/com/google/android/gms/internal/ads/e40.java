package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e40 implements r60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sz f4830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd0 f4831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xp0 f4832d;

    public e40(sz szVar, sd0 sd0Var, xp0 xp0Var) {
        this.f4830b = szVar;
        this.f4831c = sd0Var;
        this.f4832d = xp0Var;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        sz szVar;
        String str;
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3023ge)).booleanValue() || (szVar = this.f4830b) == null) {
            return;
        }
        ViewParent parent = szVar.i0().getParent();
        while (true) {
            if (parent == null) {
                str = CommonUrlParts.Values.FALSE_INTEGER;
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        zd1 zd1VarA = this.f4831c.a();
        zd1VarA.v("action", "hcp");
        zd1VarA.v("hcp", str);
        zd1VarA.t(this.f4832d);
        zd1VarA.w();
    }
}
