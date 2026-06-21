package io.flutter.plugin.editing;

import a0.b1;
import a7.l;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.ads.c3;
import hi.k;
import hi.m;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f25661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f25662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f25663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h3.e f25664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c3 f25665e = new c3(1, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f25666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f25667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f25668h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InputConnection f25669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f25670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f25671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f25672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f25673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f25674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25675p;

    public i(View view, h3.e eVar, b1 b1Var, q qVar, p pVar) {
        this.f25661a = view;
        this.f25668h = new f(null, view);
        this.f25662b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f25663c = g8.a.e(view.getContext().getSystemService(g8.a.k()));
        } else {
            this.f25663c = null;
        }
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f25673n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new l(25, this));
        }
        this.f25664d = eVar;
        eVar.f20376d = new fe.c(24, this);
        ((ii.q) eVar.f20375c).a("TextInputClient.requestExistingInputState", null, null);
        this.f25670k = qVar;
        qVar.f25734h = this;
        this.f25671l = pVar;
        pVar.f25717g = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r6 == r0.f20627e) goto L44;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r18) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.i.a(boolean):void");
    }

    public final void b(int i) {
        c3 c3Var = this.f25665e;
        int i10 = c3Var.f4005a;
        if ((i10 == 3 || i10 == 4) && c3Var.f4006b == i) {
            this.f25665e = new c3(1, 0);
            d();
            View view = this.f25661a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f25662b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.i = false;
        }
    }

    public final void c() {
        this.f25670k.f25734h = null;
        this.f25671l.f25717g = null;
        this.f25664d.f20376d = null;
        d();
        this.f25668h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f25673n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        k kVar;
        s7.g gVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f25663c) == null || (kVar = this.f25666f) == null || (gVar = kVar.f20616j) == null || this.f25667g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f25661a, ((String) gVar.f32795b).hashCode());
    }

    public final void e(k kVar) {
        s7.g gVar;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (kVar == null || (gVar = kVar.f20616j) == null) {
            this.f25667g = null;
            return;
        }
        k[] kVarArr = kVar.f20618l;
        SparseArray sparseArray = new SparseArray();
        this.f25667g = sparseArray;
        if (kVarArr == null) {
            sparseArray.put(((String) gVar.f32795b).hashCode(), kVar);
            return;
        }
        for (k kVar2 : kVarArr) {
            s7.g gVar2 = kVar2.f20616j;
            if (gVar2 != null) {
                String str = (String) gVar2.f32795b;
                this.f25667g.put(str.hashCode(), kVar2);
                this.f25663c.notifyValueChanged(this.f25661a, str.hashCode(), AutofillValue.forText(((m) gVar2.f32797d).f20623a));
            }
        }
    }
}
