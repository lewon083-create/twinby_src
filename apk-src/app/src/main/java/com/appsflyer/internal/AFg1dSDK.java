package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK {
    private StringBuilder getRevenue = new StringBuilder();
    private final List<AFa1zSDK> getCurrencyIso4217Code = new ArrayList();
    private final String getMonetizationNetwork = null;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1zSDK getCurrencyIso4217Code() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        return this.getCurrencyIso4217Code.get(r0.size() - 1);
    }

    public final void AFAdRevenueData(String str) {
        this.getRevenue.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                this.getRevenue.append("\\f");
            } else if (cCharAt == '\r') {
                this.getRevenue.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getRevenue.append("\\b");
                        break;
                    case '\t':
                        this.getRevenue.append("\\t");
                        break;
                    case '\n':
                        this.getRevenue.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getRevenue.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getRevenue.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getRevenue;
                sb2.append('\\');
                sb2.append(cCharAt);
            }
        }
        this.getRevenue.append("\"");
    }

    public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty() && this.getRevenue.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.getCurrencyIso4217Code.add(aFa1zSDK);
        this.getRevenue.append(str);
        return this;
    }

    public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code != aFa1zSDK2 && currencyIso4217Code != aFa1zSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        this.getCurrencyIso4217Code.remove(r2.size() - 1);
        this.getRevenue.append(str);
        return this;
    }

    public final String toString() {
        if (this.getRevenue.length() == 0) {
            return null;
        }
        return this.getRevenue.toString();
    }

    public final AFg1dSDK getCurrencyIso4217Code(Object obj) throws Throwable {
        if (!this.getCurrencyIso4217Code.isEmpty()) {
            if (((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) "", '0', 0) + 324, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
                try {
                    Object[] objArr = {this};
                    Map map = AFa1hSDK.f2437d;
                    Object declaredMethod = map.get(-811011778);
                    if (declaredMethod == null) {
                        declaredMethod = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 322, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
                        map.put(-811011778, declaredMethod);
                    }
                    ((Method) declaredMethod).invoke(obj, objArr);
                    return this;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            if (obj instanceof AFg1gSDK) {
                ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
                return this;
            }
            getMediationNetwork();
            if (obj != null && !(obj instanceof Boolean) && obj != AFg1gSDK.getRevenue) {
                if (obj instanceof Number) {
                    this.getRevenue.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
                    return this;
                }
                AFAdRevenueData(obj.toString());
                return this;
            }
            this.getRevenue.append(obj);
            return this;
        }
        throw new AFg1mSDK("Nesting problem");
    }

    public final void getMonetizationNetwork() throws AFg1mSDK {
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getRevenue.append(',');
        } else if (currencyIso4217Code != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK);
    }

    private void getMediationNetwork() throws AFg1mSDK {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            return;
        }
        AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
        if (currencyIso4217Code == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK);
        } else {
            if (currencyIso4217Code == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getRevenue.append(',');
                return;
            }
            if (currencyIso4217Code == AFa1zSDK.DANGLING_KEY) {
                this.getRevenue.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getCurrencyIso4217Code.set(r1.size() - 1, aFa1zSDK2);
                return;
            }
            if (currencyIso4217Code != AFa1zSDK.NULL) {
                throw new AFg1mSDK("Nesting problem");
            }
        }
    }
}
