package t9;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.b31;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.m31;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.r00;
import com.google.android.gms.internal.ads.sd0;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.tu0;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xo0;
import com.google.android.gms.internal.ads.xp0;
import com.google.android.gms.internal.ads.yk;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.ads.zp0;
import com.google.android.gms.internal.measurement.j4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0232ia;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.MeasurementUnit;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d0 f33596l = new d0(Looper.getMainLooper(), 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f33604h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f33597a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f33598b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f33599c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f33600d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33601e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f33602f = new Object();
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33605j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f33606k = Executors.newSingleThreadExecutor();

    public static final void A(b7 b7Var, Bundle bundle) {
        Intent intent = (Intent) b7Var.f3658c;
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        if (i >= 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i10 = bundle.getInt("cbp", -1);
        if (i10 < 0 || i10 > 2) {
            return;
        }
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i10);
    }

    public static final String B(Context context, String str) {
        Context contextCreatePackageContext;
        if (str == null) {
            return P();
        }
        String strP = null;
        try {
            if (d8.k.f15638d == null) {
                d8.k.f15638d = new d8.k(3);
            }
            d8.k kVar = d8.k.f15638d;
            if (TextUtils.isEmpty(kVar.f15640c)) {
                int i = ma.j.f28781e;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                kVar.f15640c = (String) j4.A(context, new aa.x(9, contextCreatePackageContext, context));
            }
            strP = kVar.f15640c;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strP)) {
            strP = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strP)) {
            strP = P();
        }
        String strG = t.z.g(new StringBuilder(String.valueOf(strP).length() + 10 + str.length()), strP, " (Mobile; ", str);
        try {
            if (wa.b.a(context).e()) {
                StringBuilder sb2 = new StringBuilder(strG.length() + 4);
                sb2.append(strG);
                sb2.append(";aia");
                strG = sb2.toString();
            }
        } catch (Exception e3) {
            p9.k.C.f31302h.d("AdUtil.getUserAgent", e3);
        }
        return strG.concat(")");
    }

    public static ArrayList I() {
        wk wkVar = al.f2915a;
        ArrayList<String> arrayListZ = q9.s.f31967e.f31968a.z();
        ArrayList arrayList = new ArrayList();
        for (String str : arrayListZ) {
            xo0 xo0VarC = xo0.c(new b31(','));
            str.getClass();
            Iterator itE = ((n31) xo0VarC.f12221c).e(xo0VarC, str);
            while (true) {
                m31 m31Var = (m31) itE;
                if (m31Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) m31Var.next()));
                    } catch (NumberFormatException unused) {
                        c0.m("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static String J(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public static d8.a K(Context context) {
        d8.a aVar = new d8.a(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry(), 6);
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new d8.a(locale.getLanguage(), locale.getCountry(), 6);
        }
        LocaleManager localeManagerC = io.flutter.plugin.platform.b.c(context.getSystemService(io.flutter.plugin.platform.b.j()));
        if (localeManagerC == null || localeManagerC.getSystemLocales().isEmpty()) {
            return aVar;
        }
        Locale locale2 = localeManagerC.getSystemLocales().get(0);
        return new d8.a(locale2.getLanguage(), locale2.getCountry(), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean M(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g0.M(android.view.View):boolean");
    }

    public static final void N(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String O(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(z(context));
    }

    public static final String P() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String Q() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : t.z.g(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap R(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e3) {
            p9.k.C.f31302h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e3);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long a(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final int b(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof ScrollingView) {
                return 4;
            }
        }
        return 0;
    }

    public static final w c(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                u9.i.e("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new v(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 1);
        } catch (Exception e3) {
            p9.k.C.f31302h.d("Failed to instantiate WorkManagerUtil", e3);
            return null;
        }
    }

    public static final boolean d(Context context, String str) {
        int i = su.f10391a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return wa.b.a(context).f33798b.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean e(Context context) {
        try {
            if (ua.b.f34409h == null) {
                ua.b.f34409h = Boolean.valueOf(ua.b.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return ua.b.f34409h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(java.lang.String r6) {
        /*
            boolean r0 = u9.f.c()
            r1 = 0
            if (r0 != 0) goto L8
            goto L69
        L8:
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.W5
            q9.s r2 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r3 = r2.f31970c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            goto L69
        L1b:
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.Y5
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            java.lang.String r3 = ";"
            if (r2 != 0) goto L41
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r4 = r1
        L33:
            if (r4 >= r2) goto L41
            r5 = r0[r4]
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3e
            goto L69
        L3e:
            int r4 = r4 + 1
            goto L33
        L41:
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.X5
            q9.s r2 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c
            java.lang.Object r0 = r2.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L54
            goto L64
        L54:
            java.lang.String[] r0 = r0.split(r3)
            int r2 = r0.length
            r3 = r1
        L5a:
            if (r3 >= r2) goto L69
            r4 = r0[r3]
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L66
        L64:
            r6 = 1
            return r6
        L66:
            int r3 = r3 + 1
            goto L5a
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g0.f(java.lang.String):boolean");
    }

    public static final boolean g(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th2) {
            u9.i.f("Error loading class.", th2);
            p9.k.C.f31302h.d("AdUtil.isLiteSdk", th2);
            return false;
        }
    }

    public static final boolean h(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        try {
            Bundle bundleZ = z(context);
            String string = bundleZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(y(bundleZ))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean j(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void k(View view, int i) {
        String str;
        int i10;
        int iHeight;
        int iWidth;
        String str2;
        String str3;
        String strA;
        xp0 xp0VarM;
        zp0 zp0VarI0;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof ad0) {
                childAt = ((ad0) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                str = "NATIVE";
                i10 = 1;
            } else {
                str = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            g0 g0Var = p9.k.C.f31297c;
            long jA = a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            boolean z5 = childAt instanceof sz;
            String str4 = MeasurementUnit.NONE;
            if (!z5 || (zp0VarI0 = ((sz) childAt).I0()) == null) {
                str2 = str;
                str3 = MeasurementUnit.NONE;
            } else {
                str3 = zp0VarI0.f13056b;
                int iHashCode = childAt.hashCode();
                str2 = str;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(iHashCode).length());
                sb2.append(str3);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(iHashCode);
                childAt.setContentDescription(sb2.toString());
            }
            if (!(childAt instanceof sz) || (xp0VarM = ((sz) childAt).M()) == null) {
                strA = str2;
            } else {
                strA = xp0.a(xp0VarM.f12229b);
                i10 = xp0VarM.f12235e;
                str4 = xp0VarM.E;
            }
            Locale locale = Locale.US;
            u9.i.g("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str4 + ", gwsQueryId=" + str3 + ", format=" + strA + ", impType=" + i10 + ", class=" + childAt.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jA + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e3) {
            u9.i.f("Failure getting view location.", e3);
        }
    }

    public static final AlertDialog.Builder l(Context context) {
        h0 h0Var = p9.k.C.f31300f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void m(Context context, xp0 xp0Var, sd0 sd0Var) {
        zd1 zd1VarA = sd0Var.a();
        zd1VarA.v("action", "can_show");
        p9.k kVar = p9.k.C;
        g0 g0Var = kVar.f31297c;
        boolean zH = h(context);
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        zd1VarA.v(C0232ia.f24064g, true != zH ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        if (true == kVar.f31301g.A()) {
            str = "1";
        }
        zd1VarA.v("fg_al", str);
        if (xp0Var != null) {
            List list = xp0Var.f12262t;
            if (!list.isEmpty()) {
                zd1VarA.v("ancn", (String) list.get(0));
            }
            zd1VarA.v("ad_format", xp0.a(xp0Var.f12229b));
        }
        zd1VarA.w();
    }

    public static final boolean n(xp0 xp0Var) {
        return ((Boolean) q9.s.f31967e.f31970c.a(al.Le)).booleanValue() && xp0Var != null && xp0Var.f12235e == 4;
    }

    public static final int o(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e3) {
            u9.i.h("Could not parse value:".concat(e3.toString()));
            return 0;
        }
    }

    public static final HashMap p(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3203t)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] r(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        q9.r rVar = q9.r.f31959g;
        return new int[]{rVar.f31960a.h(activity, iArr[0]), rVar.f31960a.h(activity, iArr[1])};
    }

    public static final boolean s(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z5 = p9.k.C.f31297c.f33601e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || M(view);
        long jA = a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z5)) {
            wk wkVar = al.J1;
            q9.s sVar = q9.s.f31967e;
            yk ykVar = sVar.f31970c;
            yk ykVar2 = sVar.f31970c;
            if ((!((Boolean) ykVar.a(wkVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) ykVar2.a(al.Ob)).booleanValue() || jA >= ((Integer) ykVar2.a(al.Qb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static int t(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 86);
        sb2.append("HTTP timeout too low: ");
        sb2.append(i);
        sb2.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        u9.i.h(sb2.toString());
        return 60000;
    }

    public static final void u(Context context, Intent intent) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3098lc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (SecurityException e3) {
                u9.i.i("", e3);
                p9.k.C.f31302h.d("AdUtil.startActivityWithUnknownContext", e3);
            }
        } catch (Throwable unused2) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final void v(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            N(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 26);
            sb2.append("Opening ");
            sb2.append(string);
            sb2.append(" in a new browser.");
            u9.i.c(sb2.toString());
        } catch (ActivityNotFoundException e3) {
            u9.i.f("No browser is found.", e3);
        }
    }

    public static final void w(Context context, Intent intent, sd0 sd0Var, String str) {
        wk wkVar = al.f3172qe;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (!((Boolean) ykVar.a(wkVar)).booleanValue() || !(context instanceof r00)) {
            u(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) ykVar2.a(al.f3202se))) {
                u(context, intent);
                return;
            }
            ((r00) context).a(intent);
            if (!((Boolean) ykVar2.a(al.f3187re)).booleanValue() || sd0Var == null) {
                return;
            }
            zd1 zd1VarA = sd0Var.a();
            zd1VarA.v("action", "hila");
            if (str == null) {
                str = "";
            }
            zd1VarA.v("gqi", str);
            zd1VarA.y();
        } catch (ActivityNotFoundException e3) {
            e = e3;
            u9.i.f("Error occurred while starting activity for result", e);
            p9.k.C.f31302h.d("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (SecurityException e7) {
            e = e7;
            u9.i.f("Error occurred while starting activity for result", e);
            p9.k.C.f31302h.d("AdUtil.startActivityForResult", e);
            u(context, intent);
        } catch (Exception e10) {
            u9.i.f("Error occurred while starting activity for result", e10);
            p9.k.C.f31302h.d("AdUtil.startActivityForResult", e10);
            u(context, intent);
        }
    }

    public static boolean x(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle z(Context context) {
        try {
            return wa.b.a(context).c(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e3) {
            c0.n("Error getting metadata", e3);
            return null;
        }
    }

    public final void C(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iT = t(i);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iT).length() + 28);
        sb2.append("HTTP timeout: ");
        sb2.append(iT);
        sb2.append(" milliseconds.");
        u9.i.g(sb2.toString());
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", F(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void D(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        al.a(context);
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3082kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new bj.g(11, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new bj.g(11, this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void E(Context context) {
        if (this.f33605j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        al.a(context);
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3082kc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new tu0(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new tu0(1), intentFilter, 4);
        }
        this.f33605j = true;
    }

    public final String F(Context context, String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3276xc)).booleanValue()) {
            if (this.f33604h != null) {
                return this.f33604h;
            }
            this.f33604h = B(context, str);
            return this.f33604h;
        }
        synchronized (this.f33602f) {
            try {
                String str2 = this.f33603g;
                if (str2 != null) {
                    return str2;
                }
                String strB = B(context, str);
                this.f33603g = strB;
                return strB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean G(String str) {
        return x(str, this.f33597a, (String) q9.s.f31967e.f31970c.a(al.D0));
    }

    public final boolean H(String str) {
        return x(str, this.f33598b, (String) q9.s.f31967e.f31970c.a(al.E0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (u9.d.q() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int L(android.content.Context r8, android.net.Uri r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.g0.L(android.content.Context, android.net.Uri, android.os.Bundle):int");
    }
}
