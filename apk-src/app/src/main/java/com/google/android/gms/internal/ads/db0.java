package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0 f4540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc0 f4541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bb0 f4542c = null;

    public db0(yc0 yc0Var, kc0 kc0Var) {
        this.f4540a = yc0Var;
        this.f4541b = kc0Var;
    }

    public static final int b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        return u9.d.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        sz szVarA = this.f4540a.a(q9.g3.c(), null, null);
        szVarA.i0().setVisibility(4);
        szVarA.i0().setContentDescription("policy_validator");
        szVarA.u0("/sendMessageToSdk", new ko(9, this));
        szVarA.u0("/hideValidatorOverlay", new ab0(this, windowManager, frameLayout));
        szVarA.u0("/open", new bp(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(szVarA);
        ab0 ab0Var = new ab0(this, frameLayout, windowManager);
        kc0 kc0Var = this.f4541b;
        kc0Var.b("/loadNativeAdPolicyViolations", new s90(kc0Var, weakReference, "/loadNativeAdPolicyViolations", ab0Var));
        kc0Var.b("/showValidatorOverlay", new s90(kc0Var, new WeakReference(szVarA), "/showValidatorOverlay", po.f9139h));
        return szVarA.i0();
    }
}
