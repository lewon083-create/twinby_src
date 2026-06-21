package ya;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.ads.gb;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import pa.c0;
import t.t0;
import t9.h0;
import ti.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f36573b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f36575d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f36577f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f36578g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f36579h = false;
    public static int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f36580j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static h f36584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static i f36585o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36586a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f36581k = new ThreadLocal();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final gb f36582l = new gb(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t f36583m = new t(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f36574c = new h0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f36576e = new t0(9);

    static {
        int i10 = 8;
        f36573b = new t0(i10);
        f36575d = new t(i10);
    }

    public d(Context context) {
        this.f36586a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (c0.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ff A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0305 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #10 {all -> 0x00b8, blocks: (B:5:0x0042, B:9:0x00b1, B:16:0x00bd, B:19:0x00c3, B:31:0x00ec, B:119:0x0299, B:120:0x02a3, B:128:0x02b2, B:130:0x02da, B:132:0x02eb, B:142:0x0317, B:143:0x031e, B:123:0x02a6, B:124:0x02a7, B:125:0x02ae, B:144:0x031f, B:145:0x033f, B:146:0x0340, B:147:0x038d), top: B:168:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Type inference failed for: r30v0, types: [ya.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ya.d c(android.content.Context r29, ya.c r30, java.lang.String r31) throws ya.a {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.c(android.content.Context, ya.c, java.lang.String):ya.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00f4, blocks: (B:4:0x0006, B:64:0x00e9, B:66:0x00ef, B:73:0x011b, B:103:0x01a4, B:111:0x01b7, B:129:0x023e, B:130:0x0241, B:124:0x0236, B:71:0x00f8, B:132:0x0243, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:62:0x00e6, B:22:0x004e, B:45:0x00a4, B:48:0x00a7, B:55:0x00bf, B:63:0x00e8, B:61:0x00c5), top: B:141:0x0006, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[Catch: all -> 0x003b, TryCatch #11 {, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:43:0x009b, B:44:0x00a3, B:39:0x0076, B:41:0x007c, B:42:0x008d, B:47:0x00a6, B:50:0x00a9, B:51:0x00b3, B:18:0x0043), top: B:144:0x002b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f36580j)) {
            return true;
        }
        boolean z5 = false;
        if (f36580j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (ma.g.f28775b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z5 = true;
            }
            f36580j = Boolean.valueOf(z5);
            if (z5 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & VKApiCodes.CODE_INVALID_PHOTO_FORMAT) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f36579h = true;
            }
        }
        if (!z5) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z5;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.d.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) throws a {
        try {
            i iVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 6);
            }
            f36585o = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
            throw new a("Failed to instantiate dynamite loader", e3);
        }
    }

    public static h h(Context context) {
        h hVar;
        synchronized (d.class) {
            h hVar2 = f36584n;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 6);
                }
                if (hVar != null) {
                    f36584n = hVar;
                    return hVar;
                }
            } catch (Exception e3) {
                String message = e3.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f36586a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new a("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}
