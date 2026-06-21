package rl;

import a7.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f32365a;

    public a(l lVar) {
        this.f32365a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z5 = obj instanceof a;
        l lVar = this.f32365a;
        return z5 ? lVar.equals(((a) obj).f32365a) : lVar.equals(obj);
    }

    public final int hashCode() {
        return this.f32365a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, l.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f32365a, objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getTargetException();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Reflection failed for method " + method, e7);
        }
    }
}
