package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.twinby.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static x1 f28396g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f28398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f28399b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f28400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t.x1 f28402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f28395f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w1 f28397h = new w1(6);

    public static synchronized x1 b() {
        try {
            if (f28396g == null) {
                f28396g = new x1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28396g;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        w1 w1Var = f28397h;
        w1Var.getClass();
        int i10 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) w1Var.b(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f28400c == null) {
            this.f28400c = new TypedValue();
        }
        TypedValue typedValue = this.f28400c;
        context.getResources().getValue(i, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            h1.g gVar = (h1.g) this.f28399b.get(context);
            drawableNewDrawable = null;
            if (gVar != null && (weakReference = (WeakReference) gVar.b(j10)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iB = i1.a.b(gVar.f20333c, gVar.f20335e, j10);
                    if (iB >= 0) {
                        Object[] objArr = gVar.f20334d;
                        Object obj = objArr[iB];
                        Object obj2 = h1.h.f20336a;
                        if (obj != obj2) {
                            objArr[iB] = obj2;
                            gVar.f20332b = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableI = null;
        if (this.f28402e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableI = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131165241)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableI = t.x1.i(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableI = t.x1.i(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableI = t.x1.i(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableI == null) {
            return layerDrawableI;
        }
        layerDrawableI.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableI.getConstantState();
                if (constantState2 != null) {
                    h1.g gVar2 = (h1.g) this.f28399b.get(context);
                    if (gVar2 == null) {
                        gVar2 = new h1.g();
                        this.f28399b.put(context, gVar2);
                    }
                    gVar2.d(j10, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return layerDrawableI;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i);
    }

    public final synchronized Drawable d(Context context, int i) {
        Drawable drawableA;
        try {
            if (!this.f28401d) {
                this.f28401d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof v6.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f28401d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i);
            if (drawableA == null) {
                drawableA = context.getDrawable(i);
            }
            if (drawableA != null) {
                drawableA = g(context, i, drawableA);
            }
            if (drawableA != null) {
                w0.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i) {
        ColorStateList colorStateList;
        h1.j jVar;
        WeakHashMap weakHashMap = this.f28398a;
        ColorStateList colorStateListK = null;
        colorStateList = (weakHashMap == null || (jVar = (h1.j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.b(i);
        if (colorStateList == null) {
            t.x1 x1Var = this.f28402e;
            if (x1Var != null) {
                colorStateListK = x1Var.k(context, i);
            }
            if (colorStateListK != null) {
                if (this.f28398a == null) {
                    this.f28398a = new WeakHashMap();
                }
                h1.j jVar2 = (h1.j) this.f28398a.get(context);
                if (jVar2 == null) {
                    jVar2 = new h1.j();
                    this.f28398a.put(context, jVar2);
                }
                jVar2.a(i, colorStateListK);
            }
            colorStateList = colorStateListK;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.x1.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
