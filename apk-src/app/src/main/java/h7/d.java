package h7;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import f7.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f20455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f20456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f20457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f20458d;

    public d(WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f20455a = component;
        this.f20456b = new ReentrantLock();
        this.f20457c = new LinkedHashMap();
        this.f20458d = new LinkedHashMap();
    }

    @Override // g7.a
    public final void a(i listener) {
        LinkedHashMap linkedHashMap = this.f20457c;
        LinkedHashMap linkedHashMap2 = this.f20458d;
        Intrinsics.checkNotNullParameter(listener, "callback");
        ReentrantLock reentrantLock = this.f20456b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(listener);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f20462d;
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock2 = fVar.f20460b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(listener);
                reentrantLock2.unlock();
                linkedHashMap2.remove(listener);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f20455a.removeWindowLayoutInfoListener(fVar);
                }
                Unit unit = Unit.f27471a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // g7.a
    public final void b(Context context, com.yandex.div.core.dagger.b executor, i callback) {
        Unit unit;
        LinkedHashMap linkedHashMap = this.f20457c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f20456b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f20458d;
            if (fVar != null) {
                fVar.b(callback);
                linkedHashMap2.put(callback, context);
                unit = Unit.f27471a;
            } else {
                unit = null;
            }
            if (unit == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(callback, context);
                fVar2.b(callback);
                this.f20455a.addWindowLayoutInfoListener(context, fVar2);
            }
            Unit unit2 = Unit.f27471a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
