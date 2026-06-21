package m;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f28343l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f28344m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28345a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28346b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28347c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28348d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28349e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f28350f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28351g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f28352h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f28353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f28354k;

    static {
        new ConcurrentHashMap();
    }

    public r0(TextView textView) {
        this.i = textView;
        this.f28353j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28354k = new p0();
        } else {
            this.f28354k = new o0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f28344m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f28346b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f28354k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f28343l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.i.getTextSize()) {
                            g(fC, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f28346b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f28350f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i10 = 0;
        int i11 = 1;
        while (i11 <= i) {
            int i12 = (i11 + i) / 2;
            int i13 = this.f28350f[i12];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int iB = l0.b(textView);
            TextPaint textPaint = this.f28352h;
            if (textPaint == null) {
                this.f28352h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f28352h.set(textView.getPaint());
            this.f28352h.setTextSize(i13);
            StaticLayout staticLayoutA = n0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB, textView, this.f28352h, this.f28354k);
            if ((iB == -1 || (staticLayoutA.getLineCount() <= iB && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i14 = i12 + 1;
                i10 = i11;
                i11 = i14;
            } else {
                i10 = i12 - 1;
                i = i10;
            }
        }
        return this.f28350f[i10];
    }

    public final boolean f() {
        return j() && this.f28345a != 0;
    }

    public final void g(float f10, int i) {
        Context context = this.f28353j;
        float fApplyDimension = TypedValue.applyDimension(i, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zA = m0.a(textView);
            if (textView.getLayout() != null) {
                this.f28346b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (zA) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f28345a == 1) {
            if (!this.f28351g || this.f28350f.length == 0) {
                int iFloor = ((int) Math.floor((this.f28349e - this.f28348d) / this.f28347c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f28347c) + this.f28348d);
                }
                this.f28350f = b(iArr);
            }
            this.f28346b = true;
        } else {
            this.f28346b = false;
        }
        return this.f28346b;
    }

    public final boolean i() {
        boolean z5 = this.f28350f.length > 0;
        this.f28351g = z5;
        if (z5) {
            this.f28345a = 1;
            this.f28348d = r0[0];
            this.f28349e = r0[r1 - 1];
            this.f28347c = -1.0f;
        }
        return z5;
    }

    public final boolean j() {
        return !(this.i instanceof s);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f28345a = 1;
        this.f28348d = f10;
        this.f28349e = f11;
        this.f28347c = f12;
        this.f28351g = false;
    }
}
