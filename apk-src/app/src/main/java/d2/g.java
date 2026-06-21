package d2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.measurement.b4;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f15542a = new w(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f15543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1.i f15545d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f15543b = threadPoolExecutor;
        f15544c = new Object();
        f15545d = new h1.i(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).f15537g);
            sb2.append("-");
            sb2.append(i);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static f b(String str, Context context, List list, int i) {
        int i10;
        Typeface typefaceI;
        w wVar = f15542a;
        Trace.beginSection(com.google.android.gms.internal.auth.g.M("getFontSync"));
        try {
            Typeface typeface = (Typeface) wVar.b(str);
            if (typeface != null) {
                return new f(typeface);
            }
            h hVarA = c.a(context, list);
            List list2 = hVarA.f15547b;
            int i11 = hVarA.f15546a;
            if (i11 != 0) {
                i10 = i11 != 1 ? -3 : -2;
            } else {
                i[] iVarArr = (i[]) list2.get(0);
                if (iVarArr == null || iVarArr.length == 0) {
                    i10 = 1;
                } else {
                    int length = iVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i10 = 0;
                            break;
                        }
                        int i13 = iVarArr[i12].f15553f;
                        if (i13 == 0) {
                            i12++;
                        } else if (i13 >= 0) {
                            i10 = i13;
                        }
                    }
                }
            }
            if (i10 != 0) {
                return new f(i10);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                i[] iVarArr2 = (i[]) list2.get(0);
                b4 b4Var = x1.d.f35695a;
                Trace.beginSection(com.google.android.gms.internal.auth.g.M("TypefaceCompat.createFromFontInfo"));
                typefaceI = x1.d.f35695a.i(context, iVarArr2, i);
                Trace.endSection();
            } else {
                b4 b4Var2 = x1.d.f35695a;
                Trace.beginSection(com.google.android.gms.internal.auth.g.M("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceI = x1.d.f35695a.j(context, list2, i);
                Trace.endSection();
            }
            if (typefaceI == null) {
                return new f(-3);
            }
            wVar.c(str, typefaceI);
            return new f(typefaceI);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }
}
