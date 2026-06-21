package nc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.internal.ads.xj0;
import java.util.BitSet;
import java.util.Objects;
import k6.t0;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Paint f29224x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f29225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s[] f29226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s[] f29227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f29228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f29230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f29231h;
    public final Path i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f29232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f29233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f29234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f29235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f29236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f29237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f29238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mc.a f29239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t0 f29240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xj0 f29241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f29242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f29243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f29244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f29245w;

    static {
        Paint paint = new Paint(1);
        f29224x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f29225b;
        this.f29241s.b(fVar.f29209a, fVar.i, rectF, this.f29240r, path);
        if (this.f29225b.f29216h != 1.0f) {
            Matrix matrix = this.f29230g;
            matrix.reset();
            float f10 = this.f29225b.f29216h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f29244v, true);
    }

    public final int b(int i) {
        int i10;
        f fVar = this.f29225b;
        float f10 = fVar.f29220m + 0.0f + fVar.f29219l;
        hc.a aVar = fVar.f29210b;
        if (aVar == null || !aVar.f20475a || x1.a.e(i, KotlinVersion.MAX_COMPONENT_VALUE) != aVar.f20478d) {
            return i;
        }
        float fMin = (aVar.f20479e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iZ = com.google.android.gms.internal.auth.g.z(fMin, x1.a.e(i, KotlinVersion.MAX_COMPONENT_VALUE), aVar.f20476b);
        if (fMin > 0.0f && (i10 = aVar.f20477c) != 0) {
            iZ = x1.a.c(x1.a.e(i10, hc.a.f20474f), iZ);
        }
        return x1.a.e(iZ, iAlpha);
    }

    public final void c(Canvas canvas) {
        if (this.f29228e.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f29225b.f29222o;
        Path path = this.f29231h;
        mc.a aVar = this.f29239q;
        if (i != 0) {
            canvas.drawPath(path, aVar.f28822a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            s sVar = this.f29226c[i10];
            int i11 = this.f29225b.f29221n;
            Matrix matrix = s.f29286b;
            sVar.a(matrix, aVar, i11, canvas);
            this.f29227d[i10].a(matrix, aVar, this.f29225b.f29221n, canvas);
        }
        if (this.f29245w) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * ((double) this.f29225b.f29222o));
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f29225b.f29222o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f29224x);
            canvas.translate(iSin, iCos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f29263f.a(rectF) * this.f29225b.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f29242t;
        Paint paint = this.f29237o;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f29225b.f29218k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29243u;
        Paint paint2 = this.f29238p;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f29225b.f29217j);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f29225b.f29218k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z5 = this.f29229f;
        Path path = this.f29231h;
        if (z5) {
            float f10 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f29225b.f29209a;
            j jVarE = kVar.e();
            c bVar = kVar.f29262e;
            if (!(bVar instanceof h)) {
                bVar = new b(f10, bVar);
            }
            jVarE.f29251e = bVar;
            c bVar2 = kVar.f29263f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f10, bVar2);
            }
            jVarE.f29252f = bVar2;
            c bVar3 = kVar.f29265h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f10, bVar3);
            }
            jVarE.f29254h = bVar3;
            c bVar4 = kVar.f29264g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f10, bVar4);
            }
            jVarE.f29253g = bVar4;
            k kVarA = jVarE.a();
            this.f29236n = kVarA;
            float f11 = this.f29225b.i;
            RectF rectFF = f();
            RectF rectF = this.f29233k;
            rectF.set(rectFF);
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f29241s.b(kVarA, f11, rectF, null, this.i);
            a(f(), path);
            this.f29229f = false;
        }
        f fVar = this.f29225b;
        fVar.getClass();
        if (fVar.f29221n > 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (!this.f29225b.f29209a.d(f()) && !path.isConvex() && i11 < 29) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d10)) * ((double) this.f29225b.f29222o)), (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f29225b.f29222o)));
                if (this.f29245w) {
                    RectF rectF2 = this.f29244v;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f29225b.f29221n * 2) + ((int) rectF2.width()) + iWidth, (this.f29225b.f29221n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f29225b.f29221n) - iWidth;
                    float f13 = (getBounds().top - this.f29225b.f29221n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f29225b;
        Paint.Style style = fVar2.f29223p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f29209a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        k kVar = this.f29236n;
        RectF rectFF = f();
        RectF rectF = this.f29233k;
        rectF.set(rectFF);
        boolean zG = g();
        Paint paint = this.f29238p;
        float strokeWidth = zG ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, this.i, kVar, rectF);
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.f29232j;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f29225b.f29223p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f29238p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29225b.f29218k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f29225b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f29225b.getClass();
        if (this.f29225b.f29209a.d(f())) {
            outline.setRoundRect(getBounds(), this.f29225b.f29209a.f29262e.a(f()) * this.f29225b.i);
            return;
        }
        RectF rectFF = f();
        Path path = this.f29231h;
        a(rectFF, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f29225b.f29215g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f29234l;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.f29231h;
        a(rectFF, path);
        Region region2 = this.f29235m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f29225b.f29210b = new hc.a(context);
        m();
    }

    public final void i(float f10) {
        f fVar = this.f29225b;
        if (fVar.f29220m != f10) {
            fVar.f29220m = f10;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f29229f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f29225b.f29213e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f29225b.getClass();
        ColorStateList colorStateList2 = this.f29225b.f29212d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f29225b.f29211c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f29225b;
        if (fVar.f29211c != colorStateList) {
            fVar.f29211c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f29225b.f29211c == null || color2 == (colorForState2 = this.f29225b.f29211c.getColorForState(iArr, (color2 = (paint2 = this.f29237o).getColor())))) {
            z5 = false;
        } else {
            paint2.setColor(colorForState2);
            z5 = true;
        }
        if (this.f29225b.f29212d == null || color == (colorForState = this.f29225b.f29212d.getColorForState(iArr, (color = (paint = this.f29238p).getColor())))) {
            return z5;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29242t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f29243u;
        f fVar = this.f29225b;
        ColorStateList colorStateList = fVar.f29213e;
        PorterDuff.Mode mode = fVar.f29214f;
        if (colorStateList == null || mode == null) {
            int color = this.f29237o.getColor();
            int iB = b(color);
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f29242t = porterDuffColorFilter;
        this.f29225b.getClass();
        this.f29243u = null;
        this.f29225b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f29242t) && Objects.equals(porterDuffColorFilter3, this.f29243u)) ? false : true;
    }

    public final void m() {
        f fVar = this.f29225b;
        float f10 = fVar.f29220m + 0.0f;
        fVar.f29221n = (int) Math.ceil(0.75f * f10);
        this.f29225b.f29222o = (int) Math.ceil(f10 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f29225b = new f(this.f29225b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f29229f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z5 = k(iArr) || l();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f29225b;
        if (fVar.f29218k != i) {
            fVar.f29218k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29225b.getClass();
        super.invalidateSelf();
    }

    @Override // nc.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f29225b.f29209a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f29225b.f29213e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f29225b;
        if (fVar.f29214f != mode) {
            fVar.f29214f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i10) {
        this(k.b(context, attributeSet, i, i10).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        xj0 xj0Var;
        this.f29226c = new s[4];
        this.f29227d = new s[4];
        this.f29228e = new BitSet(8);
        this.f29230g = new Matrix();
        this.f29231h = new Path();
        this.i = new Path();
        this.f29232j = new RectF();
        this.f29233k = new RectF();
        this.f29234l = new Region();
        this.f29235m = new Region();
        Paint paint = new Paint(1);
        this.f29237o = paint;
        Paint paint2 = new Paint(1);
        this.f29238p = paint2;
        this.f29239q = new mc.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            xj0Var = l.f29269a;
        } else {
            xj0Var = new xj0();
        }
        this.f29241s = xj0Var;
        this.f29244v = new RectF();
        this.f29245w = true;
        this.f29225b = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f29240r = new t0(3, this);
    }
}
