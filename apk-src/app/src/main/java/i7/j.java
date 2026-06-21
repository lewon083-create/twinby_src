package i7;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.plugin.platform.a0;
import io.flutter.plugin.platform.z;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import z2.m0;
import z2.t;
import z2.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21199b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21201d;

    public j(y yVar, m0 m0Var) {
        this.f21201d = yVar;
        this.f21200c = m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f21199b) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f21201d).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((k) this.f21200c).c(iBinder, activity);
                }
                break;
            case 1:
                View view2 = (View) this.f21200c;
                view2.getViewTreeObserver().addOnDrawListener(new a0(view2, new z(0, this)));
                view2.removeOnAttachStateChangeListener(this);
                break;
            default:
                m0 m0Var = (m0) this.f21200c;
                t tVar = m0Var.f45905c;
                m0Var.k();
                z2.m.j((ViewGroup) tVar.G.getParent(), ((y) this.f21201d).f46010b).i();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f21199b) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }

    public j(View view, io.flutter.plugin.platform.m mVar) {
        this.f21200c = view;
        this.f21201d = mVar;
    }

    public j(k sidecarCompat, Activity activity) {
        Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f21200c = sidecarCompat;
        this.f21201d = new WeakReference(activity);
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
