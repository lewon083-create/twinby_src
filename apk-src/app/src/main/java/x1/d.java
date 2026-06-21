package x1;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.measurement.b4;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b4 f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f35697c;

    static {
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f35695a = new j();
        } else if (i >= 29) {
            f35695a = new i();
        } else if (i >= 28) {
            f35695a = new h();
        } else if (i >= 26) {
            f35695a = new g();
        } else {
            Method method = f.f35704h;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f35695a = new f();
            } else {
                f35695a = new e();
            }
        }
        f35696b = new w(16);
        f35697c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r7 = r12.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, w1.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, w1.b r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.d.a(android.content.Context, w1.d, android.content.res.Resources, int, java.lang.String, int, int, w1.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i10, int i11) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i10 + '-' + i + '-' + i11;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f35697c == null) {
            f35697c = new Paint();
        }
        f35697c.setTextSize(10.0f);
        f35697c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f35697c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
