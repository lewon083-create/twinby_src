package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dv1 f41224a = cv1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f41225b = "YandexAds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f41226c = true;

    public static String a(String str) {
        return com.google.android.gms.internal.ads.om1.k("[Integration] ", str);
    }

    public static final void b(String str, Object... objArr) {
        boolean z5;
        if (!f41226c) {
            synchronized (gu1.f38874a) {
                z5 = gu1.f38875b;
            }
            if (!z5) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f41226c) {
            Log.i(f41225b, strA);
        }
        if (gu1.f38875b) {
            f41224a.a(fu1.f38549b, f41225b, strA);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z5;
        if (!f41226c) {
            synchronized (gu1.f38874a) {
                z5 = gu1.f38875b;
            }
            if (!z5) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f41226c) {
            Log.w(f41225b, strA);
        }
        if (gu1.f38875b) {
            f41224a.a(fu1.f38550c, f41225b, strA);
        }
    }

    public static final void a(String str, Object... objArr) {
        boolean z5;
        if (!f41226c) {
            synchronized (gu1.f38874a) {
                z5 = gu1.f38875b;
            }
            if (!z5) {
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strA = a(str2);
        if (f41226c) {
            Log.e(f41225b, strA);
        }
        if (gu1.f38875b) {
            f41224a.a(fu1.f38551d, f41225b, strA);
        }
    }
}
