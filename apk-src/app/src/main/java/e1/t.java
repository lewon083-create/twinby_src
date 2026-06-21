package e1;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f15990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.k f15991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1.h f15992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15993f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15994g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15995h = false;
    public final /* synthetic */ c0 i;

    public t(c0 c0Var, MediaCodec mediaCodec, int i) {
        this.i = c0Var;
        mediaCodec.getClass();
        this.f15988a = mediaCodec;
        f2.g.f(i);
        this.f15989b = i;
        this.f15990c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f15991d = i0.o.w(new f(atomicReference, 4));
        j1.h hVar = (j1.h) atomicReference.get();
        hVar.getClass();
        this.f15992e = hVar;
    }

    public final boolean a() {
        j1.h hVar = this.f15992e;
        if (this.f15993f.getAndSet(true)) {
            return false;
        }
        try {
            this.f15988a.queueInputBuffer(this.f15989b, 0, 0, 0L, 0);
            hVar.b(null);
        } catch (IllegalStateException e3) {
            hVar.d(e3);
        }
        return true;
    }

    public final void b(long j10) {
        c0 c0Var = this.i;
        if (!c0Var.f15919c) {
            j10 = c0Var.o(j10);
        }
        if (this.f15993f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        f2.g.b(j10 >= 0);
        this.f15994g = j10;
    }

    public final boolean c() {
        j1.h hVar = this.f15992e;
        ByteBuffer byteBuffer = this.f15990c;
        if (this.f15993f.getAndSet(true)) {
            return false;
        }
        try {
            this.f15988a.queueInputBuffer(this.f15989b, byteBuffer.position(), byteBuffer.limit(), this.f15994g, this.f15995h ? 4 : 0);
            hVar.b(null);
            return true;
        } catch (IllegalStateException e3) {
            hVar.d(e3);
            return false;
        }
    }
}
