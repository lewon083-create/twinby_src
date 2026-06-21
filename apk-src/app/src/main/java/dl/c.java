package dl;

import com.google.android.gms.internal.ads.gn0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import nl.x;
import nl.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f15817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gn0 f15823h;

    public c(gn0 gn0Var, x delegate, long j10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15823h = gn0Var;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15817b = delegate;
        this.f15818c = j10;
        this.f15820e = true;
        if (j10 == 0) {
            b(null);
        }
    }

    @Override // nl.x
    public final long D(nl.g sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f15822g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jD = this.f15817b.D(sink, 8192L);
            if (this.f15820e) {
                this.f15820e = false;
                g call = (g) this.f15823h.f5875d;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            if (jD == -1) {
                b(null);
                return -1L;
            }
            long j11 = this.f15819d + jD;
            long j12 = this.f15818c;
            if (j12 == -1 || j11 <= j12) {
                this.f15819d = j11;
                if (j11 == j12) {
                    b(null);
                }
                return jD;
            }
            throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final void a() throws IOException {
        this.f15817b.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f15821f) {
            return iOException;
        }
        this.f15821f = true;
        gn0 gn0Var = this.f15823h;
        if (iOException == null && this.f15820e) {
            this.f15820e = false;
            g call = (g) gn0Var.f5875d;
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return gn0Var.f(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f15822g) {
            return;
        }
        this.f15822g = true;
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // nl.x
    public final z timeout() {
        return this.f15817b.timeout();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f15817b + ')';
    }
}
