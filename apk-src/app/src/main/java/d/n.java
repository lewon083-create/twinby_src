package d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a1;
import androidx.lifecycle.i0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.u;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import com.twinby.R;
import hl.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import z2.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends t1.d implements a1, androidx.lifecycle.j, o6.g, x, u1.d {
    private static final h Companion = new h();
    private z0 _viewModelStore;
    private final f.h activityResultRegistry;
    private int contentLayoutId;
    private final ij.g defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final ij.g fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final ij.g onBackPressedDispatcher$delegate;
    private final ij.g onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<f2.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<f2.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<f2.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<f2.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<f2.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final o6.f savedStateRegistryController;
    private final e.a contextAwareHelper = new e.a();
    private final g2.l menuHostHelper = new g2.l(new b(this, 1));

    public n() {
        Intrinsics.checkNotNullParameter(this, "owner");
        g8.c cVar = new g8.c(this, new q0(6, this));
        this.savedStateRegistryController = new o6.f(cVar);
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = ij.h.b(new c(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = ij.h.b(new c(this, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new e(0, this));
        getLifecycle().a(new e(1, this));
        getLifecycle().a(new o6.b(3, this));
        cVar.a();
        p0.d(this);
        getSavedStateRegistry().c("android:support:activity-result", new f(0, this));
        addOnContextAvailableListener(new g(this, 0));
        this.defaultViewModelProviderFactory$delegate = ij.h.b(new c(this, 3));
        this.onBackPressedDispatcher$delegate = ij.h.b(new c(this, 4));
    }

    public static Bundle a(n nVar) {
        Bundle outState = new Bundle();
        f.h hVar = nVar.activityResultRegistry;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = hVar.f16462b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f16464d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f16467g));
        return outState;
    }

    public static final void access$ensureViewModelStore(n nVar) {
        if (nVar._viewModelStore == null) {
            i iVar = (i) nVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                nVar._viewModelStore = iVar.f15449b;
            }
            if (nVar._viewModelStore == null) {
                nVar._viewModelStore = new z0();
            }
        }
    }

    public static q c(n nVar) {
        return new q(nVar.reportFullyDrawnExecutor, new c(nVar, 0));
    }

    public static void f(n nVar, androidx.lifecycle.u uVar, androidx.lifecycle.n event) {
        Intrinsics.checkNotNullParameter(uVar, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.n.ON_DESTROY) {
            nVar.contextAwareHelper.f15878b = null;
            if (!nVar.isChangingConfigurations()) {
                nVar.getViewModelStore().a();
            }
            k kVar = (k) nVar.reportFullyDrawnExecutor;
            n nVar2 = kVar.f15453e;
            nVar2.getWindow().getDecorView().removeCallbacks(kVar);
            nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static void g(n nVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e3) {
            if (!Intrinsics.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e3;
            }
        } catch (NullPointerException e7) {
            if (!Intrinsics.a(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e7;
            }
        }
    }

    public static void h(n nVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = nVar.getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            f.h hVar = nVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = hVar.f16462b;
            LinkedHashMap linkedHashMap2 = hVar.f16461a;
            Bundle bundle = hVar.f16467g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f16464d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        k0.a(linkedHashMap2);
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                hVar.f16462b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(g2.m provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        g2.l lVar = this.menuHostHelper;
        lVar.f19888b.add(provider);
        lVar.f19887a.run();
    }

    @Override // u1.d
    public final void addOnConfigurationChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(e.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        n nVar = aVar.f15878b;
        if (nVar != null) {
            listener.a(nVar);
        }
        aVar.f15877a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final f.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.j
    public f3.c getDefaultViewModelCreationExtras() {
        f3.d dVar = new f3.d(0);
        if (getApplication() != null) {
            dVar.b(x0.f1615f, getApplication());
        }
        dVar.b(p0.f1579a, this);
        dVar.b(p0.f1580b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.b(p0.f1581c, extras);
        }
        return dVar;
    }

    public q getFullyDrawnReporter() {
        return (q) this.fullyDrawnReporter$delegate.getValue();
    }

    @Override // t1.d, androidx.lifecycle.u
    public androidx.lifecycle.p getLifecycle() {
        return super.getLifecycle();
    }

    public a6.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().f15478c;
    }

    @Override // d.x
    public final w getOnBackPressedDispatcher() {
        return (w) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // o6.g
    public final o6.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f29784b;
    }

    @Override // androidx.lifecycle.a1
    public z0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this._viewModelStore = iVar.f15449b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new z0();
            }
        }
        z0 z0Var = this._viewModelStore;
        Intrinsics.b(z0Var);
        return z0Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView6, "<this>");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        if (this.activityResultRegistry.a(i, i10, intent)) {
            return;
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((a6.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<f2.a> it = this.onConfigurationChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // t1.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        e.a aVar = this.contextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        aVar.f15878b = this;
        Iterator it = aVar.f15877a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = l0.f1566c;
        i0.b(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        g2.l lVar = this.menuHostHelper;
        getMenuInflater();
        Iterator it = lVar.f19888b.iterator();
        while (it.hasNext()) {
            ((a0) ((g2.m) it.next())).f45802a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<f2.a> it = this.onMultiWindowModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new t1.g(z5));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<f2.a> it = this.onNewIntentListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f19888b.iterator();
        while (it.hasNext()) {
            ((a0) ((g2.m) it.next())).f45802a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<f2.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new t1.v(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.f19888b.iterator();
        while (it.hasNext()) {
            ((a0) ((g2.m) it.next())).f45802a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        z0 z0Var = this._viewModelStore;
        if (z0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            z0Var = iVar.f15449b;
        }
        if (z0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f15448a = objOnRetainCustomNonConfigurationInstance;
        iVar2.f15449b = z0Var;
        return iVar2;
    }

    @Override // t1.d, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.w) {
            androidx.lifecycle.p lifecycle = getLifecycle();
            Intrinsics.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            androidx.lifecycle.o oVar = androidx.lifecycle.o.f1573b;
            ((androidx.lifecycle.w) lifecycle).g();
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<f2.a> it = this.onTrimMemoryListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> f.c registerForActivityResult(final g.b contract, final f.h registry, final f.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f16463c;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        androidx.lifecycle.p lifecycle = getLifecycle();
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) lifecycle;
        if (wVar.f1606c.a(androidx.lifecycle.o.f1576e)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + wVar.f1606c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        f.f fVar = (f.f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new f.f(lifecycle);
        }
        androidx.lifecycle.s observer = new androidx.lifecycle.s() { // from class: f.d
            @Override // androidx.lifecycle.s
            public final void d(u uVar, n event) {
                h hVar = registry;
                LinkedHashMap linkedHashMap2 = hVar.f16465e;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                n nVar = n.ON_START;
                String str = key;
                if (nVar != event) {
                    if (n.ON_STOP == event) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (n.ON_DESTROY == event) {
                            hVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = hVar.f16467g;
                LinkedHashMap linkedHashMap3 = hVar.f16466f;
                g.b bVar = contract;
                b bVar2 = callback;
                linkedHashMap2.put(str, new e(bVar, bVar2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar2.e(obj);
                }
                a aVar = (a) l.k(bundle, str);
                if (aVar != null) {
                    bundle.remove(str);
                    bVar2.e(bVar.parseResult(aVar.f16447b, aVar.f16448c));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        fVar.f16455a.a(observer);
        fVar.f16456b.add(observer);
        linkedHashMap.put(key, fVar);
        return new f.g(registry, key, contract, 0);
    }

    public void removeMenuProvider(g2.m provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        g2.l lVar = this.menuHostHelper;
        lVar.f19888b.remove(provider);
        if (lVar.f19889c.remove(provider) != null) {
            throw new ClassCastException();
        }
        lVar.f19887a.run();
    }

    @Override // u1.d
    public final void removeOnConfigurationChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(f2.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (com.google.android.gms.internal.auth.g.w()) {
                Trace.beginSection(com.google.android.gms.internal.auth.g.M("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i10, i11, i12);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z5, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z5, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<f2.a> it = this.onMultiWindowModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                f2.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new t1.g(z5));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z5, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z5, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<f2.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                f2.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.accept(new t1.v(z5));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public final <I, O> f.c registerForActivityResult(g.b contract, f.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }
}
