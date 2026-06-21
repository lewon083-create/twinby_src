package com.vk.api.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.om1;
import dk.i;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.z;
import kotlin.text.StringsKt__StringsKt;
import nl.g;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKUtils {
    public static final VKUtils INSTANCE = new VKUtils();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class MD5 {
        static final /* synthetic */ i[] $$delegatedProperties;
        public static final MD5 INSTANCE;
        private static final char[] hex;
        private static final ThreadLocalDelegate tmpBuilder$delegate;

        static {
            z zVar = new z(MD5.class, "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;", 0);
            g0.f27511a.getClass();
            $$delegatedProperties = new i[]{zVar};
            INSTANCE = new MD5();
            hex = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            tmpBuilder$delegate = ThreadLocalDelegateKt.threadLocal(VKUtils$MD5$tmpBuilder$2.INSTANCE);
        }

        private MD5() {
        }

        public static final String convert(String h10) {
            Intrinsics.checkNotNullParameter(h10, "h");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charsetName)");
                byte[] bytes = h10.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] md5 = messageDigest.digest(bytes);
                MD5 md52 = INSTANCE;
                md52.getTmpBuilder().setLength(0);
                Intrinsics.checkNotNullExpressionValue(md5, "md5");
                hex(md5);
                String string = md52.getTmpBuilder().toString();
                Intrinsics.checkNotNullExpressionValue(string, "tmpBuilder.toString()");
                return string;
            } catch (Exception unused) {
                return "";
            }
        }

        private final StringBuilder getTmpBuilder() {
            return (StringBuilder) tmpBuilder$delegate.getValue(this, $$delegatedProperties[0]);
        }

        private static final void hex(byte[] bArr) {
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                byte b2 = bArr[i];
                i++;
                MD5 md5 = INSTANCE;
                StringBuilder tmpBuilder = md5.getTmpBuilder();
                char[] cArr = hex;
                tmpBuilder.append(cArr[(b2 & 240) >> 4]);
                md5.getTmpBuilder().append(cArr[b2 & 15]);
            }
        }
    }

    private VKUtils() {
    }

    public static final Map<String, String> explodeQueryString(String str) {
        if (str == null) {
            return null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
        HashMap map = new HashMap(listSplit$default.size());
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
            if (listSplit$default2.size() > 1) {
                map.put(listSplit$default2.get(0), listSplit$default2.get(1));
            }
        }
        return map;
    }

    public static final String[] getCertificateFingerprint(Context context, String packageName) {
        Signature[] signatureArr;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (context != null) {
            try {
                if (context.getPackageManager() == null || (signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures) == null) {
                    return null;
                }
                String[] strArr = new String[signatureArr.length];
                Intrinsics.checkNotNullExpressionValue(signatureArr, "info.signatures");
                int length = signatureArr.length;
                int i = 0;
                int i10 = 0;
                while (i < length) {
                    Signature signature = signatureArr[i];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                    messageDigest.update(signature.toByteArray());
                    int i11 = i10 + 1;
                    VKUtils vKUtils = INSTANCE;
                    byte[] bArrDigest = messageDigest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest()");
                    strArr[i10] = vKUtils.toHex(bArrDigest);
                    i++;
                    i10 = i11;
                }
                return strArr;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final void getDisplaySizePreV23(Display display, Point point) {
        if (display == null) {
            return;
        }
        display.getRealSize(point);
    }

    private final void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display == null ? null : display.getMode();
        point.x = mode == null ? 0 : mode.getPhysicalWidth();
        point.y = mode != null ? mode.getPhysicalHeight() : 0;
    }

    public static final boolean isAppEnabled(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return context.getPackageManager().getApplicationInfo(packageName, 0).enabled;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean isAppInstalled(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            context.getPackageManager().getPackageInfo(packageName, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean isIntentAvailable(Context context, String action, Uri uri, String allowedPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(allowedPackage, "allowedPackage");
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager == null ? null : packageManager.queryIntentActivities(new Intent(action, uri), 65536);
        if (listQueryIntentActivities == null) {
            return false;
        }
        List<ResolveInfo> list = listQueryIntentActivities;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((ResolveInfo) it.next()).activityInfo.packageName, allowedPackage)) {
                return true;
            }
        }
        return false;
    }

    private final String toHex(byte[] bArr) {
        String str = String.format(om1.l(new StringBuilder("%0"), bArr.length << 1, 'X'), Arrays.copyOf(new Object[]{new BigInteger(1, bArr)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String toHumanReadableAscii(String str) {
        if (str == null) {
            return "";
        }
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (32 > iCodePointAt || iCodePointAt > 126) {
                g gVar = new g();
                gVar.Q(0, iCharCount, str);
                while (iCharCount < str.length()) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    gVar.S((32 > iCodePointAt2 || iCodePointAt2 > 126) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return gVar.m();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public final void clearAllCookies(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CookieManager.getInstance().removeAllCookies(null);
    }

    public final float density() {
        return getDisplayMetrics().density;
    }

    public final int dp(int i) {
        return (int) Math.ceil(density() * i);
    }

    public final DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getSystem().displayMetrics");
        return displayMetrics;
    }

    public final Point getPhysicalDisplaySize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        getDisplaySizeV23(((WindowManager) systemService).getDefaultDisplay(), point);
        return point;
    }

    public final int height(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public final int width(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
