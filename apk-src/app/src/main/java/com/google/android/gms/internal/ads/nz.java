package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.SentryOptions;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nz implements d2 {
    public static final jo0 B;
    public static final jo0 C;
    public static final /* synthetic */ int E = 0;
    public static final /* synthetic */ int F = 0;
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f8497b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ih f8509o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q90 f8514t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static Task f8517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static a1.e f8518x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f8498c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8499d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f8500e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8501f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f8502g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f8503h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, VKApiCodes.CODE_ANONYM_TOKEN_EXPIRED, 1253, 1393};
    public static final String[] i = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f8504j = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f8505k = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ya f8506l = new ya("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fp f8507m = new fp(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ih f8508n = new ih(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ih f8510p = new ih(28);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q90 f8511q = new q90(3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q90 f8512r = new q90(11);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q90 f8513s = new q90(15);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q90 f8515u = new q90(22);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final jo0 f8516v = new jo0(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f8519y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final jo0 f8520z = new jo0(9);
    public static final y5 A = new y5(5);
    public static final int[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    static {
        int i10 = 19;
        int i11 = 16;
        f8509o = new ih(i11);
        f8514t = new q90(i10);
        B = new jo0(i11);
        C = new jo0(i10);
    }

    public static ByteBuffer A(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int iRemaining = byteBuffer.remaining();
            throw new IOException(l7.o.j(iRemaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(iRemaining).length() + 82)));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return z(i10, byteBuffer);
        }
        int iRemaining2 = byteBuffer.remaining();
        throw new IOException(pe.a.g(new StringBuilder(String.valueOf(i10).length() + 79 + String.valueOf(iRemaining2).length()), i10, "Length-prefixed field longer than remaining buffer. Field length: ", iRemaining2, ", remaining: "));
    }

    public static byte[] B(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        int iRemaining = byteBuffer.remaining();
        throw new IOException(pe.a.g(new StringBuilder(String.valueOf(i10).length() + 68 + String.valueOf(iRemaining).length()), i10, "Underflow while reading length-prefixed value. Length: ", iRemaining, ", available: "));
    }

    public static void C(int i10, byte[] bArr) {
        bArr[1] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[2] = (byte) ((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[3] = (byte) ((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[4] = (byte) (i10 >> 24);
    }

    public static int a(String str) {
        int i10;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = length & (-4);
            if (i11 >= i10) {
                break;
            }
            int i13 = ((bytes[i11] & 255) | ((bytes[i11 + 1] & 255) << 8) | ((bytes[i11 + 2] & 255) << 16) | (bytes[i11 + 3] << 24)) * (-862048943);
            int i14 = i12 ^ (((i13 >>> 17) | (i13 << 15)) * 461845907);
            i12 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i15 = length & 3;
        if (i15 == 1) {
            int i16 = ((bytes[i10] & 255) | i) * (-862048943);
            i12 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        } else {
            if (i15 != 2) {
                i = i15 == 3 ? (bytes[i10 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i10 + 1] & 255) << 8;
            int i162 = ((bytes[i10] & 255) | i) * (-862048943);
            i12 ^= ((i162 >>> 17) | (i162 << 15)) * 461845907;
        }
        int i17 = i12 ^ length;
        int i18 = (i17 ^ (i17 >>> 16)) * (-2048144789);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477387);
        return i19 ^ (i19 >>> 16);
    }

    public static synchronized AudioManager c(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f8497b = null;
            }
            AudioManager audioManager = f8497b;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                cb0 cb0Var = new cb0();
                c80.f().execute(new l81(12, applicationContext, cb0Var));
                cb0Var.b();
                AudioManager audioManager2 = f8497b;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f8497b = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static Object d(o31 o31Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return o31Var.mo8h();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(int i10, f9 f9Var, ow1 ow1Var, f9 f9Var2, f9... f9VarArr) {
        if (f9Var2 == null) {
            f9Var2 = new f9(new k8[0]);
        }
        if (f9Var != null) {
            v41 v41Var = x41.f12018c;
            fs1.y(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i11 = 0;
            for (k8 k8Var : f9Var.f5274a) {
                if (pt0.class.isAssignableFrom(k8Var.getClass())) {
                    k8 k8Var2 = (k8) pt0.class.cast(k8Var);
                    k8Var2.getClass();
                    int length = objArrCopyOf.length;
                    int i12 = i11 + 1;
                    int iD = s41.d(length, i12);
                    if (iD > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                    }
                    objArrCopyOf[i11] = k8Var2;
                    i11 = i12;
                }
            }
            r51 r51VarX = x41.x(i11, objArrCopyOf);
            int i13 = r51VarX.f9715e;
            for (int i14 = 0; i14 < i13; i14++) {
                pt0 pt0Var = (pt0) r51VarX.get(i14);
                if (!pt0Var.f9182a.equals("com.android.capture.fps") || i10 == 2) {
                    f9Var2 = f9Var2.c(pt0Var);
                }
            }
        }
        for (f9 f9Var3 : f9VarArr) {
            f9Var2 = f9Var2.b(f9Var3);
        }
        if (f9Var2.f5274a.length > 0) {
            ow1Var.f8830j = f9Var2;
        }
    }

    public static void f(Context context, boolean z5) {
        synchronized (f8519y) {
            try {
                if (f8518x == null) {
                    f8518x = new a1.e(context);
                }
                Task task = f8517w;
                if (task == null || ((task.i() && !f8517w.isSuccessful()) || (z5 && f8517w.i()))) {
                    try {
                        a1.e eVar = f8518x;
                        pa.c0.j(eVar, "the appSetIdClient shouldn't be null");
                        f8517w = eVar.b();
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 31);
                        sb2.append("Failed to get app set ID info: ");
                        sb2.append(message);
                        t9.c0.m(sb2.toString());
                        f8517w = com.google.android.gms.internal.measurement.b4.q(e3);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(x6 x6Var, a4.g gVar) {
        for (int i10 = 0; i10 < x6Var.h(); i10++) {
            long jU = x6Var.u(i10);
            ArrayList arrayListB = x6Var.b(jU);
            if (!arrayListB.isEmpty()) {
                if (i10 == x6Var.h() - 1) {
                    throw new IllegalStateException();
                }
                long jU2 = x6Var.u(i10 + 1) - x6Var.u(i10);
                if (jU2 > 0) {
                    gVar.mo0a(new v6(jU, jU2, arrayListB));
                }
            }
        }
    }

    public static boolean i(tk0 tk0Var, g2 g2Var, int i10, e2 e2Var) {
        boolean z5;
        long jP = tk0Var.P();
        long j10 = jP >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jP >> 12;
        long j12 = jP >> 8;
        long j13 = jP >> 4;
        long j14 = jP >> 1;
        long j15 = jP & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            z5 = true;
            if (i11 != g2Var.f5610g - 1) {
                return false;
            }
        } else {
            z5 = true;
            if (i11 > 10 || g2Var.f5610g != 2) {
                return false;
            }
        }
        int i12 = (int) (j14 & 7);
        if (!(i12 == 0 || i12 == g2Var.i) || j15 == 1) {
            return false;
        }
        try {
            long jO = tk0Var.o();
            if (!z10) {
                jO *= (long) g2Var.f5605b;
            }
            long j16 = g2Var.f5612j;
            if (j16 != 0 && jO > j16) {
                return false;
            }
            e2Var.f4793b = jO;
            int iN = n((int) (j11 & 15), tk0Var);
            long j17 = g2Var.f5612j;
            boolean z11 = (j17 == 0 || jO + ((long) iN) >= j17) ? z5 : false;
            if (iN == -1) {
                return false;
            }
            if ((!z11 && iN < g2Var.f5604a) || iN > g2Var.f5605b) {
                return false;
            }
            int i13 = g2Var.f5608e;
            int i14 = (int) (j12 & 15);
            if (i14 != 0) {
                if (i14 <= 11) {
                    if (i14 != g2Var.f5609f) {
                        return false;
                    }
                } else if (i14 != 12) {
                    if (i14 > 14) {
                        return false;
                    }
                    int iL = tk0Var.L();
                    if (i14 == 14) {
                        iL *= 10;
                    }
                    if (iL != i13) {
                        return false;
                    }
                } else if (tk0Var.K() * 1000 != i13) {
                    return false;
                }
            }
            int iK = tk0Var.K();
            int i15 = tk0Var.f10642b;
            byte[] bArr = tk0Var.f10641a;
            int i16 = i15 - 1;
            int i17 = 0;
            for (int i18 = tk0Var.f10642b; i18 < i16; i18++) {
                i17 = cq0.i[i17 ^ (bArr[i18] & 255)];
            }
            String str = cq0.f4293a;
            if (iK != i17) {
                return false;
            }
            if (tk0Var.B() != 0) {
                int I = tk0Var.I();
                if ((I & 128) != 0) {
                    return false;
                }
                int i19 = (I & 126) >> 1;
                if ((i19 >= 2 && i19 <= 7) || (i19 >= 13 && i19 <= 31)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i19).length() + 57);
                    sb2.append("Ignoring frame where first subframe has a reserved type: ");
                    sb2.append(i19);
                    rs.n("FlacFrameReader", sb2.toString());
                    return false;
                }
            }
            return z5;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] j() {
        int i10 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i11 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ a0.u.h((i13 & (~i12)) | i14, (i12 & i15) | i16, i17, i18));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i11);
        byteBufferAllocate.putInt(i10);
        return byteBufferAllocate.array();
    }

    public static X509Certificate[][] k(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairU;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile2.length() < 22) {
                pairU = null;
            } else {
                pairU = c80.u(randomAccessFile2, 0);
                if (pairU == null) {
                    pairU = c80.u(randomAccessFile2, 65535);
                }
            }
            try {
                if (pairU == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 82);
                    sb2.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb2.append(length);
                    sb2.append(" bytes");
                    throw new da(sb2.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairU.first;
                long jLongValue = ((Long) pairU.second).longValue();
                long j10 = (-20) + jLongValue;
                if (j10 >= 0) {
                    randomAccessFile2.seek(j10);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new da("ZIP64 APK not supported");
                    }
                }
                c80.x(byteBuffer);
                long j11 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
                if (j11 >= jLongValue) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 82 + String.valueOf(jLongValue).length());
                    sb3.append("ZIP Central Directory offset out of range: ");
                    sb3.append(j11);
                    sb3.append(". ZIP End of Central Directory offset: ");
                    sb3.append(jLongValue);
                    throw new da(sb3.toString());
                }
                c80.x(byteBuffer);
                if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j11 != jLongValue) {
                    throw new da("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (j11 < 32) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j11).length() + 67);
                    sb4.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb4.append(j11);
                    throw new da(sb4.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(j11 - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new da("No APK Signing Block before ZIP Central Directory");
                }
                long j12 = byteBufferAllocate.getLong(0);
                if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j12).length() + 37);
                    sb5.append("APK Signing Block size out of range: ");
                    sb5.append(j12);
                    throw new da(sb5.toString());
                }
                int i10 = (int) (8 + j12);
                long j13 = j11 - ((long) i10);
                if (j13 < 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j13).length() + 39);
                    sb6.append("APK Signing Block offset out of range: ");
                    sb6.append(j13);
                    throw new da(sb6.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j13);
                long j14 = j11;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j15 = byteBufferAllocate2.getLong(0);
                if (j15 != j12) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(j15).length() + 63 + String.valueOf(j12).length());
                    sb7.append("APK Signing Block sizes in header and footer do not match: ");
                    sb7.append(j15);
                    sb7.append(" vs ");
                    sb7.append(j12);
                    throw new da(sb7.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j13));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb8.append("end < start: ");
                    sb8.append(iCapacity);
                    sb8.append(" < 8");
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb9 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb9.append("end > capacity: ");
                    sb9.append(iCapacity);
                    sb9.append(" > ");
                    sb9.append(iCapacity2);
                    throw new IllegalArgumentException(sb9.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i11 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i11++;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i11).length() + 59);
                            sb10.append("Insufficient data to read size of APK Signing Block entry #");
                            sb10.append(i11);
                            throw new da(sb10.toString());
                        }
                        long j16 = byteBufferSlice.getLong();
                        if (j16 < 4 || j16 > 2147483647L) {
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(j16).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i11);
                            sb11.append(" size out of range: ");
                            sb11.append(j16);
                            throw new da(sb11.toString());
                        }
                        int i12 = (int) j16;
                        int iPosition2 = byteBufferSlice.position() + i12;
                        if (i12 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb12 = new StringBuilder(String.valueOf(i11).length() + 45 + String.valueOf(i12).length() + 13 + String.valueOf(iRemaining).length());
                            sb12.append("APK Signing Block entry #");
                            sb12.append(i11);
                            sb12.append(" size out of range: ");
                            sb12.append(i12);
                            sb12.append(", available: ");
                            sb12.append(iRemaining);
                            throw new da(sb12.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrM = m(randomAccessFile.getChannel(), new ca(z(i12 - 4, byteBufferSlice), jLongValue2, j14, jLongValue, byteBuffer));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrM;
                        }
                        long j17 = j14;
                        byteBufferSlice.position(iPosition2);
                        j14 = j17;
                    }
                    throw new da("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th2) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = randomAccessFile2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] l(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nz.l(java.lang.String, boolean):java.lang.String[]");
    }

    public static X509Certificate[][] m(FileChannel fileChannel, ca caVar) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferA = A((ByteBuffer) caVar.f4118d);
                int i10 = 0;
                while (byteBufferA.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(p(A(byteBufferA), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e3) {
                        throw new SecurityException(l7.o.l(new StringBuilder(String.valueOf(i10).length() + 37), "Failed to parse/verify signer #", i10, " block"), e3);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j10 = caVar.f4115a;
                long j11 = caVar.f4116b;
                long j12 = caVar.f4117c;
                ByteBuffer byteBuffer = (ByteBuffer) caVar.f4119e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                ba baVar = new ba(fileChannel, 0L, j10);
                ba baVar2 = new ba(fileChannel, j11, j12 - j11);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                c80.x(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j10 < 0 || j10 > 4294967295L) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(j10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j10);
                kx0 kx0Var = new kx0(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    iArr[i11] = ((Integer) it.next()).intValue();
                    i11++;
                }
                try {
                    byte[][] bArrS = s(iArr, new aa[]{baVar, baVar2, kx0Var});
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = iArr[i12];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrS[i12])) {
                            throw new SecurityException(x(i13).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e7) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e7);
                }
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }

    public static int n(int i10, tk0 tk0Var) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return tk0Var.K() + 1;
            case 7:
                return tk0Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static r51 o(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (ix.E(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strI = ix.I(xmlPullParser, strConcat2);
                String strI2 = ix.I(xmlPullParser, strConcat3);
                String strI3 = ix.I(xmlPullParser, strConcat4);
                String strI4 = ix.I(xmlPullParser, strConcat5);
                if (strI == null || strI2 == null) {
                    return r51.f9713f;
                }
                x3 x3Var = new x3(strI, strI3 != null ? Long.parseLong(strI3) : 0L, strI4 != null ? Long.parseLong(strI4) : 0L);
                int length = objArrCopyOf.length;
                int i11 = i10 + 1;
                int iD = s41.d(length, i11);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i10] = x3Var;
                i10 = i11;
            }
        } while (!ix.q(xmlPullParser, str.concat(":Directory")));
        return x41.x(i10, objArrCopyOf);
    }

    public static X509Certificate[] p(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferA = A(byteBuffer);
        ByteBuffer byteBufferA2 = A(byteBuffer);
        byte[] bArrB = B(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrB2 = null;
        byte[] bArrB3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferA2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferA3 = A(byteBufferA2);
                if (byteBufferA3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferA3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iT = t(i12);
                    int iT2 = t(i10);
                    if (iT != 1 && iT2 == 1) {
                    }
                }
                bArrB3 = B(byteBufferA3);
                i10 = i12;
            } catch (IOException e3) {
                e = e3;
                throw new SecurityException(l7.o.j(i11, "Failed to parse signature record #", new StringBuilder(String.valueOf(i11).length() + 34)), e);
            } catch (BufferUnderflowException e7) {
                e = e7;
                throw new SecurityException(l7.o.j(i11, "Failed to parse signature record #", new StringBuilder(String.valueOf(i11).length() + 34)), e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrB));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferA);
            if (!signature.verify(bArrB3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferA.clear();
            ByteBuffer byteBufferA4 = A(byteBufferA);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferA4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferA5 = A(byteBufferA4);
                    if (byteBufferA5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferA5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrB2 = B(byteBufferA5);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(l7.o.j(i13, "Failed to parse digest record #", new StringBuilder(String.valueOf(i13).length() + 31)), e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException(l7.o.j(i13, "Failed to parse digest record #", new StringBuilder(String.valueOf(i13).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iT3 = t(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iT3), bArrB2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrB2)) {
                throw new SecurityException(x(iT3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferA6 = A(byteBufferA);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferA6.hasRemaining()) {
                i15++;
                byte[] bArrB4 = B(byteBufferA6);
                try {
                    arrayList3.add(new ea((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrB4)), bArrB4));
                } catch (CertificateException e12) {
                    throw new SecurityException(l7.o.j(i15, "Failed to decode certificate #", new StringBuilder(String.valueOf(i15).length() + 30)), e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrB, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException(t.z.g(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException(t.z.g(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException(t.z.g(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException(t.z.g(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException(t.z.g(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static q4 q(int i10, String str, tk0 tk0Var) {
        int iB = tk0Var.b();
        if (tk0Var.b() == 1684108385) {
            tk0Var.G(8);
            return new q4(str, null, x41.q(tk0Var.l(iB - 16)));
        }
        rs.r("MetadataUtil", "Failed to parse text attribute: ".concat(kv0.p(i10)));
        return null;
    }

    public static l4 r(int i10, String str, tk0 tk0Var, boolean z5, boolean z10) {
        int iV = v(tk0Var);
        if (z10) {
            iV = Math.min(1, iV);
        }
        if (iV >= 0) {
            return z5 ? new q4(str, null, x41.q(Integer.toString(iV))) : new i4("und", str, Integer.toString(iV));
        }
        rs.r("MetadataUtil", "Failed to parse uint8 attribute: ".concat(kv0.p(i10)));
        return null;
    }

    public static byte[][] s(int[] iArr, aa[] aaVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c8;
        int i11 = 0;
        long jH = 0;
        while (true) {
            j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
            if (i11 >= 3) {
                break;
            }
            jH += (aaVarArr[i11].h() + 1048575) / SentryOptions.MAX_EVENT_SIZE_BYTES;
            i11++;
        }
        if (jH >= 2097151) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jH).length() + 17);
            sb2.append("Too many chunks: ");
            sb2.append(jH);
            throw new DigestException(sb2.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            c8 = 5;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) jH;
            byte[] bArr2 = new byte[(y(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            C(i13, bArr2);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String strX = x(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(strX);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strX.concat(" digest not supported"), e3);
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (i10 = 3; i15 < i10; i10 = 3) {
            aa aaVar = aaVarArr[i15];
            int i18 = i15;
            long jH2 = aaVar.h();
            long j11 = 0;
            while (jH2 > 0) {
                char c9 = c8;
                int i19 = i16;
                int iMin = (int) Math.min(jH2, j10);
                C(iMin, bArr3);
                for (int i20 = 0; i20 < length; i20++) {
                    messageDigestArr[i20].update(bArr3);
                }
                try {
                    aaVar.b(messageDigestArr, j11, iMin);
                    int i21 = 0;
                    while (i21 < iArr.length) {
                        int i22 = iArr[i21];
                        byte[] bArr4 = bArr[i21];
                        int iY = y(i22);
                        aa aaVar2 = aaVar;
                        MessageDigest messageDigest = messageDigestArr[i21];
                        long j12 = jH2;
                        int iDigest = messageDigest.digest(bArr4, (i19 * iY) + 5, iY);
                        if (iDigest != iY) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb3.append("Unexpected output size of ");
                            sb3.append(algorithm);
                            sb3.append(" digest: ");
                            sb3.append(iDigest);
                            throw new RuntimeException(sb3.toString());
                        }
                        i21++;
                        aaVar = aaVar2;
                        jH2 = j12;
                    }
                    aa aaVar3 = aaVar;
                    long j13 = iMin;
                    j11 += j13;
                    jH2 -= j13;
                    i16 = i19 + 1;
                    c8 = c9;
                    aaVar = aaVar3;
                    j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
                } catch (IOException e7) {
                    throw new DigestException(pe.a.g(new StringBuilder(String.valueOf(i19).length() + 37 + String.valueOf(i17).length()), i19, "Failed to digest chunk #", i17, " of section #"), e7);
                }
            }
            i17++;
            i15 = i18 + 1;
            j10 = SentryOptions.MAX_EVENT_SIZE_BYTES;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i23 = 0; i23 < iArr.length; i23++) {
            int i24 = iArr[i23];
            byte[] bArr6 = bArr[i23];
            String strX2 = x(i24);
            try {
                bArr5[i23] = MessageDigest.getInstance(strX2).digest(bArr6);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strX2.concat(" digest not supported"), e10);
            }
        }
        return bArr5;
    }

    public static int t(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    public static int u(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f8499d[i10];
        if (i13 == 44100) {
            int i14 = f8503h[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f8502g[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static int v(tk0 tk0Var) {
        int iB = tk0Var.b();
        if (tk0Var.b() == 1684108385) {
            tk0Var.G(8);
            int i10 = iB - 16;
            if (i10 == 1) {
                return tk0Var.K();
            }
            if (i10 == 2) {
                return tk0Var.L();
            }
            if (i10 == 3) {
                return tk0Var.O();
            }
            if (i10 == 4 && (tk0Var.I() & 128) == 0) {
                return tk0Var.h();
            }
        }
        rs.r("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static q4 w(int i10, String str, tk0 tk0Var) {
        int iB = tk0Var.b();
        if (tk0Var.b() == 1684108385 && iB >= 22) {
            tk0Var.G(10);
            int iL = tk0Var.L();
            if (iL > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iL).length());
                sb2.append(iL);
                String string = sb2.toString();
                int iL2 = tk0Var.L();
                if (iL2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iL2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iL2);
                    string = sb3.toString();
                }
                return new q4(str, null, x41.q(string));
            }
        }
        rs.r("MetadataUtil", "Failed to parse index/count attribute: ".concat(kv0.p(i10)));
        return null;
    }

    public static String x(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(l7.o.j(i10, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i10).length() + 33)));
    }

    public static int y(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(l7.o.j(i10, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i10).length() + 33)));
    }

    public static ByteBuffer z(int i10, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }
}
