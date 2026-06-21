package i7;

import a0.b1;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements g7.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile m f21210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f21211d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f21213b = new CopyOnWriteArrayList();

    public m(k kVar) {
        this.f21212a = kVar;
        if (kVar != null) {
            kVar.d(new b1(20, this));
        }
    }

    @Override // g7.a
    public final void a(f7.i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f21211d) {
            try {
                if (this.f21212a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (l callbackWrapper : this.f21213b) {
                    if (callbackWrapper.f21208b == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f21213b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((l) it.next()).f21207a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f21213b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((l) it2.next()).f21207a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f21212a;
                    if (aVar != null) {
                        ((k) aVar).b(activity);
                    }
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // g7.a
    public final void b(Context context, com.yandex.div.core.dagger.b executor, f7.i callback) {
        Object next;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f21211d;
            reentrantLock.lock();
            try {
                a aVar = this.f21212a;
                if (aVar == null) {
                    callback.accept(new f7.k(b0.f27475b));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f21213b;
                boolean z5 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((l) it.next()).f21207a.equals(activity)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                l this$0 = new l(activity, executor, callback);
                copyOnWriteArrayList.add(this$0);
                if (z5) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (activity.equals(((l) next).f21207a)) {
                                break;
                            }
                        }
                    }
                    l lVar = (l) next;
                    f7.k newLayoutInfo = lVar != null ? lVar.f21209c : null;
                    if (newLayoutInfo != null) {
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                        this$0.f21209c = newLayoutInfo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                        this$0.f21208b.accept(newLayoutInfo);
                    }
                } else {
                    k kVar = (k) aVar;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        kVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j(kVar, activity));
                    }
                }
                Unit unit2 = Unit.f27471a;
                reentrantLock.unlock();
                unit = Unit.f27471a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (unit == null) {
            callback.accept(new f7.k(b0.f27475b));
        }
    }
}
