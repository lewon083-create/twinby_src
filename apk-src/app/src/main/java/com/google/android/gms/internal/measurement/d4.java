package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.b31;
import com.google.android.gms.internal.ads.m31;
import com.google.android.gms.internal.ads.n31;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.ads.xo0;
import com.google.android.gms.internal.ads.xp0;
import com.google.android.gms.internal.ads.yk;
import g0.q1;
import g0.u1;
import io.sentry.protocol.ViewHierarchyNode;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f13699a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f13700b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f13701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f13702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f13703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f13704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f13705g;

    public static boolean A(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static Integer B(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    public static int C(Activity activity, String str, int i) {
        if (i == -1) {
            return h(activity, str);
        }
        return 1;
    }

    public static boolean D(int i) {
        wk wkVar = al.f3014g4;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            return ((Boolean) sVar.f31970c.a(al.f3029h4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: JSONException -> 0x0131, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0131, blocks: (B:31:0x0113, B:40:0x012d, B:48:0x0141, B:47:0x013d), top: B:65:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject E(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d4.E(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject F(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                wk wkVar = al.W8;
                q9.s sVar = q9.s.f31967e;
                yk ykVar = sVar.f31970c;
                yk ykVar2 = sVar.f31970c;
                if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
                    if (((Boolean) ykVar2.a(al.X8)).booleanValue()) {
                        t9.g0 g0Var = p9.k.C.f31297c;
                        jSONObject.put("contained_in_scroll_view", t9.g0.b(view) != 0);
                    }
                    if (((Boolean) ykVar2.a(al.Y8)).booleanValue()) {
                        t9.g0 g0Var2 = p9.k.C.f31297c;
                        jSONObject.put("scroll_view_type", t9.g0.b(view));
                        return jSONObject;
                    }
                } else {
                    t9.g0 g0Var3 = p9.k.C.f31297c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject G(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                t9.g0 g0Var = p9.k.C.f31297c;
                jSONObject.put("can_show_on_lock_screen", t9.g0.M(view));
                boolean z5 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z5 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z5);
                return jSONObject;
            } catch (JSONException unused) {
                u9.i.h("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject H(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            q9.r rVar = q9.r.f31959g;
                            jSONObject4.put("width", rVar.f31960a.h(context, measuredWidth));
                            jSONObject4.put("height", rVar.f31960a.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", rVar.f31960a.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", rVar.f31960a.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = M(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", rVar.f31960a.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", rVar.f31960a.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                wk wkVar = al.Z8;
                                q9.s sVar = q9.s.f31967e;
                                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) sVar.f31970c.a(al.f2925a9)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", N(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", N(layoutParams.height) - 1);
                                }
                                if (((Boolean) sVar.f31970c.a(al.f2941b9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) q9.s.f31967e.f31970c.a(al.c9)).booleanValue()) {
                                jSONObject3.put(ViewHierarchyNode.JsonKeys.ALPHA, view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            u9.i.h("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject I(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i = point2.x;
                    q9.r rVar = q9.r.f31959g;
                    jSONObject3.put("x", rVar.f31960a.h(context, i));
                    jSONObject3.put("y", rVar.f31960a.h(context, point2.y));
                    jSONObject3.put("start_x", rVar.f31960a.h(context, point.x));
                    jSONObject3.put("start_y", rVar.f31960a.h(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e3) {
                    u9.i.f("Error occurred while putting signals into JSON object.", e3);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e7) {
                e = e7;
                jSONObject = jSONObject2;
                u9.i.f("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static boolean J(Context context, xp0 xp0Var) {
        m31 m31Var;
        if (!xp0Var.N) {
            return false;
        }
        wk wkVar = al.f2972d9;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            return ((Boolean) ykVar2.a(al.f3019g9)).booleanValue();
        }
        String str = (String) ykVar2.a(al.f2987e9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        xo0 xo0VarC = xo0.c(new b31(';'));
        Iterator itE = ((n31) xo0VarC.f12221c).e(xo0VarC, str);
        do {
            m31Var = (m31) itE;
            if (!m31Var.hasNext()) {
                return false;
            }
        } while (!((String) m31Var.next()).equals(packageName));
        return true;
    }

    public static JSONObject K(Context context) {
        JSONObject jSONObject = new JSONObject();
        t9.g0 g0Var = p9.k.C.f31297c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            q9.r rVar = q9.r.f31959g;
            jSONObject.put("width", rVar.f31960a.h(context, i));
            jSONObject.put("height", rVar.f31960a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams L() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) q9.s.f31967e.f31970c.a(al.f3003f9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject M(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        q9.r rVar = q9.r.f31959g;
        jSONObject.put("width", rVar.f31960a.h(context, i));
        int i10 = rect.bottom - rect.top;
        u9.d dVar = rVar.f31960a;
        jSONObject.put("height", dVar.h(context, i10));
        jSONObject.put("x", dVar.h(context, rect.left));
        jSONObject.put("y", dVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int N(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static boolean a(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zB = b(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zB;
            } catch (Throwable th2) {
                th = th2;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean b(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    public static Bitmap c(byte[] bArr, int i, int i10) throws IOException {
        BitmapFactory.Options options;
        if (i10 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i10; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw j3.d0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            x2.g gVar = new x2.g(byteArrayInputStream);
            byteArrayInputStream.close();
            int iM = gVar.m();
            if (iM == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iM);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            IntRange intRangeN = kotlin.collections.p.n(objArr);
            if ((intRangeN instanceof Collection) && ((Collection) intRangeN).isEmpty()) {
                return true;
            }
            ck.g gVarA = intRangeN.iterator();
            while (gVarA.f2383d) {
                int iNextInt = gVarA.nextInt();
                if (!d(objArr[iNextInt], objArr2[iNextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            IntRange intRangeD = kotlin.collections.s.d((Collection) obj);
            if ((intRangeD instanceof Collection) && ((Collection) intRangeD).isEmpty()) {
                return true;
            }
            ck.g gVarA2 = intRangeD.iterator();
            while (gVarA2.f2383d) {
                int iNextInt2 = gVarA2.nextInt();
                if (!d(list.get(iNextInt2), list2.get(iNextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return Intrinsics.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !d(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            fd.g.e();
            fd.g gVarE = fd.g.e();
            gVarE.a();
            Context context = gVarE.f16758a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void f(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (md.g gVar : (Set) it2.next()) {
                        for (md.i iVar : gVar.f28848a.f28833c) {
                            if (iVar.f28855c == 0) {
                                Set<md.g> set = (Set) map.get(new md.h(iVar.f28853a, iVar.f28854b == 2));
                                if (set != null) {
                                    for (md.g gVar2 : set) {
                                        gVar.f28849b.add(gVar2);
                                        gVar2.f28850c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<md.g> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (md.g gVar3 : hashSet) {
                    if (gVar3.f28850c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    md.g gVar4 = (md.g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i++;
                    for (md.g gVar5 : gVar4.f28849b) {
                        gVar5.f28850c.remove(gVar4);
                        if (gVar5.f28850c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (md.g gVar6 : hashSet) {
                    if (!gVar6.f28850c.isEmpty() && !gVar6.f28849b.isEmpty()) {
                        arrayList2.add(gVar6.f28848a);
                    }
                }
                throw new md.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            md.b bVar = (md.b) it.next();
            md.g gVar7 = new md.g(bVar);
            for (md.q qVar : bVar.f28832b) {
                boolean z5 = bVar.f28835e == 0;
                md.h hVar = new md.h(qVar, !z5);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set2 = (Set) map.get(hVar);
                if (!set2.isEmpty() && z5) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(gVar7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Context r3, java.lang.String r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto Le
            boolean r1 = l(r3, r4, r2)
            if (r1 == 0) goto Le
            return r4
        Le:
            r4 = 29
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            if (r0 >= r4) goto L24
            boolean r4 = l(r3, r1, r2)
            if (r4 == 0) goto L1b
            goto L2a
        L1b:
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = l(r3, r4, r2)
            if (r3 == 0) goto L2b
            return r4
        L24:
            boolean r3 = l(r3, r1, r2)
            if (r3 == 0) goto L2b
        L2a:
            return r1
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d4.g(android.content.Context, java.lang.String):java.lang.String");
    }

    public static int h(Activity activity, String str) {
        if (activity != null) {
            boolean z5 = activity.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
            boolean zF = t1.b.f(activity, str);
            if (z5) {
                zF = !zF;
            }
            if (!z5 && zF) {
                activity.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
            }
            if (z5 && zF) {
                return 4;
            }
        }
        return 0;
    }

    public static final dk.c i(sk.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (!(fVar instanceof sk.b) && (fVar instanceof uk.w0)) {
            return i(((uk.w0) fVar).f34601a);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList j(Context context, int i) {
        String strG;
        String strG2;
        String strG3;
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 0:
            case 37:
                if (l(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (l(context, "android.permission.READ_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (l(context, "android.permission.CAMERA", arrayList)) {
                    arrayList.add("android.permission.CAMERA");
                    return arrayList;
                }
                return arrayList;
            case 2:
                if (l(context, "android.permission.READ_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (l(context, "android.permission.WRITE_CONTACTS", arrayList)) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (l(context, "android.permission.GET_ACCOUNTS", arrayList)) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    return arrayList;
                }
                return arrayList;
            case 3:
            case 4:
            case 5:
                if (i != 4 || Build.VERSION.SDK_INT < 29) {
                    if (l(context, "android.permission.ACCESS_COARSE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (l(context, "android.permission.ACCESS_FINE_LOCATION", arrayList)) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                        return arrayList;
                    }
                } else if (l(context, "android.permission.ACCESS_BACKGROUND_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 6:
            case 11:
            case 20:
                return null;
            case 7:
            case 14:
                if (l(context, "android.permission.RECORD_AUDIO", arrayList)) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 8:
                if (l(context, "android.permission.READ_PHONE_STATE", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 > 29 && l(context, "android.permission.READ_PHONE_NUMBERS", arrayList)) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (l(context, "android.permission.CALL_PHONE", arrayList)) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (l(context, "android.permission.READ_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (l(context, "android.permission.WRITE_CALL_LOG", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (l(context, "com.android.voicemail.permission.ADD_VOICEMAIL", arrayList)) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (l(context, "android.permission.USE_SIP", arrayList)) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (i10 >= 26 && l(context, "android.permission.ANSWER_PHONE_CALLS", arrayList)) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    return arrayList;
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.READ_MEDIA_IMAGES", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                    return arrayList;
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (l(context, "android.permission.BODY_SENSORS", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    return arrayList;
                }
                return arrayList;
            case 13:
                if (l(context, "android.permission.SEND_SMS", arrayList)) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (l(context, "android.permission.RECEIVE_SMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (l(context, "android.permission.READ_SMS", arrayList)) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (l(context, "android.permission.RECEIVE_WAP_PUSH", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (l(context, "android.permission.RECEIVE_MMS", arrayList)) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    return arrayList;
                }
                return arrayList;
            case 15:
                if (l(context, "android.permission.READ_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i11 = Build.VERSION.SDK_INT;
                if ((i11 < 29 || (i11 == 29 && Environment.isExternalStorageLegacy())) && l(context, "android.permission.WRITE_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 16:
                if (l(context, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", arrayList)) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    return arrayList;
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.POST_NOTIFICATIONS", arrayList)) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                    return arrayList;
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (l(context, "android.permission.ACCESS_MEDIA_LOCATION", arrayList)) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                    return arrayList;
                }
                return arrayList;
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (l(context, "android.permission.ACTIVITY_RECOGNITION", arrayList)) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                    return arrayList;
                }
                return arrayList;
            case 21:
                if (l(context, "android.permission.BLUETOOTH", arrayList)) {
                    arrayList.add("android.permission.BLUETOOTH");
                    return arrayList;
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && l(context, "android.permission.MANAGE_EXTERNAL_STORAGE", arrayList)) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    return arrayList;
                }
                return arrayList;
            case 23:
                if (l(context, "android.permission.SYSTEM_ALERT_WINDOW", arrayList)) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    return arrayList;
                }
                return arrayList;
            case 24:
                if (l(context, "android.permission.REQUEST_INSTALL_PACKAGES", arrayList)) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    return arrayList;
                }
                return arrayList;
            case 27:
                if (l(context, "android.permission.ACCESS_NOTIFICATION_POLICY", arrayList)) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    return arrayList;
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (strG = g(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(strG);
                    return arrayList;
                }
                return arrayList;
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (strG2 = g(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(strG2);
                    return arrayList;
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (strG3 = g(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(strG3);
                    return arrayList;
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.NEARBY_WIFI_DEVICES", arrayList)) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                    return arrayList;
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.READ_MEDIA_VIDEO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                    return arrayList;
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.READ_MEDIA_AUDIO", arrayList)) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                    return arrayList;
                }
                return arrayList;
            case 34:
                if (l(context, "android.permission.SCHEDULE_EXACT_ALARM", arrayList)) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                    return arrayList;
                }
                return arrayList;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && l(context, "android.permission.BODY_SENSORS_BACKGROUND", arrayList)) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                    return arrayList;
                }
                return arrayList;
            case 36:
                if (l(context, "android.permission.WRITE_CALENDAR", arrayList)) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    return arrayList;
                }
                return arrayList;
        }
    }

    public static File k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean l(Context context, String str, ArrayList arrayList) {
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e3) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e3);
                return false;
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(context.getPackageName(), 4096);
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(String str) {
        a7.b bVar = a7.p.f494a;
        Set<a7.f> setUnmodifiableSet = Collections.unmodifiableSet(a7.c.f480c);
        HashSet hashSet = new HashSet();
        for (a7.f fVar : setUnmodifiableSet) {
            if (((a7.c) fVar).f481a.equals(str)) {
                hashSet.add(fVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a7.c cVar = (a7.c) ((a7.f) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db A[PHI: r6
      0x00db: PHI (r6v22 java.lang.String) = (r6v21 java.lang.String), (r6v34 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(android.content.Intent r22) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d4.n(android.content.Intent):void");
    }

    public static void o(Bundle bundle, String str) {
        try {
            fd.g.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e7);
                }
            }
            String str2 = fe.c.G(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            jd.b bVar = (jd.b) fd.g.e().c(jd.b.class);
            if (bVar != null) {
                ((jd.c) bVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static String p(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static MappedByteBuffer q(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static String r(String str) {
        return p(str).trim();
    }

    public static ad.m0 u(String statusLine) throws ProtocolException {
        int i;
        String strSubstring;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        boolean zN = kotlin.text.a0.n(statusLine, "HTTP/1.", false);
        zk.v vVar = zk.v.HTTP_1_0;
        if (zN) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                vVar = zk.v.HTTP_1_1;
            }
        } else {
            if (!kotlin.text.a0.n(statusLine, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            i = 4;
        }
        int i10 = i + 3;
        if (statusLine.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        try {
            String strSubstring2 = statusLine.substring(i, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i11 = Integer.parseInt(strSubstring2);
            if (statusLine.length() <= i10) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i10) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new ad.m0(vVar, i11, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
    }

    public static void x(ii.f binaryMessenger, final fj.q qVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (qVar == null || (mVar = qVar.f19403a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", nVar, obj);
        if (qVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.e0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                qVar2.getClass();
                                listF = kotlin.collections.r.c(dName.getCName());
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                qVar3.getClass();
                                listF2 = kotlin.collections.r.c(dName2.getDName());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                qVar4.getClass();
                                listF3 = kotlin.collections.r.c(dName3.getOName());
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        default:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                qVar5.getClass();
                                listF4 = kotlin.collections.r.c(dName4.getUName());
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", nVar, obj);
        if (qVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.e0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i10) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                qVar2.getClass();
                                listF = kotlin.collections.r.c(dName.getCName());
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                qVar3.getClass();
                                listF2 = kotlin.collections.r.c(dName2.getDName());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                qVar4.getClass();
                                listF3 = kotlin.collections.r.c(dName3.getOName());
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        default:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                qVar5.getClass();
                                listF4 = kotlin.collections.r.c(dName4.getUName());
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", nVar, obj);
        if (qVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.e0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i11) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                qVar2.getClass();
                                listF = kotlin.collections.r.c(dName.getCName());
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                qVar3.getClass();
                                listF2 = kotlin.collections.r.c(dName2.getDName());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                qVar4.getClass();
                                listF3 = kotlin.collections.r.c(dName3.getOName());
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        default:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                qVar5.getClass();
                                listF4 = kotlin.collections.r.c(dName4.getUName());
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", nVar, obj);
        if (qVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: fj.e0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    switch (i12) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                qVar2.getClass();
                                listF = kotlin.collections.r.c(dName.getCName());
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                qVar3.getClass();
                                listF2 = kotlin.collections.r.c(dName2.getDName());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                qVar4.getClass();
                                listF3 = kotlin.collections.r.c(dName3.getOName());
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        default:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                qVar5.getClass();
                                listF4 = kotlin.collections.r.c(dName4.getUName());
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                    }
                }
            });
        }
    }

    public static void y(ii.f binaryMessenger, final ni.g gVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = gVar != null ? gVar.f29394a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraControl.enableTorch", mVarA, obj);
        if (gVar != null) {
            final int i = 0;
            gVar2.L(new ii.b() { // from class: ni.m0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            fj.z zVar = new fj.z(reply, 3);
                            g gVar3 = gVar;
                            gVar3.getClass();
                            ed.d dVarK = ((g0.c0) obj3).k(zBooleanValue);
                            m7.a aVar = new m7.a(3, zVar);
                            dVarK.a(new ed.c(0, dVarK, aVar), t1.b.c((Context) gVar3.f29394a.f6857h));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            fj.z zVar2 = new fj.z(reply, 6);
                            g gVar4 = gVar;
                            gVar4.getClass();
                            ed.d dVarF = ((g0.c0) obj5).f((float) dDoubleValue);
                            int i10 = 0;
                            i iVar = new i(i10, zVar2);
                            dVarF.a(new ed.c(i10, dVarF, iVar), t1.b.c((Context) gVar4.f29394a.f6857h));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.FocusMeteringAction");
                            fj.z zVar3 = new fj.z(reply, 7);
                            g gVar5 = gVar;
                            gVar5.getClass();
                            ed.d dVarD = ((g0.c0) obj7).d((a0.l0) obj8);
                            k6.t0 t0Var = new k6.t0(4, zVar3);
                            dVarD.a(new ed.c(0, dVarD, t0Var), t1.b.c((Context) gVar5.f29394a.f6857h));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            fj.z zVar4 = new fj.z(reply, 5);
                            g gVar6 = gVar;
                            gVar6.getClass();
                            ed.d dVarE = ((g0.c0) obj9).e();
                            m4.d dVar = new m4.d(zVar4);
                            dVarE.a(new ed.c(0, dVarE, dVar), t1.b.c((Context) gVar6.f29394a.f6857h));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj11).longValue();
                            fj.z zVar5 = new fj.z(reply, 4);
                            g gVar7 = gVar;
                            gVar7.getClass();
                            ed.d dVarN = ((g0.c0) obj10).n((int) jLongValue);
                            m7.a aVar2 = new m7.a(4, zVar5);
                            dVarN.a(new ed.c(0, dVarN, aVar2), t1.b.c((Context) gVar7.f29394a.f6857h));
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraControl.setZoomRatio", mVarA, obj);
        if (gVar != null) {
            final int i10 = 1;
            gVar3.L(new ii.b() { // from class: ni.m0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    switch (i10) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            fj.z zVar = new fj.z(reply, 3);
                            g gVar32 = gVar;
                            gVar32.getClass();
                            ed.d dVarK = ((g0.c0) obj3).k(zBooleanValue);
                            m7.a aVar = new m7.a(3, zVar);
                            dVarK.a(new ed.c(0, dVarK, aVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            fj.z zVar2 = new fj.z(reply, 6);
                            g gVar4 = gVar;
                            gVar4.getClass();
                            ed.d dVarF = ((g0.c0) obj5).f((float) dDoubleValue);
                            int i102 = 0;
                            i iVar = new i(i102, zVar2);
                            dVarF.a(new ed.c(i102, dVarF, iVar), t1.b.c((Context) gVar4.f29394a.f6857h));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.FocusMeteringAction");
                            fj.z zVar3 = new fj.z(reply, 7);
                            g gVar5 = gVar;
                            gVar5.getClass();
                            ed.d dVarD = ((g0.c0) obj7).d((a0.l0) obj8);
                            k6.t0 t0Var = new k6.t0(4, zVar3);
                            dVarD.a(new ed.c(0, dVarD, t0Var), t1.b.c((Context) gVar5.f29394a.f6857h));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            fj.z zVar4 = new fj.z(reply, 5);
                            g gVar6 = gVar;
                            gVar6.getClass();
                            ed.d dVarE = ((g0.c0) obj9).e();
                            m4.d dVar = new m4.d(zVar4);
                            dVarE.a(new ed.c(0, dVarE, dVar), t1.b.c((Context) gVar6.f29394a.f6857h));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj11).longValue();
                            fj.z zVar5 = new fj.z(reply, 4);
                            g gVar7 = gVar;
                            gVar7.getClass();
                            ed.d dVarN = ((g0.c0) obj10).n((int) jLongValue);
                            m7.a aVar2 = new m7.a(4, zVar5);
                            dVarN.a(new ed.c(0, dVarN, aVar2), t1.b.c((Context) gVar7.f29394a.f6857h));
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraControl.startFocusAndMetering", mVarA, obj);
        if (gVar != null) {
            final int i11 = 2;
            gVar4.L(new ii.b() { // from class: ni.m0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    switch (i11) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            fj.z zVar = new fj.z(reply, 3);
                            g gVar32 = gVar;
                            gVar32.getClass();
                            ed.d dVarK = ((g0.c0) obj3).k(zBooleanValue);
                            m7.a aVar = new m7.a(3, zVar);
                            dVarK.a(new ed.c(0, dVarK, aVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            fj.z zVar2 = new fj.z(reply, 6);
                            g gVar42 = gVar;
                            gVar42.getClass();
                            ed.d dVarF = ((g0.c0) obj5).f((float) dDoubleValue);
                            int i102 = 0;
                            i iVar = new i(i102, zVar2);
                            dVarF.a(new ed.c(i102, dVarF, iVar), t1.b.c((Context) gVar42.f29394a.f6857h));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.FocusMeteringAction");
                            fj.z zVar3 = new fj.z(reply, 7);
                            g gVar5 = gVar;
                            gVar5.getClass();
                            ed.d dVarD = ((g0.c0) obj7).d((a0.l0) obj8);
                            k6.t0 t0Var = new k6.t0(4, zVar3);
                            dVarD.a(new ed.c(0, dVarD, t0Var), t1.b.c((Context) gVar5.f29394a.f6857h));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            fj.z zVar4 = new fj.z(reply, 5);
                            g gVar6 = gVar;
                            gVar6.getClass();
                            ed.d dVarE = ((g0.c0) obj9).e();
                            m4.d dVar = new m4.d(zVar4);
                            dVarE.a(new ed.c(0, dVarE, dVar), t1.b.c((Context) gVar6.f29394a.f6857h));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj11).longValue();
                            fj.z zVar5 = new fj.z(reply, 4);
                            g gVar7 = gVar;
                            gVar7.getClass();
                            ed.d dVarN = ((g0.c0) obj10).n((int) jLongValue);
                            m7.a aVar2 = new m7.a(4, zVar5);
                            dVarN.a(new ed.c(0, dVarN, aVar2), t1.b.c((Context) gVar7.f29394a.f6857h));
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraControl.cancelFocusAndMetering", mVarA, obj);
        if (gVar != null) {
            final int i12 = 3;
            gVar5.L(new ii.b() { // from class: ni.m0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    switch (i12) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            fj.z zVar = new fj.z(reply, 3);
                            g gVar32 = gVar;
                            gVar32.getClass();
                            ed.d dVarK = ((g0.c0) obj3).k(zBooleanValue);
                            m7.a aVar = new m7.a(3, zVar);
                            dVarK.a(new ed.c(0, dVarK, aVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            fj.z zVar2 = new fj.z(reply, 6);
                            g gVar42 = gVar;
                            gVar42.getClass();
                            ed.d dVarF = ((g0.c0) obj5).f((float) dDoubleValue);
                            int i102 = 0;
                            i iVar = new i(i102, zVar2);
                            dVarF.a(new ed.c(i102, dVarF, iVar), t1.b.c((Context) gVar42.f29394a.f6857h));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.FocusMeteringAction");
                            fj.z zVar3 = new fj.z(reply, 7);
                            g gVar52 = gVar;
                            gVar52.getClass();
                            ed.d dVarD = ((g0.c0) obj7).d((a0.l0) obj8);
                            k6.t0 t0Var = new k6.t0(4, zVar3);
                            dVarD.a(new ed.c(0, dVarD, t0Var), t1.b.c((Context) gVar52.f29394a.f6857h));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            fj.z zVar4 = new fj.z(reply, 5);
                            g gVar6 = gVar;
                            gVar6.getClass();
                            ed.d dVarE = ((g0.c0) obj9).e();
                            m4.d dVar = new m4.d(zVar4);
                            dVarE.a(new ed.c(0, dVarE, dVar), t1.b.c((Context) gVar6.f29394a.f6857h));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj11).longValue();
                            fj.z zVar5 = new fj.z(reply, 4);
                            g gVar7 = gVar;
                            gVar7.getClass();
                            ed.d dVarN = ((g0.c0) obj10).n((int) jLongValue);
                            m7.a aVar2 = new m7.a(4, zVar5);
                            dVarN.a(new ed.c(0, dVarN, aVar2), t1.b.c((Context) gVar7.f29394a.f6857h));
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraControl.setExposureCompensationIndex", mVarA, obj);
        if (gVar == null) {
            gVar6.L(null);
        } else {
            final int i13 = 4;
            gVar6.L(new ii.b() { // from class: ni.m0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    switch (i13) {
                        case 0:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            fj.z zVar = new fj.z(reply, 3);
                            g gVar32 = gVar;
                            gVar32.getClass();
                            ed.d dVarK = ((g0.c0) obj3).k(zBooleanValue);
                            m7.a aVar = new m7.a(3, zVar);
                            dVarK.a(new ed.c(0, dVarK, aVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            break;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj6 = list2.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj6).doubleValue();
                            fj.z zVar2 = new fj.z(reply, 6);
                            g gVar42 = gVar;
                            gVar42.getClass();
                            ed.d dVarF = ((g0.c0) obj5).f((float) dDoubleValue);
                            int i102 = 0;
                            i iVar = new i(i102, zVar2);
                            dVarF.a(new ed.c(i102, dVarF, iVar), t1.b.c((Context) gVar42.f29394a.f6857h));
                            break;
                        case 2:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj8 = list3.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.FocusMeteringAction");
                            fj.z zVar3 = new fj.z(reply, 7);
                            g gVar52 = gVar;
                            gVar52.getClass();
                            ed.d dVarD = ((g0.c0) obj7).d((a0.l0) obj8);
                            k6.t0 t0Var = new k6.t0(4, zVar3);
                            dVarD.a(new ed.c(0, dVarD, t0Var), t1.b.c((Context) gVar52.f29394a.f6857h));
                            break;
                        case 3:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            fj.z zVar4 = new fj.z(reply, 5);
                            g gVar62 = gVar;
                            gVar62.getClass();
                            ed.d dVarE = ((g0.c0) obj9).e();
                            m4.d dVar = new m4.d(zVar4);
                            dVarE.a(new ed.c(0, dVarE, dVar), t1.b.c((Context) gVar62.f29394a.f6857h));
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type androidx.camera.core.CameraControl");
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj11).longValue();
                            fj.z zVar5 = new fj.z(reply, 4);
                            g gVar7 = gVar;
                            gVar7.getClass();
                            ed.d dVarN = ((g0.c0) obj10).n((int) jLongValue);
                            m7.a aVar2 = new m7.a(4, zVar5);
                            dVarN.a(new ed.c(0, dVarN, aVar2), t1.b.c((Context) gVar7.f29394a.f6857h));
                            break;
                    }
                }
            });
        }
    }

    public static void z(ii.f binaryMessenger, final ni.g gVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = gVar != null ? gVar.f29394a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.withOutput", mVarA, obj);
        if (gVar != null) {
            final int i = 0;
            gVar2.L(new ii.b() { // from class: ni.f1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            g gVar3 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.VideoOutput");
                            x0.m0 m0Var = (x0.m0) obj4;
                            Range range = (Range) list.get(2);
                            try {
                                fj.c cVar = (fj.c) gVar3.f29394a.f6853d;
                                q1 q1Var = new a0.t0(m0Var).f224b;
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                cVar.a(jLongValue, new x0.k0(new y0.a(u1.u(q1Var))));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var = (x0.k0) obj5;
                            try {
                                gVar4.getClass();
                                listF2 = kotlin.collections.r.c(k0Var.M());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        default:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var2 = (x0.k0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj7).longValue();
                            try {
                                gVar5.getClass();
                                if (k0Var2.C((int) jLongValue2)) {
                                    k0Var2.Q();
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.getOutput", mVarA, obj);
        if (gVar != null) {
            final int i10 = 1;
            gVar3.L(new ii.b() { // from class: ni.f1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.VideoOutput");
                            x0.m0 m0Var = (x0.m0) obj4;
                            Range range = (Range) list.get(2);
                            try {
                                fj.c cVar = (fj.c) gVar32.f29394a.f6853d;
                                q1 q1Var = new a0.t0(m0Var).f224b;
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                cVar.a(jLongValue, new x0.k0(new y0.a(u1.u(q1Var))));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var = (x0.k0) obj5;
                            try {
                                gVar4.getClass();
                                listF2 = kotlin.collections.r.c(k0Var.M());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        default:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var2 = (x0.k0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj7).longValue();
                            try {
                                gVar5.getClass();
                                if (k0Var2.C((int) jLongValue2)) {
                                    k0Var2.Q();
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.VideoCapture.setTargetRotation", mVarA, obj);
        if (gVar == null) {
            gVar4.L(null);
        } else {
            final int i11 = 2;
            gVar4.L(new ii.b() { // from class: ni.f1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.video.VideoOutput");
                            x0.m0 m0Var = (x0.m0) obj4;
                            Range range = (Range) list.get(2);
                            try {
                                fj.c cVar = (fj.c) gVar32.f29394a.f6853d;
                                q1 q1Var = new a0.t0(m0Var).f224b;
                                if (range != null) {
                                    q1Var.x(s.b.u(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), g0.u0.f19772b, range);
                                }
                                cVar.a(jLongValue, new x0.k0(new y0.a(u1.u(q1Var))));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var = (x0.k0) obj5;
                            try {
                                gVar42.getClass();
                                listF2 = kotlin.collections.r.c(k0Var.M());
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        default:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.video.VideoCapture<*>");
                            x0.k0 k0Var2 = (x0.k0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj7).longValue();
                            try {
                                gVar5.getClass();
                                if (k0Var2.C((int) jLongValue2)) {
                                    k0Var2.Q();
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                    }
                }
            });
        }
    }

    public abstract void s(int i);

    public abstract void t(Typeface typeface, boolean z5);

    public abstract void w(boolean z5);

    public void v(boolean z5) {
    }
}
