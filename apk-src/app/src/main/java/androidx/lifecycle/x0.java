package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.j4;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends nc.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static x0 f1614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g8.g f1615f = new g8.g(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f1616d;

    public x0(Application application) {
        this.f1616d = application;
    }

    @Override // nc.e, androidx.lifecycle.y0
    public final w0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f1616d;
        if (application != null) {
            return h(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // nc.e, androidx.lifecycle.y0
    public final w0 e(Class modelClass, f3.d extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f1616d != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(f1615f);
        if (application != null) {
            return h(modelClass, application);
        }
        if (a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return j4.m(modelClass);
    }

    public final w0 h(Class modelClass, Application application) {
        if (!a.class.isAssignableFrom(modelClass)) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return j4.m(modelClass);
        }
        try {
            w0 w0Var = (w0) modelClass.getConstructor(Application.class).newInstance(application);
            Intrinsics.b(w0Var);
            return w0Var;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e7);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        }
    }
}
