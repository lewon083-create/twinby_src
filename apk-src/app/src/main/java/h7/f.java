package h7;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f7.i;
import f7.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f2.a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f20460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f20461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f20462d;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20459a = context;
        this.f20460b = new ReentrantLock();
        this.f20462d = new LinkedHashSet();
    }

    @Override // f2.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.f20460b;
        reentrantLock.lock();
        try {
            this.f20461c = e.b(this.f20459a, value);
            Iterator it = this.f20462d.iterator();
            while (it.hasNext()) {
                ((f2.a) it.next()).accept(this.f20461c);
            }
            Unit unit = Unit.f27471a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.f20460b;
        reentrantLock.lock();
        try {
            k kVar = this.f20461c;
            if (kVar != null) {
                listener.accept(kVar);
            }
            this.f20462d.add(listener);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
