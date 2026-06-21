package oj;

import com.google.android.gms.internal.measurement.h5;
import ij.k;
import ij.m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements mj.a, d, Serializable {

    @Nullable
    private final mj.a completion;

    public a(mj.a aVar) {
        this.completion = aVar;
    }

    @NotNull
    public mj.a create(@Nullable Object obj, @NotNull mj.a completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Nullable
    public d getCallerFrame() {
        mj.a aVar = this.completion;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    @Nullable
    public final mj.a getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        f.f30694a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        il.i iVar = f.f30696c;
        il.i iVar2 = f.f30695b;
        if (iVar == null) {
            try {
                il.i iVar3 = new il.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f30696c = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f30696c = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f21381a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f21382b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = iVar.f21383c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // mj.a
    public final void resumeWith(@NotNull Object obj) {
        mj.a frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            mj.a aVar2 = aVar.completion;
            Intrinsics.b(aVar2);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                k kVar = m.f21341c;
                obj = h5.s(th2);
            }
            if (obj == nj.a.f29512b) {
                return;
            }
            k kVar2 = m.f21341c;
            aVar.releaseIntercepted();
            if (!(aVar2 instanceof a)) {
                aVar2.resumeWith(obj);
                return;
            }
            frame = aVar2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public void releaseIntercepted() {
    }
}
