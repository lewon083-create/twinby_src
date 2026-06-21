package ob;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f30333f = new p((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f30336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f30338e;

    public p(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(w1.class);
        this.f30338e = enumMap;
        enumMap.put(w1.AD_USER_DATA, bool == null ? u1.UNINITIALIZED : bool.booleanValue() ? u1.GRANTED : u1.DENIED);
        this.f30334a = i;
        this.f30335b = d();
        this.f30336c = bool2;
        this.f30337d = str;
    }

    public static p b(String str) {
        if (str == null || str.length() <= 0) {
            return f30333f;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(w1.class);
        w1[] w1VarArr = v1.DMA.f30462b;
        int length = w1VarArr.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(w1VarArr[i11], x1.e(strArrSplit[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new p(enumMap, i, (Boolean) null, (String) null);
    }

    public static p c(int i, Bundle bundle) {
        if (bundle == null) {
            return new p((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(w1.class);
        for (w1 w1Var : v1.DMA.f30462b) {
            enumMap.put(w1Var, x1.d(bundle.getString(w1Var.f30498b)));
        }
        return new p(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final u1 a() {
        u1 u1Var = (u1) this.f30338e.get(w1.AD_USER_DATA);
        return u1Var == null ? u1.UNINITIALIZED : u1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30334a);
        for (w1 w1Var : v1.DMA.f30462b) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(x1.h((u1) this.f30338e.get(w1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f30335b.equalsIgnoreCase(pVar.f30335b) && Objects.equals(this.f30336c, pVar.f30336c)) {
            return Objects.equals(this.f30337d, pVar.f30337d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f30336c;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f30337d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f30335b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(x1.a(this.f30334a));
        for (w1 w1Var : v1.DMA.f30462b) {
            sb2.append(StringUtils.COMMA);
            sb2.append(w1Var.f30498b);
            sb2.append("=");
            u1 u1Var = (u1) this.f30338e.get(w1Var);
            if (u1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = u1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f30336c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f30337d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public p(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(w1.class);
        this.f30338e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f30334a = i;
        this.f30335b = d();
        this.f30336c = bool;
        this.f30337d = str;
    }
}
