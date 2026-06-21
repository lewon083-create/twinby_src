package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jb2 extends wo implements n11, xc2, pl3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f39809k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wn3 f39810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f39811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ql3 f39812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yc2 f39813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zz2 f39814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p11 f39815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o11 f39816h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f39817j;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jb2(Context context, wn3 wn3Var, AttributeSet attributeSet, int i) {
        wn3 wn3Var2 = (i & 2) != 0 ? new wn3() : wn3Var;
        attributeSet = (i & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        this(context, wn3Var2, attributeSet, applicationContext, new ql3(), yc2.f44998h.a(applicationContext));
    }

    public final void a(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        int i = 1;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        fw2.a();
        synchronized (gw2.f38918j) {
        }
        int iOrdinal = this.f39810b.f44434a.ordinal();
        if (iOrdinal == 0) {
            i = -1;
        } else if (iOrdinal != 1) {
            i = 3;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new ij.j();
                }
                i = 2;
            }
        }
        settings.setCacheMode(i);
        WebSettings settings2 = getSettings();
        if (ub.a(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new m11(this, es2.b()));
        setWebChromeClient(new j11());
    }

    @Override // yads.wo
    public final String b() {
        return com.google.android.gms.internal.ads.om1.k("<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n", vn3.a());
    }

    @Override // yads.wo
    public final void c() {
        setHtmlWebViewListener(null);
        super.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p11 p11Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (p11Var = this.f39815g) != null) {
            p11Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract void e();

    public final Context f() {
        return this.f39811c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39817j = true;
        this.f39813e.a(this);
        this.f39812d.getClass();
        a(ql3.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f39817j = false;
        this.f39812d.getClass();
        a(ql3.a(this));
        this.f39813e.b(this);
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.f39812d.getClass();
        a(ql3.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        this.f39812d.getClass();
        a(ql3.a(this));
    }

    public final void setHtmlWebViewErrorListener(@Nullable o11 o11Var) {
        this.f39816h = o11Var;
    }

    public void setHtmlWebViewListener(@Nullable p11 p11Var) {
        this.f39815g = p11Var;
    }

    public jb2(Context context, wn3 wn3Var, AttributeSet attributeSet, Context context2, ql3 ql3Var, yc2 yc2Var) {
        super(context2, attributeSet);
        this.f39810b = wn3Var;
        this.f39811c = context2;
        this.f39812d = ql3Var;
        this.f39813e = yc2Var;
        this.f39814f = new zz2();
        a(context);
        if (f39809k) {
            return;
        }
        f39809k = true;
    }

    public final void a(boolean z5) {
        if (this.i != z5) {
            this.i = z5;
            p11 p11Var = this.f39815g;
            if (p11Var != null) {
                p11Var.a(z5);
            }
        }
    }

    public void a(Context context, String str) {
        p11 p11Var = this.f39815g;
        if (p11Var != null) {
            p11Var.a(str);
        }
    }

    public void a() {
        zz2 zz2Var = this.f39814f;
        synchronized (zz2Var.f45605a) {
            if (zz2Var.f45606b) {
                return;
            }
            zz2Var.f45606b = true;
            Unit unit = Unit.f27471a;
            a(this);
        }
    }

    public static final void a(jb2 jb2Var) {
        jb2Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // yads.xc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.tc2 r2) {
        /*
            r1 = this;
            yads.tc2 r0 = yads.tc2.f43270c
            if (r2 != r0) goto L5
            goto L1a
        L5:
            yads.ql3 r2 = r1.f39812d
            r2.getClass()
            boolean r2 = yads.ql3.a(r1)
            if (r2 == 0) goto L1a
            yads.yc2 r2 = r1.f39813e
            boolean r2 = r2.a()
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jb2.a(yads.tc2):void");
    }

    public void a(int i) {
        o11 o11Var = this.f39816h;
        if (o11Var != null) {
            o11Var.a(i);
        }
    }
}
