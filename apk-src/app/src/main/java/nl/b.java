package nl;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29523b = 0;

    public /* synthetic */ b(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e eVarC;
        switch (this.f29523b) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                reentrantLock = e.f29530h;
                reentrantLock.lock();
                try {
                    eVarC = hl.l.c();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (eVarC == e.f29533l) {
                e.f29533l = null;
                return;
            }
            Unit unit = Unit.f27471a;
            reentrantLock.unlock();
            if (eVarC != null) {
                eVarC.j();
            }
        }
    }

    public /* synthetic */ b(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
