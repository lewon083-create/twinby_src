package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.camera2.CameraCharacteristics;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.HttpAuthHandler;
import androidx.camera.core.ImageProcessingUtil;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.b31;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.nx0;
import com.google.android.gms.internal.ads.ox0;
import com.google.android.gms.internal.ads.xo0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile u f13260b;

    public static int A(int i) {
        int iM = t.z.m(i);
        if (iM == 0) {
            return 0;
        }
        int i10 = 1;
        if (iM != 1) {
            i10 = 2;
            if (iM != 2) {
                i10 = 3;
                if (iM != 3) {
                    i10 = 4;
                    if (iM != 4) {
                        if (iM == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + l7.o.z(i) + " to int");
                    }
                }
            }
        }
        return i10;
    }

    public static byte[] B(a0.r1 r1Var, Rect rect, int i, int i10) {
        if (r1Var.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + r1Var.getFormat());
        }
        a0.q1 q1Var = r1Var.f()[0];
        a0.q1 q1Var2 = r1Var.f()[1];
        int i11 = 2;
        a0.q1 q1Var3 = r1Var.f()[2];
        ByteBuffer byteBufferE = q1Var.e();
        ByteBuffer byteBufferE2 = q1Var2.e();
        ByteBuffer byteBufferE3 = q1Var3.e();
        byteBufferE.rewind();
        byteBufferE2.rewind();
        byteBufferE3.rewind();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[((r1Var.getHeight() * r1Var.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i12 = 0; i12 < r1Var.getHeight(); i12++) {
            byteBufferE.get(bArr, width, r1Var.getWidth());
            width += r1Var.getWidth();
            byteBufferE.position(Math.min(iRemaining, q1Var.f() + (byteBufferE.position() - r1Var.getWidth())));
        }
        int height = r1Var.getHeight() / 2;
        int width2 = r1Var.getWidth() / 2;
        int iF = q1Var3.f();
        int iF2 = q1Var2.f();
        int iG = q1Var3.g();
        int iG2 = q1Var2.g();
        byte[] bArr2 = new byte[iF];
        byte[] bArr3 = new byte[iF2];
        int i13 = 0;
        while (i13 < height) {
            int i14 = i11;
            byteBufferE3.get(bArr2, 0, Math.min(iF, byteBufferE3.remaining()));
            byteBufferE2.get(bArr3, 0, Math.min(iF2, byteBufferE2.remaining()));
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < width2; i17++) {
                int i18 = width + 1;
                bArr[width] = bArr2[i15];
                width += 2;
                bArr[i18] = bArr3[i16];
                i15 += iG;
                i16 += iG2;
            }
            i13++;
            i11 = i14;
        }
        int i19 = i11;
        YuvImage yuvImage = new YuvImage(bArr, 17, r1Var.getWidth(), r1Var.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i0.n[] nVarArr = i0.l.f20789c;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        i0.k kVar = new i0.k();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = kVar.f20787a;
        kVar.c("Orientation", strValueOf, arrayList);
        kVar.c("XResolution", "72/1", arrayList);
        kVar.c("YResolution", "72/1", arrayList);
        kVar.c("ResolutionUnit", String.valueOf(i19), arrayList);
        kVar.c("YCbCrPositioning", String.valueOf(1), arrayList);
        kVar.c("Make", Build.MANUFACTURER, arrayList);
        kVar.c("Model", Build.MODEL, arrayList);
        if (r1Var.x() != null) {
            r1Var.x().a(kVar);
        }
        kVar.d(i10);
        kVar.c("ImageWidth", String.valueOf(r1Var.getWidth()), arrayList);
        kVar.c("ImageLength", String.valueOf(r1Var.getHeight()), arrayList);
        ArrayList list = Collections.list(new i0.j(kVar));
        if (!((Map) list.get(1)).isEmpty()) {
            kVar.b("ExposureProgram", String.valueOf(0), list);
            kVar.b("ExifVersion", "0230", list);
            kVar.b("ComponentsConfiguration", i0.l.f20792f, list);
            kVar.b("MeteringMode", String.valueOf(0), list);
            kVar.b("LightSource", String.valueOf(0), list);
            kVar.b("FlashpixVersion", "0100", list);
            kVar.b("FocalPlaneResolutionUnit", String.valueOf(i19), list);
            kVar.b("FileSource", String.valueOf(3), list);
            kVar.b("SceneType", String.valueOf(1), list);
            kVar.b("CustomRendered", String.valueOf(0), list);
            kVar.b("SceneCaptureType", String.valueOf(0), list);
            kVar.b("Contrast", String.valueOf(0), list);
            kVar.b("Saturation", String.valueOf(0), list);
            kVar.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i19)).isEmpty()) {
            kVar.b("GPSVersionID", "2300", list);
            kVar.b("GPSSpeedRef", "K", list);
            kVar.b("GPSTrackRef", "T", list);
            kVar.b("GPSImgDirectionRef", "T", list);
            kVar.b("GPSDestBearingRef", "T", list);
            kVar.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, r1Var.getWidth(), r1Var.getHeight()) : rect, i, new i0.m(byteArrayOutputStream, new i0.l(kVar.f20788b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new p0.a("YuvImage failed to encode jpeg.");
    }

    public static int C(int i) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i) {
                return i11;
            }
        }
        return 1;
    }

    public static void D(Context context) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.W6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            mx0 mx0VarF = mx0.f(context);
            nx0 nx0VarF = nx0.f(context);
            ox0 ox0VarD = ox0.d(context);
            mx0VarF.getClass();
            synchronized (mx0.class) {
                mx0VarF.c(false);
            }
            synchronized (mx0.class) {
                mx0VarF.c(true);
            }
            nx0VarF.h();
            ox0VarD.o();
        } catch (IOException e3) {
            p9.k.C.f31302h.d("clearStorageOnIdlessMode", e3);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e7) {
            p9.k.C.f31302h.d("clearStorageOnIdlessMode_scar", e7);
        }
    }

    public static Bundle E(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e3) {
                u9.i.d("JSON parsing error", e3);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i10 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                List listJ = xo0.c(new b31('/')).j(strOptString2);
                if (listJ.size() > 2 || listJ.isEmpty()) {
                    obj = null;
                } else {
                    if (listJ.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listJ.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listJ.get(0), 0);
                        str2 = (String) listJ.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i11 = i10 - 1;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean F(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:43|6|(3:46|7|(2:9|10))|(2:41|15)|48|19) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l7.e b(byte[] r7) throws java.lang.Throwable {
        /*
            l7.e r0 = new l7.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            l7.d r5 = new l7.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f28021a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.m.b(byte[]):l7.e");
    }

    public static void c(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static void d(boolean z5) {
        if (!z5) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int e(int i, int i10, int i11) {
        return i < i10 ? i10 : i > i11 ? i11 : i;
    }

    public static Bitmap f(a0.r1 r1Var) {
        int format = r1Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r1Var.getWidth(), r1Var.getHeight(), Bitmap.Config.ARGB_8888);
            r1Var.f()[0].e().rewind();
            ImageProcessingUtil.f(bitmapCreateBitmap, r1Var.f()[0].e(), r1Var.f()[0].f());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.c(r1Var);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + r1Var.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!n(r1Var.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + r1Var.getFormat());
        }
        ByteBuffer byteBufferE = r1Var.f()[0].e();
        int iCapacity = byteBufferE.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static long g(int i, long j10) {
        long j11 = i;
        f2.g.a("sampleRate must be greater than 0.", j11 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j10) / j11;
    }

    public static zk.v h(String protocol) throws IOException {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (protocol.equals("http/1.0")) {
            return zk.v.HTTP_1_0;
        }
        if (protocol.equals("http/1.1")) {
            return zk.v.HTTP_1_1;
        }
        if (protocol.equals("h2_prior_knowledge")) {
            return zk.v.H2_PRIOR_KNOWLEDGE;
        }
        if (protocol.equals("h2")) {
            return zk.v.HTTP_2;
        }
        if (protocol.equals("spdy/3.1")) {
            return zk.v.SPDY_3;
        }
        if (protocol.equals("quic")) {
            return zk.v.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(protocol));
    }

    public static Object i(Future future) {
        Object obj;
        if (!future.isDone()) {
            throw new IllegalStateException(hl.d.q("Future was expected to be done: %s", future));
        }
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a0.u.k(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static int k(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a0.u.k(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a0.u.k(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int m(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(a0.u.k(i, "Could not convert ", " to State"));
    }

    public static boolean n(int i) {
        return i == 256 || i == 4101;
    }

    public static void q(float[] fArr, float f10) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void r(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static s2.b s(String name, m4.d dVar, od.a aVar, int i) {
        if ((i & 2) != 0) {
            dVar = null;
        }
        Function1 produceMigrations = aVar;
        if ((i & 4) != 0) {
            produceMigrations = s2.a.f32419f;
        }
        ok.e eVar = hk.k0.f20682a;
        ok.d dVar2 = ok.d.f30722d;
        hk.s1 s1Var = new hk.s1();
        dVar2.getClass();
        mk.c scope = hk.c0.a(kotlin.coroutines.e.d(dVar2, s1Var));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new s2.b(name, dVar, produceMigrations, scope);
    }

    public static TypedValue t(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue u(Context context, String str, int i) {
        TypedValue typedValueT = t(context, i);
        if (typedValueT != null) {
            return typedValueT;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void v(Window window, boolean z5) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            g2.t0.g(window, z5);
        } else {
            if (i >= 30) {
                g2.t0.f(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void w(ii.f binaryMessenger, final fj.i iVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (iVar == null || (mVar = iVar.f19355a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", nVar, obj);
        if (iVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.c0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                iVar2.getClass();
                                listF = kotlin.collections.r.c(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                iVar3.getClass();
                                httpAuthHandler2.cancel();
                                listF2 = kotlin.collections.r.c(null);
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                iVar4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listF3 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", nVar, obj);
        if (iVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.c0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                iVar2.getClass();
                                listF = kotlin.collections.r.c(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                iVar3.getClass();
                                httpAuthHandler2.cancel();
                                listF2 = kotlin.collections.r.c(null);
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                iVar4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listF3 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", nVar, obj);
        if (iVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.c0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            i iVar2 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj3;
                            try {
                                iVar2.getClass();
                                listF = kotlin.collections.r.c(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
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
                            i iVar3 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj4;
                            try {
                                iVar3.getClass();
                                httpAuthHandler2.cancel();
                                listF2 = kotlin.collections.r.c(null);
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
                        default:
                            i iVar4 = iVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj5;
                            Object obj6 = list.get(1);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj6;
                            Object obj7 = list.get(2);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                iVar4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                listF3 = kotlin.collections.r.c(null);
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
                    }
                }
            });
        }
    }

    public static void x(ii.f binaryMessenger, final ni.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = cVar != null ? cVar.f29359a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.from", mVarA, obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.j0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj4;
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                g0.d0 d0VarB = d0Var.b();
                                f2.g.a("CameraInfo doesn't contain Camera2 implementation.", d0VarB instanceof t.d0);
                                cVar3.a(jLongValue, ((t.d0) d0VarB).f33004c);
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar = (z.d) obj5;
                            try {
                                cVar4.getClass();
                                listF2 = kotlin.collections.r.c(dVar.f45774a.f33002a);
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
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar2 = (z.d) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.hardware.camera2.CameraCharacteristics.Key<*>");
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) obj7;
                            try {
                                cVar5.getClass();
                                Object objA = dVar2.f45774a.f33003b.a(key);
                                if (objA == null) {
                                    objA = null;
                                } else if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                    int iIntValue = ((Integer) objA).intValue();
                                    if (iIntValue == 0) {
                                        objA = a0.f29345h;
                                    } else if (iIntValue == 1) {
                                        objA = a0.f29343f;
                                    } else if (iIntValue == 2) {
                                        objA = a0.f29344g;
                                    } else if (iIntValue == 3) {
                                        objA = a0.f29341d;
                                    } else if (iIntValue == 4) {
                                        objA = a0.f29342e;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(objA);
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
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.getCameraId", mVarA, obj);
        if (cVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.j0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj4;
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                g0.d0 d0VarB = d0Var.b();
                                f2.g.a("CameraInfo doesn't contain Camera2 implementation.", d0VarB instanceof t.d0);
                                cVar3.a(jLongValue, ((t.d0) d0VarB).f33004c);
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar = (z.d) obj5;
                            try {
                                cVar4.getClass();
                                listF2 = kotlin.collections.r.c(dVar.f45774a.f33002a);
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
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar2 = (z.d) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.hardware.camera2.CameraCharacteristics.Key<*>");
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) obj7;
                            try {
                                cVar5.getClass();
                                Object objA = dVar2.f45774a.f33003b.a(key);
                                if (objA == null) {
                                    objA = null;
                                } else if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                    int iIntValue = ((Integer) objA).intValue();
                                    if (iIntValue == 0) {
                                        objA = a0.f29345h;
                                    } else if (iIntValue == 1) {
                                        objA = a0.f29343f;
                                    } else if (iIntValue == 2) {
                                        objA = a0.f29344g;
                                    } else if (iIntValue == 3) {
                                        objA = a0.f29341d;
                                    } else if (iIntValue == 4) {
                                        objA = a0.f29342e;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(objA);
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
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.getCameraCharacteristic", mVarA, obj);
        if (cVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.j0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.core.CameraInfo");
                            g0.d0 d0Var = (g0.d0) obj4;
                            try {
                                fj.c cVar3 = (fj.c) cVar2.f29359a.f6853d;
                                g0.d0 d0VarB = d0Var.b();
                                f2.g.a("CameraInfo doesn't contain Camera2 implementation.", d0VarB instanceof t.d0);
                                cVar3.a(jLongValue, ((t.d0) d0VarB).f33004c);
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
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar = (z.d) obj5;
                            try {
                                cVar4.getClass();
                                listF2 = kotlin.collections.r.c(dVar.f45774a.f33002a);
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
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type androidx.camera.camera2.interop.Camera2CameraInfo");
                            z.d dVar2 = (z.d) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.hardware.camera2.CameraCharacteristics.Key<*>");
                            CameraCharacteristics.Key key = (CameraCharacteristics.Key) obj7;
                            try {
                                cVar5.getClass();
                                Object objA = dVar2.f45774a.f33003b.a(key);
                                if (objA == null) {
                                    objA = null;
                                } else if (CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL.equals(key)) {
                                    int iIntValue = ((Integer) objA).intValue();
                                    if (iIntValue == 0) {
                                        objA = a0.f29345h;
                                    } else if (iIntValue == 1) {
                                        objA = a0.f29343f;
                                    } else if (iIntValue == 2) {
                                        objA = a0.f29344g;
                                    } else if (iIntValue == 3) {
                                        objA = a0.f29341d;
                                    } else if (iIntValue == 4) {
                                        objA = a0.f29342e;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(objA);
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

    public static void y(ii.f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_defaultConstructor", mVarA, obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.d1
                /* JADX WARN: Removed duplicated region for block: B:60:0x01b2 A[PHI: r6
                  0x01b2: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:52:0x01a4, B:57:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[PHI: r4
                  0x01b4: PHI (r4v2 int) = (r4v0 int), (r4v3 int) binds: [B:53:0x01a6, B:55:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // ii.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void q(java.lang.Object r9, h3.e r10) {
                    /*
                        Method dump skipped, instruction units count: 528
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ni.d1.q(java.lang.Object, h3.e):void");
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.highestAvailableStrategy", mVarA, obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.d1
                /* JADX WARN: Removed duplicated region for block: B:60:0x01b2 A[PHI: r6
                  0x01b2: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:52:0x01a4, B:57:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[PHI: r4
                  0x01b4: PHI (r4v2 int) = (r4v0 int), (r4v3 int) binds: [B:53:0x01a6, B:55:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // ii.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void q(java.lang.Object r9, h3.e r10) {
                    /*
                        Method dump skipped, instruction units count: 528
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ni.d1.q(java.lang.Object, h3.e):void");
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.getBoundSize", mVarA, obj);
        if (fVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.d1
                /* JADX WARN: Removed duplicated region for block: B:60:0x01b2 A[PHI: r6
                  0x01b2: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:52:0x01a4, B:57:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[PHI: r4
                  0x01b4: PHI (r4v2 int) = (r4v0 int), (r4v3 int) binds: [B:53:0x01a6, B:55:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // ii.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void q(java.lang.Object r9, h3.e r10) {
                    /*
                        Method dump skipped, instruction units count: 528
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ni.d1.q(java.lang.Object, h3.e):void");
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.getFallbackRule", mVarA, obj);
        if (fVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.d1
                /* JADX WARN: Removed duplicated region for block: B:60:0x01b2 A[PHI: r6
                  0x01b2: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:52:0x01a4, B:57:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[PHI: r4
                  0x01b4: PHI (r4v2 int) = (r4v0 int), (r4v3 int) binds: [B:53:0x01a6, B:55:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // ii.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void q(java.lang.Object r9, h3.e r10) {
                    /*
                        Method dump skipped, instruction units count: 528
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ni.d1.q(java.lang.Object, h3.e):void");
                }
            });
        }
    }

    public static long z(int i, long j10) {
        long j11 = i;
        f2.g.a("bytesPerFrame must be greater than 0.", j11 > 0);
        return j10 / j11;
    }

    public abstract View o(int i);

    public abstract boolean p();
}
