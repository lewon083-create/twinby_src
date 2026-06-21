package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g7 implements i7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f13395d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile h7 f13396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f13397c;

    /* JADX WARN: Multi-variable type inference failed */
    public static g7 a(h7 h7Var) {
        if (h7Var instanceof g7) {
            return (g7) h7Var;
        }
        g7 g7Var = new g7();
        g7Var.f13397c = f13395d;
        g7Var.f13396b = h7Var;
        return g7Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    public final Object j() {
        Object obj = this.f13397c;
        Object obj2 = f13395d;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f13397c;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objJ = this.f13396b.j();
                Object obj4 = this.f13397c;
                if (obj4 != obj2 && obj4 != objJ) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objJ + ". This is likely due to a circular dependency.");
                }
                this.f13397c = objJ;
                this.f13396b = null;
                return objJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
