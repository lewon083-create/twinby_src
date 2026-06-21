package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f13400a;

    public static n a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new n(strConcat, str2);
    }

    public static void b(int i, int i10) {
        String strC;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strC = b0.c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
                }
                strC = b0.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void d(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(g(i, i10, "index"));
        }
    }

    public static void e(Context context, HashSet hashSet) {
        HashMap map;
        c0 c0Var = new c0(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = c0Var.f13348c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            n nVarA = a(context, str);
            if (nVarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = (String) nVarA.f13492b;
                if (!map.containsKey(str2)) {
                    map.put(str2, c0Var.f13347b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove((String) nVarA.f13493c);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static void f(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? g(i, i11, "start index") : (i10 < 0 || i10 > i11) ? g(i10, i11, "end index") : b0.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static String g(int i, int i10, String str) {
        if (i < 0) {
            return b0.c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return b0.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
    }
}
