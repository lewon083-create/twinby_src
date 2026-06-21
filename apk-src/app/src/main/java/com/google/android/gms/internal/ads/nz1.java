package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 extends eb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x41 f8526d;

    public nz1(String str, r51 r51Var) {
        super(str, null, false, 1);
        this.f8526d = x41.v(r51Var);
    }

    @Override // com.google.android.gms.internal.ads.eb, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        x41 x41Var = this.f8526d;
        if (x41Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(x41Var);
        return t.z.g(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
