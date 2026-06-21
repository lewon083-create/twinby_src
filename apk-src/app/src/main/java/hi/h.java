package hi;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.g00;
import com.google.android.gms.internal.ads.mx;
import ii.q;
import ii.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f20602g;

    public h(Activity activity, g00 g00Var, g00 g00Var2) {
        this.f20596a = 2;
        this.f20601f = activity;
        this.f20600e = g00Var;
        this.f20602g = g00Var2;
    }

    public static HashMap b(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void a() {
        p pVar = (p) this.f20600e;
        Drawable buttonDrawable = pVar.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f20597b || this.f20598c) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f20597b) {
                    drawableMutate.setTintList((ColorStateList) this.f20601f);
                }
                if (this.f20598c) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f20602g);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(pVar.getDrawableState());
                }
                pVar.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void c() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        g00 g00Var = (g00) this.f20602g;
        if (this.f20597b) {
            return;
        }
        Activity activity = (Activity) this.f20601f;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(g00Var);
            }
        }
        g00 g00Var2 = (g00) this.f20600e;
        fp fpVar = p9.k.C.B;
        mx mxVar = new mx(g00Var2, g00Var);
        View view = (View) ((WeakReference) mxVar.f6568b).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            mxVar.F1(viewTreeObserver2);
        }
        this.f20597b = true;
    }

    public String toString() {
        switch (this.f20596a) {
            case 3:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f20597b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f20598c + ", prettyPrintIndent='" + ((String) this.f20600e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f20601f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f20599d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((vk.a) this.f20602g) + ')';
            default:
                return super.toString();
        }
    }

    public h(boolean z5, boolean z10, String prettyPrintIndent, String classDiscriminator, boolean z11, vk.a classDiscriminatorMode) {
        this.f20596a = 3;
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f20597b = z5;
        this.f20598c = z10;
        this.f20600e = prettyPrintIndent;
        this.f20601f = classDiscriminator;
        this.f20599d = z11;
        this.f20602g = classDiscriminatorMode;
    }

    public h(zh.b bVar, boolean z5) {
        this.f20596a = 0;
        q qVar = new q(bVar, "flutter/restoration", x.f21321b, null);
        this.f20598c = false;
        this.f20599d = false;
        fe.c cVar = new fe.c(19, this);
        this.f20601f = qVar;
        this.f20597b = z5;
        qVar.b(cVar);
    }

    public h(p pVar) {
        this.f20596a = 1;
        this.f20601f = null;
        this.f20602g = null;
        this.f20597b = false;
        this.f20598c = false;
        this.f20600e = pVar;
    }
}
