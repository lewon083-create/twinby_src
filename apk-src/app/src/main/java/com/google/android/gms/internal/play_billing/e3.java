package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e3 f14169b = new e3(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14170a;

    public /* synthetic */ e3(int i) {
        this.f14170a = i;
    }

    public static final u3 a(Object obj, Object obj2) {
        u3 u3Var = (u3) obj;
        u3 u3Var2 = (u3) obj2;
        if (!u3Var2.isEmpty()) {
            if (!u3Var.f14330b) {
                if (u3Var.isEmpty()) {
                    u3Var = new u3();
                } else {
                    u3 u3Var3 = new u3(u3Var);
                    u3Var3.f14330b = true;
                    u3Var = u3Var3;
                }
            }
            u3Var.b();
            if (!u3Var2.isEmpty()) {
                u3Var.putAll(u3Var2);
            }
        }
        return u3Var;
    }

    @Override // com.google.android.gms.internal.play_billing.w3
    public e4 c(Class cls) {
        switch (this.f14170a) {
            case 0:
                if (!g3.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (e4) g3.h(cls.asSubclass(g3.class)).d(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w3
    public boolean d(Class cls) {
        switch (this.f14170a) {
            case 0:
                return g3.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
