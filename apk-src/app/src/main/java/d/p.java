package d;

import a0.d1;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.q0;
import com.twinby.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Dialog implements androidx.lifecycle.u, x, o6.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.w f15461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o6.f f15462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.p f15463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij.p f15464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f15462c = new o6.f(new g8.c(this, new q0(6, this)));
        final int i10 = 0;
        this.f15463d = ij.h.b(new Function0(this) { // from class: d.o

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f15460c;

            {
                this.f15460c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        a6.a aVar = new a6.a();
                        this.f15460c.getOnBackPressedDispatcher().b().f15478c.a(aVar);
                        return aVar;
                    default:
                        return new w(new d1(14, this.f15460c));
                }
            }
        });
        final int i11 = 1;
        this.f15464e = ij.h.b(new Function0(this) { // from class: d.o

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f15460c;

            {
                this.f15460c = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        a6.a aVar = new a6.a();
                        this.f15460c.getOnBackPressedDispatcher().b().f15478c.a(aVar);
                        return aVar;
                    default:
                        return new w(new d1(14, this.f15460c));
                }
            }
        });
    }

    public static void a(p pVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.b(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        Intrinsics.b(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.b(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        Intrinsics.b(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        androidx.lifecycle.w wVar = this.f15461b;
        if (wVar != null) {
            return wVar;
        }
        androidx.lifecycle.w wVar2 = new androidx.lifecycle.w(this);
        this.f15461b = wVar2;
        return wVar2;
    }

    @Override // d.x
    public final w getOnBackPressedDispatcher() {
        return (w) this.f15464e.getValue();
    }

    @Override // o6.g
    public final o6.e getSavedStateRegistry() {
        return this.f15462c.f29784b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((a6.a) this.f15463d.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            w onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.f15462c.a(bundle);
        androidx.lifecycle.w wVar = this.f15461b;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f15461b = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f15462c.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.w wVar = this.f15461b;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f15461b = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.w wVar = this.f15461b;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this.f15461b = wVar;
        }
        wVar.e(androidx.lifecycle.n.ON_DESTROY);
        this.f15461b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
