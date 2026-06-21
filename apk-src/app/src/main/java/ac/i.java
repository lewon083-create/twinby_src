package ac;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.wk;
import e4.j;
import g2.b1;
import g2.x1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p9.k;
import q9.s;
import t9.d0;
import t9.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f759e;

    public i(Context context, int i) {
        switch (i) {
            case 2:
                this.f756b = 0;
                this.f757c = context;
                break;
            default:
                this.f759e = "";
                this.f757c = context;
                this.f758d = context.getApplicationInfo();
                wk wkVar = al.sa;
                s sVar = s.f31967e;
                this.f755a = ((Integer) sVar.f31970c.a(wkVar)).intValue();
                this.f756b = ((Integer) sVar.f31970c.a(al.f3214ta)).intValue();
                break;
        }
    }

    public static String b(fd.g gVar) {
        gVar.a();
        fd.i iVar = gVar.f16760c;
        String str = iVar.f16776e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f16773b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(i0.b.f20759a);
        arrayList2.add(i0.b.f20761c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (i0.b.a(size, (Rational) it2.next(), p0.b.f30756c)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational f(int i, boolean z5) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z5 ? i0.b.f20759a : i0.b.f20760b;
        }
        if (i == 1) {
            return z5 ? i0.b.f20761c : i0.b.f20762d;
        }
        com.google.android.gms.internal.auth.g.k("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = d(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (i0.b.a(size, rational, p0.b.f30756c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void k(List list, Size size, boolean z5) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z5) {
            list.addAll(arrayList);
        }
    }

    public static void l(List list, Size size, boolean z5) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z5) {
            list.addAll(arrayList);
        }
    }

    public synchronized String a() {
        try {
            if (((String) this.f758d) == null) {
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f758d;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f757c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Failed to find package " + e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List e(g0.x2 r14) {
        /*
            Method dump skipped, instruction units count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.i.e(g0.x2):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f756b     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7f
        La:
            java.lang.Object r0 = r5.f757c     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L27
            r4 = -1
            if (r3 != r4) goto L29
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r2
            goto L7f
        L27:
            r0 = move-exception
            goto L83
        L29:
            boolean r3 = ua.b.h()     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L4c
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L4c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            if (r3 <= 0) goto L4c
            r5.f756b = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r1
            goto L7f
        L4c:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r0 == 0) goto L6a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L6a
            r5.f756b = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r3
            goto L7f
        L6a:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L27
            boolean r0 = ua.b.h()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7a
            r5.f756b = r3     // Catch: java.lang.Throwable -> L27
            goto L7c
        L7a:
            r5.f756b = r1     // Catch: java.lang.Throwable -> L27
        L7c:
            int r0 = r5.f756b     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
        L7f:
            if (r0 == 0) goto L82
            return r1
        L82:
            return r2
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.i.h():boolean");
    }

    public void i(x1 x1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((b1) it.next()).f19835a.c() & 8) != 0) {
                ((View) this.f758d).setTranslationY(wb.a.c(r3.f19835a.b(), this.f756b, 0));
                return;
            }
        }
    }

    public synchronized void j() {
        PackageInfo packageInfoC = c(((Context) this.f757c).getPackageName());
        if (packageInfoC != null) {
            this.f758d = Integer.toString(packageInfoC.versionCode);
            this.f759e = packageInfoC.versionName;
        }
    }

    public JSONObject m() throws JSONException {
        String strO;
        String strEncodeToString;
        int i = this.f756b;
        int i10 = this.f755a;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f758d;
        Context context = (Context) this.f757c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            d0 d0Var = g0.f33596l;
            Context context2 = wa.b.a(context).f33798b;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        g0 g0Var = k.C.f31297c;
        Drawable applicationIcon = null;
        try {
            strO = g0.O(context);
        } catch (RemoteException unused2) {
            strO = null;
        }
        jSONObject.put("adMobAppId", strO);
        if (((String) this.f759e).isEmpty()) {
            try {
                ti.b bVarA = wa.b.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = bVarA.f33798b;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i10, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f759e = strEncodeToString;
        }
        if (!((String) this.f759e).isEmpty()) {
            jSONObject.put("icon", (String) this.f759e);
            jSONObject.put("iconWidthPx", i10);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    public i(g0.d0 d0Var, Size size) {
        Rational rational;
        this.f757c = d0Var;
        this.f755a = d0Var.c();
        this.f756b = d0Var.l();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listS = d0Var.s(256);
            if (listS.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listS, new i0.f(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f758d = rational;
        this.f759e = new j(d0Var, rational);
    }
}
