package dl;

import com.google.android.gms.internal.ads.gn0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import nl.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends nl.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gn0 f15816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gn0 gn0Var, v delegate, long j10) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15816f = gn0Var;
        this.f15812b = j10;
    }

    public final IOException a(IOException iOException) {
        if (this.f15813c) {
            return iOException;
        }
        this.f15813c = true;
        return this.f15816f.f(false, true, iOException);
    }

    @Override // nl.k, nl.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f15815e) {
            return;
        }
        this.f15815e = true;
        long j10 = this.f15812b;
        if (j10 != -1 && this.f15814d != j10) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e3) {
            throw a(e3);
        }
    }

    @Override // nl.k, nl.v, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e3) {
            throw a(e3);
        }
    }

    @Override // nl.k, nl.v
    public final void write(nl.g source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f15815e) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f15812b;
        if (j11 != -1 && this.f15814d + j10 > j11) {
            StringBuilder sbN = gf.a.n("expected ", " bytes but received ", j11);
            sbN.append(this.f15814d + j10);
            throw new ProtocolException(sbN.toString());
        }
        try {
            super.write(source, j10);
            this.f15814d += j10;
        } catch (IOException e3) {
            throw a(e3);
        }
    }
}
