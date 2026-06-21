package a1;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f384a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f385b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f386c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.i f387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f391h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f394l;

    public s(l lVar, n nVar) {
        j0.a aVar;
        if (j0.a.f26118d != null) {
            aVar = j0.a.f26118d;
        } else {
            synchronized (j0.a.class) {
                try {
                    if (j0.a.f26118d == null) {
                        j0.a.f26118d = new j0.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar = j0.a.f26118d;
        }
        this.f387d = new j0.i(aVar);
        this.f388e = new Object();
        this.f389f = null;
        this.f393k = new AtomicBoolean(false);
        this.f390g = lVar;
        int iA = nVar.a();
        this.f391h = iA;
        int i = nVar.f369b;
        this.i = i;
        f2.g.a("mBytesPerFrame must be greater than 0.", ((long) iA) > 0);
        f2.g.a("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.f392j = 500;
        this.f394l = iA * 1024;
    }

    public final void a() {
        f2.g.h("AudioStream has been released.", !this.f385b.get());
    }

    public final void b() {
        if (this.f393k.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f394l);
            r rVar = new r(byteBufferAllocateDirect, this.f390g.read(byteBufferAllocateDirect), this.f391h, this.i);
            int i = this.f392j;
            synchronized (this.f388e) {
                try {
                    this.f386c.offer(rVar);
                    while (this.f386c.size() > i) {
                        this.f386c.poll();
                        com.google.android.gms.internal.auth.g.O("BufferedAudioStream", "Drop audio data due to full of queue.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f393k.get()) {
                this.f387d.execute(new p(this, 2));
            }
        }
    }

    public final void c() {
        a();
        AtomicBoolean atomicBoolean = this.f384a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new p(this, 1), null);
        this.f387d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e3) {
            atomicBoolean.set(false);
            throw new i(e3);
        }
    }

    @Override // a1.j
    public final o read(ByteBuffer byteBuffer) {
        boolean z5;
        a();
        f2.g.h("AudioStream has not been started.", this.f384a.get());
        this.f387d.execute(new q(this, byteBuffer.remaining(), 0));
        o oVar = new o(0, 0L);
        do {
            synchronized (this.f388e) {
                try {
                    r rVar = this.f389f;
                    this.f389f = null;
                    if (rVar == null) {
                        rVar = (r) this.f386c.poll();
                    }
                    if (rVar != null) {
                        oVar = rVar.a(byteBuffer);
                        if (rVar.f382c.remaining() > 0) {
                            this.f389f = rVar;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z5 = oVar.f373a <= 0 && this.f384a.get() && !this.f385b.get();
            if (z5) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e3) {
                    com.google.android.gms.internal.auth.g.P("BufferedAudioStream", "Interruption while waiting for audio data", e3);
                    return oVar;
                }
            }
        } while (z5);
        return oVar;
    }
}
