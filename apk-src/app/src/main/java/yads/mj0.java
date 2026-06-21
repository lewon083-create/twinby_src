package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mj0 extends Thread implements rj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj0 f40923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj0 f40924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oj0 f40925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile kj0 f40928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f40929h;
    public Exception i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f40930j = -1;

    public mj0(qj0 qj0Var, sj0 sj0Var, oj0 oj0Var, boolean z5, int i, kj0 kj0Var) {
        this.f40923b = qj0Var;
        this.f40924c = sj0Var;
        this.f40925d = oj0Var;
        this.f40926e = z5;
        this.f40927f = i;
        this.f40928g = kj0Var;
    }

    public final void a(boolean z5) {
        if (z5) {
            this.f40928g = null;
        }
        if (this.f40929h) {
            return;
        }
        this.f40929h = true;
        this.f40924c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f40926e) {
                this.f40924c.remove();
            } else {
                long j10 = -1;
                int i = 0;
                while (!this.f40929h) {
                    try {
                        this.f40924c.a(this);
                        break;
                    } catch (IOException e3) {
                        if (!this.f40929h) {
                            long j11 = this.f40925d.f41549a;
                            if (j11 != j10) {
                                i = 0;
                                j10 = j11;
                            }
                            int i10 = i + 1;
                            if (i10 > this.f40927f) {
                                throw e3;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i10;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e7) {
            this.i = e7;
        }
        kj0 kj0Var = this.f40928g;
        if (kj0Var != null) {
            kj0Var.obtainMessage(9, this).sendToTarget();
        }
    }

    public final void a(long j10, long j11, float f10) {
        this.f40925d.f41549a = j11;
        this.f40925d.f41550b = f10;
        if (j10 != this.f40930j) {
            this.f40930j = j10;
            kj0 kj0Var = this.f40928g;
            if (kj0Var != null) {
                kj0Var.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }
}
