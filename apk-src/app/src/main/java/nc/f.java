package nc;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f29209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hc.a f29210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f29211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f29212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f29213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f29214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f29215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f29216h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f29217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f29219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f29220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint.Style f29223p;

    public f(k kVar) {
        this.f29211c = null;
        this.f29212d = null;
        this.f29213e = null;
        this.f29214f = PorterDuff.Mode.SRC_IN;
        this.f29215g = null;
        this.f29216h = 1.0f;
        this.i = 1.0f;
        this.f29218k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f29219l = 0.0f;
        this.f29220m = 0.0f;
        this.f29221n = 0;
        this.f29222o = 0;
        this.f29223p = Paint.Style.FILL_AND_STROKE;
        this.f29209a = kVar;
        this.f29210b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f29229f = true;
        return gVar;
    }

    public f(f fVar) {
        this.f29211c = null;
        this.f29212d = null;
        this.f29213e = null;
        this.f29214f = PorterDuff.Mode.SRC_IN;
        this.f29215g = null;
        this.f29216h = 1.0f;
        this.i = 1.0f;
        this.f29218k = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f29219l = 0.0f;
        this.f29220m = 0.0f;
        this.f29221n = 0;
        this.f29222o = 0;
        this.f29223p = Paint.Style.FILL_AND_STROKE;
        this.f29209a = fVar.f29209a;
        this.f29210b = fVar.f29210b;
        this.f29217j = fVar.f29217j;
        this.f29211c = fVar.f29211c;
        this.f29212d = fVar.f29212d;
        this.f29214f = fVar.f29214f;
        this.f29213e = fVar.f29213e;
        this.f29218k = fVar.f29218k;
        this.f29216h = fVar.f29216h;
        this.f29222o = fVar.f29222o;
        this.i = fVar.i;
        this.f29219l = fVar.f29219l;
        this.f29220m = fVar.f29220m;
        this.f29221n = fVar.f29221n;
        this.f29223p = fVar.f29223p;
        if (fVar.f29215g != null) {
            this.f29215g = new Rect(fVar.f29215g);
        }
    }
}
