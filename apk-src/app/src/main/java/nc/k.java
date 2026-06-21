package nc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ya.e f29258a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ya.e f29259b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ya.e f29260c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ya.e f29261d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f29262e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f29263f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f29264g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f29265h = new a(0.0f);
    public e i = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f29266j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f29267k = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f29268l = new e();

    public static j a(Context context, int i, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(vb.a.f34825q);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            jVar.f29247a = a.a.c(i12);
            jVar.f29251e = cVarC2;
            jVar.f29248b = a.a.c(i13);
            jVar.f29252f = cVarC3;
            jVar.f29249c = a.a.c(i14);
            jVar.f29253g = cVarC4;
            jVar.f29250d = a.a.c(i15);
            jVar.f29254h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i10) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34820l, i, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z5 = this.f29268l.getClass().equals(e.class) && this.f29266j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f29267k.getClass().equals(e.class);
        float fA = this.f29262e.a(rectF);
        return z5 && ((this.f29263f.a(rectF) > fA ? 1 : (this.f29263f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f29265h.a(rectF) > fA ? 1 : (this.f29265h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f29264g.a(rectF) > fA ? 1 : (this.f29264g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f29259b instanceof i) && (this.f29258a instanceof i) && (this.f29260c instanceof i) && (this.f29261d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f29247a = this.f29258a;
        jVar.f29248b = this.f29259b;
        jVar.f29249c = this.f29260c;
        jVar.f29250d = this.f29261d;
        jVar.f29251e = this.f29262e;
        jVar.f29252f = this.f29263f;
        jVar.f29253g = this.f29264g;
        jVar.f29254h = this.f29265h;
        jVar.i = this.i;
        jVar.f29255j = this.f29266j;
        jVar.f29256k = this.f29267k;
        jVar.f29257l = this.f29268l;
        return jVar;
    }
}
