package t;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f33240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f33241d;

    public /* synthetic */ q1(int i, long j10, r1 r1Var) {
        this.f33239b = i;
        this.f33240c = r1Var;
        this.f33241d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33239b) {
            case 0:
                r1 r1Var = this.f33240c;
                r1Var.f33253b.execute(new q1(3, this.f33241d, r1Var));
                break;
            case 1:
                r1 r1Var2 = this.f33240c;
                r1Var2.f33253b.execute(new q1(2, this.f33241d, r1Var2));
                break;
            case 2:
                long j10 = this.f33241d;
                r1 r1Var3 = this.f33240c;
                if (j10 == r1Var3.f33261k) {
                    r1Var3.b(null);
                }
                break;
            default:
                long j11 = this.f33241d;
                r1 r1Var4 = this.f33240c;
                if (j11 == r1Var4.f33261k) {
                    r1Var4.f33263m = false;
                    ScheduledFuture scheduledFuture = r1Var4.f33260j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        r1Var4.f33260j = null;
                    }
                    j1.h hVar = r1Var4.f33270t;
                    if (hVar != null) {
                        hVar.b(new a0.m0(false));
                        r1Var4.f33270t = null;
                    }
                }
                break;
        }
    }
}
