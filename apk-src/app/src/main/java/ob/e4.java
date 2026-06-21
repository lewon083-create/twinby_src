package ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 extends s1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f30099j = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f30100k = {"_err"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f30101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f30102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e6.c f30104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f30105h;
    public Integer i;

    public e4(l1 l1Var) {
        super(l1Var);
        this.i = null;
        this.f30102e = new AtomicLong(0L);
    }

    public static String H(int i, String str, boolean z5) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z5) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static boolean J0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void S(d4 d4Var, String str, int i, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        u0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i10);
        }
        d4Var.g0(str, "_err", bundle);
    }

    public static MessageDigest T() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long U(byte[] bArr) {
        pa.c0.i(bArr);
        int length = bArr.length;
        int i = 0;
        pa.c0.l(length > 0);
        long j10 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j10 += (((long) bArr[i10]) & 255) << i;
            i += 8;
        }
        return j10;
    }

    public static boolean V(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean X(String str) {
        String str2 = (String) d0.f30039r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(StringUtils.COMMA)).contains(str);
    }

    public static boolean Z(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean a0(String str, String[] strArr) {
        pa.c0.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList q0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(CommonUrlParts.APP_ID, eVar.f30073b);
            bundle.putString("origin", eVar.f30074c);
            bundle.putLong("creation_timestamp", eVar.f30076e);
            bundle.putString("name", eVar.f30075d.f29965c);
            Object objH = eVar.f30075d.h();
            pa.c0.i(objH);
            y1.c(bundle, objH);
            bundle.putBoolean("active", eVar.f30077f);
            String str = eVar.f30078g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            v vVar = eVar.f30079h;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f30454b);
                u uVar = vVar.f30455c;
                if (uVar != null) {
                    bundle.putBundle("timed_out_event_params", uVar.f());
                }
            }
            bundle.putLong("trigger_timeout", eVar.i);
            v vVar2 = eVar.f30080j;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f30454b);
                u uVar2 = vVar2.f30455c;
                if (uVar2 != null) {
                    bundle.putBundle("triggered_event_params", uVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f30075d.f29966d);
            bundle.putLong("time_to_live", eVar.f30081k);
            v vVar3 = eVar.f30082l;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f30454b);
                u uVar3 = vVar3.f30455c;
                if (uVar3 != null) {
                    bundle.putBundle("expired_event_params", uVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean r0(Context context) {
        ActivityInfo receiverInfo;
        pa.c0.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void s0(r2 r2Var, Bundle bundle, boolean z5) {
        if (bundle != null && r2Var != null) {
            if (!bundle.containsKey("_sc") || z5) {
                String str = r2Var.f30385a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = r2Var.f30386b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", r2Var.f30387c);
                return;
            }
            z5 = false;
        }
        if (bundle != null && r2Var == null && z5) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean u0(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean z0(String str) {
        pa.c0.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final Bundle A0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean B0(String str, String str2) {
        l1 l1Var = (l1) this.f15951b;
        if (str2 == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.i.g(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.i.g(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.i.h(str, "Name must start with a letter. Type, name", str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = l1Var.f30265g;
                l1.k(s0Var4);
                s0Var4.i.h(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean C0(String str, String str2) {
        l1 l1Var = (l1) this.f15951b;
        if (str2 == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.i.g(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.i.g(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                s0 s0Var3 = l1Var.f30265g;
                l1.k(s0Var3);
                s0Var3.i.h(str, "Name must start with a letter or _ (underscore). Type, name", str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = l1Var.f30265g;
                l1.k(s0Var4);
                s0Var4.i.h(str, "Name must consist of letters, digits or _ (underscores). Type, name", str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // ob.s1
    public final boolean D() {
        return true;
    }

    public final boolean D0(String str, String[] strArr, String[] strArr2, String str2) {
        l1 l1Var = (l1) this.f15951b;
        if (str2 == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.i.g(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f30099j[i])) {
                s0 s0Var2 = l1Var.f30265g;
                l1.k(s0Var2);
                s0Var2.i.h(str, "Name starts with reserved prefix. Type, name", str2);
                return false;
            }
        }
        if (strArr == null || !a0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && a0(str2, strArr2)) {
            return true;
        }
        s0 s0Var3 = l1Var.f30265g;
        l1.k(s0Var3);
        s0Var3.i.h(str, "Name is reserved. Type, name", str2);
        return false;
    }

    public final boolean E0(int i, String str, String str2) {
        l1 l1Var = (l1) this.f15951b;
        if (str2 == null) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.i.g(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        s0 s0Var2 = l1Var.f30265g;
        l1.k(s0Var2);
        s0Var2.i.i("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int F0(String str) {
        if (!C0("event", str)) {
            return 2;
        }
        if (!D0("event", y1.f30543a, y1.f30544b, str)) {
            return 13;
        }
        ((l1) this.f15951b).getClass();
        return !E0(40, "event", str) ? 2 : 0;
    }

    public final boolean G(String str) {
        l1 l1Var = (l1) this.f15951b;
        if (TextUtils.isEmpty(str)) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.i.f("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        pa.c0.i(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        s0 s0Var2 = l1Var.f30265g;
        l1.k(s0Var2);
        s0Var2.i.g(s0.K(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int G0(String str) {
        if (!C0("user property", str)) {
            return 6;
        }
        if (!D0("user property", y1.i, null, str)) {
            return 15;
        }
        ((l1) this.f15951b).getClass();
        return !E0(24, "user property", str) ? 6 : 0;
    }

    public final int H0(String str) {
        if (!B0("event param", str)) {
            return 3;
        }
        if (!D0("event param", null, null, str)) {
            return 14;
        }
        ((l1) this.f15951b).getClass();
        return !E0(40, "event param", str) ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.e4.I(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int I0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (!D0("event param", null, null, str)) {
            return 14;
        }
        ((l1) this.f15951b).getClass();
        return !E0(40, "event param", str) ? 3 : 0;
    }

    public final Object J(Object obj, String str) {
        l1 l1Var = (l1) this.f15951b;
        int iMax = 500;
        if ("_ev".equals(str)) {
            l1Var.f30263e.getClass();
            return v0(Math.max(500, 256), obj, true, true);
        }
        if (Z(str)) {
            l1Var.f30263e.getClass();
            iMax = Math.max(500, 256);
        } else {
            l1Var.f30263e.getClass();
        }
        return v0(iMax, obj, false, true);
    }

    public final Bundle K(String str, Bundle bundle, List list, boolean z5) {
        int iH0;
        String str2;
        List list2 = list;
        boolean zA0 = a0(str, y1.f30546d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        l1 l1Var = (l1) this.f15951b;
        g gVar = l1Var.f30263e;
        o0 o0Var = l1Var.f30268k;
        e4 e4Var = ((l1) gVar.f15951b).f30267j;
        l1.h(e4Var);
        int i = e4Var.g0(201500000) ? 100 : 25;
        int i10 = 0;
        boolean z10 = false;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                iH0 = !z5 ? H0(str4) : 0;
                if (iH0 == 0) {
                    iH0 = I0(str4);
                }
            } else {
                iH0 = 0;
            }
            if (iH0 != 0) {
                O(bundle2, iH0, str4, iH0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int I = I(str, str4, bundle.get(str4), bundle2, list2, z5, zA0);
                if (I == 17) {
                    O(bundle2, 17, str4, Boolean.FALSE);
                } else if (I != 0 && !"_ev".equals(str4)) {
                    O(bundle2, I, I == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (z0(str4)) {
                    i10++;
                    if (i10 > i) {
                        if (l1Var.f30263e.M(str3, d0.f30010e1) && z10) {
                            str2 = str3;
                        } else {
                            String strL = l7.o.l(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                            s0 s0Var = l1Var.f30265g;
                            l1.k(s0Var);
                            str2 = str3;
                            s0Var.i.h(o0Var.a(str), strL, o0Var.e(bundle));
                        }
                        u0(5, bundle2);
                        bundle2.remove(str4);
                        z10 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final boolean K0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30415l.i("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final void L(dl.k kVar, int i) {
        Bundle bundle = (Bundle) kVar.f15874e;
        int i10 = 0;
        boolean z5 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (z0(str) && (i10 = i10 + 1) > i) {
                l1 l1Var = (l1) this.f15951b;
                g gVar = l1Var.f30263e;
                o0 o0Var = l1Var.f30268k;
                if (!gVar.M(null, d0.f30010e1) || !z5) {
                    String strL = l7.o.l(new StringBuilder(String.valueOf(i).length() + 37), "Event can't contain more than ", i, " params");
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.i.h(o0Var.a((String) kVar.f15872c), strL, o0Var.e(bundle));
                    u0(5, bundle);
                }
                bundle.remove(str);
                z5 = true;
            }
        }
    }

    public final void L0(String str, String str2, Bundle bundle, List list, boolean z5) {
        int iH0;
        String str3;
        int I;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        l1 l1Var = (l1) this.f15951b;
        g gVar = l1Var.f30263e;
        s0 s0Var = l1Var.f30265g;
        o0 o0Var = l1Var.f30268k;
        e4 e4Var = ((l1) gVar.f15951b).f30267j;
        l1.h(e4Var);
        int i = true != e4Var.g0(231100000) ? 0 : 35;
        int i10 = 0;
        boolean z10 = false;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                iH0 = !z5 ? H0(str4) : 0;
                if (iH0 == 0) {
                    iH0 = I0(str4);
                }
            } else {
                iH0 = 0;
            }
            if (iH0 != 0) {
                O(bundle, iH0, str4, iH0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (J0(bundle.get(str4))) {
                    l1.k(s0Var);
                    s0Var.f30415l.i("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    I = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    I = I(str, str4, bundle.get(str4), bundle, list2, z5, false);
                }
                if (I != 0 && !"_ev".equals(str4)) {
                    O(bundle, I, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (z0(str4) && !a0(str4, y1.f30550h)) {
                    int i11 = i10 + 1;
                    if (!g0(231100000)) {
                        l1.k(s0Var);
                        s0Var.i.h(o0Var.a(str), "Item array not supported on client's version of Google Play Services (Android Only)", o0Var.e(bundle));
                        u0(23, bundle);
                        bundle.remove(str4);
                    } else if (i11 > i) {
                        if (!l1Var.f30263e.M(str3, d0.f30010e1) || !z10) {
                            l1.k(s0Var);
                            s0Var.i.h(o0Var.a(str), l7.o.l(new StringBuilder(String.valueOf(i).length() + 55), "Item can't contain more than ", i, " item-scoped custom params"), o0Var.e(bundle));
                        }
                        u0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i10 = i11;
                        z10 = true;
                    }
                    list2 = list;
                    i10 = i11;
                }
            }
            list2 = list;
        }
    }

    public final void M(Parcelable[] parcelableArr, int i) {
        pa.c0.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = 0;
            boolean z5 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (z0(str) && !a0(str, y1.f30550h) && (i10 = i10 + 1) > i) {
                    l1 l1Var = (l1) this.f15951b;
                    g gVar = l1Var.f30263e;
                    o0 o0Var = l1Var.f30268k;
                    if (!gVar.M(null, d0.f30010e1) || !z5) {
                        s0 s0Var = l1Var.f30265g;
                        l1.k(s0Var);
                        s0Var.i.h(o0Var.b(str), l7.o.l(new StringBuilder(String.valueOf(i).length() + 60), "Param can't contain more than ", i, " item-scoped custom parameters"), o0Var.e(bundle));
                    }
                    u0(28, bundle);
                    bundle.remove(str);
                    z5 = true;
                }
            }
        }
    }

    public final void N(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                e4 e4Var = ((l1) this.f15951b).f30267j;
                l1.h(e4Var);
                e4Var.R(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void O(Bundle bundle, int i, String str, Object obj) {
        if (u0(i, bundle)) {
            ((l1) this.f15951b).getClass();
            bundle.putString("_ev", H(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int P(Object obj, String str) {
        return "_ldl".equals(str) ? K0("user property referrer", str, w0(str), obj) : K0("user property", str, w0(str), obj) ? 0 : 7;
    }

    public final Object Q(Object obj, String str) {
        return "_ldl".equals(str) ? v0(w0(str), obj, true, false) : v0(w0(str), obj, false, false);
    }

    public final void R(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            l1 l1Var = (l1) this.f15951b;
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30415l.h(l1Var.f30268k.b(str), "Not putting event parameter. Invalid value type. name, type", simpleName);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long W() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.e4.W():long");
    }

    public final boolean Y(String str) {
        C();
        l1 l1Var = (l1) this.f15951b;
        if (wa.b.a(l1Var.f30260b).f33798b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30417n.g(str, "Permission not granted");
        return false;
    }

    public final boolean b0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((l1) this.f15951b).f30263e.G("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle c0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objJ = J(bundle.get(str), str);
                if (objJ == null) {
                    l1 l1Var = (l1) this.f15951b;
                    s0 s0Var = l1Var.f30265g;
                    l1.k(s0Var);
                    s0Var.f30415l.g(l1Var.f30268k.b(str), "Param value can't be null");
                } else {
                    R(bundle2, str, objJ);
                }
            }
        }
        return bundle2;
    }

    public final v d0(String str, Bundle bundle, String str2, long j10, boolean z5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (F0(str) != 0) {
            l1 l1Var = (l1) this.f15951b;
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(l1Var.f30268k.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleK = K(str, bundle2, Collections.singletonList("_o"), true);
        if (z5) {
            bundleK = c0(bundleK);
        }
        pa.c0.i(bundleK);
        return new v(str, new u(bundleK), str2, j10);
    }

    public final boolean e0(Context context, String str) {
        Signature[] signatureArr;
        l1 l1Var = (l1) this.f15951b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoD = wa.b.a(context).d(64, str);
            if (packageInfoD == null || (signatureArr = packageInfoD.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e3) {
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30411g.g(e3, "Package name not found");
            return true;
        } catch (CertificateException e7) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30411g.g(e7, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean g0(int i) {
        Boolean bool = ((l1) this.f15951b).n().f30068f;
        if (h0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int h0() {
        if (this.i == null) {
            l1 l1Var = (l1) this.f15951b;
            ma.g gVar = ma.g.f28775b;
            Context context = l1Var.f30260b;
            gVar.getClass();
            this.i = Integer.valueOf(ma.g.a(context) / 1000);
        }
        return this.i.intValue();
    }

    public final void i0(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(Long.valueOf(j11), "Params already contained engagement");
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void j0(String str, com.google.android.gms.internal.measurement.l0 l0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning string value to wrapper");
        }
    }

    public final void k0(com.google.android.gms.internal.measurement.l0 l0Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning long value to wrapper");
        }
    }

    public final void l0(com.google.android.gms.internal.measurement.l0 l0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning int value to wrapper");
        }
    }

    public final void m0(com.google.android.gms.internal.measurement.l0 l0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning byte array to wrapper");
        }
    }

    public final void n0(com.google.android.gms.internal.measurement.l0 l0Var, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z5);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning boolean value to wrapper");
        }
    }

    public final void o0(com.google.android.gms.internal.measurement.l0 l0Var, Bundle bundle) {
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning bundle value to wrapper");
        }
    }

    public final void p0(com.google.android.gms.internal.measurement.l0 l0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l0Var.W2(bundle);
        } catch (RemoteException e3) {
            s0 s0Var = ((l1) this.f15951b).f30265g;
            l1.k(s0Var);
            s0Var.f30413j.g(e3, "Error returning bundle list to wrapper");
        }
    }

    public final String t0() {
        byte[] bArr = new byte[16];
        y0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object v0(int i, Object obj, boolean z5, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return H(i, obj.toString(), z5);
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleC0 = c0((Bundle) parcelable);
                if (!bundleC0.isEmpty()) {
                    arrayList.add(bundleC0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int w0(String str) {
        l1 l1Var = (l1) this.f15951b;
        if ("_ldl".equals(str)) {
            l1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            l1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            l1Var.getClass();
            return 100;
        }
        l1Var.getClass();
        return 36;
    }

    public final long x0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f30102e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f30102e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((l1) this.f15951b).f30269l.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f30103f + 1;
            this.f30103f = i;
            j10 = jNextLong + ((long) i);
        }
        return j10;
    }

    public final SecureRandom y0() {
        C();
        if (this.f30101d == null) {
            this.f30101d = new SecureRandom();
        }
        return this.f30101d;
    }
}
