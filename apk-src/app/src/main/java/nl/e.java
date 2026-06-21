package nl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f29530h;
    public static final Condition i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f29531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f29532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f29533l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f29535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29536g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f29530h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f29531j = millis;
        f29532k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j10 = this.f29581c;
        boolean z5 = this.f29579a;
        if (j10 != 0 || z5) {
            ReentrantLock reentrantLock = f29530h;
            reentrantLock.lock();
            try {
                if (this.f29534e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f29534e = true;
                if (f29533l == null) {
                    f29533l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z5) {
                    this.f29536g = Math.min(j10, c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    this.f29536g = j10 + jNanoTime;
                } else {
                    if (!z5) {
                        throw new AssertionError();
                    }
                    this.f29536g = c();
                }
                long j11 = this.f29536g - jNanoTime;
                e eVar2 = f29533l;
                Intrinsics.b(eVar2);
                while (true) {
                    eVar = eVar2.f29535f;
                    if (eVar == null || j11 < eVar.f29536g - jNanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f29535f = eVar;
                eVar2.f29535f = this;
                if (eVar2 == f29533l) {
                    i.signal();
                }
                Unit unit = Unit.f27471a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f29530h;
        reentrantLock.lock();
        try {
            if (!this.f29534e) {
                return false;
            }
            this.f29534e = false;
            e eVar = f29533l;
            while (eVar != null) {
                e eVar2 = eVar.f29535f;
                if (eVar2 == this) {
                    eVar.f29535f = this.f29535f;
                    this.f29535f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
