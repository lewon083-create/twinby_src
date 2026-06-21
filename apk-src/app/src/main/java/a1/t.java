package a1;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f395a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f396b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f400f;

    public t(n nVar) {
        this.f397c = nVar.a();
        this.f398d = nVar.f369b;
    }

    public final void a() {
        f2.g.h("AudioStream has been released.", !this.f396b.get());
    }

    @Override // a1.j
    public final o read(ByteBuffer byteBuffer) {
        a();
        f2.g.h("AudioStream has not been started.", this.f395a.get());
        long jRemaining = byteBuffer.remaining();
        int i = this.f397c;
        long jZ = com.google.android.gms.internal.auth.m.z(i, jRemaining);
        long j10 = i;
        f2.g.a("bytesPerFrame must be greater than 0.", j10 > 0);
        int i10 = (int) (j10 * jZ);
        if (i10 <= 0) {
            return new o(0, this.f400f);
        }
        long jG = this.f400f + com.google.android.gms.internal.auth.m.g(this.f398d, jZ);
        long jNanoTime = jG - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException e3) {
                com.google.android.gms.internal.auth.g.P("SilentAudioStream", "Ignore interruption", e3);
            }
        }
        f2.g.h(null, i10 <= byteBuffer.remaining());
        byte[] bArr = this.f399e;
        if (bArr == null || bArr.length < i10) {
            this.f399e = new byte[i10];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f399e, 0, i10).limit(iPosition + i10).position(iPosition);
        o oVar = new o(i10, this.f400f);
        this.f400f = jG;
        return oVar;
    }
}
