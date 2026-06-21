package c7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.i f2229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7.b f2230b;

    public c(kotlin.jvm.internal.i clazz, h7.b consumer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f2229a = clazz;
        this.f2230b = consumer;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(method, "method");
        boolean zA = Intrinsics.a(method.getName(), "accept");
        h7.b bVar = this.f2230b;
        if (zA && objArr != null && objArr.length == 1) {
            Object parameter = objArr[0];
            kotlin.jvm.internal.i iVar = this.f2229a;
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            if (!iVar.e(parameter)) {
                throw new ClassCastException("Value cannot be cast to " + iVar.b());
            }
            Intrinsics.c(parameter, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            bVar.invoke(parameter);
            return Unit.f27471a;
        }
        if (Intrinsics.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (Intrinsics.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (Intrinsics.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
