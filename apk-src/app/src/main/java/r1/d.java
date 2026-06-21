package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.om1;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f32156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32163h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f32165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f32166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f32169o;

    public d() {
        super(-2, -2);
        this.f32157b = false;
        this.f32158c = 0;
        this.f32159d = 0;
        this.f32160e = -1;
        this.f32161f = -1;
        this.f32162g = 0;
        this.f32163h = 0;
        this.f32169o = new Rect();
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.f32167m;
        }
        if (i != 1) {
            return false;
        }
        return this.f32168n;
    }

    public d(Context context, AttributeSet attributeSet) {
        a aVar;
        super(context, attributeSet);
        this.f32157b = false;
        this.f32158c = 0;
        this.f32159d = 0;
        this.f32160e = -1;
        this.f32161f = -1;
        this.f32162g = 0;
        this.f32163h = 0;
        this.f32169o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f31624b);
        this.f32158c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f32161f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f32159d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f32160e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f32162g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f32163h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f32157b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1291u;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1291u;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1293w;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1292v);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException(om1.k("Could not inflate Behavior subclass ", string), e3);
                }
            }
            this.f32156a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f32156a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f32157b = false;
        this.f32158c = 0;
        this.f32159d = 0;
        this.f32160e = -1;
        this.f32161f = -1;
        this.f32162g = 0;
        this.f32163h = 0;
        this.f32169o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f32157b = false;
        this.f32158c = 0;
        this.f32159d = 0;
        this.f32160e = -1;
        this.f32161f = -1;
        this.f32162g = 0;
        this.f32163h = 0;
        this.f32169o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f32157b = false;
        this.f32158c = 0;
        this.f32159d = 0;
        this.f32160e = -1;
        this.f32161f = -1;
        this.f32162g = 0;
        this.f32163h = 0;
        this.f32169o = new Rect();
    }
}
