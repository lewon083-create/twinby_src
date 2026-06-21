package d8;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f15712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15713c;

    public x() {
        this.f15711a = 0;
        this.f15713c = Executors.defaultThreadFactory();
        this.f15712b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15711a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f15712b;
                Thread threadNewThread = ((ThreadFactory) this.f15713c).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            case 1:
                int andIncrement = ((AtomicInteger) this.f15712b).getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = (String) this.f15713c;
                StringBuilder sb2 = new StringBuilder(pe.a.b(12, length, str));
                sb2.append("AdWorker(");
                sb2.append(str);
                sb2.append(") #");
                sb2.append(andIncrement);
                return new Thread(runnable, sb2.toString());
            default:
                Thread threadNewThread2 = ((ThreadFactory) this.f15713c).newThread(new j0.h(2, runnable));
                threadNewThread2.setName((String) this.f15712b);
                return threadNewThread2;
        }
    }

    public x(String str, int i) {
        this.f15711a = i;
        switch (i) {
            case 2:
                this.f15713c = Executors.defaultThreadFactory();
                this.f15712b = str;
                break;
            default:
                this.f15713c = str;
                this.f15712b = new AtomicInteger(1);
                break;
        }
    }
}
