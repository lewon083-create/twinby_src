package io.appmetrica.analytics.impl;

import android.database.Cursor;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ko {
    public static boolean a(Object obj) {
        return obj != null;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean a(Map map) {
        return map == null || map.size() == 0;
    }

    public static boolean a(Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static BigDecimal a(long j10) {
        return new BigDecimal(j10).divide(new BigDecimal(1000000), 6, 6);
    }

    public static double a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? ConfigValue.DOUBLE_DEFAULT_VALUE : d10;
    }
}
