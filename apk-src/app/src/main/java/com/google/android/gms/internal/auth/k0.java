package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f13252b = new k0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13253a;

    public /* synthetic */ k0(int i) {
        this.f13253a = i;
    }

    @Override // com.google.android.gms.internal.auth.a1
    public final j1 c(Class cls) {
        switch (this.f13253a) {
            case 0:
                if (!l0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (j1) l0.a(cls.asSubclass(l0.class)).h(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.auth.a1
    public final boolean d(Class cls) {
        switch (this.f13253a) {
            case 0:
                return l0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
