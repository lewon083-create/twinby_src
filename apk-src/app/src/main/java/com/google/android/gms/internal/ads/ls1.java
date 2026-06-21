package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements qs1, js1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7602c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile qs1 f7603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7604b = f7602c;

    public ls1(qs1 qs1Var) {
        this.f7603a = qs1Var;
    }

    public static ls1 a(qs1 qs1Var) {
        return qs1Var instanceof ls1 ? (ls1) qs1Var : new ls1(qs1Var);
    }

    public static js1 b(qs1 qs1Var) {
        if (qs1Var instanceof js1) {
            return (js1) qs1Var;
        }
        qs1Var.getClass();
        return new ls1(qs1Var);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        Object obj = this.f7604b;
        Object obj2 = f7602c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f7604b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objJ = this.f7603a.j();
                Object obj4 = this.f7604b;
                if (obj4 != obj2 && obj4 != objJ) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objJ + ". This is likely due to a circular dependency.");
                }
                this.f7604b = objJ;
                this.f7603a = null;
                return objJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
