package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 implements d6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i5 f13784b = new i5(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13785a;

    public /* synthetic */ i5(int i) {
        this.f13785a = i;
    }

    public static final b6 a(Object obj, Object obj2) {
        b6 b6VarA = (b6) obj;
        b6 b6Var = (b6) obj2;
        if (!b6Var.isEmpty()) {
            if (!b6VarA.f13674b) {
                b6VarA = b6VarA.a();
            }
            b6VarA.c();
            if (!b6Var.isEmpty()) {
                b6VarA.putAll(b6Var);
            }
        }
        return b6VarA;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public boolean c(Class cls) {
        switch (this.f13785a) {
            case 0:
                return k5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public l6 d(Class cls) {
        switch (this.f13785a) {
            case 0:
                if (!k5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (l6) k5.l(cls.asSubclass(k5.class)).o(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
