package yads;

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
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RectF f39853j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f39854k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f39855l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39856a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39857b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39858c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39859d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f39860e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f39861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f39862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f39863h;
    public final ig i;

    public jg(TextView textView) {
        this.f39862g = textView;
        this.f39863h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.i = new hg();
        } else {
            this.i = new gg();
        }
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f39854k;
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

    public final void a() {
        TextView textView = this.f39862g;
        if ((textView instanceof EditText) || this.f39856a == 0) {
            return;
        }
        if (this.f39857b) {
            if (textView.getMeasuredHeight() <= 0 || this.f39862g.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.i.a(this.f39862g) ? 1048576 : (this.f39862g.getMeasuredWidth() - this.f39862g.getTotalPaddingLeft()) - this.f39862g.getTotalPaddingRight();
            int height = (this.f39862g.getHeight() - this.f39862g.getCompoundPaddingBottom()) - this.f39862g.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f39853j;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fA = a(rectF);
                    if (fA != this.f39862g.getTextSize()) {
                        a(0, fA);
                    }
                } finally {
                }
            }
        }
        this.f39857b = true;
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f39860e.length;
        if (length != 0) {
            int i = length - 1;
            int i10 = 1;
            int i11 = 0;
            while (i10 <= i) {
                int i12 = (i10 + i) / 2;
                int i13 = this.f39860e[i12];
                CharSequence text = this.f39862g.getText();
                TransformationMethod transformationMethod = this.f39862g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f39862g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f39862g.getMaxLines();
                TextPaint textPaint = this.f39861f;
                if (textPaint == null) {
                    this.f39861f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f39861f.set(this.f39862g.getPaint());
                this.f39861f.setTextSize(i13);
                Layout.Alignment alignment = (Layout.Alignment) a(this.f39862g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f39861f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f39862g.getLineSpacingExtra(), this.f39862g.getLineSpacingMultiplier()).setIncludePad(this.f39862g.getIncludeFontPadding()).setBreakStrategy(this.f39862g.getBreakStrategy()).setHyphenationFrequency(this.f39862g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.i.a(builderObtain, this.f39862g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i14 = i12 + 1;
                    i11 = i10;
                    i10 = i14;
                } else {
                    i11 = i12 - 1;
                    i = i11;
                }
            }
            return this.f39860e[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static Object a(Object obj, String str, Object obj2) {
        try {
            return b(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a(int i, float f10) {
        Resources resources;
        Context context = this.f39863h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i, f10, resources.getDisplayMetrics());
        if (fApplyDimension != this.f39862g.getPaint().getTextSize()) {
            this.f39862g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f39862g.isInLayout();
            if (this.f39862g.getLayout() != null) {
                this.f39857b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f39862g, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (!zIsInLayout) {
                    this.f39862g.requestLayout();
                } else {
                    this.f39862g.forceLayout();
                }
                this.f39862g.invalidate();
            }
        }
    }
}
