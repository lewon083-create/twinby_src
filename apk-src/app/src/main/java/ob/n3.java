package ob;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ad.b1 f30314a = ad.j0.y("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(r4 r4Var, ad.g1 g1Var, ad.g1 g1Var2, ad.o1 o1Var, char[] cArr, int i, int i10, int i11, String str, String str2, String str3, boolean z5, boolean z10) {
        m3 m3Var;
        char c8;
        int iC = c(r4Var);
        if (iC > 0 && (i10 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(r4Var, g1Var2) == s4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c8 = '3';
        } else {
            if (r4Var == r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && o1Var.f848e.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (g1Var.containsKey(r4Var) && (m3Var = (m3) g1Var.get(r4Var)) != null) {
                int iOrdinal = m3Var.ordinal();
                s4 s4Var = s4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    s4 s4Var2 = s4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(r4Var, g1Var2) == s4Var ? f(r4Var, cArr, str3, z10) : e(r4Var, cArr, str2, z5);
                        }
                        if (iOrdinal == 3) {
                            return g(r4Var, g1Var2) == s4Var2 ? e(r4Var, cArr, str2, z5) : f(r4Var, cArr, str3, z10);
                        }
                        c8 = '0';
                    } else if (g(r4Var, g1Var2) != s4Var2) {
                        return f(r4Var, cArr, str3, z10);
                    }
                } else if (g(r4Var, g1Var2) != s4Var) {
                    return e(r4Var, cArr, str2, z5);
                }
                c8 = '8';
            } else {
                c8 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c8;
        return false;
    }

    public static final int c(r4 r4Var) {
        if (r4Var == r4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (r4Var == r4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (r4Var == r4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return r4Var == r4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(r4 r4Var, String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strValueOf = CommonUrlParts.Values.FALSE_INTEGER;
        String strValueOf2 = (zIsEmpty || str.length() < r4Var.h()) ? CommonUrlParts.Values.FALSE_INTEGER : String.valueOf(str.charAt(r4Var.h() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= r4Var.h()) {
            strValueOf = String.valueOf(str2.charAt(r4Var.h() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(r4 r4Var, char[] cArr, String str, boolean z5) {
        char c8;
        int iC = c(r4Var);
        if (!z5) {
            c8 = '4';
        } else {
            if (str.length() >= r4Var.h()) {
                char cCharAt = str.charAt(r4Var.h() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c8 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c8;
        }
        return false;
    }

    public static final boolean f(r4 r4Var, char[] cArr, String str, boolean z5) {
        char c8;
        int iC = c(r4Var);
        if (!z5) {
            c8 = '5';
        } else {
            if (str.length() >= r4Var.h()) {
                char cCharAt = str.charAt(r4Var.h() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c8 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c8;
        }
        return false;
    }

    public static final s4 g(r4 r4Var, ad.g1 g1Var) {
        Object obj = g1Var.get(r4Var);
        if (obj == null) {
            obj = s4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (s4) obj;
    }
}
