package xh;

import a0.b1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.om1;
import hk.c1;
import hk.k0;
import hk.w0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k6.t0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends FrameLayout implements ki.b, z {
    public f7.i A;
    public int B;
    public int C;
    public t D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f36168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f36170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f36171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f36172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f36173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f36174h;
    public final HashSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f36175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FlutterEngine f36176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f36177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h3.e f36178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.i f36179n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.editing.g f36180o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ji.a f36181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u7.f f36182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f36183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public io.flutter.view.h f36184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextServicesManager f36185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t0 f36186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f36187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m4.d f36188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.i f36189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q f36190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f36191z;

    public s(Context context, n nVar) {
        super(context, null);
        this.f36168b = new AtomicBoolean(true);
        this.f36169c = false;
        this.i = new HashSet();
        this.f36177l = new HashSet();
        this.f36187v = new io.flutter.embedding.engine.renderer.i();
        this.f36188w = new m4.d(this);
        this.f36189x = new com.google.android.gms.internal.auth.i(this, new Handler(Looper.getMainLooper()), 5);
        this.f36190y = new q(this);
        this.f36191z = new io.flutter.embedding.engine.renderer.a(2, this);
        this.D = new t();
        this.f36170d = nVar;
        this.f36173g = nVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final void a() {
        Objects.toString(this.f36176k);
        if (c()) {
            Iterator it = this.f36177l.iterator();
            if (it.hasNext()) {
                throw om1.i(it);
            }
            getContext().getContentResolver().unregisterContentObserver(this.f36189x);
            io.flutter.plugin.platform.q qVar = this.f36176k.f25557r;
            SparseArray sparseArray = qVar.f25738m;
            SparseArray sparseArray2 = qVar.f25739n;
            SparseArray sparseArray3 = qVar.f25741p;
            for (int i = 0; i < sparseArray3.size(); i++) {
                qVar.f25731e.removeView((io.flutter.plugin.platform.i) sparseArray3.valueAt(i));
            }
            for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
                qVar.f25731e.removeView((di.b) sparseArray2.valueAt(i10));
            }
            qVar.d();
            SparseArray sparseArray4 = qVar.f25740o;
            if (qVar.f25731e == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i11 = 0; i11 < sparseArray4.size(); i11++) {
                    qVar.f25731e.removeView((View) sparseArray4.valueAt(i11));
                }
                sparseArray4.clear();
            }
            qVar.f25731e = null;
            qVar.f25743r = false;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                ((io.flutter.plugin.platform.f) sparseArray.valueAt(i12)).getClass();
            }
            io.flutter.plugin.platform.p pVar = this.f36176k.f25558s;
            SparseArray sparseArray5 = pVar.f25719j;
            SparseArray sparseArray6 = pVar.f25720k;
            for (int i13 = 0; i13 < sparseArray6.size(); i13++) {
                pVar.f25715e.removeView((di.b) sparseArray6.valueAt(i13));
            }
            Surface surface = pVar.f25724o;
            if (surface != null) {
                surface.release();
                pVar.f25724o = null;
                pVar.f25725p = null;
            }
            pVar.f25715e = null;
            for (int i14 = 0; i14 < sparseArray5.size(); i14++) {
                ((io.flutter.plugin.platform.f) sparseArray5.valueAt(i14)).getClass();
            }
            this.f36176k.f25557r.r();
            this.f36176k.f25558s.r();
            io.flutter.view.h hVar = this.f36184s;
            hVar.f25865u = true;
            hVar.f25850e.r();
            hVar.f25863s = null;
            AccessibilityManager accessibilityManager = hVar.f25848c;
            accessibilityManager.removeAccessibilityStateChangeListener(hVar.f25866v);
            accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f25867w);
            hVar.f25851f.unregisterContentObserver(hVar.f25868x);
            ka.k kVar = hVar.f25847b;
            kVar.f27326e = null;
            ((FlutterJNI) kVar.f27325d).setAccessibilityDelegate(null);
            this.f36184s = null;
            this.f36179n.f25662b.restartInput(this);
            this.f36179n.c();
            int size = ((HashSet) this.f36182q.f34323d).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f36180o;
            if (gVar != null) {
                gVar.f25649a.f45c = null;
                SpellCheckerSession spellCheckerSession = gVar.f25651c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            h3.e eVar = this.f36178m;
            if (eVar != null) {
                ((b1) eVar.f20376d).f45c = null;
            }
            io.flutter.embedding.engine.renderer.j jVar = this.f36176k.f25542b;
            this.f36175j = false;
            jVar.g(this.f36191z);
            FlutterJNI flutterJNI = jVar.f25607a;
            if (this.f36169c) {
                flutterJNI.removeResizingFlutterUiListener(this.f36190y);
            }
            jVar.j();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f36174h;
            if (view != null && this.f36173g == this.f36172f) {
                this.f36173g = view;
            }
            this.f36173g.b();
            m mVar = this.f36172f;
            if (mVar != null) {
                mVar.f36146b.close();
                removeView(this.f36172f);
                this.f36172f = null;
            }
            this.f36174h = null;
            this.f36176k = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        s7.g gVar;
        s7.g gVar2;
        io.flutter.plugin.editing.i iVar = this.f36179n;
        if (Build.VERSION.SDK_INT < 26) {
            iVar.getClass();
            return;
        }
        hi.k kVar = iVar.f25666f;
        if (kVar == null || iVar.f25667g == null || (gVar = kVar.f20616j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            hi.k kVar2 = (hi.k) iVar.f25667g.get(sparseArray.keyAt(i));
            if (kVar2 != null && (gVar2 = kVar2.f20616j) != null) {
                String str = (String) gVar2.f32795b;
                String string = g8.a.g(sparseArray.valueAt(i)).getTextValue().toString();
                hi.m mVar = new hi.m(string.length(), string.length(), -1, -1, string);
                if (str.equals((String) gVar.f32795b)) {
                    iVar.f25668h.f(mVar);
                } else {
                    map.put(str, mVar);
                }
            }
        }
        h3.e eVar = iVar.f25664d;
        int i10 = iVar.f25665e.f4006b;
        eVar.getClass();
        map.size();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hi.m mVar2 = (hi.m) entry.getValue();
            map2.put((String) entry.getKey(), h3.e.y(mVar2.f20624b, mVar2.f20625c, -1, -1, mVar2.f20623a));
        }
        ((ii.q) eVar.f20375c).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i10), map2), null);
    }

    public final void b() {
        n nVar = this.f36170d;
        if (nVar != null) {
            addView(nVar);
        } else {
            p pVar = this.f36171e;
            if (pVar != null) {
                addView(pVar);
            } else {
                addView(this.f36172f);
            }
        }
        this.f36169c = i0.o.B(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.m] */
    public final boolean c() {
        FlutterEngine flutterEngine = this.f36176k;
        return flutterEngine != null && flutterEngine.f25542b == this.f36173g.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.f36176k;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap map = flutterEngine.f25557r.f25737l;
        if (view == null || !map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.s.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f36182q.n(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f10 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.i iVar = this.f36187v;
        iVar.f25586a = f10;
        iVar.f25604t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.j jVar = this.f36176k.f25542b;
        jVar.getClass();
        int i = iVar.f25587b;
        ArrayList arrayList = iVar.f25606v;
        ArrayList arrayList2 = iVar.f25605u;
        if (i == 0) {
            int i10 = iVar.f25589d;
            int i11 = iVar.f25590e;
            if (i10 <= 0 && i11 <= 0) {
                return;
            }
        } else {
            int i12 = iVar.f25588c;
            if (i12 == 0) {
                int i13 = iVar.f25591f;
                int i14 = iVar.f25592g;
                if (i13 <= 0 && i14 <= 0) {
                    return;
                }
            } else if (i <= 0 || i12 <= 0 || iVar.f25586a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i15);
            int i16 = i15 * 4;
            Rect rect = bVar.f25568a;
            iArr[i16] = rect.left;
            iArr[i16 + 1] = rect.top;
            iArr[i16 + 2] = rect.right;
            iArr[i16 + 3] = rect.bottom;
            iArr2[i15] = t.z.m(bVar.f25569b);
            iArr3[i15] = t.z.m(bVar.f25570c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList.get(i17);
            int i18 = (i17 * 4) + size2;
            Rect rect2 = bVar2.f25568a;
            iArr[i18] = rect2.left;
            iArr[i18 + 1] = rect2.top;
            iArr[i18 + 2] = rect2.right;
            iArr[i18 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i17] = t.z.m(bVar2.f25569b);
            iArr3[arrayList2.size() + i17] = t.z.m(bVar2.f25570c);
        }
        jVar.f25607a.setViewportMetrics(iVar.f25586a, iVar.f25587b, iVar.f25588c, iVar.f25593h, iVar.i, iVar.f25594j, iVar.f25595k, iVar.f25596l, iVar.f25597m, iVar.f25598n, iVar.f25599o, iVar.f25600p, iVar.f25601q, iVar.f25602r, iVar.f25603s, iVar.f25604t, iArr, iArr2, iArr3, iVar.f25589d, iVar.f25590e, iVar.f25591f, iVar.f25592g);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f36184s;
        if (hVar == null || !hVar.f25848c.isEnabled()) {
            return null;
        }
        return this.f36184s;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.f36176k;
    }

    public ii.f getBinaryMessenger() {
        return this.f36176k.f25543c;
    }

    public m getCurrentImageSurface() {
        return this.f36172f;
    }

    public io.flutter.embedding.engine.renderer.i getViewportMetrics() {
        return this.f36187v;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r18) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.s.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        mj.a aVar = null;
        try {
            f7.g gVar = f7.h.L1;
            Context context = getContext();
            gVar.getClass();
            t0Var = new t0(22, new a1.e(f7.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            t0Var = null;
        }
        this.f36186u = t0Var;
        Activity activity = j0.g.K(getContext());
        t0 t0Var2 = this.f36186u;
        if (t0Var2 == null || activity == null) {
            return;
        }
        this.A = new f7.i(5, this);
        Executor executor = t1.b.c(getContext());
        f7.i consumer = this.A;
        a1.e eVar = (a1.e) t0Var2.f27180c;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        a1.e eVar2 = (a1.e) eVar.f324d;
        f7.b bVar = (f7.b) eVar.f323c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = 1;
        e6.b bVar2 = new e6.b(bVar, activity, aVar, i);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f27499b;
        kk.c cVar = new kk.c(bVar2, gVar2, -2, jk.a.f26675b);
        ok.e eVar3 = k0.f20682a;
        ik.d dVar = mk.n.f28934a;
        if (dVar.get(hk.b1.f20637b) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dVar).toString());
        }
        kk.e flow = cVar;
        if (!dVar.equals(gVar2)) {
            flow = lk.g.a(cVar, dVar, 0, null, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar2.f324d;
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(flow, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) eVar2.f323c;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(consumer) == null) {
                linkedHashMap.put(consumer, hk.c0.m(hk.c0.a(new w0(executor)), null, new cx0(flow, consumer, aVar, i), 3));
            }
            Unit unit = Unit.f27471a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f36176k != null) {
            this.f36181p.b(configuration);
            d();
            j0.g.E(getContext(), this.f36176k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[PHI: r8
      0x0060: PHI (r8v13 int) = (r8v6 int), (r8v16 int) binds: [B:73:0x00bb, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r17) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.s.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f7.i consumer;
        t0 t0Var = this.f36186u;
        if (t0Var != null && (consumer = this.A) != null) {
            a1.e eVar = (a1.e) t0Var.f27180c;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            a1.e eVar2 = (a1.e) eVar.f324d;
            LinkedHashMap linkedHashMap = (LinkedHashMap) eVar2.f324d;
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            ReentrantLock reentrantLock = (ReentrantLock) eVar2.f323c;
            reentrantLock.lock();
            try {
                c1 c1Var = (c1) linkedHashMap.get(consumer);
                if (c1Var != null) {
                    c1Var.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        this.A = null;
        this.f36186u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            a aVar = this.f36183r;
            Context context = getContext();
            aVar.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z5 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z5) {
                int iB = a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                aVar.a(motionEvent, motionEvent.getActionIndex(), iB, 0, a.f36092f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                aVar.f36093a.f25607a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f36184s.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        this.B = View.MeasureSpec.getMode(i);
        this.C = View.MeasureSpec.getMode(i10);
        super.onMeasure(i, i10);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        io.flutter.plugin.editing.i iVar = this.f36179n;
        if (Build.VERSION.SDK_INT < 26) {
            iVar.getClass();
            return;
        }
        if (iVar.f25667g != null) {
            String str = (String) iVar.f25666f.f20616j.f32795b;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i10 = 0; i10 < iVar.f25667g.size(); i10++) {
                int iKeyAt = iVar.f25667g.keyAt(i10);
                s7.g gVar = ((hi.k) iVar.f25667g.valueAt(i10)).f20616j;
                if (gVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) gVar.f32796c;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) gVar.f32798e;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = iVar.f25672m) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((hi.m) gVar.f32797d).f20623a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f25672m.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(iVar.f25668h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        io.flutter.embedding.engine.renderer.i iVar = this.f36187v;
        iVar.f25587b = i;
        iVar.f25588c = i10;
        boolean z5 = this.f36169c;
        if (z5 && this.C == 0) {
            iVar.f25591f = 0;
            iVar.f25592g = 8192;
        } else {
            iVar.f25591f = i10;
            iVar.f25592g = i10;
        }
        if (z5 && this.B == 0) {
            iVar.f25589d = 0;
            iVar.f25590e = 8192;
        } else {
            iVar.f25589d = i;
            iVar.f25590e = i;
        }
        if (this.f36168b.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f36183r.d(motionEvent, a.f36092f);
        return true;
    }

    public void setDelegate(@NonNull t tVar) {
        this.D = tVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f36173g;
        if (view instanceof n) {
            ((n) view).setVisibility(i);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(f7.k kVar) {
        f7.b bVar = f7.b.f16667e;
        List<f7.c> list = kVar.f16690a;
        ArrayList arrayList = new ArrayList();
        for (f7.c cVar : list) {
            cVar.f16673a.a().toString();
            c7.b bVar2 = cVar.f16673a;
            int i = 2;
            int i10 = ((bVar2.f2227c - bVar2.f2225a == 0 || bVar2.f2228d - bVar2.f2226b == 0) ? f7.b.f16666d : bVar) == bVar ? 3 : 2;
            f7.b bVar3 = cVar.f16675c;
            if (bVar3 != f7.b.f16668f) {
                i = bVar3 == f7.b.f16669g ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar2.a(), i10, i));
        }
        ArrayList arrayList2 = this.f36187v.f25605u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public s(Context context, p pVar) {
        super(context, null);
        this.f36168b = new AtomicBoolean(true);
        this.f36169c = false;
        this.i = new HashSet();
        this.f36177l = new HashSet();
        this.f36187v = new io.flutter.embedding.engine.renderer.i();
        this.f36188w = new m4.d(this);
        this.f36189x = new com.google.android.gms.internal.auth.i(this, new Handler(Looper.getMainLooper()), 5);
        this.f36190y = new q(this);
        this.f36191z = new io.flutter.embedding.engine.renderer.a(2, this);
        this.D = new t();
        this.f36171e = pVar;
        this.f36173g = pVar;
        b();
    }
}
