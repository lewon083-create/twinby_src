package x0;

import a0.f2;
import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import fh.nd;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v7.f f35600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f35601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f35602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f35603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f35604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f35605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b4.d f35606h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f35607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f2.a f35608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f35609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f35610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f35611n;

    public h(m mVar, Executor executor, f7.i iVar, boolean z5, boolean z10, long j10) {
        v7.f fVar;
        if (Build.VERSION.SDK_INT >= 30) {
            fVar = new v7.f(21, new i0.d());
        } else {
            fVar = new v7.f(21, new nd());
        }
        this.f35600b = fVar;
        this.f35601c = new AtomicBoolean(false);
        this.f35602d = new AtomicReference(null);
        this.f35603e = new AtomicReference(null);
        this.f35604f = new AtomicReference(new f2(4));
        this.f35605g = new AtomicBoolean(false);
        this.f35606h = new b4.d(Boolean.FALSE);
        this.i = mVar;
        this.f35607j = executor;
        this.f35608k = iVar;
        this.f35609l = z5;
        this.f35610m = z10;
        this.f35611n = j10;
    }

    public final void a(Uri uri) {
        if (this.f35601c.get()) {
            b((f2.a) this.f35604f.getAndSet(null), uri);
        }
    }

    public final void b(f2.a aVar, Uri uri) {
        if (aVar != null) {
            ((i0.e) this.f35600b.f34767c).close();
            aVar.accept(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(Context context) {
        if (this.f35601c.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((i0.e) this.f35600b.f34767c).d("finalizeRecording");
        this.f35602d.set(new w(this.i));
        if (this.f35609l) {
            int i = Build.VERSION.SDK_INT;
            AtomicReference atomicReference = this.f35603e;
            if (i >= 31) {
                atomicReference.set(new x(this, context));
            } else {
                atomicReference.set(new y(this));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        f2.a aVar = hVar.f35608k;
        Executor executor = hVar.f35607j;
        if (!this.i.equals(hVar.i)) {
            return false;
        }
        Executor executor2 = this.f35607j;
        if (executor2 == null) {
            if (executor != null) {
                return false;
            }
        } else if (!executor2.equals(executor)) {
            return false;
        }
        f2.a aVar2 = this.f35608k;
        if (aVar2 == null) {
            if (aVar != null) {
                return false;
            }
        } else if (!aVar2.equals(aVar)) {
            return false;
        }
        return this.f35609l == hVar.f35609l && this.f35610m == hVar.f35610m && this.f35611n == hVar.f35611n;
    }

    public final void finalize() throws Throwable {
        try {
            ((i0.e) this.f35600b.f34767c).a();
            f2.a aVar = (f2.a) this.f35604f.getAndSet(null);
            if (aVar != null) {
                b(aVar, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final MediaMuxer h(int i, f7.i iVar) throws IOException {
        if (!this.f35601c.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        w wVar = (w) this.f35602d.getAndSet(null);
        if (wVar == null) {
            throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
        }
        try {
            return wVar.a(i, iVar);
        } catch (RuntimeException e3) {
            throw new IOException("Failed to create MediaMuxer by " + e3, e3);
        }
    }

    public final int hashCode() {
        int iHashCode = (this.i.f35649b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f35607j;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        f2.a aVar = this.f35608k;
        int iHashCode3 = (((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f35609l ? 1231 : 1237)) * 1000003;
        int i = this.f35610m ? 1231 : 1237;
        long j10 = this.f35611n;
        return ((iHashCode3 ^ i) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final void i(s0 s0Var, boolean z5) {
        int i;
        String strK;
        m mVar = s0Var.f35670a;
        m mVar2 = this.i;
        if (!Objects.equals(mVar, mVar2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + mVar + ", Expected: " + mVar2 + "]");
        }
        if (z5) {
            String strConcat = "Sending VideoRecordEvent ".concat(s0Var.getClass().getSimpleName());
            if ((s0Var instanceof n0) && (i = ((n0) s0Var).f35658b) != 0) {
                StringBuilder sbJ = pe.a.j(strConcat);
                switch (i) {
                    case 0:
                        strK = "ERROR_NONE";
                        break;
                    case 1:
                        strK = "ERROR_UNKNOWN";
                        break;
                    case 2:
                        strK = "ERROR_FILE_SIZE_LIMIT_REACHED";
                        break;
                    case 3:
                        strK = "ERROR_INSUFFICIENT_STORAGE";
                        break;
                    case 4:
                        strK = "ERROR_SOURCE_INACTIVE";
                        break;
                    case 5:
                        strK = "ERROR_INVALID_OUTPUT_OPTIONS";
                        break;
                    case 6:
                        strK = "ERROR_ENCODING_FAILED";
                        break;
                    case 7:
                        strK = "ERROR_RECORDER_ERROR";
                        break;
                    case 8:
                        strK = "ERROR_NO_VALID_DATA";
                        break;
                    case 9:
                        strK = "ERROR_DURATION_LIMIT_REACHED";
                        break;
                    case 10:
                        strK = "ERROR_RECORDING_GARBAGE_COLLECTED";
                        break;
                    default:
                        strK = a0.u.k(i, "Unknown(", ")");
                        break;
                }
                sbJ.append(" [error: " + strK + "]");
                strConcat = sbJ.toString();
            }
            com.google.android.gms.internal.auth.g.e("Recorder", strConcat);
        }
        boolean z10 = s0Var instanceof q0;
        b4.d dVar = this.f35606h;
        if (z10 || (s0Var instanceof p0)) {
            dVar.P(Boolean.TRUE);
        } else if ((s0Var instanceof o0) || (s0Var instanceof n0)) {
            dVar.P(Boolean.FALSE);
        }
        Executor executor = this.f35607j;
        if (executor == null || this.f35608k == null) {
            return;
        }
        try {
            executor.execute(new v0(15, this, s0Var));
        } catch (RejectedExecutionException e3) {
            com.google.android.gms.internal.auth.g.l("Recorder", "The callback executor is invalid.", e3);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb2.append(this.i);
        sb2.append(", getCallbackExecutor=");
        sb2.append(this.f35607j);
        sb2.append(", getEventListener=");
        sb2.append(this.f35608k);
        sb2.append(", hasAudioEnabled=");
        sb2.append(this.f35609l);
        sb2.append(", isPersistent=");
        sb2.append(this.f35610m);
        sb2.append(", getRecordingId=");
        return pe.a.h(sb2, this.f35611n, "}");
    }
}
