package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f28326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28327c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t2 f28328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2 f28329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2 f28330f;

    public o(View view) {
        q qVar;
        this.f28325a = view;
        PorterDuff.Mode mode = q.f28337b;
        synchronized (q.class) {
            try {
                if (q.f28338c == null) {
                    q.c();
                }
                qVar = q.f28338c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28326b = qVar;
    }

    public final void a() {
        View view = this.f28325a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f28328d != null) {
                if (this.f28330f == null) {
                    this.f28330f = new t2();
                }
                t2 t2Var = this.f28330f;
                t2Var.f28367c = null;
                t2Var.f28366b = false;
                t2Var.f28368d = null;
                t2Var.f28365a = false;
                Field field = g2.n0.f19900a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    t2Var.f28366b = true;
                    t2Var.f28367c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    t2Var.f28365a = true;
                    t2Var.f28368d = backgroundTintMode;
                }
                if (t2Var.f28366b || t2Var.f28365a) {
                    q.d(background, t2Var, view.getDrawableState());
                    return;
                }
            }
            t2 t2Var2 = this.f28329e;
            if (t2Var2 != null) {
                q.d(background, t2Var2, view.getDrawableState());
                return;
            }
            t2 t2Var3 = this.f28328d;
            if (t2Var3 != null) {
                q.d(background, t2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        t2 t2Var = this.f28329e;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f28367c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        t2 t2Var = this.f28329e;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f28368d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = this.f28325a;
        Context context = view.getContext();
        int[] iArr = h.a.f20313v;
        ka.k kVarJ = ka.k.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        View view2 = this.f28325a;
        g2.n0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) kVarJ.f27325d, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f28327c = typedArray.getResourceId(0, -1);
                q qVar = this.f28326b;
                Context context2 = view.getContext();
                int i10 = this.f28327c;
                synchronized (qVar) {
                    colorStateListF = qVar.f28339a.f(context2, i10);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(kVarJ.E(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(w0.c(typedArray.getInt(2, -1), null));
            }
            kVarJ.Q();
        } catch (Throwable th2) {
            kVarJ.Q();
            throw th2;
        }
    }

    public final void e() {
        this.f28327c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListF;
        this.f28327c = i;
        q qVar = this.f28326b;
        if (qVar != null) {
            Context context = this.f28325a.getContext();
            synchronized (qVar) {
                colorStateListF = qVar.f28339a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f28328d == null) {
                this.f28328d = new t2();
            }
            t2 t2Var = this.f28328d;
            t2Var.f28367c = colorStateList;
            t2Var.f28366b = true;
        } else {
            this.f28328d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f28329e == null) {
            this.f28329e = new t2();
        }
        t2 t2Var = this.f28329e;
        t2Var.f28367c = colorStateList;
        t2Var.f28366b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f28329e == null) {
            this.f28329e = new t2();
        }
        t2 t2Var = this.f28329e;
        t2Var.f28368d = mode;
        t2Var.f28365a = true;
        a();
    }
}
