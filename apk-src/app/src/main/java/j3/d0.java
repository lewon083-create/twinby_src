package j3;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26228c;

    public d0(String str, Throwable th2, boolean z5, int i) {
        super(str, th2);
        this.f26227b = z5;
        this.f26228c = i;
    }

    public static d0 a(RuntimeException runtimeException, String str) {
        return new d0(str, runtimeException, true, 1);
    }

    public static d0 b(String str, Exception exc) {
        return new d0(str, exc, true, 4);
    }

    public static d0 c(String str) {
        return new d0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f26227b);
        sb2.append(", dataType=");
        return t.z.d(this.f26228c, "}", sb2);
    }
}
