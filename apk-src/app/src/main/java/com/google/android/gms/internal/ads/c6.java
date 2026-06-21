package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 implements t2, lo1, o31, q1, w1, b2, r6, z6, ub, xn1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Cipher f4044d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c6 f4043c = new c6(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f4045e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f4046f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c6 f4047g = new c6(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c6 f4048h = new c6(3);
    public static final c6 i = new c6(4);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c6 f4049j = new c6(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c6 f4050k = new c6(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c6 f4051l = new c6(8);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ c6 f4052m = new c6(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c6 f4053n = new c6(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ c6 f4054o = new c6(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ c6 f4055p = new c6(16);

    public /* synthetic */ c6(int i10) {
        this.f4056b = i10;
    }

    public static final void B(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                sb2.append("javascript: ");
                sb2.append(str);
                webView.loadUrl(sb2.toString());
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    public static boolean C(int i10, androidx.datastore.preferences.protobuf.l lVar, Object obj) throws co1 {
        en1 en1Var = (en1) lVar.f1438e;
        int i11 = lVar.f1435b;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            lVar.W(0);
            ((ep1) obj).d(i12 << 3, Long.valueOf(en1Var.o()));
            return true;
        }
        if (i13 == 1) {
            lVar.W(1);
            ((ep1) obj).d((i12 << 3) | 1, Long.valueOf(en1Var.r()));
            return true;
        }
        if (i13 == 2) {
            ((ep1) obj).d((i12 << 3) | 2, lVar.f0());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new co1("Protocol message end-group tag did not match expected tag.");
            }
            if (i13 != 5) {
                throw new bo1();
            }
            lVar.W(5);
            ((ep1) obj).d(5 | (i12 << 3), Integer.valueOf(en1Var.s()));
            return true;
        }
        ep1 ep1VarA = ep1.a();
        int i14 = i12 << 3;
        int i15 = i10 + 1;
        if (i15 >= 100) {
            throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.d0() != Integer.MAX_VALUE && C(i15, lVar, ep1VarA)) {
        }
        if ((i14 | 4) != lVar.f1435b) {
            throw new co1("Protocol message end-group tag did not match expected tag.");
        }
        if (ep1VarA.f5031e) {
            ep1VarA.f5031e = false;
        }
        ((ep1) obj).d(i14 | 3, ep1VarA);
        return true;
    }

    public static q5 m(qa qaVar, Map map) {
        String str = qaVar.f9374d;
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(qaVar.e());
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i10 = qaVar.f9382m.f4005a;
        httpURLConnection.setConnectTimeout(i10);
        httpURLConnection.setReadTimeout(i10);
        boolean z5 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str2 : map2.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
            }
            if (qaVar.f9373c != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrF = qaVar.f();
                if (bArrF != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrF);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                q5 q5Var = new q5(responseCode, t(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return q5Var;
            }
            try {
                return new q5(responseCode, t(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new db(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z5 = true;
                if (!z5) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static vc n(final long j10) {
        return vc.f(new nc() { // from class: com.google.android.gms.internal.ads.xb
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((rc) obj).f9815a.c(vc.b(j10));
                    return Optional.empty();
                } catch (lc unused) {
                    return Optional.of(qb.f9391c);
                }
            }
        });
    }

    public static final ni o(Context context, li liVar) {
        com.google.android.gms.internal.measurement.i4 i4Var = new com.google.android.gms.internal.measurement.i4(context, 5);
        ni niVar = new ni(i4Var);
        oq0 oq0Var = new oq0(i4Var, liVar, niVar, 5);
        zd1 zd1Var = new zd1(4, i4Var, niVar);
        synchronized (i4Var.f13783d) {
            ki kiVar = new ki(context, p9.k.C.f31313t.i(), oq0Var, zd1Var, 0);
            i4Var.f13782c = kiVar;
            kiVar.d();
        }
        return niVar;
    }

    public static String p(byte[] bArr, byte[] bArr2) throws df {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4045e) {
                x().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = x().doFinal(bArr2);
                iv = x().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e3) {
            throw new df(e3);
        } catch (NoSuchAlgorithmException e7) {
            throw new df(e7);
        } catch (BadPaddingException e10) {
            throw new df(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new df(e11);
        } catch (NoSuchPaddingException e12) {
            throw new df(e12);
        }
    }

    public static final void q(com.google.android.gms.internal.consent_sdk.c cVar, cw cwVar) {
        File externalStorageDirectory;
        Context context = (Context) cwVar.f4349e;
        String str = (String) cwVar.f4350f;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        String str2 = (String) cwVar.f4347c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cwVar.f4348d;
        cVar.f13341e = context;
        cVar.f13342f = str;
        cVar.f13340d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        cVar.f13344h = atomicBoolean;
        atomicBoolean.set(((Boolean) wl.f11838c.r()).booleanValue());
        if (((AtomicBoolean) cVar.f13344h).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            cVar.i = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) cVar.f13338b).put((String) entry.getKey(), (String) entry.getValue());
        }
        hx.f6279a.execute(new s(12, cVar));
        HashMap map = (HashMap) cVar.f13339c;
        bl blVar = bl.f3809c;
        map.put("action", blVar);
        map.put("ad_format", blVar);
        map.put("e", bl.f3810d);
    }

    public static final SharedPreferences s(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e3) {
            u9.i.i("", e3);
            return null;
        }
    }

    public static ArrayList t(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ka((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void v(long j10, kx0 kx0Var, boolean z5) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = (((((~j11) & j12) | j13) + ((j11 & j14) | j15)) - j16) + j17;
        long j20 = j18 % 1629190168;
        long j21 = z5 ? (j10 + j10) ^ (j10 >> 63) : j10;
        int i10 = 1;
        while (true) {
            long j22 = j19 ^ j20;
            long j23 = j21 >>> 7;
            boolean z10 = j23 != 0 || i10 < 0;
            int i11 = (int) (j21 & j22);
            if (z10) {
                i11 = ((i11 | 128) << 24) >> 24;
            }
            ((ByteArrayOutputStream) kx0Var.f7326c).write((byte) i11);
            if (!z10) {
                return;
            }
            i10++;
            j21 = j23;
        }
    }

    public static byte[] w(String str, byte[] bArr) throws df {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new df();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4045e) {
                x().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = x().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e3) {
            throw new df(e3);
        } catch (InvalidAlgorithmParameterException e7) {
            throw new df(e7);
        } catch (InvalidKeyException e10) {
            throw new df(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new df(e11);
        } catch (BadPaddingException e12) {
            throw new df(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new df(e13);
        } catch (NoSuchPaddingException e14) {
            throw new df(e14);
        }
    }

    public static final Cipher x() {
        Cipher cipher;
        synchronized (f4046f) {
            try {
                if (f4044d == null) {
                    f4044d = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                }
                cipher = f4044d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public static /* bridge */ ep1 z(Object obj) {
        sn1 sn1Var = (sn1) obj;
        ep1 ep1Var = sn1Var.zzt;
        if (ep1Var != ep1.f5026f) {
            return ep1Var;
        }
        ep1 ep1VarA = ep1.a();
        sn1Var.zzt = ep1VarA;
        return ep1VarA;
    }

    public void A(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append("null");
                } else if (obj instanceof String) {
                    String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb2.append(string);
                    } else {
                        sb2.append('\"');
                        sb2.append(string);
                        sb2.append('\"');
                    }
                } else {
                    sb2.append(obj);
                }
                sb2.append(StringUtils.COMMA);
            }
            sb2.setLength(sb2.length() - 1);
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                B(webView, string2);
            } else {
                handler.post(new th0(this, webView, string2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public w2 O(int i10, int i11) {
        switch (this.f4056b) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return new y1();
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void U(o2 o2Var) {
        switch (this.f4056b) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r6
    public long a(a2 a2Var) {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public boolean c(Class cls) {
        return sn1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public uo1 d(Class cls) {
        if (!sn1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (uo1) sn1.s(cls.asSubclass(sn1.class)).v(3, null);
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ub
    public byte e(ac acVar, int i10) {
        return acVar.b(i10);
    }

    @Override // com.google.android.gms.internal.ads.z6
    public boolean g(jx1 jx1Var) {
        switch (this.f4056b) {
            case 18:
                String str = jx1Var.f6975m;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        int i10 = p0.f8866a;
        try {
            return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ub
    public ac i(ac acVar, int i10, int i11) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = acVar.f2838a).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        if (i12 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, i10, bArr3, 0, i12);
            bArr2 = bArr3;
        }
        return new ac(bArr2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r4.equals("application/vobsub") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r4.equals("application/x-quicktime-tx3g") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r4.equals("application/x-mp4-vtt") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r4.equals("application/pgs") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r4.equals("application/dvbsubs") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j(com.google.android.gms.internal.ads.jx1 r4) {
        /*
            r3 = this;
            int r0 = r3.f4056b
            switch(r0) {
                case 18: goto L7;
                default: goto L5;
            }
        L5:
            r4 = 1
            return r4
        L7:
            java.lang.String r4 = r4.f6975m
            if (r4 == 0) goto L68
            int r0 = r4.hashCode()
            r1 = 1
            r2 = 2
            switch(r0) {
                case -1351681404: goto L5e;
                case -1248334819: goto L55;
                case -1026075066: goto L4c;
                case -1004728940: goto L43;
                case 691401887: goto L3a;
                case 822864842: goto L31;
                case 1157994102: goto L27;
                case 1668750253: goto L1e;
                case 1693976202: goto L15;
                default: goto L14;
            }
        L14:
            goto L68
        L15:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L1e:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L27:
            java.lang.String r0 = "application/vobsub"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
        L2f:
            r1 = r2
            goto L67
        L31:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L3a:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L43:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L67
        L4c:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L55:
            java.lang.String r0 = "application/pgs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L5e:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L68
            goto L2f
        L67:
            return r1
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported MIME type: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c6.j(com.google.android.gms.internal.ads.jx1):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.z6
    public a7 k(jx1 jx1Var) {
        a7 a8Var;
        switch (this.f4056b) {
            case 18:
                String str = jx1Var.f6975m;
                List list = jx1Var.f6978p;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                k7 k7Var = new k7();
                                tk0 tk0Var = new tk0((byte[]) list.get(0));
                                int iL = tk0Var.L();
                                int iL2 = tk0Var.L();
                                Paint paint = new Paint();
                                k7Var.f7130b = paint;
                                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                                paint.setPathEffect(null);
                                Paint paint2 = new Paint();
                                k7Var.f7131c = paint2;
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                                paint2.setPathEffect(null);
                                k7Var.f7132d = new Canvas();
                                int i10 = 719;
                                k7Var.f7133e = new e7(i10, 575, 0, i10, 0, 575);
                                k7Var.f7134f = new d7(0, new int[]{0, -1, -16777216, -8421505}, k7.g(), k7.j());
                                k7Var.f7135g = new j7(iL, iL2, 0);
                                a8Var = k7Var;
                                return a8Var;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                return new cw(1);
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                return new l2(1);
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                return new ut(3);
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                a8Var = new a8(list, 0);
                                return a8Var;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                a8Var = new m7(list);
                                return a8Var;
                            }
                            break;
                        case 1157994102:
                            if (str.equals("application/vobsub")) {
                                a8Var = new cw(list);
                                return a8Var;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                return new q7();
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                return new w7();
                            }
                            break;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ub
    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public ub mo2l() {
        return new c6(false);
    }

    public long r() {
        return SystemClock.elapsedRealtime();
    }

    public String toString() {
        switch (this.f4056b) {
            case 0:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.b2
    public void u() {
        switch (this.f4056b) {
            case 14:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public lo0 y(Looper looper, Handler.Callback callback) {
        return new lo0(new Handler(looper, callback));
    }

    public /* synthetic */ c6(boolean z5) {
        this.f4056b = 21;
    }

    @Override // com.google.android.gms.internal.ads.r6
    public o2 l() {
        return new f2(-9223372036854775807L, 0L);
    }

    public c6(se seVar, cv0 cv0Var) {
        this.f4056b = 24;
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Constructor mo8h() throws IllegalAccessException, InvocationTargetException {
        switch (this.f4056b) {
            case 12:
                int[] iArr = x1.f11967d;
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(z1.class).getConstructor(null);
            default:
                int[] iArr2 = x1.f11967d;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(z1.class).getConstructor(Integer.TYPE);
                }
                return null;
        }
    }

    private final void D() {
    }

    private final void E(o2 o2Var) {
    }

    @Override // com.google.android.gms.internal.ads.q1
    public long b(long j10) {
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.r6
    public void f(long j10) {
    }
}
