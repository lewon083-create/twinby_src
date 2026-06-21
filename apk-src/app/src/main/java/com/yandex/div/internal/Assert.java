package com.yandex.div.internal;

import androidx.annotation.NonNull;
import bg.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new a(7);
    private static volatile boolean sEnabled = false;

    public static void assertEquals(String str, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                failNotEquals(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
        }
    }

    public static void fail(String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    private static void failNotEquals(String str, Object obj, Object obj2) {
        fail(format(str, obj, obj2));
    }

    public static String format(String str, Object obj, Object obj2) {
        String strConcat = "";
        if (str != null && !str.equals("")) {
            strConcat = str.concat(" ");
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            StringBuilder sbK = pe.a.k(strConcat, "expected: ");
            sbK.append(formatClassAndValue(obj, strValueOf));
            sbK.append(" but was: ");
            sbK.append(formatClassAndValue(obj2, strValueOf2));
            return sbK.toString();
        }
        return strConcat + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    private static String formatClassAndValue(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + "<" + str + ">";
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            ((a) sAssertionErrorHandler).getClass();
            lambda$static$0(assertionError);
        }
    }

    public static void fail(String str, Throwable th2) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th2);
            performFail(assertionError);
        }
    }

    private static /* synthetic */ void lambda$static$0(AssertionError assertionError) {
        throw assertionError;
    }
}
