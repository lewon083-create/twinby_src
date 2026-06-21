package a2;

import android.location.LocationRequest;
import android.os.Build;
import com.google.android.gms.internal.measurement.d4;
import com.yandex.varioqub.config.model.ConfigValue;
import f2.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f405d;

    public e(long j10, int i, long j11, float f10) {
        this.f403b = j10;
        this.f402a = i;
        this.f404c = j11;
        this.f405d = f10;
    }

    public final LocationRequest a(String str) {
        long j10 = this.f403b;
        if (Build.VERSION.SDK_INT >= 31) {
            return b.f(this);
        }
        Class cls = Integer.TYPE;
        Object obj = null;
        try {
            if (d4.f13701c == null) {
                d4.f13701c = Class.forName("android.location.LocationRequest");
            }
            Method method = d4.f13702d;
            Class cls2 = Long.TYPE;
            if (method == null) {
                Method declaredMethod = d4.f13701c.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls2, Float.TYPE, Boolean.TYPE);
                d4.f13702d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = d4.f13702d.invoke(null, str, Long.valueOf(j10), Float.valueOf(this.f405d), Boolean.FALSE);
            if (objInvoke != null) {
                if (d4.f13703e == null) {
                    Method declaredMethod2 = d4.f13701c.getDeclaredMethod("setQuality", cls);
                    d4.f13703e = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                d4.f13703e.invoke(objInvoke, Integer.valueOf(this.f402a));
                if (d4.f13704f == null) {
                    Method declaredMethod3 = d4.f13701c.getDeclaredMethod("setFastestInterval", cls2);
                    d4.f13704f = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method2 = d4.f13704f;
                long j11 = this.f404c;
                if (j11 != -1) {
                    j10 = j11;
                }
                method2.invoke(objInvoke, Long.valueOf(j10));
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return d.g(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f402a == eVar.f402a && this.f403b == eVar.f403b && this.f404c == eVar.f404c && Float.compare(eVar.f405d, this.f405d) == 0;
    }

    public final int hashCode() {
        int i = this.f402a * 31;
        long j10 = this.f403b;
        int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f404c;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbJ = pe.a.j("Request[");
        long j10 = this.f403b;
        if (j10 != Long.MAX_VALUE) {
            sbJ.append("@");
            g.i(j10, sbJ);
            int i = this.f402a;
            if (i == 100) {
                sbJ.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sbJ.append(" BALANCED");
            } else if (i == 104) {
                sbJ.append(" LOW_POWER");
            }
        } else {
            sbJ.append("PASSIVE");
        }
        long j11 = this.f404c;
        if (j11 != -1 && j11 < j10) {
            sbJ.append(", minUpdateInterval=");
            g.i(j11, sbJ);
        }
        float f10 = this.f405d;
        if (f10 > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            sbJ.append(", minUpdateDistance=");
            sbJ.append(f10);
        }
        if (0 > j10) {
            sbJ.append(", maxUpdateDelay=");
            g.i(0L, sbJ);
        }
        sbJ.append(']');
        return sbJ.toString();
    }
}
