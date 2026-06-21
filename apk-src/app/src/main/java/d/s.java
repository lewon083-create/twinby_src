package d;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    private boolean isEnabled;
    private final List<r> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public s(boolean z5) {
        this.isEnabled = z5;
    }

    public abstract void a();

    public final void addCloseable$activity(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        this.closeables.add(closeable);
    }

    public final r createNavigationEventHandler$activity(a6.e info) {
        Intrinsics.checkNotNullParameter(info, "info");
        r rVar = new r(this, info);
        this.eventHandlers.add(rVar);
        return rVar;
    }

    public void handleOnBackProgressed(a backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(a backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        boolean zIsTerminated;
        Iterator<AutoCloseable> it = this.closeables.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z5 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z5) {
                                executorService.shutdownNow();
                                z5 = true;
                            }
                        }
                    }
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else if (next instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) next).release();
            } else {
                if (!(next instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) next).release();
            }
        }
        this.closeables.clear();
        Iterator<r> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.eventHandlers.clear();
    }

    public final void setEnabled(boolean z5) {
        a6.g gVar;
        this.isEnabled = z5;
        for (r rVar : this.eventHandlers) {
            boolean z10 = rVar.f15475g && z5;
            if (rVar.f15472d != z10) {
                rVar.f15472d = z10;
                a6.c cVar = rVar.f15473e;
                if (cVar != null && (gVar = cVar.f449b) != null) {
                    gVar.b();
                }
            }
        }
    }

    public void handleOnBackCancelled() {
    }
}
