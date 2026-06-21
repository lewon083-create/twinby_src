package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private s rootView;
    private boolean startFocused;
    private final v state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, f fVar, a aVar, int i, View.OnFocusChangeListener onFocusChangeListener) {
        super(new t(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        v vVar = new v();
        this.state = vVar;
        vVar.f25758a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public v detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        s sVar = this.rootView;
        if (sVar != null) {
            sVar.removeAllViews();
        }
        return this.state;
    }

    public f getView() {
        return this.state.f25758a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        v vVar = this.state;
        if (vVar.f25760c == null) {
            vVar.f25760c = new r(getContext());
        }
        if (this.state.f25759b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            v vVar2 = this.state;
            vVar2.f25759b = new c0(windowManager, vVar2.f25760c);
        }
        this.container = new FrameLayout(getContext());
        u uVar = new u(getContext(), this.state.f25759b, this.outerContext);
        View view = this.state.f25758a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(uVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        s sVar = new s(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = sVar;
        sVar.addView(this.container);
        this.rootView.addView(this.state.f25760c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, a aVar, v vVar, View.OnFocusChangeListener onFocusChangeListener, boolean z5) {
        super(new t(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = vVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z5;
    }
}
