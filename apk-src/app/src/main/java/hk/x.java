package hk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f20723c = new w(kotlin.coroutines.d.R1, new ch.a(8));

    public x() {
        super(kotlin.coroutines.d.R1);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = this.f27494b;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f27496c != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            CoroutineContext.Element element = (CoroutineContext.Element) bVar.f27495b.invoke(this);
            if (element != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.R1 == key) {
            return this;
        }
        return null;
    }

    public abstract void j(CoroutineContext coroutineContext, Runnable runnable);

    public boolean k(CoroutineContext coroutineContext) {
        return !(this instanceof y1);
    }

    public x l(int i) {
        mk.a.a(i);
        return new mk.g(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = this.f27494b;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f27496c != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f27495b.invoke(this)) != null) {
                return kotlin.coroutines.g.f27499b;
            }
        } else if (kotlin.coroutines.d.R1 == key) {
            return kotlin.coroutines.g.f27499b;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c0.h(this);
    }
}
