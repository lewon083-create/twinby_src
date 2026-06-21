package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u33 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f43543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f43544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f43545c = Uri.EMPTY;

    public u33(p30 p30Var) {
        this.f43543a = (p30) ni.a(p30Var);
    }

    @Override // yads.p30
    public final void a(u83 u83Var) {
        u83Var.getClass();
        this.f43543a.a(u83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f43543a.close();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f43543a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f43543a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f43543a.read(bArr, i, i10);
        if (i11 != -1) {
            this.f43544b += (long) i11;
        }
        return i11;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        this.f43545c = u30Var.f43533a;
        long jA = this.f43543a.a(u30Var);
        Uri uri = this.f43543a.getUri();
        uri.getClass();
        this.f43545c = uri;
        this.f43543a.getResponseHeaders();
        return jA;
    }
}
