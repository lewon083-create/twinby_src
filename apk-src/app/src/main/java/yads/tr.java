package yads;

import android.os.Process;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tr extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f43418h = om3.f41652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f43419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f43420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr f43421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dq2 f43422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f43423f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hn3 f43424g;

    public tr(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, mr mrVar, dq2 dq2Var) {
        this.f43419b = priorityBlockingQueue;
        this.f43420c = priorityBlockingQueue2;
        this.f43421d = mrVar;
        this.f43422e = dq2Var;
        this.f43424g = new hn3(this, priorityBlockingQueue2, dq2Var);
    }

    private void a() {
        ro2 ro2Var = (ro2) this.f43419b.take();
        ro2Var.a("cache-queue-take");
        ro2Var.a(1);
        try {
            if (ro2Var.i()) {
                ro2Var.c("cache-discard-canceled");
            } else {
                lr lrVar = this.f43421d.get(ro2Var.c());
                if (lrVar == null) {
                    ro2Var.a("cache-miss");
                    if (!this.f43424g.a(ro2Var)) {
                        this.f43420c.put(ro2Var);
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (lrVar.f40642e < jCurrentTimeMillis) {
                        ro2Var.a("cache-hit-expired");
                        ro2Var.f42671p = lrVar;
                        if (!this.f43424g.a(ro2Var)) {
                            this.f43420c.put(ro2Var);
                        }
                    } else {
                        ro2Var.a("cache-hit");
                        byte[] bArr = lrVar.f40638a;
                        Map map = lrVar.f40644g;
                        xp2 xp2VarA = ro2Var.a(new h82(VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM, bArr, map, h82.a(map), false));
                        ro2Var.a("cache-hit-parsed");
                        if (xp2VarA.f44788c != null) {
                            ro2Var.a("cache-parsing-failed");
                            this.f43421d.a(ro2Var.c());
                            ro2Var.f42671p = null;
                            if (!this.f43424g.a(ro2Var)) {
                                this.f43420c.put(ro2Var);
                            }
                        } else if (lrVar.f40643f < jCurrentTimeMillis) {
                            ro2Var.a("cache-hit-refresh-needed");
                            ro2Var.f42671p = lrVar;
                            xp2VarA.f44789d = true;
                            if (this.f43424g.a(ro2Var)) {
                                ((hn0) this.f43422e).a(ro2Var, xp2VarA, null);
                            } else {
                                ((hn0) this.f43422e).a(ro2Var, xp2VarA, new sr(this, ro2Var));
                            }
                        } else {
                            ((hn0) this.f43422e).a(ro2Var, xp2VarA, null);
                        }
                    }
                }
            }
            ro2Var.a(2);
        } catch (Throwable th2) {
            ro2Var.a(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.f43421d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f43423f) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
    }
}
