package kotlin.coroutines;

import hk.u;
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f27497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext.Element f27498c;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f27497b = left;
        this.f27498c = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f27497b;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f27497b;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i10 == i) {
                c cVar4 = this;
                while (true) {
                    CoroutineContext.Element element = cVar4.f27498c;
                    if (!Intrinsics.a(cVar.get(element.getKey()), element)) {
                        zA = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = cVar4.f27497b;
                    if (!(coroutineContext3 instanceof c)) {
                        Intrinsics.c(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zA = Intrinsics.a(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar4 = (c) coroutineContext3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f27497b.fold(obj, operation), this.f27498c);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f27498c.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f27497b;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f27498c.hashCode() + this.f27497b.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f27498c;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f27497b;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        return coroutineContextMinusKey == coroutineContext ? this : coroutineContextMinusKey == g.f27499b ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f27499b ? this : (CoroutineContext) context.fold(this, new u(5));
    }

    public final String toString() {
        return a0.u.n(new StringBuilder("["), (String) fold("", new u(4)), ']');
    }
}
