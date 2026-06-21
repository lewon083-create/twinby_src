package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dv1 f39237a = cv1.a();

    public static void a(String str, Object... objArr) {
        boolean z5;
        if (!cd1.f37338a) {
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
        if (cd1.f37338a) {
            Log.w("Yandex Mobile Ads", str2);
        }
        if (gu1.f38875b) {
            f39237a.a(fu1.f38550c, "Yandex Mobile Ads", str2);
        }
    }
}
