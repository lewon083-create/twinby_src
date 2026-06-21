package bc;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import nc.g;
import nc.k;
import nc.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f2029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f2030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2036h;
    public PorterDuff.Mode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f2037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f2038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f2039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f2040m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2044q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f2046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2047t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2041n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2042o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2043p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2045r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f2029a = materialButton;
        this.f2030b = kVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f2046s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f2046s.getNumberOfLayers() > 2 ? (u) this.f2046s.getDrawable(2) : (u) this.f2046s.getDrawable(1);
    }

    public final g b(boolean z5) {
        RippleDrawable rippleDrawable = this.f2046s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f2046s.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f2030b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i10) {
        Field field = n0.f19900a;
        MaterialButton materialButton = this.f2029a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f2033e;
        int i12 = this.f2034f;
        this.f2034f = i10;
        this.f2033e = i;
        if (!this.f2042o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        g gVar = new g(this.f2030b);
        MaterialButton materialButton = this.f2029a;
        gVar.h(materialButton.getContext());
        gVar.setTintList(this.f2037j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        float f10 = this.f2036h;
        ColorStateList colorStateList = this.f2038k;
        gVar.f29225b.f29217j = f10;
        gVar.invalidateSelf();
        nc.f fVar = gVar.f29225b;
        if (fVar.f29212d != colorStateList) {
            fVar.f29212d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f2030b);
        gVar2.setTint(0);
        float f11 = this.f2036h;
        int iP = this.f2041n ? com.google.android.gms.internal.auth.g.p(materialButton, R.attr.colorSurface) : 0;
        gVar2.f29225b.f29217j = f11;
        gVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
        nc.f fVar2 = gVar2.f29225b;
        if (fVar2.f29212d != colorStateListValueOf) {
            fVar2.f29212d = colorStateListValueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f2030b);
        this.f2040m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(lc.a.a(this.f2039l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f2031c, this.f2033e, this.f2032d, this.f2034f), this.f2040m);
        this.f2046s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g gVarB = b(false);
        if (gVarB != null) {
            gVarB.i(this.f2047t);
            gVarB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g gVarB = b(false);
        g gVarB2 = b(true);
        if (gVarB != null) {
            float f10 = this.f2036h;
            ColorStateList colorStateList = this.f2038k;
            gVarB.f29225b.f29217j = f10;
            gVarB.invalidateSelf();
            nc.f fVar = gVarB.f29225b;
            if (fVar.f29212d != colorStateList) {
                fVar.f29212d = colorStateList;
                gVarB.onStateChange(gVarB.getState());
            }
            if (gVarB2 != null) {
                float f11 = this.f2036h;
                int iP = this.f2041n ? com.google.android.gms.internal.auth.g.p(this.f2029a, R.attr.colorSurface) : 0;
                gVarB2.f29225b.f29217j = f11;
                gVarB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
                nc.f fVar2 = gVarB2.f29225b;
                if (fVar2.f29212d != colorStateListValueOf) {
                    fVar2.f29212d = colorStateListValueOf;
                    gVarB2.onStateChange(gVarB2.getState());
                }
            }
        }
    }
}
