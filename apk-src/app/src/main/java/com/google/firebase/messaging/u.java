package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.impl.Tb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Intrinsics;
import t.r1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14875e;

    public /* synthetic */ u(int i, Object obj, Object obj2, boolean z5) {
        this.f14872b = i;
        this.f14874d = obj;
        this.f14873c = z5;
        this.f14875e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [t.m1, t.n] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14872b) {
            case 0:
                Context context = (Context) this.f14874d;
                boolean z5 = this.f14873c;
                sb.g gVar = (sb.g) this.f14875e;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = h5.v(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z5) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    gVar.d(null);
                }
            case 1:
                Tb.a((Tb) this.f14874d, (LocationControllerObserver) this.f14875e, this.f14873c);
                return;
            case 2:
                oi.j jVar = (oi.j) this.f14874d;
                boolean z10 = this.f14873c;
                sb.g gVar2 = (sb.g) this.f14875e;
                try {
                    FirebaseAnalytics firebaseAnalytics = jVar.f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    m1 m1Var = firebaseAnalytics.f14753a;
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    m1Var.getClass();
                    m1Var.c(new a1(m1Var, boolValueOf));
                    gVar2.b(null);
                    return;
                } catch (Exception e3) {
                    gVar2.a(e3);
                    return;
                }
            default:
                final r1 r1Var = (r1) this.f14874d;
                boolean z11 = this.f14873c;
                final j1.h hVar = (j1.h) this.f14875e;
                r1Var.f33252a.B(r1Var.f33273w);
                r1Var.f33272v = z11;
                if (!r1Var.f33255d) {
                    hVar.d(new a0.o("Camera is not active."));
                    return;
                }
                final long jF = r1Var.f33252a.F();
                ?? r12 = new t.n() { // from class: t.m1
                    @Override // t.n
                    public final boolean b(TotalCaptureResult totalCaptureResult) {
                        boolean z12 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        com.google.android.gms.internal.auth.g.e("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z12);
                        if (z12 != r1Var.f33272v || !o.A(totalCaptureResult, jF)) {
                            return false;
                        }
                        com.google.android.gms.internal.auth.g.e("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z12);
                        hVar.b(null);
                        return true;
                    }
                };
                r1Var.f33273w = r12;
                r1Var.f33252a.a(r12);
                return;
        }
    }

    public /* synthetic */ u(Tb tb2, LocationControllerObserver locationControllerObserver, boolean z5) {
        this.f14872b = 1;
        this.f14874d = tb2;
        this.f14875e = locationControllerObserver;
        this.f14873c = z5;
    }
}
