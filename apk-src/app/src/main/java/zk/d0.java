package zk;

import com.google.android.gms.internal.ads.gn0;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f46346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f46347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f46350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f46351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0 f46352h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f46353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d0 f46354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f46355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f46356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gn0 f46357n;

    public d0(x request, v protocol, String message, int i, j jVar, k headers, f0 f0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j10, long j11, gn0 gn0Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f46346b = request;
        this.f46347c = protocol;
        this.f46348d = message;
        this.f46349e = i;
        this.f46350f = jVar;
        this.f46351g = headers;
        this.f46352h = f0Var;
        this.i = d0Var;
        this.f46353j = d0Var2;
        this.f46354k = d0Var3;
        this.f46355l = j10;
        this.f46356m = j11;
        this.f46357n = gn0Var;
    }

    public static String a(String name, d0 d0Var) {
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = d0Var.f46351g.a(name);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final c0 b() {
        Intrinsics.checkNotNullParameter(this, "response");
        c0 c0Var = new c0();
        c0Var.f46331a = this.f46346b;
        c0Var.f46332b = this.f46347c;
        c0Var.f46333c = this.f46349e;
        c0Var.f46334d = this.f46348d;
        c0Var.f46335e = this.f46350f;
        c0Var.f46336f = this.f46351g.e();
        c0Var.f46337g = this.f46352h;
        c0Var.f46338h = this.i;
        c0Var.i = this.f46353j;
        c0Var.f46339j = this.f46354k;
        c0Var.f46340k = this.f46355l;
        c0Var.f46341l = this.f46356m;
        c0Var.f46342m = this.f46357n;
        return c0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f0 f0Var = this.f46352h;
        if (f0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        f0Var.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f46347c + ", code=" + this.f46349e + ", message=" + this.f46348d + ", url=" + this.f46346b.f46511a + '}';
    }
}
