package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f28405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f28406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f28407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f28408d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f28405a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f28406b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f28407c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f28408d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
