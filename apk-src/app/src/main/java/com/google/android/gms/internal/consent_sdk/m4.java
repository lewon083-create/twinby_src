package com.google.android.gms.internal.consent_sdk;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements h6, h7, yc.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m4 f13468c = new m4(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m4 f13469d = new m4(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m4 f13470e = new m4(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m4 f13471f = new m4(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m4 f13472g = new m4(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m4 f13473h = new m4(5);
    public static final m4 i = new m4(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m4 f13474j = new m4(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m4 f13475k = new m4(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m4 f13476l = new m4(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m4 f13477m = new m4(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m4 f13478n = new m4(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m4 f13479o = new m4(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m4 f13480p = new m4(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m4 f13481q = new m4(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m4 f13482r = new m4(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m4 f13483s = new m4(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m4 f13484t = new m4(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m4 f13485u = new m4(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m4 f13486v = new m4(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m4 f13487w = new m4(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13488b;

    public /* synthetic */ m4(int i10) {
        this.f13488b = i10;
    }

    @Override // yc.f
    public void a(yc.e eVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(eVar.f45613b)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public o6 c(Class cls) {
        switch (this.f13488b) {
            case 20:
                if (!t5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (o6) t5.h(cls.asSubclass(t5.class)).f(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.h6
    public boolean d(Class cls) {
        switch (this.f13488b) {
            case 20:
                return t5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public Object j() {
        switch (this.f13488b) {
            case 21:
                return new a();
            default:
                e0 e0Var = f0.f13386b;
                h0.c(e0Var);
                return new r0(e0Var);
        }
    }
}
