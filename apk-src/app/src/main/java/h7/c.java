package h7;

import a7.l;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f7.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f20449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f20450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f20451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f20452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f20453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f20454f;

    public c(WindowLayoutComponent component, l consumerAdapter) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(consumerAdapter, "consumerAdapter");
        this.f20449a = component;
        this.f20450b = consumerAdapter;
        this.f20451c = new ReentrantLock();
        this.f20452d = new LinkedHashMap();
        this.f20453e = new LinkedHashMap();
        this.f20454f = new LinkedHashMap();
    }

    @Override // g7.a
    public final void a(i listener) {
        LinkedHashMap linkedHashMap = this.f20452d;
        LinkedHashMap linkedHashMap2 = this.f20453e;
        Intrinsics.checkNotNullParameter(listener, "callback");
        ReentrantLock reentrantLock = this.f20451c;
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
                    c7.d dVar = (c7.d) this.f20454f.remove(fVar);
                    if (dVar != null) {
                        dVar.f2231a.invoke(dVar.f2232b, dVar.f2233c);
                    }
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
        LinkedHashMap linkedHashMap = this.f20452d;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f20451c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f20453e;
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
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(b0.f27475b));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f20454f.put(fVar2, this.f20450b.c(this.f20449a, g0.a(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            Unit unit2 = Unit.f27471a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
